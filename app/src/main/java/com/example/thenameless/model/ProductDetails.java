package com.example.thenameless.model;

import com.google.firebase.Timestamp;

public class ProductDetails {

    private String type;
    private String title;
    private String userId;
    private int price;
    private String userName;
    private String description;
    private String timeAdded;
    private String image1_url;
    private String image2_url;
    private String image3_url;
    private String image4_url;
    private String lastUpdated;

    public ProductDetails() {

    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTimeAdded() {
        return timeAdded;
    }

    public void setTimeAdded(String timeAdded) {
        this.timeAdded = timeAdded;
    }

    public String getImage1_url() {
        return image1_url;
    }

    public void setImage1_url(String image1_url) {
        this.image1_url = image1_url;
    }

    public String getImage2_url() {
        return image2_url;
    }

    public void setImage2_url(String image2_url) {
        this.image2_url = image2_url;
    }

    public String getImage3_url() {
        return image3_url;
    }

    public void setImage3_url(String image3_url) {
        this.image3_url = image3_url;
    }

    public String getImage4_url() {
        return image4_url;
    }

    public void setImage4_url(String image4_url) {
        this.image4_url = image4_url;
    }
}