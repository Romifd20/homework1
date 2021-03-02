package com.company;

public class Samsung extends  Gadjet{
    private String name;
    private String model;
    private String commands;

    public Samsung(){

    }
    public Samsung(String name,String model,Color color,Android android) {
        this.name = name;
        this.model = model;
        super.getColor(color);
        super.getAndroid(android);
    }
    public Samsung(String name,String model,Color color,Gadjet gadjet,String[] commands){

    }

    public static String getName(String namee){return  namee;}


    public static String getModel(String modell){
        return modell;

    }

    public String getCommands(String[] strings){
        return commands;

    }
    public void  makeVoice(String voice,int number){
        for (int i = 0; i < number; i++){
            System.out.println(voice);
        }

    }
    public String getInfo(){
        return super.getInfo()+"\nName = "+name + "\nModel= " + model + " \ncommands = " + commands;
    }
}

