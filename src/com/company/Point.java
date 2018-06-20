package com.company;

public class Point
{
    private String name;
    private int pumpType;
    private Location loc;
    public Point()
    {}

    public Point(String str, int pumpT, Location loc)
    {
        name = str;
        pumpType = pumpT;
        this.loc = loc;
    }

    public String getName() {
        return name;
    }

    public int getPumpType() {
        return pumpType;
    }

    public double getLong()
    {
        return loc.getLongitude();
    }

    public double getLat()  { return loc.getLatitude(); }

    public void setName(String name) {
        this.name = name;
    }

    public void setPumpType(int pumpType) {
        this.pumpType = pumpType;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }
}