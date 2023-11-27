package com.example;

import java.util.UUID;

public class Co2Sensor extends Sensor 
{
    public Co2Sensor(String name, UUID id) 
    {
        super(name, id);
    }

    @Override
    public String toString() 
    {
        return "name: " + getName() + ", value: " + getValue();
    }
}