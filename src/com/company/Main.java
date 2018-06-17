package com.company;
import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Paths;
import java.util.*;


public class Main {

    public static void main(String[] args) {
    ArrayList<Location> locationArrayList = new ArrayList<>();
    ArrayList<Concentration> concentrationArrayList = new ArrayList<>();
    ArrayList<Point> pointArrayList = new ArrayList<>();

    readLocations(locationArrayList);
    readConcentrations(concentrationArrayList);
    integrateLists(locationArrayList,concentrationArrayList, pointArrayList);




    }

    //reads the Excel file of locations to to a list of Location
    private static void readLocations (ArrayList <Location> listOfLoc)
    {
        File input = new File("ICPResult.txt");
        Scanner in = new Scanner(new FileReader("C:\\Users\\longyuxi\\Documents\\ICPResult.txt"));
    }
6667yh                                                                                                                                                                                                          

    //reads the Excel file of concentrations to a list of Concentration
    private static void readConcentrations(ArrayList<Concentration> listOfConc)
    {
        //to be implemented
    }

    //integrate Location list and Concentration list to Point list
    private static void integrateLists(ArrayList<Location> listOfLoc, ArrayList<Concentration> listOfConc, ArrayList<Point> listOfPoint)
    {
        //to be implemented
    }
}
