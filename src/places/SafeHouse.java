package places;

import game.Inventory;
import game.Player;

public class SafeHouse extends Location {

    public SafeHouse(Player p, Inventory i) {
        super.locationId=1;
        super.name="Safe House";
        super.player=p;
        super.inventory=i;
    }

    public void getLocation()
    {
        if(inventory.isFireWood()==true && inventory.isFood()==true && inventory.isWater()==true)
        {
            System.out.println("Congratulations! You brought items that your village needs.");
            System.out.println("You Win!!");
        }
        else{
            player.setHealth(player.getRealHealth());
            System.out.println("You are healed!!");
            System.out.println("You are in the SAFEHOUSE now!!");

            printMenu();
        }
    }
}
