package com.company;//initiates a location object with longitude and latitude

public class Location
{
    private double longitude;
    private double latitude;

    public Location(int longt, int lat)
    {
        longitude = longt;
        latitude = lat;
    }

    public double getLongitude()
    {
        return longitude;
    }

    public double getLatitude()
    {
        return latitude;
    }
}