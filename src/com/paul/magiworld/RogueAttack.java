package com.paul.magiworld;

public class RogueAttack extends TypesOfAttack {

    @Override
    public void basicAttack(Player playerAtk, Player playerDef) {
       playerDef.setStamina(playerDef.getStamina()-playerAtk.getAgility());
        System.out.println("Joueur "+playerAtk.getNbPlayer()+" utilise Tir à l’Arc et inflige "+playerAtk.getAgility()+ " dommages");
        System.out.println("Joueur "+playerDef.getNbPlayer()+ "perd "+playerAtk.getAgility()+" points de vie");

    }

    @Override
    public void specialAttack(Player playerAtk, Player playerDef) {
        playerAtk.setAgility(playerAtk.getAgility()+(int)(playerAtk.getLvl()/2));
        System.out.println("Joueur "+playerAtk.getNbPlayer()+" utilise Concentration et gagne "+(int)(playerAtk.getLvl()/2)+ " d'agilité ("+playerAtk.getAgility()+" d'agilité au total");
    }
}
