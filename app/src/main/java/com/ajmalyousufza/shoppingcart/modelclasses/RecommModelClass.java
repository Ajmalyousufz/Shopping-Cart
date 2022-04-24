package com.ajmalyousufza.shoppingcart.modelclasses;

public class RecommModelClass {

    String recommId;
    String recommImage;
    String recommLargeImage;
    String recommName;
    String recommDesc;
    String recommParticularDesc;
    String recommServiceDesc;
    String recommPrice;
    String recommQuantity;
    String recommIce;
    String recommSugar;
    String recommRating;
    boolean recommCarted;

    public RecommModelClass(String recommId, String recommImage,String recommLargeImage, String recommName,
                            String recommDesc,String recommParticularDesc,
                            String recommServiceDesc,String recommPrice,String recommQuantity,String recommIce,String recommSugar,String recommRating,boolean recommCarted) {
        this.recommId = recommId;
        this.recommImage = recommImage;
        this.recommName = recommName;
        this.recommDesc = recommDesc;
        this.recommParticularDesc = recommParticularDesc;
        this.recommServiceDesc = recommServiceDesc;
        this.recommPrice = recommPrice;
        this.recommQuantity = recommQuantity;
        this.recommIce = recommIce;
        this.recommSugar = recommSugar;
        this.recommRating = recommRating;
        this.recommCarted = recommCarted;
        this.recommLargeImage = recommLargeImage;
    }

    public String getRecommLargeImage() {
        return recommLargeImage;
    }

    public void setRecommLargeImage(String recommLargeImage) {
        this.recommLargeImage = recommLargeImage;
    }

    public boolean isRecommCarted() {
        return recommCarted;
    }

    public void setRecommCarted(boolean recommCarted) {
        this.recommCarted = recommCarted;
    }

    public String getRecommRating() {
        return recommRating;
    }

    public void setRecommRating(String recommRating) {
        this.recommRating = recommRating;
    }

    public String getRecommDesc() {
        return recommDesc;
    }

    public void setRecommDesc(String recommDesc) {
        this.recommDesc = recommDesc;
    }

    public String getRecommParticularDesc() {
        return recommParticularDesc;
    }

    public void setRecommParticularDesc(String recommParticularDesc) {
        this.recommParticularDesc = recommParticularDesc;
    }

    public String getRecommServiceDesc() {
        return recommServiceDesc;
    }

    public void setRecommServiceDesc(String recommServiceDesc) {
        this.recommServiceDesc = recommServiceDesc;
    }

    public String getRecommPrice() {
        return recommPrice;
    }

    public void setRecommPrice(String recommPrice) {
        this.recommPrice = recommPrice;
    }

    public String getRecommQuantity() {
        return recommQuantity;
    }

    public void setRecommQuantity(String recommQuantity) {
        this.recommQuantity = recommQuantity;
    }

    public String getRecommIce() {
        return recommIce;
    }

    public void setRecommIce(String recommIce) {
        this.recommIce = recommIce;
    }

    public String getRecommSugar() {
        return recommSugar;
    }

    public void setRecommSugar(String recommSugar) {
        this.recommSugar = recommSugar;
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
