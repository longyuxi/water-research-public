package com.company;
import java.io.*;
import java.nio.file.Paths;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

    ArrayList<Location> locationArrayList = new ArrayList<>();
    ArrayList<Concentration> concentrationArrayList = new ArrayList<>();
    ArrayList<Point> pointArrayList = new ArrayList<>();
    for(int i = 0; i < 160; i++)
        locationArrayList.add(new Location());
    for(int i = 0; i < 160; i++)
        concentrationArrayList.add(new Concentration());
    for(int i = 0; i < 160; i++)
        pointArrayList.add(new Point());

    readConcentrations(concentrationArrayList);
    System.out.println(concentrationArrayList.get(14).getName());
        for (float f: concentrationArrayList.get(14).getConc()
             ) {
            System.out.print(f + " ");
        }

    }


    //reads the Excel file of concentrations to a list of Concentration
    private static void readConcentrations(ArrayList<Concentration> listOfConc) throws IOException
    {
        String pix;
        String name = "";
        float[] concs = new float[22];
        int sampleIndex = 0;
        Scanner in = new Scanner(Paths.get("ICPResult.txt"));

        for(; sampleIndex < 160; sampleIndex++)
        {
            for(int i = 0; i < 24; i++)
            {
                pix = in.next();

                //assigns the column into name
                if(i == 0)
                {
                    name = pix;
                }

                //assigns value read into conc[]
                if(i > 1)
                {
                    try {
                        concs[i - 2] = Float.valueOf(pix.trim()).floatValue();
                    }
                    catch (NumberFormatException nfe)
                    {
                        System.out.println("NFE ERROR!");
                    }

                }

            }

            if(name.equals(""))
                System.out.println("NAME NOT INITIALIZED");

            Concentration concentrationToBeSet = new Concentration();
            concentrationToBeSet.setConc(concs);
            concentrationToBeSet.setName(name);
            listOfConc.set(sampleIndex, concentrationToBeSet);

            System.out.println("Name is " + name);
            System.out.print("Concentrations: ");
            for (float f: concs
                 ) {
                System.out.print(f + " ");
            }
            System.out.println();
        }

        in.close();

    }

    //reads the file of locations to to a list of Location
    //NOT DONE YET
    private static void readLocations (ArrayList <Location> listOfLoc) throws IOException
    {
        File input = new File("ICPResult.txt");
        Scanner in = new Scanner(Paths.get("ICPResult.txt"));
        for(int i = 0; i < 13; i++)
        {
            System.out.println(in.nextLine());
        }
        in.close();
        Scanner in2 = new Scanner(Paths.get("ICPResult.txt"));


    }

    //integrate Location list and Concentration list to Point list
    private static void integrateLists(ArrayList<Location> listOfLoc, ArrayList<Concentration> listOfConc, ArrayList<Point> listOfPoint)
    {
        if(!(listOfLoc.size()==listOfConc.size() && listOfConc.size() == listOfPoint.size()))
        {
            System.out.println("ERROR!");
            return;
        }

        for(int i = 0; i < listOfLoc.size(); i++)
        {
            listOfPoint.get(i).setLoc(listOfLoc.get(i));
            listOfPoint.get(i).setName(listOfConc.get(i).getName());
            listOfPoint.get(i).setPumpType(listOfLoc.get(i).getPumpType());
        }
        //to be implemented
    }
}
