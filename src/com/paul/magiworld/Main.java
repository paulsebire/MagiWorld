package com.paul.magiworld;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static private Scanner sc = new Scanner(System.in);

    static private Player player1;
    static private Player player2;

    static private WarAttack warAttack= new WarAttack();
    static private RogueAttack rogueAttack = new RogueAttack();
    static private MageAttack mageAttack = new MageAttack();

    public static void main(String[] args) {


        System.out.println("Création du personnage du Joueur 1");
        player1=createChar(1);
        System.out.println("Création du personnage du Joueur 2");
        player2=createChar(2);

        System.out.println("LE COMBAT COMMENCE");

        while(player1.getStamina()!=0||player2.getStamina()!=0){

            fight(player1,player2);
            if (player2.getStamina()==0)return;
            fight(player2,player1);
            if (player1.getStamina()==0)return;
        }

    }


    static private Player createChar(int nbPlayer ){
        String intro="";
        String roleStr="";
        int role;
        int lvl;
        int strength;
        int agility;
        int intel;
        int stamina;
        do{
        System.out.println("Joueur "+nbPlayer+": Veuillez choisir la classe de votre personnage (1: Guerrier, 2: Rôdeur, 3: Mage)");
        role=getTheNumber(1,3);
        System.out.println("Niveau du personnage ?");
        lvl=getTheNumber(1,100);
        System.out.println("Force du personnage ?");
        strength=getTheNumber(0,100);
        System.out.println("Agilité  du personnage ?");
        agility=getTheNumber(0,100);
        System.out.println("Intelligence du personnage ?");
        intel=getTheNumber(0,100);
        stamina=lvl*5;

        switch (role){
            case 1: intro="Woarg ";
                    roleStr="Guerrier";
                    break;
            case 2: intro="Pfiuuu ";
                    roleStr="Rôdeur";
                    break;
            case 3: intro="Abracadabra ";
                    roleStr="Mage";
                    break;
        }

        if (strength+agility+intel!=lvl)
            System.out.println("La somme de la force, de l'agilité et de l'intelligence doit être égale au niveau du personnage");
        else System.out.println(intro +"je suis le "+ roleStr+" Joueur "+nbPlayer+" de niveau "+lvl+" je possède " + stamina+" de vitalité, "
                + strength+" de force, "+agility+" d'agilité et "+intel+" d'intelligence.");

        }while (strength+agility+intel!=lvl);
        return new Player(role,lvl,strength,agility,intel,stamina,nbPlayer);
    }
    static private int getTheNumber(int min,int max){
        boolean responseIsGood;
        int number=0;
    do {
        try {
            number = sc.nextInt();
            if  (number>=min && number<=max)responseIsGood = true;
            else {
                responseIsGood = false;
                System.out.println("Veuillez saisir un nombre compris  entre "+min+" et "+max);
            }
        } catch (InputMismatchException e) {
            sc.next();
            responseIsGood = false;
            System.out.println("Veuillez saisir un nombre compris entre "+min+" et "+max);
        }
    }while (!responseIsGood) ;
    return number;
}

    static private void fight (Player playerAtk, Player playerDef){
        int atk;
        System.out.println("joueur "+playerAtk.getNbPlayer()+" ("+playerAtk.getStamina()+" Vitalité) Veuillez choisir votre action (1: Attaque Basique, 2: Attaque Spéciale)");
            atk=getTheNumber(1,2);
            switch (playerAtk.getRole()){
                case 1: if (atk==1)warAttack.basicAttack(playerAtk,playerDef);
                        else warAttack.specialAttack(playerAtk,playerDef);
                        break;
                case 2: if (atk==1)rogueAttack.basicAttack(playerAtk,playerDef);
                        else rogueAttack.specialAttack(playerAtk,playerDef);
                        break;
                case 3: if (atk==1)mageAttack.basicAttack(playerAtk,playerDef);
                        else mageAttack.specialAttack(playerAtk,playerDef);
                        break;
            }
            if (playerDef.getStamina()==0){
                System.out.println("Joueur "+playerDef.getNbPlayer()+ " est mort");
                System.out.println("Joueur "+playerDef.getNbPlayer()+ " a perdu");

            }
    }
}
