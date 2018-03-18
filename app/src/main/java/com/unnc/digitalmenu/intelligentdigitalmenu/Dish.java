package com.unnc.digitalmenu.intelligentdigitalmenu;

/**
 * Created by xys_0329 on 2018/3/6.
 */

public class Dish {
    private String name;

    private int imageId;

    public Dish(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
