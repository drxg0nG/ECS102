public class Main {
    public static void main(String[] args) {
             // TODO: write for all customers 

            Customer c = Customer.generateRandom();
            System.out.println("--- Customer " + 1 + " ---");
            System.out.println("Name: " + c.getName());
            System.out.println("Credit Score: " + c.getCreditScore());
            System.out.println("Loan: $" + String.format("%.2f", c.getLoanAmount()));
            System.out.println("Defaulted? " + c.determineDefault());
            System.out.println();
        
    }
}
