package com.example.covid19alerts.Model;

public class symptomsModel {
    int img;
    String title;

    public symptomsModel() {
    }

    public symptomsModel(int img, String title) {
        this.img = img;
        this.title = title;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
