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

        tester.testFile();
    }
}
