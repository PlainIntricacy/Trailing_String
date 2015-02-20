/**
 * Trailing String
 * Direct User (Console) Input Version
 *
 * https://www.codeeval.com/open_challenges/32/
 *
 * Author: todyerutz@plainintricacy.wordpress.com
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your string:");
        String[] parts = input.nextLine().split(",");
        input.close();
        if(parts[0].substring(parts[0].length()-parts[1].length(), parts[0].length()).equals(parts[1])){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
