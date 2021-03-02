package com.company;

import java.time.Year;

public class Main {

    public static void main(String[] args) {
        Samsung samsung = new Samsung();

        Samsung.getName("samsung");
        Samsung.getModel("a20");
        samsung.getColor(Color.BlACK);
        samsung.getCommands(new String[] {"to push","come in","undo"});
        samsung.getAndroid(new Android("oreo","oreo1"));

        System.out.println(samsung.getInfo());
        samsung.makeVoice("tyn tyn",2);



    }

}
