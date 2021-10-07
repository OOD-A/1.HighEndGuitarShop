public enum Wood {
    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAPLE, MAHOGANY,
    COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;


    @Override
    public String toString() {
        switch (this) {
            case INDIAN_ROSEWOOD:
                return "Indian Rosewood";
            case BRAZILIAN_ROSEWOOD:
                return "Brazilian Rosewood";
            case MAPLE:
                return "Maple";
            case MAHOGANY:
                return "Mahogany";
            case COCOBOLO:
                return "Cocobolo";
            case CEDAR:
                return "Cedar";
            case ADIRONDACK:
                return "Adirondack";
            case ALDER:
                return "Alder";
            case SITKA:
                return "Sitka";
            default:
                return null;
        }
    }
}
