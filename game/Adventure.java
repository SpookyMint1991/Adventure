package game;

import characters.Knight;
import characters.Mage;
import characters.Thief;

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

        //add the choices, the texts, and consequences.

        

        //Day 2
        System.out.println("Leaving the Village, the Adventurers enter further into the woods. ");
        System.out.println("After many hours they come to a fork in the path. One path, Dark, twisted trees");
        System.out.println("and shifting shadows. The other path, lit with warm light and lined with clover and daisies.  ");


        System.out.println("The Adventurers choose the Dark, twisted path and continue on their way.");
        
        System.out.println("The Adventurers chose the Light, floral path and continues on their way.");

        //Day 3
        System.out.println("As the Adventurers follow their chosen path...");

        System.out.println("They are ambushed by a band of Elves, all armed with long swords, bows, and staffs.");

        System.out.println("They exit the creepy path into a contrasting clearing with a crystaline lagoon.");
        System.out.println("Where they are met with a copperous and emerald gilded serpent.");


        //Day 4
        System.out.println("The Adventurers make it out if the woods into the open plains.");
        System.out.println("The quickly find their path and get a move on. But it is not very long before they sight");
        System.out.println("the first building in their path, an old abandonded windmill.");
        System.out.println("Do the Adventurers search the windmill?");

        System.out.println("As they enter the structure they are meet with an old mad man with a canon.");

        System.out.println("As they approach the windmill, it collapses.");

        System.out.println("The Adventurers continue on their way.");


        //Day 5
        System.out.println("As the Adventurers continue on their way, they exit the plains into the mountainous terrain.");
        System.out.println("But they run into yet another issue. The path has been split, creating a new massive gorge.");
        System.out.println("Now they are faced with out will they get back onto the path on the other side?");

        System.out.println("Will they climb up the mountains and over to the other side?");
        System.out.println("Will they climb down the gorge and cross from the valley floor?");


        //Day 6
        System.out.println("The Adventurers climb the mountain. They follow a rocky turning snowy path to the top.");
        System.out.println("They then are faced with a gate and a eerie castle.");
        System.out.println("It's not long before they are met with guards and a princess.");

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("The Adventurers climb down into the gorge. They stumble their way across the earthen floor.");
        System.out.println("Before long they find a large cave with small amounts of gold... A dragons cave.");
        System.out.println("As they approach, they hear and feel a gust of air behind them... the dragon behind them.");

        //Day 7
        System.out.println("The Adventurers make their way, finally, on the other side of the gorge and back onto ");
        System.out.println("their path to the statue.");
        System.out.println("The landscape calms as the mountainous terrain softens into rolling hills and poppy fields.");
        System.out.println("The path winds between and over hills, following the contour of the land. The path is mindless");
        System.out.println("and long, uneventful.");
        System.out.println("That is until the Adventures come across a merchant and his broken wagon.");

        System.out.println("");
        System.out.println("");
        System.out.println("");

        //Day 8
        System.out.println("After the merchant, the Adventurers continue, but are quickly stopped by a bickering couple.");
        System.out.println("A witch and a warlock. They demand advice for their situation");
        System.out.println("");


        //Day 9
        System.out.println("The Adventurers are tired and know that the path they are on is way to long for their journey.");
        System.out.println("They decide to search for a short cut. They know they can pass through the closes city or");
        System.out.println("to risk traveling through the mystical pinkwood forest.");

        System.out.println("Which with they choose?");
        System.out.println("City");
        System.out.println("Forest");


        //Day 10
        System.out.println("This is to be decided...");
        System.out.println("");
        System.out.println("");

        
    }
}