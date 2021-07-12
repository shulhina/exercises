package day11.ex6;

class Invoice {
    String partNumber;
    String partDescription;
    int quantity;
    double pricePerItem;

    Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }


    @Override
    public String toString() {
        return "Invoice{" +
                "partNumber='" + partNumber + '\'' +
                ", partDescription='" + partDescription + '\'' +
                ", quantity=" + quantity +
                ", pricePerItem=" + pricePerItem +
                '}';
    }

    public String getPartDescription() {
        return partDescription;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }
}