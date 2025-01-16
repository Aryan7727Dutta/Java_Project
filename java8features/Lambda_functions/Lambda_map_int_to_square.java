package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Lambda_map_int_to_square {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 3, 1, 9, 4);
        List<Integer> sortedNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Square of all the list values are : " + sortedNumbers);
    }
}
