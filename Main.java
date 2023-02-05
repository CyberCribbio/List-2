import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        List<Integer> divisorsOf52 = new ArrayList();
        divisorsOf52.add(1);
        divisorsOf52.add(2);
        divisorsOf52.add(4);
        divisorsOf52.add(13);
        divisorsOf52.add(26);
        divisorsOf52.add(52);
        List<Integer> randomNumbers = new ArrayList();
        randomNumbers.add(1);
        randomNumbers.add(60);
        randomNumbers.add(13);
        randomNumbers.add(12);
        randomNumbers.addAll(divisorsOf52);
        System.out.println("1 - randomNumbers elements: " + randomNumbers);
        System.out.println("1 - randomNumbers has " + randomNumbers.size() + " items");
        int duplicate1 = randomNumbers.indexOf(1);
        randomNumbers.remove(duplicate1);
        int duplicate13 = randomNumbers.indexOf(13);
        randomNumbers.remove(duplicate13);
        System.out.println("2 - randomNumbers elements: " + randomNumbers);
        System.out.println("2 - randomNumbers has " + randomNumbers.size() + " items");
        Collections.sort(randomNumbers, Collections.reverseOrder());
        System.out.println("3 - randomNumbers elements: " + randomNumbers);
    }
}

