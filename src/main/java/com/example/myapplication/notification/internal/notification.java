package com.example.myapplication.notification.internal;
import java.util.Date;

public class notification {
    private Date date;
    private String format;
    private String productName;

    public notification(Date date, String format ,String productName) {
        this.date = date;
        this.format = format;
        this.productName = productName;
    }

    public notification() {
      //TODO Auto-generated constructor stub
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
