public class GuitarSpec {
    Builder builder;
    String model;
    int numStrings;
    Type type;
    Wood backWood;
    Wood topWood;

    GuitarSpec(Builder builder, String model, int numStrings, Type type,
               Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.numStrings = numStrings;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public int getNumStrings() {
        return numStrings;
    }

    @Override
    public boolean equals(Object obj) {
        GuitarSpec searchSpec = (GuitarSpec) obj;
        String model = searchSpec.getModel();

        return this.getBuilder().equals(searchSpec.getBuilder()) &&
                (model != null) && !model.equals("") &&
                model.equals(this.getModel()) &&
                this.getNumStrings() == searchSpec.getNumStrings() &&
                this.getType().equals(searchSpec.getType()) &&
                this.getBackWood().equals(searchSpec.getBackWood()) &&
                this.getTopWood().equals(searchSpec.getTopWood());
    }
}
