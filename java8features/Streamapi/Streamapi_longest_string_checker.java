package java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Streamapi_longest_string_checker {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        String sumup = numbers.stream()
                .max(Comparator.comparingInt(String::length))
                .get();
        System.out.println("longest string - "+ sumup);
    }
}