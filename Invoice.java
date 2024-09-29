public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

   
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity > 0 ? quantity : 0;  
        this.pricePerItem = pricePerItem > 0 ? pricePerItem : 0.0; 
    }

    
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice("214", "Hammer", 5, 9.99);
        System.out.println("Invoice Amount: $" + invoice.getInvoiceAmount());
    }
}
