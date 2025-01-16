package java8features;

@FunctionalInterface
interface Transformer
{
    String apply(String s);
}
public class Functional_interface_case_changer {
    public static void main(String[] args) {

            Transformer toLowerCase = String::toLowerCase;
            Transformer toUpperCase = String::toUpperCase;
            Transformer toTitleCase = input -> {
                String[] words = input.split("\\s+");
                StringBuilder result = new StringBuilder();
                for (String word : words) {
                    result.append(Character.toUpperCase(word.charAt(0)))
                            .append(word.substring(1).toLowerCase())
                            .append(" ");
                }
                return result.toString().trim();
            };
            String input = "hello WORLD";

            System.out.println("Lowercase: " + toLowerCase.apply(input));
            System.out.println("Uppercase: " + toUpperCase.apply(input));
            System.out.println("Title Case: " + toTitleCase.apply(input));

    }
}
