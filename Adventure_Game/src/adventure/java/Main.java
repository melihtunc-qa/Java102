public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory(false,false,false,false,false,false,false,false,false,false,false,false);
        Player player = new Player(inventory);

        SafeHouse safeHouse = new SafeHouse(player);
        ToolStore toolStore = new ToolStore(player);

        Bear bear = new Bear("Bear",4,35,12);
        Zombie zombie = new Zombie("Zombie",3,23,9);
        Vampire vampire = new Vampire("Vampire",2,29,7);
        Snake snake = new Snake("Snake",3,20,3);

        River river = new River(player,bear);
        Cave cave = new Cave(player,zombie);
        Mine mine = new Mine(player,snake);
        Forest forest = new Forest(player,vampire);

        Game advgame = new Game(player,safeHouse,toolStore,forest,mine,cave,river);

        advgame.startGame();

    }
}
