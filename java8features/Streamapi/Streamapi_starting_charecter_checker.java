package java8features;

import java.util.Arrays;
import java.util.List;

public class Streamapi_starting_charecter_checker {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("apple", "banana", "cherry", "date", "elderberry","cat","count");
        long count1= names.stream()
                .filter(n -> n.charAt(0)=='c')
                .count();
        System.out.println(count1);
    }
}
