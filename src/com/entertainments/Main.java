package com.entertainments;

import java.util.*;

public class Main {

    public static void main(String[] arg) {

        String name = "";
        String answer = "";
        // ASKING CHARACTER NAME
        Scanner userName = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a Name for your Character below.");
            System.out.print("Character Name: ");
            name = userName.nextLine();
            if (name.trim().length() >= 3 && name.trim().length() <= 32)
                break;
            System.out.println("");
            System.out.println("");
            System.out.println("***************************************************************");
            System.out.println("***************************************************************");
            System.out.println("**                                                           **");
            System.out.println("**                        ERROR: NAME                        **");
            System.out.println("**    ERROR: Character Name needs to be between 3 and 32.    **");
            System.out.println("**                                                           **");
            System.out.println("***************************************************************");
            System.out.println("***************************************************************");
            System.out.println("");
            System.out.println("");
        }
        // CONFIRM CHARACTER NAME
        Scanner decision = new Scanner(System.in);
        System.out.println("Are you sure you want to be named \"" + name + "\"?");
        System.out.print("You say... ");
        while (true) {
            answer = decision.nextLine().trim().toLowerCase();
            if (answer.equals("yes") || answer.equals("okay") || answer.equals("agree") || answer.equals("accept") || answer.equals("confirm")) {

                break;
            } else if (answer.equals("no") || answer.equals("nope") || answer.equals("deny") || answer.equals("disagree") || answer.equals("negative")) {

                break;
            }
            System.out.println("");
            System.out.println("");
            System.out.println("************************************************************************************");
            System.out.println("************************************************************************************");
            System.out.println("**                                                                                **");
            System.out.println("**                                ERROR: DECISION                                 **");
            System.out.println("**    ERROR: Unknown Decision statement, please only use what is listed below:    **");
            System.out.println("**      AGREEMENTS: y, ok, yes, okay, agree, accept, OR confirm                   **");
            System.out.println("** **");
            System.out.println("** **");
            System.out.println("");
            System.out.println("");
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