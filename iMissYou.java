package Codes;
import java.sql.SQLOutput;
import java.util.*;

public class iMissYou {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int num;
        do {
            System.out.println("What is 1+1? ");
            num = Integer.parseInt(kbd.nextLine());

            if (num == 2) {
                for (int i = 0; i <= 100; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("I MISS YOU ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("wrong! try again!");
            }
        } while (num != 2);
    }
}