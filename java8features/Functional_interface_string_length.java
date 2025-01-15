package java8features;

@FunctionalInterface
interface StringLength
{
    int apply(String s);

}
public class Functional_interface_string_length {
    public static void main(String[] args) {
        StringLength len =(str) -> str.length();
        String stri = "Hello World";
        System.out.println("length = "+ len.apply(stri));
    }
}
