package com.paul.magiworld;

public class MageAttack extends TypesOfAttack {

    @Override
    public void basicAttack(Player playerAtk, Player playerDef) {
        playerDef.setStamina(playerDef.getStamina()-playerAtk.getIntel());
    }

    @Override
    public void specialAttack(Player playerAtk, Player playerDef) {
        playerAtk.setStamina(playerAtk.getStamina()+2*playerAtk.getIntel());
        if (playerAtk.getStamina()>playerAtk.getStaminaBegin())playerAtk.setStamina(playerAtk.getStaminaBegin());
    }
}
