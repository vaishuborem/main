public class ElectricityBill {
    private String consumerNo;
    private String consumerName;
    private int prevReading;
    private int currReading;
    private String connectionType;

    
    public ElectricityBill(String consumerNo, String consumerName, int prevReading, int currReading,
            String connectionType) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.prevReading = prevReading;
        this.currReading = currReading;
        this.connectionType = connectionType;
    }

    public double calculateBill() {
        int units = currReading - prevReading;
        double rate;

        if (connectionType.equalsIgnoreCase("domestic")) {
            if (units <= 100)
                rate = 1.5;
            else if (units <= 200)
                rate = 2.5;
            else
                rate = 4.0;
        } else {
            if (units <= 100)
                rate = 2.5;
            else if (units <= 200)
                rate = 4.5;
            else
                rate = 6.0;
        }

        return units * rate;
    }

    public static void main(String[] args) {
        ElectricityBill bill = new ElectricityBill("C001", "John Doe", 500, 700, "domestic");

        System.out.println("Bill Amount: $" + bill.calculateBill());
    }
}
