import java.util.LinkedHashSet;
import java.util.Set;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("Task1: ");
        int[] numbers = {8,2,3,4,5,6,7};
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 ==0) {
                sum += number;
            }
        }
        System.out.println(sum);

        System.out.println();
        System.out.println("Task2: ");
        Set<Character> uniqueValue = new LinkedHashSet<>();
        String str = "Alexx9800";
        for (int i = 0; i < str.length(); i++){
            uniqueValue.add(str.charAt(i));
        }
        for (Character ch : uniqueValue
        ) {
            System.out.println(ch);
        }
    }
}
