import java.util.HashMap;

public class Devisor {
    public int number;
    public String word;
    public static HashMap<Integer, String> devisors = new HashMap<>();

    public Devisor(int number, String word) {
        this.number = number;
        this.word = word;
        devisors.put(number, word);
    }

    public static void fizzbuzz(int integer) {
        StringBuilder string = new StringBuilder();
        for (int devisor  : devisors.keySet()) {
            if (integer % devisor == 0) {
                string.append(devisors.get(devisor));
            }
        }
        if (string.isEmpty()) {
            System.out.println(integer);
        }
        else {
            System.out.println(string);
        }
    }
}
