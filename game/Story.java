package game;

import characters.Knight;
import java.util.Scanner;

public class Story implements Runnable
{
    public void Story() {}

    @Override
    public void run()
    {}

    public void intro(Story st)
    {
        System.out.println();
        System.out.println("This is Adventure, a text-based story game of a small group of adventurers.");
        System.out.println("The Adventuring party consists of a Knight, a Mage, and a Thief.");
        System.out.println("The goal of the Adventurers is to travel across the lands and to prepare themselves ");
        System.out.println("for a forseen battle with an unknown enemy yet to make an appearence.");
        System.out.println();
        System.out.println("The party must travel and gain experience. To prepare themselves for the upcoming fight.");
        System.out.println("They don't know their foe but they know the fight takes place at the ancient shrine of the ");
        System.out.println("God Shadow Jesus and her desciples");
        st.breakLine();
    }

    public void breakLine()
    {
        System.out.println();
        System.out.println("==========================================================================================");
        System.out.println();
    }

    public void tenDayStory(Knight gc, Story st)
    {
        Scanner scnr = new Scanner(System.in);
        DiceRoll dice = new DiceRoll();
        String choice; 
        int location = 0;
        int chance;
        boolean cursed = false;
        boolean tome = false;
        boolean play = true;
        boolean hasGold = false;
        int start = 1;

        for(int i = 1; i <= 11; i++)
        {
            if (start == 1)
            {
                st.breakLine();

                System.out.println("Would you like to start the Adventure?");
                System.out.println();
                System.out.println("[A] Yes");
                System.out.println("[B] No");

                st.breakLine();
                
                choice = scnr.next();

                switch (choice)
                {
                    case "A":
                    {
                        System.out.println("The Adventure Starts.");
                    }
                    break;

                    case "B":
                    {
                        play = false;
                        System.out.println("The Adventure comes to an End. Thanks for not playing, I guess.");
                    }        
                }
                start = start + 1;
            }
            if (play == true && gc.getHP() > 0 && gc.getDays() == 1)
            {
            
                st.breakLine();

                // Day 1 Prompt
                System.out.println("The Adventurers come across a small village in the middle of the woods, in search of supplies."); 
                System.out.println("They are greeted by guards outside the village walls. They aren't happy people.");
                System.out.println("\"You shall not enter,\" the Guards yell. You must convince them to let you in.");
                System.out.println("What will the Adventurers do?");
                st.breakLine();

                // Day 1 Choices
                System.out.println("[A] Fight the Guards.");
                System.out.println("[B] Talk to the Guards.");
                System.out.println("[C] Leave the Village.");

                st.breakLine();

                choice = scnr.next(); 

                switch(choice)
                {
                    case "A": 
                        if (dice.rollDice(gc.getStrP()) >= dice.rollDice())
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
                            gc.updateHP(-1);
                            System.out.println("The Adventurers leave the Village.");
                        }
                        break;
                    case "B":
                        if (dice.rollDice(gc.getCharP()) >= dice.rollDice())
                        {
                            // If they talk and succeed -> enter the village -> They can trade with villagers.
                            System.out.println("The Adventurers succeeded to convince the Guards to let them in.");
                            System.out.println("Three Villagers walk up the party and want to trade, but the party has");
                            System.out.println("very little to give, they can only trade with one Villager.");
                            System.out.println("Who will you trade with?");
                            
                            st.breakLine();

                            System.out.println("[A] The Tavern Keeper");
                            System.out.println("[B] The Seamstress");
                            System.out.println("[C] The Blacksmith");

                            st.breakLine();

                            choice = scnr.next();
                            
                            switch (choice)
                            {
                                case "A":
                                {
                                    // option 1
                                    System.out.println("The party buys an Elixir of Swiftness from the Tavern Keeper"); // increases the Knights stealth by 2 points
                                    System.out.println("The Knight uses the Elixir and begins to feel lighter on their feet.");
                                    gc.updateSP(2);
                                }
                                break;
                                case "B":
                                {
                                    // option 2
                                    System.out.println("The party buys a Silver-lined Cloak from the Seamstress"); // increases the Mages strength by 2 points
                                    System.out.println("The Mage puts on the cloak and begins to feel stronger than before.");
                                }
                                break;
                                case "C":
                                {
                                    // option 3
                                    System.out.println("The party buys a Sharpened Dragon Fang Dagger from the Blacksmith."); // increases the Thiefs strength by 2 points
                                    System.out.println("The Thief wastes not time claiming the dagger has their own.");
                                    System.out.println("They begin to feel like they can do so much more damage than before.");
                                }
                                break;
                            }
                            System.out.println("The Adventurers leave the Village.");
                            break;
                        }
                        else
                        {
                            // If they talk and fail -> cannot enter the village.
                            System.out.println("The Adventures failed to convince the Guards.");
                            System.out.println("The Adventures leave the Village.");
                        }
                        break;
                    case "C":
                        {
                            // If they leave -> nothing happens.
                            System.out.println("The Adventures leave the Village.");
                        }
                        break;
                }

                gc.updateDays(1);

                st.breakLine();

                System.out.println("The day comes to an end.");
                System.out.println();

                gc.getStats();
                
                st.breakLine();

                System.out.println("Continue?");
                System.out.println("[A] Yes");
                System.out.println("[B] No");

                st.breakLine();
                
                choice = scnr.next();

                switch (choice)
                {
                    case "A":
                    {
                        System.out.println("The Adventure Continues.");
                    }
                    break;

                    case "B":
                    {
                        play = false;
                        System.out.println("The Adventure comes to an End,");
                    }        
                }
            }
            else if (play == true && gc.getHP() > 0 && gc.getDays() == 2)
            {
                st.breakLine();
            
                // Day 2 Prompt
                System.out.println("The Adventurers move further into the woods. ");
                System.out.println("After many hours they come to a fork in the path. One path, Dark, twisted trees and ");
                System.out.println("shifting shadows. The other path, lit with warm light and lined with clover and daisies.");
                System.out.println("Which path will the Adventures choose?");
                st.breakLine();
            
                // Day 2 Choices
                System.out.println("[A] Dark Path.");
                System.out.println("[B] Light Path.");

                st.breakLine();

                choice = scnr.next();

                switch (choice)
                {
                    case "A": 
                    {
                        location = 1;
                        // If they choose the Dark path.
                        System.out.println("The Adventurers choose the Dark, twisted path and continue on their way.");
                    }
                    break;
                    
                    case "B":
                    {
                        location = 2;
                        // If they choose the Light path.
                        System.out.println("The Adventurers choose the Light, floral path and continues on their way.");
                    }
                    break;
                }
                gc.updateDays(1);

                st.breakLine();

                System.out.println("The day comes to an end.");
                System.out.println();

                gc.getStats();
                
                st.breakLine();

                System.out.println("Continue?");
                System.out.println("[A] Yes");
                System.out.println("[B] No");

                st.breakLine();
                
                choice = scnr.next();

                switch (choice)
                {
                    case "A":
                    {
                        System.out.println("The Adventure Continues.");
                    }
                    break;

                    case "B":
                    {
                        play = false;
                        System.out.println("The Adventure comes to an End,");
                    }        
                }

            }
            else if (play == true && gc.getHP() > 0 && gc.getDays() == 3) 
            {
                if (location == 1) 
                {
                    st.breakLine();

                    // If they chose Dark path.
                    System.out.println("The eerie, creepy path comes to an end revealing a massive clearing with a crystaline lagoon.");
                    System.out.println("Where they are met with a copperous and emerald gilded serpent.");
                    System.out.println("What will the Adventurers do?");
                    st.breakLine();

                    // Day 4 Choices
                    System.out.println("[A] Fight the Serpent.");
                    System.out.println("[B] Talk to the Serpent.");
                    System.out.println("[C] Leave the Lagoon");

                    st.breakLine();

                    choice = scnr.next();

                    switch (choice)
                    {
                        case "A":
                        {
                            // If they fight and lose -> They cannot win this fight no matter what. There are fights you will never win.
                            System.out.println("The Adventurers attempt to fight the Serpent and are quickly made out to be fools.");
                            System.out.println("The Adventurers, as stupid as they are, all parish.");
                            gc.updateHP(-1000);
                        }
                        break;

                        case "B":
                        {
                            if (dice.rollDice(gc.getCharP()) >= dice.rollDice()) 
                            {
                                // If they talk and succeed to convince -> The Adventures gain 2 HP
                                System.out.println("The Adventurers talk to the Serpent and have a kind conversation. The Serpent ");
                                System.out.println("reveals his name to be Vasuki and allow they party to rest in the clear waters.");
                                System.out.println("The lake rejuvenates the Adventures and they begin to feel healthier than before.");
                                System.out.println("After a while they say their goodbyes and leave the lagoon.");
                                gc.updateHP(2);

                            }
                            else if (dice.rollDice(gc.getCharP()) < dice.rollDice())
                            {
                                // If they talk and fail to convince -> they are kicked out of the lagoon -> Serpent curses the Party 
                                // -> lose 2 strenght and 2 mana and 2 stealth
                                System.out.println("The Adventurers speak rudely to the Serpent and are demanded to leave the lagoon.");
                                System.out.println("But the rude words get to the Serpent and he curses the party.");
                                cursed = true;
                                gc.updateStrP(-2);
                                gc.updateMP(-2);
                                gc.updateSP(-2);
                            }
                        }
                        break;

                        case "C":
                        {
                            // If they leave -> get nothing.
                            System.out.println("The Adventures decide the lagoon and the Serpent are not worth their time.");
                            System.out.println("They leave the lagoon.");

                            st.breakLine();
                        }
                        break;
                    }
                }
                else if (location == 2)
                {
                    // Day 3 prompt

                    st.breakLine();

                    System.out.println("A day passes as the Adventurers keep to their chosen path.");
                    System.out.println("That is until...");
                    System.out.println();

                    // Day 3 Prompt based on previous choice
                    // If they chose Light path
                    System.out.println("The Adenturers are ambushed by a band of Elves, all armed with long swords, bows, and staffs.");
                    System.out.println("What will you do?");
                    st.breakLine();

                    // Day 3 Choices
                    System.out.println("[A] Fight the Elves");
                    System.out.println("[B] Talk to the Elves");
                    System.out.println("[C] Run from the Elves");

                    st.breakLine();

                    choice = scnr.next();

                    switch (choice)
                    {
                        case "A":
                        {
                            if (dice.rollDice(gc.getStrP()) >= dice.rollDice()) 
                            {
                                // If they fight and win -> Elves die and the party loots the corpses.
                                System.out.println("The Adventurers battled the Elves and succeeded. The Elves were slaughtered.");
                                System.out.println("They loot the Elves bodies and gained a Potion of Revival.");

                            }
                            else if (dice.rollDice(gc.getStrP()) < dice.rollDice())
                            {
                                // If they fight and lose -> The adventurers that fought lose HP and/or Die
                                System.out.println("The Adventures battle the Elves and lost. They are forced to Flee.");
                                System.out.println("The Elves don't bother to chase, they found the party to be quite pathetic.");
                                chance = dice.randNum(3);
                                gc.updateHP(-chance);
                                System.out.println("The Knight lost " + chance + " health.");
                                
                            }
                        }
                        break;

                        case "B":
                        {
                            if(dice.rollDice(gc.getCharP()) >= dice.rollDice())
                            {
                                // If they talk (aka intimidate) and succeed to convince -> The adventurers get away unharmed
                                System.out.println("The Adventurers convince the Elves that they shouldn't fight them and are allowed to leave.");
                            }
                            else if (dice.rollDice(gc.getCharP()) < dice.rollDice())
                            {
                                // If they talk (aka intimidate) and fail to convince -> The adventurers are attacked and flee and lose HP or die
                                System.out.println("The Adventurers fail to convince the Elves to let them go and the Elves attack the Adventures.");
                                System.out.println("The party is attacked and unable to defend themselves. They are forced to flee.");
                                System.out.println("The Elves don't bother to chase, they found the party to be quite pathetic.");
                                chance = dice.randNum(3);
                                gc.updateHP(-chance);
                                System.out.println("The Knight lost " + chance + " health.");
                            }
                        }
                        break;

                        case "C":
                        {
                            if (dice.rollDice(gc.getSP()) >= dice.rollDice()) 
                            {
                                // If they run and succeed to get away -> They get away and nothing happens
                                System.out.println("The Adventures flee from the Elves and quickly lose them. The party is free from their Elven enemies.");

                            }
                            else if (dice.rollDice(gc.getSP()) < dice.rollDice())
                            {
                                // If they run and fail to get away -> Lose HP and/or die, if had any previous items, they are taken.
                                System.out.println("The Adventurers attempt to flee but failed to get away quick enough.");
                                System.out.println("An Elven Mage casts a spell to freeze the Adventurers in place and they are attacked and robbed.");
                                chance = dice.randNum(3);
                                gc.updateHP(-chance);
                                System.out.println("The Knight lost " + chance + " health.");
                            }
                        }
                        break;
                    }
                }
                gc.updateDays(1);

                st.breakLine();

                System.out.println("The day comes to an end.");
                System.out.println();

                gc.getStats();
                
                st.breakLine();

                System.out.println("Continue?");
                System.out.println("[A] Yes");
                System.out.println("[B] No");

                st.breakLine();
                
                choice = scnr.next();

                switch (choice)
                {
                    case "A":
                    {
                        System.out.println("The Adventure Continues.");
                    }
                    break;

                    case "B":
                    {
                        play = false;
                        System.out.println("The Adventure comes to an End,");
                    }        
                }
            }
            else if (play == true && gc.getHP() > 0 && gc.getDays() == 4)
            {
                st.breakLine();


                // Day 4 prompt
                System.out.println("The Adventurers make it out if the woods into the open plains.");
                System.out.println("The quickly find their path and get a move on. But it is not very long before they sight");
                System.out.println("the first building in their path, an old abandonded windmill.");
                System.out.println("Does the Adventurers search the windmill?");
                st.breakLine();
        
                // Day 4 choices
                System.out.println("[A] Approach");
                System.out.println("[B] Leave");

                st.breakLine();

                choice = scnr.next();

                switch (choice)
                {
                    case "A":
                    {
                        chance = dice.randNum(3);
                        if (chance == 1)
                        {
                            // if they Enter 33.33% chance -> they old man fire the canon and the party takes random amount of damage
                            System.out.println("As they enter the structure they are meet with an old mad man with a canon.");
                            System.out.println("The party flees but not unscathed.");
                            chance = dice.randNum(3);
                            gc.updateHP(-chance);
                            System.out.println("The knight lost " + chance + " health.");
                        }
                        else if (chance == 2)
                        {
                            // if they Enter 33.33% chance -> the party gets nothing
                            System.out.println("As they approach the windmill, it collapses.");
                            System.out.println("The Adventurers can't salvage anything from the ruins, they walk away defeated.");
                        }
                       else if (chance == 3)
                       {
                            // if they Enter 33.33% chance
                            System.out.println("As they enter the structure they find nothing but a chest.");
                            System.out.println("They loot the chest and...");

                            //randomized loot
                            chance = dice.randNum(3);

                            switch (chance)
                            {
                                case 1:
                                {
                                    // option 1 -> get nothing
                                    System.out.println("They find nothing.");
                                    System.out.println("The Adventurers exit the structure and continue on their way.");
                                }
                                break;

                                case 2:
                                {
                                    if (cursed == true)
                                    {
                                        // option 2 -> if they are cursed by the serpent -> gain 2 strenght, 2 mana, and 2 stealth
                                        System.out.println("They find a tome of curses, they use it to free themselves of the Serpents curse.");
                                        System.out.println("The Tome is destroyed after this one use. The Adventurers are sad but thankful to");
                                        System.out.println("be free of the curse.");
                                        System.out.println("The Adventurers exit the structure and continue on their way.");
                                        gc.updateStrP(2);
                                        gc.updateMP(2);
                                        gc.updateSP(2);
                                    }
                                    else
                                    {
                                        // option 2 -> if they are not cursed by the serpent
                                        System.out.println("They find a tome of curses, but they cannot use it, they put it away for later.");
                                        System.out.println("The Adventurers exit the structure and continue on their way.");
                                        tome = true;
                                    }
                                }
                                break;

                                case 3:
                                {
                                    // option 3 -> will increase health by 1 point for each character
                                    System.out.println("They find a potion of Healing and they all take turn passing around the bottle.");
                                    System.out.println("They all feel as though they have gain some extra time on this earth.");
                                    System.out.println("The Adventurers exit the structure and continue on their way.");
                                }
                                break;
                            }
                        }
                    }
                    break;

                    case "B":
                    {
                        // if they Leave
                        System.out.println("The Adventurers continue on their way.");
                    }
                    break;
                }
                gc.updateDays(1);

                st.breakLine();

                System.out.println("The day comes to an end.");
                System.out.println();

                gc.getStats();
                
                st.breakLine();

                System.out.println("Continue?");
                System.out.println("[A] Yes");
                System.out.println("[B] No");

                st.breakLine();
                
                choice = scnr.next();

                switch (choice)
                {
                    case "A":
                    {
                        System.out.println("The Adventure Continues.");
                    }
                    break;

                    case "B":
                    {
                        play = false;
                        System.out.println("The Adventure comes to an End,");
                    }        
                }

            }
            else if (play == true && gc.getHP() > 0 && gc.getDays() == 5)
            {
                st.breakLine();

                // Day 5 Prompt
                System.out.println("As the Adventurers continue on their way, they exit the plains into the mountainous terrain.");
                System.out.println("But they run into yet another issue. The path has been split, a new massive gorge preventing");
                System.out.println("their passage. They collectively groan in frustration.");
                System.out.println("Now they are faced with the question, how will they get back onto the path on the other side?");
                System.out.println("What will the Adventurers do?");
                st.breakLine();
            
                // Day 5 Choices
                System.out.println("[A] Go around the gorge by climbing the mountains?");
                System.out.println("[B] Descend into the gorge and cross the valley floor?");

                st.breakLine();

                choice = scnr.next();

                switch (choice)
                {
                    case "A":
                    {
                        System.out.println("The Adventurers decide to climb the mountains to get to the other side of the gorge.");
                        location = 1;
                    }
                    break;

                    case "B":
                    {
                        System.out.println("The Adventurers decide to descend into the gorge to get to the other side.");
                        location = 2;
                    }
                    break;
                }
                gc.updateDays(1);

                st.breakLine();

                System.out.println("The day comes to an end.");
                System.out.println();

                gc.getStats();
                
                st.breakLine();

                System.out.println("Continue?");
                System.out.println("[A] Yes");
                System.out.println("[B] No");

                st.breakLine();
                
                choice = scnr.next();

                switch (choice)
                {
                    case "A":
                    {
                        System.out.println("The Adventure Continues.");
                    }
                    break;

                    case "B":
                    {
                        play = false;
                        System.out.println("The Adventure comes to an End,");
                    }        
                }
            }
            else if (play == true && gc.getHP() > 0 && gc.getDays() == 6)
            {
                if (location == 1)
                {
                    location = 0;

                    st.breakLine();

                    System.out.println("The Adventurers climb the mountain. They follow a rocky, turning snowy, path to the top.");
                    System.out.println("At the top, they are faced with a gate and a magnificant castle.");
                    System.out.println("It's not long before they are met with guards and a princess.");
                    System.out.println("What will you do?");

                    st.breakLine();   
                    
                    System.out.println("[A] Fight the Guards and Princess?");
                    System.out.println("[B] Talk to the Princess?");
                    System.out.println("[C] Leave the Castle?");

                    st.breakLine();

                    choice = scnr.next();

                    switch (choice)
                    {
                        case "A":
                        {
                            if (dice.rollDice(gc.getStrP()) >= dice.rollDice())
                            {
                                System.out.println("The Adventurers attempt to battle the Princess and her Guards.");
                                System.out.println("They successfully defeated the Princess and her guards.");
                                System.out.println("The Adventurers decend down the mountain.");
                                location = 1;

                                //add ability to enter castle and explore it. aka... discover Princesses secret and free the Princes

                            }
                            else if (dice.rollDice(gc.getStrP()) < dice.rollDice())
                            {
                                System.out.println("The Adventurers attempt to battle the Princess and her Guards.");
                                System.out.println("They failed to defeat the guards and are taken as slaves.");
                                location = 2;
                            }
                        }
                        break;

                        case "B":
                        {
                            if (dice.rollDice(gc.getCharP()) >= dice.rollDice())
                            {
                                System.out.println("The Adventurers attempt to talk the Princess and her Guards.");
                                System.out.println("They convince her to grants them passage through her castle.");
                                System.out.println("She walks with the Adventurers, making sure they don't stray from the path.");
                                System.out.println("The Adventures make it to the other side of the castle and descend down the ");
                                System.out.println("mountain.");
                                location = 1;

                                //add ability to stray from path and learn of her secret.

                            }
                            else if (dice.rollDice(gc.getCharP()) < dice.rollDice())
                            {
                                System.out.println("The Adventurers attempt to talk the Princess and her Guards.");
                                System.out.println("They failed to convince the princess to let them through and the guards attack.");
                                System.out.println("The Adventurers are taken as slaves.");
                                location = 2;
                            }
                        }
                        break;

                        case "C":
                        {
                            if (dice.rollDice(gc.getSP()) >= dice.rollDice())
                            {
                                System.out.println("The Adventurers attempt to walk away from the Princess and her Guards.");
                                System.out.println("The princess commands her guards to chase you, but they fail to do so.");
                                System.out.println("The Adventurers find a away around the castle and descend down the mountain.");
                                location = 1;
                            }
                            else if (dice.rollDice(gc.getSP()) < dice.rollDice())
                            {
                                System.out.println("The Adventurers attempt to walk away from the Princess and her Guards.");
                                System.out.println("The princess commands her guards to chase you and they success in doing so.");
                                System.out.println("The Adventurers are captured and taken as slaves.");
                                location = 2;
                            }
                        }
                        break;
                    }
                }
                else if (location == 2)
                {
                    st.breakLine();
                    //Day 6 prompts based on previous choice
                    System.out.println("The Adventurers climb down into the gorge. They stumble their way across the earthen floor.");
                    System.out.println("Before long they find a large cave with small amounts of gold... A dragons cave.");
                    System.out.println("As they approach, they feel a gust of air behind them... the dragon is behind them.");
                    System.out.println("What will the Adventurers do?");

                    st.breakLine();

                    System.out.println("Fight the dragon.");
                    System.out.println("Talk to the dragon."); 
                    System.out.println("Run from the dragon.");

                    st.breakLine();
                    

                    choice = scnr.next();

                    switch (choice)
                    {
                        case "A":
                        {
                            if (dice.rollDice(gc.getStrP()) >= dice.rollDice())
                            {
                                System.out.println("The Adventurers attempt to fight the Dragon.");
                                System.out.println("They successfully land a hit on the Dragon and it cries out for the Adventurers");
                                System.out.println("to stop. It pleads, please stop hurting me.");
                                System.out.println("Will the Adventurers stop hurting the Dragon?");

                                st.breakLine();

                                System.out.println("[A] Yes");
                                System.out.println("[B] No");

                                st.breakLine();

                                choice = scnr.next();

                                switch (choice)
                                {
                                    case "A":
                                    {
                                        System.out.println("The Adventurers stop hurting the Dragon, much to the Dragons relief.");
                                        System.out.println("You all are kinder than that Princess up the mountain, the Dragon says.");
                                        System.out.println("Please leave the my cave and the gorge, the way up is head, the Dragon says.");
                                        System.out.println("The Adventurers leave in the direction given and exit the gorge.");
                                    }
                                    break;

                                    case "B":
                                    {
                                        System.out.println("The Adventurers continue their assault on the Dragon.");
                                        System.out.println("The Dragon doesn't fight back, instead it only cries until it finally goes silent.");
                                        System.out.println("The Adventurers, being the monsters they are, murdered the Dragon");
                                        System.out.println("Does the Adventurers take the Dragons gold?");

                                        st.breakLine();

                                        System.out.println("[A] Yes");
                                        System.out.println("[B] No");

                                        st.breakLine();

                                        choice = scnr.next();

                                        switch (choice)
                                        {
                                            case "A":
                                            {
                                                System.out.println("The Adventurers, without guilt or good conscience, takes the Dragons gold.");
                                                hasGold = true;
                                            }
                                            break;

                                            case "B":
                                            {
                                                System.out.println("The Adventurers feel guilty for their horrible slaughter of the Dragon.");
                                                System.out.println("They decide not to take the Dragons gold.");
                                                hasGold = false;
                                            }
                                            break;
                                        }
                                    }
                                    break;
                                }
                            }
                            else if (dice.rollDice(gc.getStrP()) < dice.rollDice())
                            {
                                System.out.println("The Adventurers attempt to attack the Dragon.");
                                System.out.println("They all stumble and fall, swing and miss, failing to harm the Dragon as it sits and watches");
                                System.out.println("the Adventurers make fools of themselves. ");
                                System.out.println("The Dragon awkwardly says, \"please get out of my cave, the exits over there...\"");
                                System.out.println("The Adventurers, embarrassingly defeated, walk themselves out of the cave and out of the gorge.");
                            }
                        }
                        break;

                        case "B":
                        {
                            if (dice.rollDice(gc.getCharP()) >= dice.rollDice())
                            {
                                System.out.println("The Adventurers attempt to talk to the Dragon and they succeed.");
                                System.out.println("The Dragon, surprised by the Adventurers kindness and willingness to talk to him,");
                                System.out.println("allows them to rest in his cave. They all converse for a while and the Dragon warns of the");
                                System.out.println("Princess up the mountain and how lucky they are for not choosing that path.");
                                System.out.println("Some time passes and the Adventurers leave, but only after the Dragon offers some gold for their");
                                System.out.println("kindness.");

                                hasGold = true;
                                gc.updateHP(2);

                                System.out.println();
                                System.out.println("The Adventurers have gained gold and some 2 health.");
                            }
                            else if (dice.rollDice(gc.getCharP()) < dice.rollDice())
                            {
                                System.out.println("The Adventurers attempt to talk to the Dragon and they fail.");
                                System.out.println("They speak very rudely and loudly at the Dragon, making him anxious.");
                                System.out.println("The Dragon demands the Adventuring party to leave the cave at once.");
                                System.out.println("The Adventurers leave the cave and make their way out of the gorge.");

                                // Add another chance to fight the dragon. Even though you shouldnt fight him. Hes just a baby.
                            }
                        }
                        break;

                        case "C":
                        {
                            System.out.println("The Adventurers flee and the Dragon just watches.");
                            System.out.println("It is made very clear that the Dragon doesn't want to harm them.");
                            System.out.println("The Adventurers leave and make their way out of the gorge.");
                        }
                        break;
                    }
                }
                gc.updateDays(1);

                st.breakLine();

                System.out.println("The day comes to an end.");
                System.out.println();

                gc.getStats();
                
                st.breakLine();

                System.out.println("Continue?");
                System.out.println("[A] Yes");
                System.out.println("[B] No");

                st.breakLine();
                
                choice = scnr.next();

                switch (choice)
                {
                    case "A":
                    {
                        System.out.println("The Adventure Continues.");
                    }
                    break;

                    case "B":
                    {
                        play = false;
                        System.out.println("The Adventure comes to an End,");
                    }        
                }
            }
            else if (play == true && gc.getHP() > 0 && gc.getDays() == 7)
            {
                st.breakLine();

                System.out.println("The Adventurers make their way, finally, on the other side of the gorge and back onto ");
                System.out.println("their path to the shrine.");
                System.out.println("The landscape calms as the mountainous terrain softens into rolling hills and poppy fields.");
                System.out.println("The path winds between and over hills, following the contour of the land. The path is mindless,");
                System.out.println("long, and uneventful.");
                System.out.println("That is until the Adventures come across a merchant and his broken wagon.");

                st.breakLine();

                //Day 7 choices
                System.out.println("[A] ");
                System.out.println("[B] ");
                System.out.println("[C] ");

                st.breakLine();

                choice = scnr.next();

                switch (choice)
                {
                    case "A":
                    {
                        if (dice.rollDice(gc.getStrP()) >= dice.rollDice())
                        {}
                        else if (dice.rollDice(gc.getStrP()) < dice.rollDice())
                        {}
                    }
                    break;

                    case "B":
                    {
                        if (dice.rollDice(gc.getCharP()) >= dice.rollDice())
                        {}
                        else if (dice.rollDice(gc.getCharP()) < dice.rollDice())
                        {}
                    }
                    break;

                    case "C":
                    {
                        if (dice.rollDice(gc.getSP()) >= dice.rollDice())
                        {}
                        else if (dice.rollDice(gc.getSP()) < dice.rollDice())
                        {}
                    }
                    break;
                }
                gc.updateDays(1);

                st.breakLine();

                System.out.println("The day comes to an end.");
                System.out.println();

                gc.getStats();
                
                st.breakLine();

                System.out.println("Continue?");
                System.out.println("[A] Yes");
                System.out.println("[B] No");

                st.breakLine();
                
                choice = scnr.next();

                switch (choice)
                {
                    case "A":
                    {
                        System.out.println("The Adventure Continues.");
                    }
                    break;

                    case "B":
                    {
                        play = false;
                        System.out.println("The Adventure comes to an End,");
                    }        
                }
            }
            else if (play == true && gc.getHP() > 0 && gc.getDays() == 8)
            {
                st.breakLine();

                //Day 8 prompt
                System.out.println("After the merchant, the Adventurers continue, but are quickly stopped by a bickering couple.");
                System.out.println("A witch and a warlock. They demand advice for their situation");
                
                st.breakLine();

                System.out.println("Kill the annoying couple.");
                System.out.println("Become their therapist and talk to them?");
                System.out.println("Ignore their plees for advice and leave?");
                

                st.breakLine();

                choice = scnr.next();

                switch (choice)
                {
                    case "A":
                        {
                            if (dice.rollDice(gc.getStrP()) >= dice.rollDice())
                            {}
                            else if (dice.rollDice(gc.getStrP()) < dice.rollDice())
                            {}
                        }
                        break;

                        case "B":
                        {
                            if (dice.rollDice(gc.getCharP()) >= dice.rollDice())
                            {}
                            else if (dice.rollDice(gc.getCharP()) < dice.rollDice())
                            {}
                        }
                        break;

                        case "C":
                        {
                            if (dice.rollDice(gc.getSP()) >= dice.rollDice())
                            {}
                            else if (dice.rollDice(gc.getSP()) < dice.rollDice())
                            {}
                        }
                        break;
                }
                gc.updateDays(1);

                st.breakLine();

                System.out.println("The day comes to an end.");
                System.out.println();

                gc.getStats();
                
                st.breakLine();

                System.out.println("Continue?");
                System.out.println("[A] Yes");
                System.out.println("[B] No");

                st.breakLine();
                
                choice = scnr.next();

                switch (choice)
                {
                    case "A":
                    {
                        System.out.println("The Adventure Continues.");
                    }
                    break;

                    case "B":
                    {
                        play = false;
                        System.out.println("The Adventure comes to an End,");
                    }        
                }
            }
            else if (play == true && gc.getHP() > 0 && gc.getDays() == 9)
            {
                st.breakLine();

                //Day 9 prompt
                System.out.println("The Adventurers are tired and know that the path they are on is way to long for their journey.");
                System.out.println("They decide to search for a short cut. They know they can pass through the closes city or");
                System.out.println("to risk traveling through the mystical pinkwood forest.");
                System.out.println("Which with they choose?");

                st.breakLine();

                //Day 9 choices
                System.out.println("City");
                System.out.println("Forest");

                st.breakLine();

                if (location == 1)
                {

                    //prompt and choices

                    choice = scnr.next();

                    switch (choice)
                    {
                        case "A":
                        {
                            if (dice.rollDice(gc.getStrP()) >= dice.rollDice())
                            {}
                            else if (dice.rollDice(gc.getStrP()) < dice.rollDice())
                            {}
                        }
                        break;

                        case "B":
                        {
                            if (dice.rollDice(gc.getCharP()) >= dice.rollDice())
                            {}
                            else if (dice.rollDice(gc.getCharP()) < dice.rollDice())
                            {}
                        }
                        break;

                        case "C":
                        {
                            if (dice.rollDice(gc.getSP()) >= dice.rollDice())
                            {}
                            else if (dice.rollDice(gc.getSP()) < dice.rollDice())
                            {}
                        }
                        break;
                    }
                }
                else if (location == 2)
                {
                    //prompt and choices

                    choice = scnr.next();

                    switch (choice)
                    {
                        case "A":
                        {
                            if (dice.rollDice(gc.getStrP()) >= dice.rollDice())
                            {}
                            else if (dice.rollDice(gc.getStrP()) < dice.rollDice())
                            {}
                        }
                        break;

                        case "B":
                        {
                            if (dice.rollDice(gc.getCharP()) >= dice.rollDice())
                            {}
                            else if (dice.rollDice(gc.getCharP()) < dice.rollDice())
                            {}
                        }
                        break;

                        case "C":
                        {
                            if (dice.rollDice(gc.getSP()) >= dice.rollDice())
                            {}
                            else if (dice.rollDice(gc.getSP()) < dice.rollDice())
                            {}
                        }
                        break;
                    }
                }
                gc.updateDays(1);

                st.breakLine();

                System.out.println("The day comes to an end.");
                System.out.println();

                gc.getStats();
                
                st.breakLine();

                System.out.println("Continue?");
                System.out.println("[A] Yes");
                System.out.println("[B] No");

                st.breakLine();
                
                choice = scnr.next();

                switch (choice)
                {
                    case "A":
                    {
                        System.out.println("The Adventure Continues.");
                    }
                    break;

                    case "B":
                    {
                        play = false;
                        System.out.println("The Adventure comes to an End,");
                    }        
                }
            }
            else if (play == true && gc.getHP() > 0 && gc.getDays() == 10)
            {
                //prompt and choices

                st.breakLine();

                System.out.println("[A] ");
                System.out.println("[B] ");
                System.out.println("[C] ");

                st.breakLine();

                choice = scnr.next();

                switch (choice)
                {
                    case "A":
                        {
                            if (dice.rollDice(gc.getStrP()) >= dice.rollDice())
                            {}
                            else if (dice.rollDice(gc.getStrP()) < dice.rollDice())
                            {}
                        }
                        break;

                        case "B":
                        {
                            if (dice.rollDice(gc.getCharP()) >= dice.rollDice())
                            {}
                            else if (dice.rollDice(gc.getCharP()) < dice.rollDice())
                            {}
                        }
                        break;

                        case "C":
                        {
                            if (dice.rollDice(gc.getSP()) >= dice.rollDice())
                            {}
                            else if (dice.rollDice(gc.getSP()) < dice.rollDice())
                            {}
                        }
                        break;
                }
                gc.updateDays(1);
            }
            else if (gc.getDays() == 11)
            {
                System.out.println("Thank you for playing Adventure!");
            }
        }
    }
}


