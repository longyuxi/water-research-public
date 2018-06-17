package com.company;//initiates a location object with longitude and latitude

public class Coordinate
{
    private double longitude;
    private double latitude;

    public Coordinate(int longt, int lat)
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