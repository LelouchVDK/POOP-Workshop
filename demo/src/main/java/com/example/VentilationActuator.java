package com.example;

import java.util.UUID;

public class VentilationActuator extends Actuator 
{
    public VentilationActuator(String name, UUID id) 
    {
        super(name, id);
    }

    @Override
    public String toString() 
    {
        return "name: " + getName() + ", value: " + getValue();
    }

}