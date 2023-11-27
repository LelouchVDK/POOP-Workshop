package com.example;

import java.util.UUID;

public class TemperatureSensor extends Sensor 
{
    public TemperatureSensor(String name, UUID id) 
    {
        super(name, id);
    }

    @Override
    public String toString() 
    {
        return "name: " + getName() + ", value: " + getValue();
    }
}