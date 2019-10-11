package w09_List;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-list/problem
public class Solution {

    public static void main(String[] args) {
        int n; //number of integers to be added to list
        int q; //number of queries
        int x; //index
        int y; //element
        String query;

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number of integers you wanna store.");
        n = scanner.nextInt();

        List<Integer> integers = new ArrayList<>(/*n*/);
        for (int i = 0; i < n; i++) {
            integers.add(scanner.nextInt());
        }
//        System.out.println("Enter the number of queries you want to make.");
        q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            query = scanner.next();
            if (query.equals("Insert")) {
//        System.out.println("Enter the position you want to add to.");
                x = scanner.nextInt();
//        System.out.println("Enter an integer number that you want to add");
                y = scanner.nextInt();
                integers.add(x, y);
            } else if (query.equals("Delete")) {
//        System.out.println("Enter the index you want to delete with its content.");
                x = scanner.nextInt();
                integers.remove(x);
            } else {
                System.out.println("Not a valid query, try again!");
                i--;
            }
        }
        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }
    }
}
/* Sample Input
5
12 0 1 78 12
2
Insert
5 23
Delete
0

Sample Output
0 1 78 12 23 */
