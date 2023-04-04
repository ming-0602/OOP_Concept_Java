package Ex201;

public class BankAccount {
    private String owner;
    private int number;
    private static double interest_rate;

    public BankAccount(String owner, int number) {
        this.owner = owner;
        this.number = number;
//        this.interest_rate = interest_rate;
    }

    public BankAccount() {
        this.owner = "Owner Not Available";
        this.number = 0;
        this.interest_rate = 0;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static double getInterest_rate() {
        return interest_rate;
    }

    public static void setInterest_rate(double interest_rate) {
        BankAccount.interest_rate = interest_rate;
    }

    @Override
    public String toString() {
        return "Owner : " + getOwner() + ' ' +
                " Account Number : " + getNumber() + " " +
                " Interest Rate : " + getInterest_rate();
    }
}
