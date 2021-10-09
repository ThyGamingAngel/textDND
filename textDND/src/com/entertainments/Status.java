package com.entertainments;

import com.entertainments.Main;

public class Status {

    int vitality = 0;
    int recovery = 0;
    int strength = 0;
    int agility = 0;
    int traitPoints = 20;
    int wisdom = 0;
    int intelligent = 0;
    int luck = 0;
    int patience = 0;
    int specialTraitPoints = 5;

    public void soldierStats() {

        vitality = 6;
        recovery = 5;
        strength = 6;
        agility = 3;
        traitPoints = 0;
        wisdom = 0;
        intelligent = 0;
        luck = 1;
        patience = 4;
        specialTraitPoints = 0;

    }
}
/*
*   VITALITY: Health limit
*   RECOVERY: Health recovery rate
*   STRENGTH: Damage output
*   AGILITY: Chances to doge
*       SPECIAL TRAITS
*   WISDOM: Essence limit
*   INTELLIGENT: Essence recovery rate
*   LUCK: Chances to gain rarer loot
*   PATIENCE: Chances to gain rarer fish
 */