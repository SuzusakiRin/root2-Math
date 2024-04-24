public class Main {
    public static void main(String[] args) {
        double x = 1;
        for (int i = 0; i <= 20; i++) {
            x = 2 + (1 / x);
            System.out.println("√2の" + (i + 1) + "回近似した数は : " + x);
        }
    }
}