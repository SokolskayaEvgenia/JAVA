package ru.sokolskaja;

import com.google.gson.Gson;
import okhttp3.*;

import javax.management.Query;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Найти: ");
        Scanner scanner = new Scanner(System.in);
        String query = scanner.nextLine();
        String myUrl = "https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch="
                + URLEncoder.encode(query, StandardCharsets.UTF_8);
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().get().url(myUrl).build();

        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String content = response.body().string();
                System.out.println(content);
                Gson gson = new Gson();
                Example example = gson.fromJson(content,Example.class);
                List<Search>list=example.getQuery().getSearch();
                List<String>result=new ArrayList<>();
                for (Search s:list){
                    result.add(String.format("%s\thttps://ru.wikipedia.org/?curid=%s", s.getTitle(), s.getPageid()));
                }
                System.out.println("Results: ");
                int c =1;
                for(String s:result){
                    System.out.printf("%d) %s\n", c++, s);
                }

            }
        });
    }
}
