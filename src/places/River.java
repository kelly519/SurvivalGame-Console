package places;

import enemies.Bear;
import game.Inventory;
import game.Player;

public class River  extends Location{

    public River(Player p, Inventory i) {
        super.locationId=4;
        super.name="River";
        super.itemName="Water";
        super.obstacle=new Bear();
        super.player=p;
        super.inventory=i;
    }
}
