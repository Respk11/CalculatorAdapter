package work;

public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(6,3));
        System.out.println(calc.mult(3,3));
        System.out.println(calc.pow(3,2));
    }
}