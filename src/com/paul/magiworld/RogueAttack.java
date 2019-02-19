package com.paul.magiworld;

public class RogueAttack extends TypesOfAttack {

    @Override
    public void basicAttack(Player playerAtk, Player playerDef) {
       playerDef.setStamina(playerDef.getStamina()-playerAtk.getAgility());
    }

    @Override
    public void specialAttack(Player playerAtk, Player playerDef) {
        playerAtk.setAgility(playerAtk.getAgility()+(int)(playerAtk.getLvl()/2));
    }
}
