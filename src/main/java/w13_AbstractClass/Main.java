package w13_AbstractClass;

import java.util.*;

// https://www.hackerrank.com/challenges/java-abstract-class/problem
public class Main {

    public static void main(String[] args) {
        // Following line gets prHMain.java:25: error: Book is abstract; cannot be instantiated
//         Book new_novel=new Book();
        // So we have to create a child of the class e.g MyBook

        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        MyBook new_novel = new MyBook();

        // If we want to implement the abstract method (empty body) of Book (e.g. setter),
        // we must implement the body (override) of that method in the child class.
        new_novel.setTitle(title);

        System.out.println("The title is: " + new_novel.getTitle());
        sc.close();

    }
}
/* Sample Input:
A tale of two cities

Sample Output:
The title is: A tale of two cities */