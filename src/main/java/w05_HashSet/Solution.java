package w05_HashSet;

import java.util.HashSet;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-hashset/problem
public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
//            System.out.println(i+1);
        }

        HashSet<String> pairs = new HashSet</*String*/>(/*t*/);

        for (int i = 0; i < t; i++) {
            pairs.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(pairs.size());
        }
    }
}
/*Sample Input
5
john tom
john mary
john tom
mary anna
mary anna

Sample Output
1
2
2
3
3*/
