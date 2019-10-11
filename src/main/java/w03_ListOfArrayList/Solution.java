package w03_ListOfArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-arraylist/problem
public class Solution {
    public static void main(String[] args) {
//        ArrayList<ArrayList<Integer>> rows = new ArrayList<>();
        List<ArrayList> rows = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //number of rows

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            int d = scanner.nextInt(); //number of integers on this row
            for (int j = 0; j < d; j++) {
                row.add(scanner.nextInt()); //integers on this row
            }
            rows.add(row);
        }

        int q = scanner.nextInt(); //number of queries

        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt(); //no. of this row
            int y = scanner.nextInt(); //position no. of this integer

            try {
                System.out.println(rows.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}
/* Sample input:
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5

Sample output:
74
52
37
ERROR!
ERROR! */
