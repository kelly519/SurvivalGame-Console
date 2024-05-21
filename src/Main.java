import game.Inventory;
import game.Player;
import places.Location;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter Your Name : ");

        String name = scan.nextLine();
        Player player = new Player();
        player.setPlayerName(name);

        Inventory inventory=new Inventory();
        player.characterMenu();
        player.toCharacter();

        Location local=new Location(player,inventory);
        local.printMenu();
    }
}