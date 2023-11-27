package com.example;
 
import java.util.ArrayList;
import java.util.UUID;

public class BuildingManagementSystem
{
    
    private ArrayList<Building> buildings = new ArrayList<Building>();

    
    public ArrayList<Building> getBuildings() 
    {
        return buildings;
    }

    public UUID addBuilding(Building building) 
    {
        buildings.add(building);
        return building.getId();
    }

    public void removeBuilding(Building building) 
    {
        buildings.remove(buildings.indexOf(building));
    }
}