import java.util.List;

public class FindGuitarTester {
    public static void main(String[] args) {
        //Set up Rick's guitar Inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", 6, Type.ELECTRIC,
                Wood.ALDER, Wood.ALDER);

        List<Guitar> matchingGuitars = inventory.search(whatErinLikes);

        if(!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");

            for(Guitar guitar: matchingGuitars) {
                GuitarSpec guitarSpec = guitar.getSpec();

                System.out.println("We have a " +
                        guitarSpec.getBuilder() + " " + guitarSpec.getModel() + " " +
                        guitarSpec.getNumStrings() + "-String " +
                        guitarSpec.getType() + " guitar:\n   " +
                        guitarSpec.getBackWood() + " back and sides,\n   " +
                        guitarSpec.getTopWood() + " top.\n you can have it for only $" +
                        guitar.getPrice() + "!\n  -----");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    public static void initializeInventory(Inventory inventory) {
        //Adds some guitars to inventory
        inventory.addGuitar("1", 1499.95, Builder.FENDER,
                "Stratocastor", 6, Type.ELECTRIC,
                Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("2", 1549.95, Builder.FENDER,
                "Stratocastor", 12, Type.ELECTRIC,
                Wood.ALDER, Wood.ALDER);
    }
}
