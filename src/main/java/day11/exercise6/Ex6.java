package day11.exercise6;

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

        System.out.println("Sorting the Invoice objects by partDescription: ");
        // sorting the Invoice objects by partDescription
        Arrays.stream(invoices)
                .sorted(Comparator.comparing(Invoice::getPartDescription))
                .forEach(System.out::println);

        System.out.println("\nSorting the Invoice objects by pricePerItem: ");
        // sorting the Invoice objects by pricePerItem
        Arrays.stream(invoices)
                .sorted(Comparator.comparing(Invoice::getPricePerItem))
                .forEach(System.out::println);

        System.out.println("\nMapping each Invoice to its partDescription and quantity: ");
        // mapping each Invoice to its partDescription and quantity,
        // sorting the results by quantity
        Arrays.stream(invoices)
                .sorted(Comparator.comparing(Invoice::getQuantity))
                .map(invoice -> invoice.getPartDescription() + " " + invoice.getQuantity())
                .forEach(System.out::println);

        System.out.println("\nMapping each Invoice to its partDescription and the value of the Invoice: ");
        // mapping each Invoice to its partDescription
        // and the value of the Invoice (i.e., quantity * pricePerItem).
        // Ordering the results by Invoice value.
        Arrays.stream(invoices)
                .sorted(Comparator.comparing(invoice1 -> invoice1.getQuantity() * invoice1.getPricePerItem()))
                .map(invoice -> invoice.getPartDescription() + " " + invoice.getQuantity() * invoice.getPricePerItem())
                .forEach(System.out::println);


        System.out.println("\nMapping each Invoice to its partDescription and the value of the Invoice in range (200-500): ");
        // mapping each Invoice to its partDescription
        // and the value of the Invoice (i.e., quantity * pricePerItem).
        // Ordering the results by Invoice value.
        Arrays.stream(invoices)
                .sorted(Comparator.comparing(invoice1 -> invoice1.getQuantity() * invoice1.getPricePerItem()))
                .filter(invoice -> invoice.getQuantity() * invoice.getPricePerItem() > 200 && invoice.getQuantity() * invoice.getPricePerItem() < 500)
                .map(invoice -> invoice.getPartDescription() + " " + invoice.getQuantity() * invoice.getPricePerItem())
                .forEach(System.out::println);


        System.out.println("\nFinding any one Invoice in which the partDescription contains the word \"saw\"");
        // Finding any one Invoice in which the partDescription contains the word "saw"
        System.out.println(
                Arrays.stream(invoices)
                        .filter(x -> x.getPartDescription().contains("saw"))
                        .findAny());
    }
}