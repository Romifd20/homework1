package com.company;

import java.util.Random;

public class Gadjet {
    private int year;
    private Color color;
private Android android;

     public int getYear() {
        return year;
    }

    public Color getColor(Color color) {
        return this.color;
    }

    public Android getAndroid(Android android) {
        return this.android;
    }
    Random random = new Random();

    public int generalDefaultYear() {
         return new Random().nextInt(18)+1;
    }
    public String getInfo(){
        return "Year = "+year+"\nColor = "+color+"\nAndroid = +"+android;}
    }



