public class Main {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        Devisor devisor1 = new Devisor(3, "Fizz");
        Devisor devisor2 = new Devisor(5, "Buzz");
        Devisor devisor3 = new Devisor(7, "Ven");

        for (int i = start; i <= end; i++) {
            Devisor.fizzbuzz(i);
        }
    }
}