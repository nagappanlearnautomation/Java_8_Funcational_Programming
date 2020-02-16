import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class FunctionalInterface {

    @java.lang.FunctionalInterface
    public interface Operation {
        public int add(int num1, int num2);

       //public double add(Double num1, Double num2);
    }


    public static class TestOperation implements Operation {

        @Override
        public int add(int num1, int num2) {
            return num1 + num2;
        }
    }

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> AddFunctionalInterface = (num1, num2) -> num1 + num2;
        Function<Integer, String> ConvertToStringFunctionalInterface = num -> String.valueOf(num) + " is a string";
        ToIntFunction<String> ToIntFuntionalInterface = str -> Integer.valueOf(str) + 1;
        IntFunction<String> IntFunctionalInterface = num -> String.valueOf(num);
        TestOperation testOperation = new TestOperation();
        System.out.println(testOperation.add(10, 15));
        System.out.println(AddFunctionalInterface.andThen(ConvertToStringFunctionalInterface).apply(10, 25));
        //IntFunctionalInterface.apply("");
        System.out.println("AddFunctionalInterface"+AddFunctionalInterface.apply(10, 15));
        System.out.println("ConvertToStringFunctionalInterface"+ConvertToStringFunctionalInterface.apply(123));
        System.out.println("ToIntFuntionalInterface "+ToIntFuntionalInterface.applyAsInt("10"));
    }

}
