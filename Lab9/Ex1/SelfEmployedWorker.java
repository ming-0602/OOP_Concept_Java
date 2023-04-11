package Ex1;

import sampleprogram1.Employee;

public class SelfEmployedWorker extends Employee {

    private double estimatedIncome;

    public SelfEmployedWorker(String firstName, String lastName, double estimatedIncome) {
        super(firstName, lastName);
        this.estimatedIncome = estimatedIncome;
    }


    public double getEstimatedIncome() {
        return estimatedIncome;
    }

    public void setEstimatedIncome(double estimatedIncome) {
        double tem = 400 + (Math.random() * 900);
        estimatedIncome = tem;
        this.estimatedIncome = estimatedIncome;
    }

    public double earnings() {
        return 400 + ( Math.random() * 900);
    }

    @Override
    public String toString() {
        return "Self-employed worker's name is " + super.toString();
    }
}
