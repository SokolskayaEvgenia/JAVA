package ru.sokolskaja;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Continue {

    @SerializedName("sroffset")
    @Expose
    private Integer sroffset;
    @SerializedName("continue")
    @Expose
    private String _continue;

    /**
     * No args constructor for use in serialization
     *
     */
    public Continue() {
    }

    /**
     *
     * @param _continue
     * @param sroffset
     */
    public Continue(Integer sroffset, String _continue) {
        super();
        this.sroffset = sroffset;
        this._continue = _continue;
    }

    public Integer getSroffset() {
        return sroffset;
    }

    public void setSroffset(Integer sroffset) {
        this.sroffset = sroffset;
    }

    public String getContinue() {
        return _continue;
    }

    public void setContinue(String _continue) {
        this._continue = _continue;
    }

}
