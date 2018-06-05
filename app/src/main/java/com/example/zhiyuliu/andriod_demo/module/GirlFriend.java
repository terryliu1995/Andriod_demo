package com.example.zhiyuliu.andriod_demo.module;

public class GirlFriend {

    private String girlName;
    private String girlDescription;
    private int girlImage;

    public GirlFriend(String girlName, String girlDescription, int girlImage) {
        this.girlName = girlName;
        this.girlDescription = girlDescription;
        this.girlImage = girlImage;
    }

    public String getGirlName() {
        return girlName;
    }

    public String getGirlDescription() {
        return girlDescription;
    }

    public int getGirlImage() {
        return girlImage;
    }
}