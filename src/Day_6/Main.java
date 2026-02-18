package Day_6;

class Bank {
    double rate = 5.0;
    static class InterestCalculator {
        static double calculateSimpleInterest(double p, double t, double r) {
            return (p * t * r) / 100;
        }
    }
    public static void main(String[] args) {
        double si = InterestCalculator.calculateSimpleInterest(800, 8, 5);
        System.out.println("Simple Interest = " + si);
    }
}
