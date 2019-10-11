package w10_Interface;

import java.util.*;

// https://www.hackerrank.com/challenges/java-interface/problem
class Solution{
    //I've lost so much time on deque problem (w08), that problem 10 couldn't finish in time
    //(since then i've set a rule to myself to pseudo all tasks first and solve easiest first)
    //the following code must be completed:
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
/* Sample Input
6

Sample Output
I implemented: AdvancedArithmetic
12 */
