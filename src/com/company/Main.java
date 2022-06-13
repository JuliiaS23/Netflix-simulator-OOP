package com.company;

public class Main {

    public static void main(String[] args) {

        Serial clinic = new Serial("Клініка", 55.5);
        Serial mandalorian = new Serial("Мандалорець", 60.0);
        Serial sherlock = new Serial("Шерлок", 57.0);
        Netflix netflix = new Netflix();
        netflix.search(clinic,7);
        netflix.search(mandalorian, 5);
        netflix.search(sherlock, 10);
    }
}

