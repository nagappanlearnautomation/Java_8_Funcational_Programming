        package LamdaExpression;

        import java.util.function.IntFunction;

        public class LamdaExpression {

//            public static int incrementByOne(int number) {
//                return number + 1;
//            }

            static IntFunction<Integer> incrementByOne = number -> number + 1;

         //   static IntFunction<Integer> incrementByOne = (int number) -> number + 1;
        //
         //   static IntFunction<Integer> incrementByOne = (number) -> number + 1;

         //   static IntFunction<Integer> incrementByOne = (int number) -> { return number + 1; };

            public  static void main(String[] args) {
                System.out.println(incrementByOne.apply(10));
                //System.out.println(incrementByOne(10));
            }
        }
