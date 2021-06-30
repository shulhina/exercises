package day2.ex1;

class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.setPartNumber("A22");
        invoice.setPartDescription("Part Description");
        invoice.setQuantityPurchased(22);
        invoice.setItemPrice(13.50);

        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("A quantity of the item being purchased: " + invoice.getQuantityPurchased());
        System.out.println("A price per item: " + invoice.getItemPrice());
        System.out.println("The invoice amount: " + invoice.getInvoiceAmount());
    }
}
