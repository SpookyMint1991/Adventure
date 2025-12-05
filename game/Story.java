package game;

import characters.GameCharacter;
import characters.Knight;
import characters.Mage;
import characters.Thief;
import java.util.Scanner;

public class Story implements Runnable
{
    public void Story() {}

    @Override
    public void run()
    {}

    public static void intro()
    {
        System.out.println("This is Adventure, a text-based story game of a small group of adventurers.");
        System.out.println("The Adventuring party consists of a Knight, a Mage, and a Thief.");
        System.out.println("The goal of the Adventurers is to travel across the lands and to prepare themselves ");
        System.out.println("for a forseen battle with an unknown enemy yet to make an appearence.");
        System.out.println();
        System.out.println("The party must travel and gain experience. To prepare themselves for the upcoming fight.");
        System.out.println("They don't know their foe but they know the fight takes place at the ancient shrine of the ");
        System.out.println("God Shadow Jesus and her desciples");
        System.out.println();
        System.out.println("==========================================================================================");
        System.out.println();
    }

    public void tenDayStory(Knight kn)
    {
        Scanner scnr = new Scanner(System.in);
        DiceRoll dice = new DiceRoll();

        if (kn.getHP() != 0){
            if (kn.getDays() == 1)
            {
                // Day 1 Prompt
                System.out.println("The Adventurers come across a small village in the middle of the woods, in search of supplies."); 
                System.out.println("They are greeted by guards outside the village walls. They aren't happy people.");
                System.out.println("You shall not enter, the Guards yell. You must convince them to let you in.");
                System.out.println("What will the Adventurers do?");
                System.out.println();
                System.out.println("==========================================================================================");
                System.out.println();

                // Day 1 Choices
                System.out.println("[A] Fight the Guards.");
                System.out.println("[B] Talk to the Guards.");
                System.out.println("[C] Leave the Village.");

                System.out.println();
                System.out.println("==========================================================================================");
                System.out.println();

                String choice = scnr.next(); 

                switch(choice)
                {
                    case "A": 
                        if (kn.getStrP() >= dice.rollDice())
                        {
                            // If they fight and win -> enter the village -> cannot trade with villagers.
                            System.out.println("The Adventurers win against the guards and enter the village."); // get nothing from this fight
                            System.out.println("The Villagers fear the Adventurers and flee from them.");
                            System.out.println("The Adventurers leave the Village empty handed.");
                        }
                        else
                        {
                            // If they fight and lose -> cannot enter the village -> Adventurers that fought lose 1 HP.
                            System.out.println("The Adventurer failed to defeat the Guards and lost 1 HP.");
                            kn.updateHP(-1);
                            System.out.println("The Adventurers leave the Village.");
                        }
                    case "B":
                        if (kn.getCharP() >= dice.rollDice())
                        {
                            // If they talk and succeed -> enter the village -> They can trade with villagers.
                            System.out.println("The Adventurers succeeded to convince the Guards to let them in.");
                            System.out.println("Three Villagers walk up the party and want to trade, but the party has");
                            System.out.println("very little to give, they can only trade with one.");
                            System.out.println("Who will you trade with?");
                            
                            System.out.println();
                            System.out.println("==========================================================================================");
                            System.out.println();

                            System.out.println("[A] The Tavern Keeper");
                            System.out.println("[B] The Seamstress");
                            System.out.println("[C] The Blacksmith");

                            System.out.println();
                            System.out.println("==========================================================================================");
                            System.out.println();

                            choice = scnr.next();
                            
                            switch (choice)
                            {
                                case "A":
                                {
                                    // option 1
                                    System.out.println("The party buys an Elixir of Swiftness"); // increases the Knights stealth by 2 points
                                    System.out.println("The Knight uses the Elixir and begins to feel lighter on their feet.");
                                    kn.updateSP(2);
                                }
                                case "B":
                                {
                                    // option 2
                                    System.out.println("The party buys a Silver-lined Cloak"); // increases the Mages strength by 2 points
                                    System.out.println("The Mage puts on the cloak and begins to feel stronger than before.");
                                }
                                case "C":
                                {
                                    // option 3
                                    System.out.println("The party buys a Sharpened Dragon Fang Dagger."); // increases the Thiefs strength by 2 points
                                    System.out.println("The Thief wastes not time claiming the dagger has their own.");
                                    System.out.println("They begin to feel like they can do so much more damage than before.");
                                }
                            }
                            System.out.println("The Adventurers leave the Village.");
                        }
                        else
                        {
                            // If they talk and fail -> cannot enter the village.
                            System.out.println("The Adventures failed to convince the Guards.");
                            System.out.println("The Adventures leave the Village.");
                        }
                    case "C":
                        {
                            // If they leave -> nothing happens.
                            System.out.println("The Adventures leave the Village.");
                        }
                }
            }
            else if (kn.getDays() == 2)
            {
                System.out.println();
                System.out.println("==========================================================================================");
                System.out.println();
            
                // Day 2 Prompt
                System.out.println("The Adventurers move further into the woods. ");
                System.out.println("After many hours they come to a fork in the path. One path, Dark, twisted trees and ");
                System.out.println("shifting shadows. The other path, lit with warm light and lined with clover and daisies.");
                System.out.println("Which path will the Adventures choose?");
                System.out.println();
                System.out.println("==========================================================================================");
                System.out.println();
            
                // Day 2 Choices
                System.out.println("[A] Dark Path.");
                System.out.println("[B] Light Path.");

                System.out.println();
                System.out.println("==========================================================================================");
                System.out.println();

            }
        }
    }

