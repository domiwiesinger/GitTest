package NumberTester;

public class Main {

    public static void main(String[] args) {
        NumberTester tester = new NumberTester("input.csv");

        tester.setOddEvenTester(number -> {
            if (number % 2 == 0){
                return true;
            }
            return false;
        });

        tester.setPrimeTester(number -> {

                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0){
                        return false;
                    }
                }
                return true;
        });

        tester.setPalindromeTest(number -> {

            String numb = String.valueOf(number);
            String backwards;
            StringBuilder reversedString = new StringBuilder(numb);
            backwards = reversedString.reverse().toString();


            if (numb.equals(backwards)){
                return true;
            }
            else {
                return false;
            }

        });

        tester.testFile();
    }
}
