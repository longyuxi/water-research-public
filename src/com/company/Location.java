package com.company;//initiates a location object with longitude and latitude

public class Location
{
    private double longitude;
    private double latitude;
    private int pumpType;

    public Location(int longt, int lat, int pumpType)
    {
        longitude = longt;
        latitude = lat;
        this.pumpType = pumpType;
    }

    public Location() {
    }

    public double getLongitude()
    {
        return longitude;
    }

    public double getLatitude()
    {
        return latitude;
    }

    public int getPumpType() {
        return pumpType;
    }

}