    public static void Story10Days()
    {
        // If they choose the Dark path.
        System.out.println("The Adventurers choose the Dark, twisted path and continue on their way.");

        // If they choose the Light path.
        System.out.println("The Adventurers choose the Light, floral path and continues on their way.");

        System.out.println();
        System.out.println("==========================================================================================");
        System.out.println();

        // Day 3 prompt
        System.out.println("A day passes as the Adventurers keep to their chosen path.");
        System.out.println("That is until...");
        System.out.println();

        // Day 3 Prompt based on previous choice
        // If they chose Light path
        System.out.println("The Adenturers are ambushed by a band of Elves, all armed with long swords, bows, and staffs.");
        System.out.println("What will you do?");
        System.out.println();
        System.out.println("==========================================================================================");
        System.out.println();

        // Day 3 Choices
        System.out.println("[A] Fight the Elves");
        System.out.println("[B] Talk to the Elves");
        System.out.println("[C] Run from the Elves");

        System.out.println();
        System.out.println("==========================================================================================");
        System.out.println();

        // Day 3 Consequences
        // If they fight and win -> Elves die and the party loots the corpses.
        System.out.println("The Adventurers battled the Elves and succeeded. The Elves were slaughtered.");
        System.out.println("They loot the Elves bodies and gained a Potion of Revival.");

        // If they fight and lose -> The adventurers that fought lose HP and/or Die
        System.out.println("The Adventures battle the Elves and lost. They are forced to Flee.");
        System.out.println("The Elves don't bother to chase, they found the party to be quite pathetic.");

        // If they talk (aka intimidate) and succeed to convince -> The adventurers get away unharmed
        System.out.println("The Adventurers convince the Elves that they shouldn't fight them and are allowed to leave.");

        // If they talk (aka intimidate) and fail to convince -> The adventurers are attacked and flee and lose HP or die
        System.out.println("The Adventurers fail to convince the Elves to let them go and the Elves attack the Adventures.");
        System.out.println("The party is attacked and unable to defend themselves. They are forced to flee.");
        System.out.println("The Elves don't bother to chase, they found the party to be quite pathetic.");

        // If they run and succeed to get away -> They get away and nothing happens
        System.out.println("The Adventures flee from the Elves and quickly lose them. The party is free from their Elven enemies.");

        // If they run and fail to get away -> Lose HP and/or die, if had any previous items, they are taken.
        System.out.println("The Adventurers attempt to flee but failed to get away quick enough.");
        System.out.println("An Elven Mage casts a spell to freeze the Adventurers in place and they are attacked and robbed.");

        System.out.println();
        System.out.println("==========================================================================================");
        System.out.println();
    
        // If they chose Dark path.
        System.out.println("The eerie,creepy path comes to an end revealing a massive clearing with a crystaline lagoon.");
        System.out.println("Where they are met with a copperous and emerald gilded serpent.");
        System.out.println("What will you do?");
        System.out.println();
        System.out.println("==========================================================================================");
        System.out.println();

        // Day 4 Choices
        System.out.println("[A] Fight the Serpent.");
        System.out.println("[B] Talk to the Serpent.");
        System.out.println("[C] Leave the Lagoon");

        System.out.println();
        System.out.println("==========================================================================================");
        System.out.println();

        // Day 4 Consequences
    
        // If they fight and lose -> They cannot win this fight no matter what. There are fights you will never win.
        System.out.println("The Adventurers attempt to fight the Serpent and are quickly made out as fools.");
        System.out.println("The Adventurers as stupid as they are, all parish like the fools they are.");

        // If they talk and succeed to convince -> The Adventures gain 2 HP
        System.out.println("The Adventurers talk to the Serpent and have a kind conversation. The Serpent ");
        System.out.println("reveals his name to be  and allow they party to rest in the clear waters.");
        System.out.println("The lake rejuvenates the Adventures and they begin to feel healthier than before.");
        System.out.println("After a while they say their goodbyes and leave the lagoon.");

        // If they talk and fail to convince -> they are kicked out of the lagoon -> Serpent curses the Party 
        // -> lose 2 strenght and 2 mana and 2 stealth
        System.out.println("The Adventurers speak rudely to the Serpent and are demanded to leave the lagoon.");
        System.out.println("But the rude words get to the Serpent and he curses the party.");

        // If they leave -> get nothing.
        System.out.println("The Adventures decide the lagoon and the Serpent are not worth their time.");
        System.out.println("They leave the lagoon.");

        System.out.println();
        System.out.println("==========================================================================================");
        System.out.println();

        // Day 4 prompt
        System.out.println("The Adventurers make it out if the woods into the open plains.");
        System.out.println("The quickly find their path and get a move on. But it is not very long before they sight");
        System.out.println("the first building in their path, an old abandonded windmill.");
        System.out.println("Does the Adventurers search the windmill?");
        System.out.println();
        System.out.println("==========================================================================================");
        System.out.println();
 
        // Day 4 choices
        System.out.println("[A] Enter");
        System.out.println("[B] Leave");

        System.out.println();
        System.out.println("==========================================================================================");
        System.out.println();

        // Day 4 consequences
        // if they Enter 33.33% chance -> they old man fire the canon and the party takes random amount of damage
        System.out.println("As they enter the structure they are meet with an old mad man with a canon.");
        System.out.println("The party flees but not unscathed.");

        // if they Enter 33.33% chance -> the party gets nothing
        System.out.println("As they approach the windmill, it collapses.");
        System.out.println("The Adventurers can't salvage anything from the ruins, they walk away defeated.");

        // if they Enter 33.33% chance
        System.out.println("As they enter the structure they find nothing but a chest, the adventurers loot the chest.");
        
            //randomized loot
            // option 1 -> get nothing
            System.out.println("They find nothing.");
            System.out.println("The Adventurers exit the structure and continue on their way.");

            // option 2 -> if they are cursed by the serpent -> gain 2 strenght, 2 mana, and 2 stealth
            System.out.println("They find a tome of curses, they use it to free themselves of the Serpents curse.");
            System.out.println("The Tome is destroyed after this one use. The Adventurers are sad but thankful to");
            System.out.println("be free of the curse.");
            System.out.println("The Adventurers exit the structure and continue on their way.");

            // option 2 -> if they are not cursed by the serpent
            System.out.println("They find a tome of curses, but they cannot use it, they put it away for later.");
            System.out.println("The Adventurers exit the structure and continue on their way.");

            // option 3 -> will increase health by 1 point for each character
            System.out.println("They find a potion of Healing and they all take turn passing around the bottle.");
            System.out.println("They all feel as though they have gain some extra time on this earth.");
            System.out.println("The Adventurers exit the structure and continue on their way.");

        // if they Leave
        System.out.println("The Adventurers continue on their way.");

        System.out.println();
        System.out.println("==========================================================================================");
        System.out.println();

        // Day 5 Prompt
        System.out.println("As the Adventurers continue on their way, they exit the plains into the mountainous terrain.");
        System.out.println("But they run into yet another issue. The path has been split, a new massive gorge preventing");
        System.out.println("their passage. They collectively groan in frustration.");
        System.out.println("Now they are faced with the question, how will they get back onto the path on the other side?");
        System.out.println("What will the Adventurers do?");
        System.out.println();
        System.out.println("==========================================================================================");
        System.out.println();
    
        // Day 5 Choices
        System.out.println("[A] Will they climb up the mountains and over to the other side?");
        System.out.println("[B] Will they climb down the gorge and cross from the valley floor?");

        System.out.println();
        System.out.println("==========================================================================================");
        System.out.println();
    }
}

