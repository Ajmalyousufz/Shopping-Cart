package com.ajmalyousufza.shoppingcart.modelclasses;

public class WillBuyModelClass {
    String item_id;
    String item_name;
    String item_image;
    String item_price;
    String item_desc;

    public WillBuyModelClass() {
    }

    public WillBuyModelClass(String item_id, String item_name, String item_image, String item_price, String item_desc) {
        this.item_id = item_id;
        this.item_name = item_name;
        this.item_image = item_image;
        this.item_price = item_price;
        this.item_desc = item_desc;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_image() {
        return item_image;
    }

    public void setItem_image(String item_image) {
        this.item_image = item_image;
    }

    public String getItem_price() {
        return item_price;
    }

    public void setItem_price(String item_price) {
        this.item_price = item_price;
    }

    public String getItem_desc() {
        return item_desc;
    }

    public void setItem_desc(String item_desc) {
        this.item_desc = item_desc;
    }
}
