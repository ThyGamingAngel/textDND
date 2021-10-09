package com.entertainments;

import java.util.*;

public class Main {

    String answer = "";
    String name = "";

    public void main() {

        Scanner userName = new Scanner(System.in);
        while (true) {
            System.out.println("WARNING: Once a NAME is confirmed you can not change it later on.");
            System.out.println(" ");
            System.out.println("Enter a NAME or your character below.");
            System.out.print("I should be called... ");
            name = userName.nextLine();
            if (name.trim().length() >= 3 &&
                    name.trim().length() <= 32)
                break;
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("***************************************************************************");
            System.out.println("***************************************************************************");
            System.out.println("**                                                                       **");
            System.out.println("**                         ERROR: CHARACTER NAME                         **");
            System.out.println("**     ERROR: Character name is not between 3 and 32 characters long     **");
            System.out.println("**                                                                       **");
            System.out.println("***************************************************************************");
            System.out.println("***************************************************************************");
            System.out.println(" ");
            System.out.println(" ");

        }
    }
        public void nameChoice() {

            Scanner decision = new Scanner(System.in);
            while (true){
            answer = decision.nextLine().trim().toLowerCase();
            switch (answer) {
                case "y":
                case "ok":
                case "yes":
                case "okay":
                case "agree":
                case "accept":
                case "confirm":
                case "positive":
                    System.out.println("I like how \"" + name + "\" sounds.");
                    break;
                case "n":
                case "no":
                case "nah":
                case "nope":
                case "deny":
                case "disagree":
                case "negative":
                    break;
                default:

            }
            }
    }
}


/*
*   MOTION ACTIONS: Sleep, Nap, Lay, Sit, Wait, Stare, Amble, Walk, Sprint, Run, Mine, Strike,-
*   Punch, Attack(For Bows and Ranged Attacks), Special Attack (Name), Special Ability (Name)
*   CHARACTER ACTIONS: Look Around, Search, Use (Item Name), Use (Item Name) With (Item Name), Equipped, Fish,-
*   Open, Close, Enter, Exit, Interact
*   SPEECH ACTIONS: Talk (Number), Talk With (NPC Name), Accept[Yes, Confirm,-
*   Okay, Agree] (Number), Deny[No, Negative, Nope, Disagree] (Number)
*   PET ACTIONS: Tame, Refill [Food, Water], Train, Walk, Play, Pet
*   SHOP ACTIONS: Enter, Next Page, Previous Page, Page (Number), Buy (Item Name),-
*   Sell (Item Name) Confirm, Balance, (Item Name) Description
*   MISCELLANEOUS: Inventory, Next Page, Previous Page, Page (Number), (Item Name) Description
 */