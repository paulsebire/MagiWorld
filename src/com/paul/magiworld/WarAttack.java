package com.paul.magiworld;

public class WarAttack extends TypesOfAttack {

    @Override
    public void basicAttack(Player playerAtk, Player playerDef) {
        playerDef.setStamina(playerDef.getStamina()-playerAtk.getStrength());
        System.out.println("Joueur "+playerAtk.getNbPlayer()+" utilise Coup d'Épée et inflige "+playerAtk.getStrength()+ " dommages");
        System.out.println("Joueur "+playerDef.getNbPlayer()+ " perd "+playerAtk.getStrength()+" points de vie");
    }

    @Override
    public void specialAttack(Player playerAtk, Player playerDef) {
        playerDef.setStamina(playerDef.getStamina()-2*playerAtk.getStrength());
        playerAtk.setStamina(playerAtk.getStamina()-(int)(playerAtk.getStrength()/2));
        System.out.println("Joueur "+playerAtk.getNbPlayer()+" utilise Coup de Rage et inflige "+playerAtk.getStrength()*2+ " dommages");
        System.out.println("Joueur "+playerDef.getNbPlayer()+ " perd "+playerAtk.getStrength()*2+" points de vie");
        System.out.println("Joueur "+playerAtk.getNbPlayer()+ " perd "+(int)(playerAtk.getStrength()/2)+" points de vie");
    }
}
