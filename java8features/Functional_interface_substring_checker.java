package java8features;

@FunctionalInterface
interface Predicate<T> {
    boolean test(T s, T substring);
}

public class Functional_interface_substring_checker  {
    public static void main(String[] args) {
        Predicate<String> containsSubstring = (s, substring) -> s.contains(substring);

        // Test cases
        String mainString = "Hello, world!";
        String substring1 = "world";
        String substring2 = "java";

        System.out.println("Does \"" + mainString + "\" contain \"" + substring1 + "\"? "
                + containsSubstring.test(mainString, substring1));
        System.out.println("Does \"" + mainString + "\" contain \"" + substring2 + "\"? "
                + containsSubstring.test(mainString, substring2));
    }
}

