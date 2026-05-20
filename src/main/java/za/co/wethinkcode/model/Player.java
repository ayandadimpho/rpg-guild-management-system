package za.co.wethinkcode.model;

public class Player {

    public enum PlayerRank {
        BRONZE,
        SILVER,
        GOLD,
        DIAMOND
    }

    // TODO: declare private fields:
    private int id;
    private String name;
    private int level;
    private int xp;
    private int gold;
    private PlayerRank rank;
    private Inventory inventory;
    private Weapon equippedWeapon;
    private Armor equippedArmor;

    // TODO: implement constructor:
    // - initialise level = 1
    // - xp = 0
    // - gold = 0
    // - rank = BRONZE
    // - inventory = new Inventory()
    public Player(int id, String name) {
        this.id = id;
        this.name = name;
        this.level = 1;
        this.xp = 0;
        this.gold = 0;
        this.rank = PlayerRank.BRONZE;
        this.inventory = new Inventory();
    }

    // TODO: implement getters:
    // int getId()
    // String getName()
    // int getLevel()
    // int getXp()
    // int getGold()
    // PlayerRank getRank()
    // Inventory inventory()

    // TODO: implement addExperience(int xp)
    // - add xp
    // - call levelUp() when threshold reached

    // TODO: implement levelUp()
    // - increase level by 1
    // - reset or reduce xp appropriately (your design should be consistent with tests)

    // TODO: implement addGold(int gold)
    // - increase gold

    // TODO: implement spendGold(int amount)
    // - throw IllegalArgumentException if insufficient gold

    // TODO: implement equipWeapon(Weapon weapon)

    // TODO: implement equipArmor(Armor armor)

    // TODO: implement updateRank(PlayerRank rank)

    // TODO: override toString()
    // Example:
    // Player: John (Level 3, Rank GOLD)
}