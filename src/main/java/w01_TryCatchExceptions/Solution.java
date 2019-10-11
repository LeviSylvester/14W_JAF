package w01_TryCatchExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem?h_r=internal-search
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
//            System.out.println("Enter an integer value for x:");
            int x = scanner.nextInt();
//            System.out.println("Enter an integer value for y:");
            int y = scanner.nextInt();
            scanner.close();
            int z = x / y;
            System.out.println(/*"Here's your integer result for dividing x by y: " + */z);
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        } catch (Exception e) {
            System.out.println("other exception");
        }
    }
}
/* Sample Input 0:
10
3
Sample Output 0:
3

Sample Input 1:
10
Hello
Sample Output 1:
java.util.InputMismatchException

Sample Input 2:
10
0
Sample Output 2:
java.lang.ArithmeticException: / by zero

Sample Input 3:
23.323
0
Sample Output 3:
java.util.InputMismatchException */
