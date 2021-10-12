package ru.sokolskaja;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //1.
        //readFile("./notes.txt").forEach(System.out::println);

        //2.
        //writeFile("./text.txt", "some text");

        //3.
        //concatFiles("./notes.txt", "./text.txt");

        //4.
        //copyFile("./notes.txt");

        //5.
        //findFileName("./", "co").forEach(System.out::println);

        //6.
        findContainsInFile("./", "some").forEach(System.out::println);
    }

    //1.
    public static List<String> readFile (String path) {
        List<String> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.add(line);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    //2.
    public static void writeFile (String path, String text) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
            writer.append(text).append("\n");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    //3.
    public static void concatFiles (String path1, String path2) {
        List<String> file1 = readFile(path1);
        List<String> file2 = readFile(path2);
        file1.forEach(it->writeFile("./concat.txt", it));
        file2.forEach(it->writeFile("./concat.txt", it));
    }

    //4.
    public static void copyFile (String path) {
        List<String> file = readFile(path);
        file.forEach(it->writeFile(path.replace(".txt", "(copy).txt"), it));
    }

    //5.
    public static List<String> findFileName (String dir, String substring) {
        File folder = new File(dir);
        try {
            File[] listOfFiles = folder.listFiles();
            return Stream.of(listOfFiles)
                    .filter(File::isFile)
                    .map(File::getName)
                    .filter(it -> it.contains(substring))
                    .collect(Collectors.toList());
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
            return Collections.emptyList();
        }
    }

    //6.
    public static List<String> findContainsInFile (String dir, String substring) {
        File folder = new File(dir);
        try {
            File[] listOfFiles = folder.listFiles();
            List<String> result = new ArrayList<>();
            return Stream.of(listOfFiles)
                    .filter(File::isFile)
                    .filter(file -> readFile(file.getPath())
                            .toString()
                            .toLowerCase()
                            .contains(substring.toLowerCase()))
                    .map(File::getName)
                    .collect(Collectors.toList());
        }
        catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
            return Collections.emptyList();
        }
    }
}
