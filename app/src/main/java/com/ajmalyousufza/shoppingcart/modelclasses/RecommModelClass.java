package com.ajmalyousufza.shoppingcart.modelclasses;

public class RecommModelClass {

    String recommId;
    String recommImage;
    String recommName;

    public RecommModelClass(String recommId, String recommImage, String recommName) {
        this.recommId = recommId;
        this.recommImage = recommImage;
        this.recommName = recommName;
    }

    public String getRecommId() {
        return recommId;
    }

    public void setRecommId(String recommId) {
        this.recommId = recommId;
    }

    public String getRecommImage() {
        return recommImage;
    }

    public void setRecommImage(String recommImage) {
        this.recommImage = recommImage;
    }

    public String getRecommName() {
        return recommName;
    }

    public void setRecommName(String recommName) {
        this.recommName = recommName;
    }
}
