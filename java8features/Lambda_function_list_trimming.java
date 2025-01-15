package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Lambda_function_list_trimming {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Aryan","Dutta","","qwerty","hello","","world");
        List<String> trimmed = words.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
        System.out.println("Sorted List in Descending Order: " + trimmed);
    }
}
