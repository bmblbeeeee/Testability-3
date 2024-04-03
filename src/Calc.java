public class Calc {
    public int calculate(int sumOfCredit, double yearPercent, int term) {
        double payment;
        double k;
        double monthPercent = yearPercent / 100 / 12;
        int monthTerm = term * 12;
        k = (monthPercent * Math.pow(1 + monthPercent, monthTerm)) / (Math.pow(1 + monthPercent, monthTerm) - 1);
        payment = sumOfCredit * k;
        return (int) payment;
    }
}

