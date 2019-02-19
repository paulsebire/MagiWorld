package com.paul.magiworld;

public class Player {
    private int role;
    private int lvl;
    private int strength;
    private int agility;
    private int intel;
    private int stamina;
    private int nbPlayer;


    public Player(int role, int lvl, int strength, int agility, int intel, int stamina, int nbPlayer) {
        this.role = role;
        this.lvl = lvl;
        this.strength = strength;
        this.agility = agility;
        this.intel = intel;
        this.stamina = stamina;
        this.nbPlayer = nbPlayer;
    }

    public int getNbPlayer() {
        return nbPlayer;
    }

    public void setNbPlayer(int nbPlayer) {
        this.nbPlayer = nbPlayer;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntel() {
        return intel;
    }

    public void setIntel(int intel) {
        this.intel = intel;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

}
