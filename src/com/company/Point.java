package com.company;

public class Point
{
    private String name;
    private int pumpType;
    private Location loc;
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
}