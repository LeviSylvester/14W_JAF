package w08_Dequeue;

import java.util.*;

// https://www.hackerrank.com/challenges/java-dequeue/problem
//Print the maximum number of unique integers among all possible contiguous subarrays of size m.
public class Test {
    //Okay, somehow I understood the problem, my logic looked something like this
    // Calculate from n (6) numbers how many contiguous subarrays of m (3) can have
    // Make the contiguous subarrays and add them one by one to a deque
    // Retrieve them one by one on front and count unique members, also compare to previous (if exists)
    // Add them back to the other end
    // sout count
    //Couldn't make it work, found following solution in Discussions
    //Commented the lines which i don't understand:

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        int max = map.size();

        for (int i = 0; i < n; i++) {
            if (i >= m) { //if >= 3 (m meaning max number of unique element to display)
                int plusInteger = deque.remove();
                if (map.get(plusInteger) == 1) { //if int to remove exists then remove int WHY !!!???
                    map.remove(plusInteger);
                } else {
                    map.put(plusInteger, map.get(plusInteger) - 1); //key and its value -1 !!!!!?????
                }
            }

            int num = scanner.nextInt();
            deque.add(num);
            map.merge(num, 1, Integer::sum);
            //ctrl+click on merge -> points to a method that i completely do not understand

            max = Math.max(max, map.size());//why do that (don't know what) if we already got the size in max

            if (max == m) {
                break;
            }
        }
        scanner.close();
        System.out.println(max);
    }
}
/* Sample Input
6 3
5 3 5 2 3 2

Sample Output
3 */