package example1;

public enum Pizza {
    MARGHERITA("sos pomidorowy", "ser"),CAPRICOSA("sos pomidorowy", "ser", "pieczarki"),
    PROSCIUTTO("sos pomidorowy", "ser", "szynka");

    private final String i1;
    private String i2;
    private String i3;

    Pizza(String i1, String i2) {
        this.i1 = i1;
        this.i2 = i2;
    }

    Pizza(String i1, String i2, String i3) {
        this.i1 = i1;
        this.i2 = i2;
        this.i3 = i3;
    }

    public Pizza fromNumber(int x){
        Pizza[] values = Pizza.values();
        for (Pizza temp: values){
            if (temp.ordinal() == (x-1)){
                return temp;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        if (i3 == null){
            return (ordinal() + 1) + " " + name() + " (" + i1 + " + " + i2 + ")";
        } else {
            return (ordinal() + 1) + " " + name() + " (" + i1 + " + " + i2 + " + " + i3 + ")";
        }
    }
}
