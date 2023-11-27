package com.example;

import java.util.UUID;

public class Sensor extends Unit
{

    public Sensor(String name, UUID id) 
    {
        super(name, id);
    }

    private double value;


    public double getValue()
    {
        return value;
    }

}