package com.paul.magiworld;

import org.jetbrains.annotations.NotNull;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static private Scanner sc = new Scanner(System.in);
    static private Player player1 = new Player();
    static private Player player2 = new Player();

    public static void main(String[] args) {

        player1.setNbPlayer(1);
        createChar(player1);
        player2.setNbPlayer(2);
        createChar(player2);

    }

    static private void createChar(@NotNull Player player ){
        do{
        System.out.println("Création du personnage du Joueur "+ player.getNbPlayer() );
        System.out.println("Veuillez choisir la classe de votre personnage (1: Guerrier, 2: Rôdeur, 3: Mage");
        player.setRole(getTheRole());
        System.out.println("Niveau du personnage ?");
        player.setLvl(getTheNumberU100());
        System.out.println("Force du personnage ?");
        player.setStrength(getTheNumberU100());
        System.out.println("Agilité  du personnage ?");
        player.setAgility(getTheNumberU100());
        System.out.println("Intelligence du personnage ?");
        player.setIntel(getTheNumberU100());
        player.setStamina(player.getLvl()*5);
        System.out.println("je suis le "+ player.getRole()+" Joueur de niveau "+player.getLvl()+" je possède " + player.getStamina()+" de vitalité, "
                + player.getStrength()+" de force, "+player.getAgility()+" d'agilité et "+player.getIntel()+" d'intelligence.");
        if (player.getStrength()+player.getAgility()+player.getIntel()!=player.getLvl())
            System.out.println("La somme de la force, de l'agilité et de l'intelligence doit être égale au niveau du personnage");
        }while (player.getStrength()+player.getAgility()+player.getIntel()!=player.getLvl());
    }
    static private int getTheNumberU100(){
        boolean responseIsGood;
        int number=0;
    do {
        try {
            number = sc.nextInt();
            if  (number>=1 && number<=100)responseIsGood = true;
            else {
                responseIsGood = false;
                System.out.println("Veuillez saisir un nombre compris  entre 1 et 100");
            }
        } catch (InputMismatchException e) {
            sc.next();
            responseIsGood = false;
            System.out.println("Veuillez saisir un nombre compris entre 1 et 100");
        }
    }while (!responseIsGood) ;
    return number;
}
    static private int getTheRole(){
        boolean responseIsGood;
        int number=0;
        do {
            try {
                number = sc.nextInt();
                if  (number>=1 && number<=3)responseIsGood = true;
                else {
                    responseIsGood = false;
                    System.out.println("Veuillez saisir un nombre compris  entre 1 et 3");
                }
            } catch (InputMismatchException e) {
                sc.next();
                responseIsGood = false;
                System.out.println("Veuillez saisir un nombre compris entre 1 et 3");
            }
        }while (!responseIsGood) ;
        return number;
    }


}
