package ru.sokolskaja;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Searchinfo {

    @SerializedName("totalhits")
    @Expose
    private Integer totalhits;

    /**
     * No args constructor for use in serialization
     *
     */
    public Searchinfo() {
    }

    /**
     *
     * @param totalhits
     */
    public Searchinfo(Integer totalhits) {
        super();
        this.totalhits = totalhits;
    }

    public Integer getTotalhits() {
        return totalhits;
    }

    public void setTotalhits(Integer totalhits) {
        this.totalhits = totalhits;
    }

}
