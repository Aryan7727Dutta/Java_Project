package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda_function_list_sort {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 3, 1, 9, 4);
        List<Integer> sortedNumbers = numbers.stream()
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());
        System.out.println("Sorted List in Descending Order: " + sortedNumbers);
    }
}
