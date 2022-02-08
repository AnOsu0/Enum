package example2;

public enum Status {
    NEW("złożone"), PAID("opłacone"), SHIPPED("wysłane"),
    DELIVERED("dostarczone"), CANCELED("anulowane");

    private final String description;

    Status(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }

}
