package questions2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @SotirisKastanas 1517
 */
public class Questions2 {

    public void print() {
        Scanner kb = new Scanner(System.in);
        Random rand = new Random();

        int jug[] = {0, 0, 0};

//to fill all jug with 8 Litre of water*/
        while ((jug[0] + jug[1] + jug[2]) != 8) {
            jug[0] = rand.nextInt(8) + 0;
            jug[1] = rand.nextInt(5) + 0;
            jug[2] = rand.nextInt(3) + 0;
        }
//build the jug of water
        int total_jugA = 8 - jug[0];
        int total_jugB = 5 - jug[1];
        int total_jugC = 3 - jug[2];
        int k = 0, x = 0;
        int jA = 0, jB = 0, jC = 0;
        for (int i = 0; i < 8; i++) {

            if (jA < total_jugA) {
                System.out.print("|   |");
            } else {
                System.out.print("|$$$|");
            }
            if (k < 3) {
                System.out.print("      ");
                jB = 0;
            } else {
                if (jB <= total_jugB) {
                    System.out.print("|   |");
                } else if (jB <= 5) {
                    System.out.print("|$$$|");
                }
            }
            if (x < 5) {
                System.out.print("      ");
                jC = 0;
            } else {
                if (jC <= total_jugC) {
                    System.out.print("|   |");
                } else if (jC <= 3) {
                    System.out.print("|$$$|");
                }
            }
            System.out.println();
            jA++;
            jB++;
            jC++;
            k++;
            x++;
        }
        System.out.println("  A    B    C");
        System.out.println("  " + jug[0] + "L   " + jug[1] + "L   " + jug[2] + "L");
//if the jug 1 kai dio have 4 each game over!!
        int tries = 0;
        while ((jug[0] != 4) || jug[1] != 4) {

            System.out.println("Enter a choice: ");
            String letters = kb.nextLine().toUpperCase();

            while (letters.charAt(0) < 'A' || letters.charAt(0) > 'C' || letters.charAt(1) < 'A' || letters.charAt(1) > 'C') {
                System.out.println("Enter a choice: ");
                letters = kb.nextLine().toUpperCase();
            }
            //move water from jug to jug
            char pos1 = letters.charAt(0);
            char pos2 = letters.charAt(1);
            if (pos1 == 'A') {
                if (pos2 == 'B') {
                    while (jug[1] < 5) {
                        jug[0]--;
                        jug[1]++;
                    }
                } else if (pos2 == 'C') {
                    while (jug[2] < 3) {
                        jug[0]--;
                        jug[2]++;
                    }
                }
            } else if (pos1 == 'B') {
                if (pos2 == 'A') {
                    while ((jug[0] < 8) && (jug[1] > 0)) {
                        jug[0]++;
                        jug[1]--;
                    }
                } else if (pos2 == 'C') {
                    while ((jug[2] < 3) && (jug[1] > 0)) {
                        jug[2]++;
                        jug[1]--;
                    }
                }
            } else if (pos1 == 'C') {
                if (pos2 == 'A') {
                    while ((jug[0] < 8) && (jug[2] > 0)) {
                        jug[0]++;
                        jug[2]--;
                    }
                } else if (pos2 == 'B') {
                    while ((jug[1] < 5) && (jug[2] > 0)) {
                        jug[1]++;
                        jug[2]--;
                    }
                }
            }
            tries++;
            total_jugA = 8 - jug[0];
            total_jugB = 5 - jug[1];
            total_jugC = 3 - jug[2];
            jA = 0;
            jB = 0;
            jC = 0;
            k = 0;
            x = 0;
            for (int i = 0; i < 8; i++) {
                if (jA < total_jugA) {
                    System.out.print("|   |");
                } else {
                    System.out.print("|$$$|");
                }
                if (k < 3) {
                    System.out.print("      ");
                    jB = 0;
                } else {
                    if (jB <= total_jugB) {
                        System.out.print("|   |");
                    } else if (jB <= 5) {
                        System.out.print("|$$$|");
                    }
                }
                if (x < 5) {
                    System.out.print("      ");
                    jC = 0;
                } else {
                    if (jC <= total_jugC) {
                        System.out.print("|   |");
                    } else if (jC <= 3) {
                        System.out.print("|$$$|");
                    }
                }
                System.out.println();
                jA++;
                jB++;
                jC++;
                k++;
                x++;
            }
            System.out.println("  A    B    C");
            System.out.println("  " + jug[0] + "L   " + jug[1] + "L   " + jug[2] + "L");
           
        } System.out.println("congratulation , you solve it. your moved is  " + tries + " \n incent coint/ play again");
    }
}
