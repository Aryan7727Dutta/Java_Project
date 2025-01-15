package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Lambda_function_max_value {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 3, 1, 9, 4);
        int sortedNumbers = numbers.stream()
                .max(Integer::compareTo)
                 .get();
        System.out.println("Maximum Value is : " + sortedNumbers);
    }
}
