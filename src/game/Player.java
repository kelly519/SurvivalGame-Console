package game;

import java.util.Scanner;

public class Player {

    private String playerName;
    private String name;
    private int id;
    private int health;
    private int damage;
    private int money;
    private int realHealth;

    public Player(){

    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getRealHealth() {
        return realHealth;
    }

    public void setRealHealth(int realHealth) {
        this.realHealth = realHealth;
    }

    public void characterMenu()
    {
        System.out.println( "Welcome the Game " + playerName + "\nSelect Warrior ! \n1.)Samurai\n2.)Sniper\n3.)Knight");
        Scanner scan = new Scanner(System.in);
        System.out.print("Your Choice : ");
        id=scan.nextInt();
        selectCharacter(id);
    }

    public void selectCharacter(int id) {
        switch (id) {
            case 1:
                name = "Samurai";
                health = 21;
                realHealth = 21;
                damage = 5;
                money = 15;
                break;
            case 2:
                name = "Sniper";
                health = 18;
                realHealth = 18;
                damage = 7;
                money = 20;
                break;
            case 3:
                name = "Knight";
                realHealth = 24;
                health = 24;
                damage = 8;
                money = 5;
                break;
        }
    }

    public void toCharacter()
    {
        System.out.println("Warrior created successfully! ID=" + id + ",Name=" + name +",Health=" +health +",Damage=" + damage +",Money="+money);
    }
}
