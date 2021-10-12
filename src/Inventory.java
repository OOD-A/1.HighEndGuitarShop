import java.util.LinkedList;
import java.util.List;

public class Inventory {
    List<Guitar> guitars;

    Inventory() {
        guitars = new LinkedList<>();
    }

    public void addGuitar(String serialNumber, double price,
                          Builder builder, String model, int numStrings,
                          Type type, Wood backWood, Wood topWood) {
        Guitar guitar = new Guitar(serialNumber, price, new GuitarSpec(builder, model, numStrings, type, backWood, topWood));
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for(Guitar guitar: guitars) {
            if(guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec searchGuitar) {
        List<Guitar> matchingGuitars = new LinkedList<>();

        for(Guitar guitar: guitars) {
            // Ignore serial Number and price since they are unique

            GuitarSpec guitarSpec = guitar.getSpec();

            if(guitarSpec.equals(searchGuitar))
                matchingGuitars.add(guitar);
        }

        return matchingGuitars;
    }
}
