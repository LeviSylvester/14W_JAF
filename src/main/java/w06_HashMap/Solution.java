package w06_HashMap;

import java.util.*;

// https://www.hackerrank.com/challenges/phone-book/problem
class Solution {
    public static void main(String[] args) {
        Map<String, Integer> phoneBook = new HashMap<>();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            Integer phone = in.nextInt();
            in.nextLine();
            phoneBook.put(name, phone);
        }
//        for (int i = 0; i < n; i++) {
        while (in.hasNext()) {
            String s = in.nextLine();
            if (phoneBook.get(s) != null) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
//            }
        }
    }
}
/*Sample Input
3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry

Sample Output
uncle sam=99912222
Not found
harry=12299933*/
