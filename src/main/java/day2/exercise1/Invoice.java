package day2.exercise1;

public class Invoice {
    String partNumber;
    String partDescription;
    int quantityPurchased;
    double itemPrice;

    double getInvoiceAmount() {
        return this.quantityPurchased * this.itemPrice;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantityPurchased() {
        return quantityPurchased;
    }

    public void setQuantityPurchased(int quantityPurchased) {
        this.quantityPurchased = Math.max(quantityPurchased, 0);
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice < 0 ? 0.0 : itemPrice;
    }
}
