package java8features;

import java.util.Arrays;
import java.util.List;

public class Streamapi_average_calculator {
    public static void main(String[] args) {
        List<Double> names= Arrays.asList(12.5, 9.7, 3.14, 15.8, 7.22, 8.9);
        double count = names.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .getAsDouble();
        System.out.println(count);
    }
}
