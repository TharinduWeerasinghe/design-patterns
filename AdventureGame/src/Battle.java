public class Battle {

    public static void main(String[] args) {

        System.out.println("King");
        Character king = new King();
        king.fight();

        System.out.println("\nQueen");
        Character queen = new Queen();
        queen.fight();

        System.out.println("\nKnight");
        Character knight = new Knight();
        knight.fight();

        System.out.println("\nTroll");
        Character troll = new Troll();
        troll.fight();


    }
}
