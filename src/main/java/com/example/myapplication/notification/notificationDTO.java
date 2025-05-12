package com.example.myapplication.notification;

import java.util.Date;

public class notificationDTO {

    private Date date;
    private String format;
    private String productName;

    public notificationDTO(Date date2, String format, String name) {
        this.date = date2;
        this.format = format;
        this.productName = name;
    }

    public String getProductName() {
        return this.productName;
    }

    public Date getDate() {
        return this.date;
    }

    public String getFormat() {
        return this.format;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
