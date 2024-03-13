public class RewardValue {
    double cashValue,milesValue;

    public double getCashValue() {
        return cashValue;
    }

    public void setCashValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    public void setMilesValue(double milesValue) {
        this.milesValue = milesValue;
    }

    public RewardValue(double cashValue) {
        milesValue = cashValue*0.0035;
    }
}
