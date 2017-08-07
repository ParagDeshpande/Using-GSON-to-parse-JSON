package com.parag.catchtest.Helper_Classes;
import com.google.gson.annotations.SerializedName;

/**
 * Created by parag on 7/08/2017.
 */

public class ItemObject {

    @SerializedName("title")
    private String title;
    @SerializedName("subtitle")
    private String subTitle;
    @SerializedName("id")
    private String id;
    @SerializedName("content")
    private String content;

    public ItemObject(){

    }

    public ItemObject(String text1, String text2, String id1, String text3) {
        this.title = text1;
        this.subTitle = text2;
        this.id = id1;
        this.content = text3;
    }
    public String getTitle() {
        return title;
    }
    public String getSubTitle() {
        return subTitle;
    }
    public String getId() {
        return id;
    }
    public String getContent() {
        return content;
    }

    public String setTitle() {
        return title;
    }
    public String setSubTitle() {
        return subTitle;
    }
    public String setId() {
        return id;
    }
    public String setContent() {
        return content;
    }
}