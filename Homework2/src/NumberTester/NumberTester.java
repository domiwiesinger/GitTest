package NumberTester;

import java.io.*;

public class NumberTester {

    private NumberTest oddEvenTester;
    private NumberTest palindromeTest;
    private NumberTest primeTester;
    private String filename;

    public NumberTester(String filename) {
        this.filename = filename;
    }

    public void setOddEvenTester(NumberTest oddEvenTester) {
        this.oddEvenTester = oddEvenTester;
    }

    public void setPalindromeTest(NumberTest palindromeTest) {
        this.palindromeTest = palindromeTest;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void testFile(){
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;
            br.readLine();
            while ((line = br.readLine())!=null){
                String[] parts = line.split(" ");

                if (Integer.parseInt(parts[0]) == 1){
                    if (oddEvenTester.testNumber(Integer.parseInt(parts[1]))) {
                        System.out.println("EVEN");
                    }
                    else {
                        System.out.println("ODD");
                    }
                }
                else if (Integer.parseInt(parts[0]) == 2){
                    if (primeTester.testNumber(Integer.parseInt(parts[1]))) {
                        System.out.println("PRIME");
                    }
                    else {
                        System.out.println("NO PRIME");
                    }
                }
                else if (Integer.parseInt(parts[0]) == 3){
                    if (palindromeTest.testNumber(Integer.parseInt(parts[1]))) {
                        System.out.println("PALINDROME");
                    }
                    else {
                        System.out.println("NO PALINDROME");
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
