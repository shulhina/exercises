package day11.ex6;

import java.util.Arrays;
import java.util.Comparator;

public class Ex6 {
    public static void main(String[] args) {
        Invoice[] invoices = {
                new Invoice("83", "Electric sander", 7, 57.98),
                new Invoice("24", "Power saw", 18, 99.99),
                new Invoice("7", "Sledge hammer", 11, 21.50),
                new Invoice("77", "Hammer", 76, 11.99),
                new Invoice("39", "Lawn mower", 3, 79.50),
                new Invoice("68", "Screwdriver", 106, 6.99),
                new Invoice("56", "Jig saw", 21, 11.00),
                new Invoice("3", "Wrench", 34, 7.50)
        };

        Arrays.stream(invoices).sorted(Comparator.comparing(Invoice::getPartDescription)).forEach(System.out::println);
    }
}

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
}