public class Main {
    public static void main(String[] args) {
        Calc calculation = new Calc();
        int yourPayment = calculation.calculate(1000000, 9.99, 1);
        System.out.println("Ежемесячный платеж: " + yourPayment);
        int yourPayment2 = calculation.calculate(1000000, 9.99, 2);
        System.out.println("Ежемесячный платеж: " + yourPayment2);
        int yourPayment3 = calculation.calculate(1000000, 9.99, 3);
        System.out.println("Ежемесячный платеж: " + yourPayment3);
    }
}