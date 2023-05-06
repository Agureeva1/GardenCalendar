package com.example.cardencalendar;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class SomeWork {
    private int volume;
    private double weight;
    private String substance;
    private String date;
    DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd.MM.uuuu");

    public SomeWork(){}
    public SomeWork (int volume){
        this.volume=volume;
        LocalDate dataNow = LocalDate.now();
        this.date = dataNow.format(formatters);
    }
    public SomeWork (String substance){
        this.substance = substance;
        LocalDate dataNow = LocalDate.now();
        this.date = dataNow.format(formatters);
    }
//    public SomeWork (int volume,String substance){
//        this.volume=volume;
//        this.substance = substance;
//        LocalDate dataNow = LocalDate.now();
//        this.date = dataNow.format(formatters);}

        public SomeWork (double weight,String substance){
            this.weight=weight;
            this.substance = substance;
            LocalDate dataNow = LocalDate.now();
            this.date = dataNow.format(formatters);

    }

    public int getVolume() {
        return volume;
    }

    public double getWeight() {return weight;}

    public String getSubstance() {
        return substance;
    }

    public String getDate() {
        return date;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setWeight(double weight) {this.weight = weight;}

    public void setSubstance(String substance) {
        this.substance = substance;
    }

    public void setDate(String date) {
        this.date = date;
    }

       }
