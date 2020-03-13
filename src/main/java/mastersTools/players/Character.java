package main.java.mastersTools.players;

import main.java.mastersTools.character.*;
import main.java.mastersTools.items.Armor;
import main.java.mastersTools.items.Shield;
import main.java.mastersTools.items.Weapon;

import java.util.List;

public class Character {
    //description
    private String characterName;
    private Race characterRace;
    private Classes characterClass;
    private Backstage characterBackstage;
    private String playersName;

    //characteristics
    private Characteristics characteristics;
    private SavingThrow savingThrow;
    private Specifications specifications;
    private int maxHP;
    private int currentHP;
    private int temporaryHP;
    private int diceHit;
    private int XP;
    private int passiveWisdom;
    private int KD;

    //abilities
    private List feats;
    private List magic;
    private List skills;

    //equipment
    private Armor armor;
    private Weapon weapon;
    private Shield shield;
    private int copperMoney;
    private int silverMoney;
    private int electromadMoney;
    private int goldMoney;
    private int platinumMoney;
    private List inventory;
}
