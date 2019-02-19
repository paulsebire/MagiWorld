package com.paul.magiworld;

public class WarAttack extends TypesOfAttack {

    @Override
    public void basicAttack(Player playerAtk, Player playerDef) {
        playerDef.setStamina(playerDef.getStamina()-playerAtk.getStrength());
    }

    @Override
    public void specialAttack(Player playerAtk, Player playerDef) {
        playerDef.setStamina(playerDef.getStamina()-2*playerAtk.getStrength());
        playerAtk.setStamina(playerAtk.getStamina()-(int)(playerAtk.getStrength()/2));
    }
}
