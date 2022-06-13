package com.company;

public class Serial {
    private String name;
    private double duration;

    public Serial(String name, double duration) {
        this.name = name;
        this.duration = duration;
    }

    void show(int series_number){
        System.out.println(name +" "+ duration +" "+ series_number + " серія");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getDuration() {
        return duration;
    }
    public void setDuration(double duration) {
        this.duration = duration;
    }
}

