package w04_Comparator;

import com.sun.javafx.binding.StringFormatter;

import java.util.Arrays;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-comparator/problem
class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] players = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            players[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(players, checker);
//        for(int i = 0; i < player.length; i++){
        for (Player player : players) {
//            System.out.printf("%s %s\n", player.name, player.score);
            System.out.println(player.name + " " + player.score);
        }
    }
}
/*Sample Input
5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150

Sample Output
aleksa 150
amy 100
david 100
aakansha 75
heraldo 50*/