package com.entertainments;

import java.util.*;

import static com.entertainments.Main.*;

public class Decisions {

    public static boolean decisionLoopName = false;

    public static void decisionCharacterName() {

        Scanner decision = new Scanner(System.in);
        System.out.print("Am I sure that I would like to be called \"" + name + "\" for the rest of my life?");
        while (decisionLoopName) {
            answer = decision.nextLine().trim().toLowerCase();
            switch (answer) {
                case "y":
                case "ok":
                case "yes":
                case "okay":
                case "true":
                case "agree":
                case "accept":
                case "confirm":
                case "positive":
                    Main.characterLoop = false;
                    decisionLoopName = false;
                    System.out.println("I like how \"" + name + "\" sounds.");
                case "n":
                case "no":
                case "nah":
                case "nope":
                case "deny":
                case "false":
                case "disagree":
                case "negative":
                    Main.characterLoop = true;
                    decisionLoopName = false;
                default:
                    System.out.println("YES OR NO");

            }
        }
    }



}
