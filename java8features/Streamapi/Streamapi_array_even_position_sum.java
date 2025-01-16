package java8features;

import java.util.Arrays;
import java.util.List;

public class Streamapi_array_even_position_sum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3,14,5, 16, 7, 28, 9, 10);
        int sumup = numbers.stream()
                .filter(n -> n%2 ==0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("sum of even = "+ sumup);
    }
}