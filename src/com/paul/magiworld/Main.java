package com.paul.magiworld;

import org.jetbrains.annotations.NotNull;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static private Scanner sc = new Scanner(System.in);

    static private Player player1;
    static private Player player2;

    public static void main(String[] args) {
        int atk=0;

        System.out.println("Création du personnage du Joueur 1");
        player1=createChar(1);
        System.out.println("Création du personnage du Joueur 2");
        player2=createChar(2);

        System.out.println("LE COMBAT COMMENCE");

        do{
            atk=getTheAttack(player1);

        }while(player1.getStamina()!=0||player2.getStamina()!=0);
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
        System.out.println("Veuillez choisir la classe de votre personnage (1: Guerrier, 2: Rôdeur, 3: Mage)");
        role=getTheNumber(3);
        System.out.println("Niveau du personnage ?");
        lvl=getTheNumber(100);
        System.out.println("Force du personnage ?");
        strength=getTheNumber(100);
        System.out.println("Agilité  du personnage ?");
        agility=getTheNumber(100);
        System.out.println("Intelligence du personnage ?");
        intel=getTheNumber(100);
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

        System.out.println(intro +"je suis le "+ roleStr+" Joueur "+nbPlayer+" de niveau "+lvl+" je possède " + stamina+" de vitalité, "
                + strength+" de force, "+agility+" d'agilité et "+intel+" d'intelligence.");

        if (strength+agility+intel!=lvl)
            System.out.println("La somme de la force, de l'agilité et de l'intelligence doit être égale au niveau du personnage");

        }while (strength+agility+intel!=lvl);
        return new Player(role,lvl,strength,agility,intel,stamina,nbPlayer);
    }
    static private int getTheNumber(int max){
        boolean responseIsGood;
        int number=0;
    do {
        try {
            number = sc.nextInt();
            if  (number>=1 && number<=max)responseIsGood = true;
            else {
                responseIsGood = false;
                System.out.println("Veuillez saisir un nombre compris  entre 1 et "+max);
            }
        } catch (InputMismatchException e) {
            sc.next();
            responseIsGood = false;
            System.out.println("Veuillez saisir un nombre compris entre 1 et "+max);
        }
    }while (!responseIsGood) ;
    return number;
}


    static private int getTheAttack(Player player){
        System.out.println("joueur "+player.getNbPlayer()+" ("+player.getStamina()+" Vitalité) Veuillez choisir votre action (1: Attaque Basique, 2: Attaque Spéciale");
        boolean responseIsGood;
        int number=0;
        do {
            try {
                number = sc.nextInt();
                if  (number>=1 && number<=2)responseIsGood = true;
                else {
                    responseIsGood = false;
                    System.out.println("Veuillez saisir un nombre compris  entre 1 et 2");
                }
            } catch (InputMismatchException e) {
                sc.next();
                responseIsGood = false;
                System.out.println("Veuillez saisir un nombre compris entre 1 et 2");
            }
        }while (!responseIsGood) ;
        return number;
    }
}