/*
        //Day 6 prompts based on previous choice
        System.out.println("The Adventurers climb the mountain. They follow a rocky turning snowy path to the top.");
        System.out.println("They then are faced with a gate and a eerie castle.");
        System.out.println("It's not long before they are met with guards and a princess.");
        System.out.println("What will you do?");

        //Day 6 choices
        System.out.println("");
        System.out.println("");
        System.out.println("");

        //Day 6 prompts based on previous choice
        System.out.println("The Adventurers climb down into the gorge. They stumble their way across the earthen floor.");
        System.out.println("Before long they find a large cave with small amounts of gold... A dragons cave.");
        System.out.println("As they approach, they hear and feel a gust of air behind them... the dragon behind them.");
        System.out.println("What will you do?");

        System.out.println("Attempt to fight the dragon.");
        System.out.println("Run from the dragon.");
        System.out.println("Talk to the dragon.");

        //Day 7 prompt
        System.out.println("The Adventurers make their way, finally, on the other side of the gorge and back onto ");
        System.out.println("their path to the shrine.");
        System.out.println("The landscape calms as the mountainous terrain softens into rolling hills and poppy fields.");
        System.out.println("The path winds between and over hills, following the contour of the land. The path is mindless");
        System.out.println("and long, uneventful.");
        System.out.println("That is until the Adventures come across a merchant and his broken wagon.");

        //Day 7 choices
        System.out.println("");
        System.out.println("");
        System.out.println("");

        //Day 8 prompt
        System.out.println("After the merchant, the Adventurers continue, but are quickly stopped by a bickering couple.");
        System.out.println("A witch and a warlock. They demand advice for their situation");
        System.out.println("");

        System.out.println("Ignore their plees for advice.");
        System.out.println("Become their therapist.");
        System.out.println("");

        //Day 9 prompt
        System.out.println("The Adventurers are tired and know that the path they are on is way to long for their journey.");
        System.out.println("They decide to search for a short cut. They know they can pass through the closes city or");
        System.out.println("to risk traveling through the mystical pinkwood forest.");
        System.out.println("Which with they choose?");

        //Day 9 choices
        System.out.println("City");
        System.out.println("Forest");

        System.out.println("");
        System.out.println("");
        System.out.println("");

        //Day 10 prompt (boss fight)
        System.out.println("This is to be decided...");
        System.out.println("");
        System.out.println("");

        System.out.println("");
        System.out.println("");
        System.out.println("");
*/

