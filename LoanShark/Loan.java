public class Loan {

    double principal;
    double rate;
    double year;
    int number;

    public Loan(double p, double r, double y, int n) {
        this.principal = p/100;
        this.rate = r;
        this.year = y;
        this.number = n;
    }

    double calculateSimpleInterest() {
        return principal + (principal * rate * year) / 100;
    }

    double calculateTotalRepayment() {
        return principal * Math.pow(1 + (rate / number), number * year);
    }
    
}