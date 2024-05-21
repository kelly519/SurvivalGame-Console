package game;

public class Inventory {

    private boolean water = false;
    private boolean food = false;
    private boolean fireWood = false;
    private int id;
    private int weaponID;
    private int armorID;
    private int defend = 0;
    private String weaponString;
    private String armorString;

    public void addWeapon(int id, String name, int damage) {
        this.weaponID = id;
        this.weaponString = name + " " + "+" + damage + " damage";

    }

    public void addArmor(int id, String name, int avoid) {
        this.armorID = id;
        this.armorString = "Armor: " + name + " Armor " + avoid + " avoid.";

    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isFireWood() {
        return fireWood;
    }

    public void setFireWood(boolean fireWood) {
        this.fireWood = fireWood;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeaponID() {
        return weaponID;
    }

    public void setWeaponID(int weaponID) {
        this.weaponID = weaponID;
    }

    public int getArmorID() {
        return armorID;
    }

    public void setArmorID(int armorID) {
        this.armorID = armorID;
    }

    public int getDefend() {
        return defend;
    }

    public void setDefend(int defend) {
        this.defend = defend;
    }

    public String getWeaponString() {
        return weaponString;
    }

    public void setWeaponString(String weaponString) {
        this.weaponString = weaponString;
    }

    public String getArmorString() {
        return armorString;
    }

    public void setArmorString(String armorString) {
        this.armorString = armorString;
    }
}
