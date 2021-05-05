package sample;
import java.util.Random;
import java.util.Collections;
import java.util.Arrays;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

import java.util.Scanner;

public class Controller {
    private static Dungeon[][] dungeonMaze=new Dungeon[4][4];
    public static Soldier player;
    public static int playerX;
    public static int playerY;
    public static Soldier opponent;
    public static Dungeon currentDungeon;
    @FXML
    private static Button zerozero;
    @FXML
    private static Button zeroone;
    @FXML
    private static Button zerotwo;
    @FXML
    private static Button zerothree;
    @FXML
    private static Button onezero;
    @FXML
    private static Button oneone;
    @FXML
    private static Button onetwo;
    @FXML
    private static Button onethree;
    @FXML
    private static Button twozero;
    @FXML
    private static Button twoone;
    @FXML
    private static Button twotwo;
    @FXML
    private static Button twothree;
    @FXML
    private static Button threezero;
    @FXML
    private static Button threeone;
    @FXML
    private static Button threetwo;
    @FXML
    private static Button threethree;
    @FXML
    private static Label fightStatusLabel;

    @FXML
    public void initialize(){
        initializeMazeAndStartGame();
    }
    public static void initializeMazeAndStartGame() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String playerName = scan.nextLine();
        System.out.println("Welcome, "+playerName+"!");
        player = new Soldier(playerName, "", "player.png", 100, 100, 20, 10, 3);
        Soldier f1 = new Soldier("The Weakling", "He failed all his fighting classes, so he's not very strong.", "weakling.png", 50, 50, 15, 5, 0);
        Soldier f2 = new Soldier("The Alchemist", "She doesn't hit very hard, but she has some tricks up her sleeve that'll make you think twice.", "alchemist.png",  75, 75, 10, 5, 2);
        Soldier f3 = new Soldier("The Titan", "He's very big and strong, but his health isn't great.", "titan.png", 75, 75, 25, 15, 0);
        Soldier f4 = new Soldier("The Glitch", "ă̸̡̤̩̙̜͚͙͍̞͉̼͛͗͑̇̍̾̐̀̌̒̀̓̚͝ş̵̛̭̩͙̻͎̳͇̠͈̲̭̃͊̌͂̌̏̊͑̈́̍̚̚̚͝ͅl̵͉̰̲̹̲͉̅̐͒̋͒̉̀̋̈́̃́̕͜͜͝d̷̲̋̒̑̏̒̑͝͝f̸̨̖͉̹͎̐̃̎͋̄̑́̓̑i̵̞̝̭̦̣̖̓͆́y̵̧̛̟͙͉̥̣̰̝̠̒͋͋̉̈́͊̀̎̏̀́͜͝͝w̴͚͖̫͚͚͍̆͑̓̊̄̍ͅͅe̷̳̼̠͈͍̞̓͋̍̿̆ŗ̸̫̜̜̟͖̪͙̖̺̜͉̝͛̀̂́̌͝u̷̦̒̕i̸͇̠̳̜̊̄̈́̿̓͑̎̽̂v̵̧͕̼̞̖̮̬͖̘̣͕̖̊̀b̵̛͖̥̠͕̖̙̘͊̒j̴̨̛̞̞̭͓̪͕̯̣̩͎̦̣̳̃́̄͑ͅk̴͈͖̦̭͕̲̻̞͔͙̟̃̑̑͌̿̎͂͝ͅͅľ̷̛̬̗̺̤̲̠̟͕̪̩͇̑͝s̶̨̩͔͇̀͗̾͜͝j̴̟̠̒̄̇̽̈́̐̓͒̑͌̂̅̒͂̅", "glitch.png", 1, 1, 1, 1, 0);
        Soldier f5 = new Soldier("The Nick", "The strongest enemy you will ever fight.", "nick.png", 150, 150, 30, 20, 0);
        Soldier f6 = new Soldier("The Alien", "This enemy is out of this world!", "alien.png", 100,100, 20, 15, 0);
        Soldier f7 = new Soldier("The Wolf", "A strong, quick enemy that will make you think fast.", "wolf.png", 70,70,25,15,0);
        Soldier f8 = new Soldier("The Spider", "Maybe you could step on it or something?", "spider.png", 20,20,10,5,0);
        Soldier f9 = new Soldier("The Crab", "Look out for its pincers!","crab.png",50,50,10,5,0);
        Soldier f10 = new Soldier("The Ogre","Get out of my swamp!", "ogre.png", 150, 150, 20, 12, 0);
        Soldier f11 = new Soldier("The Reaper", "Death itself has come for you.", "reaper.png", 1000000, 1000000, 10000, 10000, 0);
        Soldier f12 = new Soldier("The Fighter", "This enemy looks just like you.", "fighter.png", 100, 100, 20, 10, 1);
        Soldier f13 = new Soldier("The Slime", "A green blob that looks hard to kill.", "slime.png", 500, 500, 1, 1, 0);
        Soldier f14 = new Soldier("The Zombie","She rose from the dead just to fight you.", "zombie.png", 125, 125, 15, 10, 0);
        Soldier f15 = new Soldier("The Archer","His aim is dead on, but that might not help him very much in this fight.", "archer.png", 75, 75, 30, 5, 0);
        Soldier f16 = new Soldier("The Swordsman", "Highly trained and well-armed, this enemy will be hard to kill.", "swordsman.png", 125, 125, 25, 15, 0);
        Soldier[] poolOfFighters={f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14,f15,f16};
        Collections.shuffle(Arrays.asList(poolOfFighters));
        Random random=new Random();
        int randNum=random.nextInt(16);
        poolOfFighters[randNum].setStoleSoul(true);
        Dungeon d1 = new Dungeon("The Classroom","Maybe you'll learn something here.",poolOfFighters[0]);
        Dungeon d2 = new Dungeon("The Arena","Countless fighters have fallen here.",poolOfFighters[1]);
        Dungeon d3 = new Dungeon("The Library","Don't disturb the books!",poolOfFighters[2]);
        Dungeon d4 = new Dungeon("The Classroom","Maybe you'll learn something here.",poolOfFighters[3]);
        Dungeon d5 = new Dungeon("The Arena","Countless fighters have fallen here.",poolOfFighters[4]);
        Dungeon d6 = new Dungeon("The Library","Don't disturb the books!",poolOfFighters[5]);
        Dungeon d7 = new Dungeon("The Classroom","Maybe you'll learn something here.",poolOfFighters[6]);
        Dungeon d8 = new Dungeon("The Arena","Countless fighters have fallen here.",poolOfFighters[7]);
        Dungeon d9 = new Dungeon("The Library","Don't disturb the books!",poolOfFighters[8]);
        Dungeon d10 = new Dungeon("The Classroom","Maybe you'll learn something here.",poolOfFighters[9]);
        Dungeon d11 = new Dungeon("The Arena","Countless fighters have fallen here.",poolOfFighters[10]);
        Dungeon d12 = new Dungeon("The Library","Don't disturb the books!",poolOfFighters[11]);
        Dungeon d13 = new Dungeon("The Classroom","Maybe you'll learn something here.",poolOfFighters[12]);
        Dungeon d14 = new Dungeon("The Arena","Countless fighters have fallen here.",poolOfFighters[13]);
        Dungeon d15 = new Dungeon("The Library","Don't disturb the books!",poolOfFighters[14]);
        Dungeon d16 = new Dungeon("The Classroom","Maybe you'll learn something here.",poolOfFighters[15]);
        Dungeon[] dungeons= {d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15,d16};
        Collections.shuffle(Arrays.asList(dungeons));
        dungeonMaze[0][0]=dungeons[0];
        dungeonMaze[0][1]=dungeons[1];
        dungeonMaze[0][2]=dungeons[2];
        dungeonMaze[0][3]=dungeons[3];
        dungeonMaze[1][0]=dungeons[4];
        dungeonMaze[1][1]=dungeons[5];
        dungeonMaze[1][2]=dungeons[6];
        dungeonMaze[1][3]=dungeons[7];
        dungeonMaze[2][0]=dungeons[8];
        dungeonMaze[2][1]=dungeons[9];
        dungeonMaze[2][2]=dungeons[10];
        dungeonMaze[2][3]=dungeons[11];
        dungeonMaze[3][0]=dungeons[12];
        dungeonMaze[3][1]=dungeons[13];
        dungeonMaze[3][2]=dungeons[14];
        dungeonMaze[3][3]=dungeons[15];
        playerX=random.nextInt(4);
        playerY=random.nextInt(4);
        Dungeon currentDungeon=dungeonMaze[playerX][playerY];
        button00Pressed();

    }
    public static void button00Pressed(){
        fightStatusLabel.setText("hi");
    }
    public static void button01Pressed(){

    }
    public static void attackButtonPressed(){
        int playerAttackStrength = player.attack();
        opponent.subtractHealth(playerAttackStrength);
        if (opponent.isAlive()) {
            fightStatusLabel.setText("You attacked with a strength of " + playerAttackStrength + ". Your opponent now has " + opponent.getHealth() + " hitpoints left.");
        }
        else{
            fightStatusLabel.setText("You attacked with a strength of "+playerAttackStrength+". Your opponent is now dead.");
        }
        //playerTurn=false;
    }
    public static void healButtonPressed(){
        if (player.getNumOfPotions()>0){
            player.heal();
            System.out.println("You drink your potion and suddenly feel healthy and invigorated. You now have " + player.getHealth() + " hitpoints left.");
            //playerTurn=false;
        }
    }
    public static void button02Pressed(){

    }
    public static void button03Pressed(){

    }
    public static void button10Pressed(){

    }
    public static void button11Pressed(){

    }
    public static void button12Pressed(){

    }
    public static void button13Pressed(){

    }
    public static void button20Pressed(){

    }
    public static void button21Pressed(){

    }
    public static void button22Pressed(){

    }
    public static void button23Pressed(){

    }
    public static void button30Pressed(){

    }
    public static void button31Pressed(){

    }
    public static void button32Pressed(){

    }
    public static void button33Pressed(){

    }
}
