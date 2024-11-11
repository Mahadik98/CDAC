class Investment{

    private double payment;
    private int count;
    private boolean risk;

    public Investment(double amount, int years){
        payment = amount;
        count = years;
        risk = false;

    }

    public void allowRisk(boolean yes){
        risk = yes;
    }

    public double totalPayment() {
        return count * payment;
    }

    public double futureValue() {
        double i = risk ? 0.08 : 0.06;
        return (payment / i) * (Math.pow(1 + i, count) - 1);
    }
}