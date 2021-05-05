/*
package sample;
import java.util.Scanner;
import java.util.Random;
public class MMAFighterSim {
    //public static void main(String[] args) {
        //welcome();
        Random rand = new Random();
        Soldier choice1 = poolOfFighters[rand.nextInt(5)];
        while (!choice1.isAlive()) {
            choice1 = poolOfFighters[rand.nextInt(5)];
        }
        boolean result1 = letsGetItOn(player, choice1);
        if (result1) {
            player.upgrade();
            Soldier choice2 = poolOfFighters[rand.nextInt(5)];
            while (!choice2.isAlive()) {
                choice2 = poolOfFighters[rand.nextInt(5)];
            }
            boolean result2 = letsGetItOn(player, choice2);
            if (result2) {
                player.upgrade();
                Soldier choice3 = poolOfFighters[rand.nextInt(5)];
                while (!choice3.isAlive()) {
                    choice3 = poolOfFighters[rand.nextInt(5)];
                }
                boolean result3 = letsGetItOn(player, choice3);
                if (result3){
                    System.out.println("You won the belt! You are now the ultimate fighting champion.");
                }
            }
        }
    }

    public static void welcome() {
        System.out.println("  ___              ___  \n" +
                " (o o)            (o o) \n" +
                "(  V  ) Welcome! (  V  )\n" +
                "--m-m--------------m-m--");

        System.out.println("Welcome to the arena! Here, you will fight for a chance at glory...or death.");
    }



    public static boolean letsGetItOn(Soldier f1, Soldier f2) {
        Soldier computer = f2;
        Soldier player = f1;
        player.regenerate();
        System.out.println("You are fighting " + computer.getName() + ". " + computer.getDescription() + " Your opponent has " + computer.getHealth() + " hitpoints.");
        while (true) {
            System.out.println("It is your turn. Press (1) to attack and (2) to heal.");
            Scanner scan = new Scanner(System.in);
            int playerChoice = scan.nextInt();
            if (playerChoice == 2) {
                boolean healSuccessful = player.heal();
                if (!healSuccessful) {
                    playerChoice = 1;
                    System.out.println("You have no potions left to heal yourself, so you decide to attack instead.");
                } else {
                    System.out.println("You drink your potion and suddenly feel healthy and invigorated. You now have " + player.getHealth() + " hitpoints left.");
                }
            }
            if (playerChoice == 1) {
                int playerAttackStrength = player.attack();
                computer.subtractHealth(playerAttackStrength);
                if (computer.isAlive()) {
                    System.out.println("You attacked with a strength of " + playerAttackStrength + ". Your opponent now has " + computer.getHealth() + " hitpoints left.");
                }
                else{
                    System.out.println("You attacked with a strength of "+playerAttackStrength+". Your opponent is now dead.");
                }
            }
            if (!computer.isAlive()) {
                System.out.println("Congratulations, you defeated your opponent!\n");
                return true;
            }
            if (computer.getHealth() < player.getMaxDamage() && computer.getNumOfPotions() > 0) {
                computer.heal();
                System.out.println("Your opponent drinks a potions and heals. They now have " + computer.getHealth() + " hitpoints left.");
            } else {
                int computerAttackStrength = computer.attack();
                player.subtractHealth(computerAttackStrength);
                if (player.isAlive()) {
                    System.out.println(computer.getName() + " attacked with a strength of " + computerAttackStrength + ". You now have " + player.getHealth() + " hitpoints left.");
                }
                else{
                    System.out.println(computer.getName()+" attacked with a strength of "+computerAttackStrength+". You are now dead.");
                }
            }
            if (!player.isAlive()) {
                System.out.println("You fall to the ground, defeated. Maybe you'll win next time.");
                return false;
            }
        }
    }
}
*/
