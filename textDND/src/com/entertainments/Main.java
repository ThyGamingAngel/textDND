package com.entertainments;

import java.util.*;

public class Main {

    public static String name = "";
    public static String answer = "";
    public static boolean characterLoop = false;

    public static void main(String[] arg) {

        characterName();

    }

    public static void characterName() {
        while (true) {
        characterLoop = true;
        Decisions.decisionLoopName = false;
        Scanner userName = new Scanner(System.in);
        while (characterLoop) {
            System.out.println("WARNING: Once a NAME is confirmed you can not change it later on.");
            System.out.println(" ");
            System.out.println("Enter a NAME or your character below.");
            System.out.print("I should be called... ");
            name = userName.nextLine();
            if (name.trim().length() >= 3 &&
                    name.trim().length() <= 32) {
                characterLoop = false;
                Decisions.decisionLoopName = true;
            }
            Errors.errorCharacterName();
        }
        Decisions.decisionCharacterName();
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