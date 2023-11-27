package com.example;

import java.util.UUID;

public class Unit 
{
    private String name;
    public UUID id;

    /**
     * Constructor
     * @param name
     * @param id
     */
    public Unit(String name, UUID id)
    {
        this.name = name;
        this.id = id;
    }

    /**
     * Getter
     * @return name
     */
    public String getName() { return name; }

    public UUID getId() { return id; }
}