import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Adventure
{
    public static void main(String[] args) 
    {
        Knight knight = new Knight();
        Mage mage = new Mage();
        Thief thief = new Thief();

        knight.setHP();
        knight.setMP();
        knight.setSP();
        knight.setStrPoints();
        knight.setCharPoints();

        mage.setHP();
        mage.setMP();
        mage.setSP();
        mage.setStrPoints();
        mage.setCharPoints();

        thief.setHP();
        thief.setMP();
        thief.setSP();
        thief.setStrPoints();
        thief.setCharPoints();

        Scanner scnr = new Scanner(System.in);

        //Introduction
        System.out.println("This is Adventure, a text-based story game of a small group of adventurers.");
        System.out.println("The Adventuring party consists of a Knight, a Mage, and a Thief.");
        System.out.println("The goal of the Adventurers is to travel across the lands and to prepare themselves ");
        System.out.println("for a forseen battle with an unknown enemy yet to make an appearence.");
        System.out.println();
        System.out.println("The party must travel and gain experience. Prepare themselves for the upcoming fight.");
        System.out.println();
        System.out.println("==========================================================================================");
        System.out.println();

        //Day 1
        System.out.println("The Adventurers come across a small village in the middle of the woods, in search of supplies."); 
        System.out.println("They are greeted by guards outside the village walls. They aren't happy people.");
        System.out.println("You shall not enter, the Guards yell. You must convince them to let you in.");

        //add the choices and consequences.

        

        //Day 2
        System.out.println("Leaving the Village, the Adventurers go down ");
        System.out.println("");
        System.out.println("");


        //Day 3
        System.out.println("");
        System.out.println("");
        System.out.println("");


        //Day 4
        System.out.println("");
        System.out.println("");
        System.out.println("");


        //Day 5
        System.out.println("");
        System.out.println("");
        System.out.println("");


        //Day 6
        System.out.println("");
        System.out.println("");
        System.out.println("");


        //Day 7
        System.out.println("");
        System.out.println("");
        System.out.println("");


        //Day 8
        System.out.println("");
        System.out.println("");
        System.out.println("");


        //Day 9
        System.out.println("");
        System.out.println("");
        System.out.println("");


        //Day 10
        System.out.println("");
        System.out.println("");
        System.out.println("");

        
    }
}