package com.paul.magiworld;

public class MageAttack extends TypesOfAttack {

    @Override
    public void basicAttack(Player playerAtk, Player playerDef) {
        playerDef.setStamina(playerDef.getStamina()-playerAtk.getIntel());
        System.out.println("Joueur "+playerAtk.getNbPlayer()+" utilise Boule de feu et inflige "+playerAtk.getIntel()+ " dommages");
        System.out.println("Joueur "+playerDef.getNbPlayer()+ " perd "+playerAtk.getIntel()+" points de vie");
    }

    @Override
    public void specialAttack(Player playerAtk, Player playerDef) {
        playerAtk.setStamina(playerAtk.getStamina()+2*playerAtk.getIntel());
        if (playerAtk.getStamina()>playerAtk.getStaminaBegin())playerAtk.setStamina(playerAtk.getStaminaBegin());
        System.out.println("Joueur "+playerAtk.getNbPlayer()+" utilise Soin et gagne "+playerAtk.getIntel()*2+ " points de vie (sur "+playerAtk.getStaminaBegin()+" d'agilité au total");
    }
}
