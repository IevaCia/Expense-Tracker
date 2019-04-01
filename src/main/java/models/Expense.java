package models;

public class Expense {

    private String date;
    private Beneficiary beneficiary;
    private double sum;


    public Expense(String date, Beneficiary beneficiary, double sum) {
        this.date = date;
        this.beneficiary = beneficiary;
        this.sum = sum;

    }

    public String getDate() {
        return date;
    }

    public Beneficiary getBeneficiary() {
        return beneficiary;
    }

    public double getSum() {
        return sum;
    }

}

