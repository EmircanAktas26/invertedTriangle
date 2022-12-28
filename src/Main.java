import java.util.Scanner;

/*
 *@Author Emircan Aktaş - 28.Dec.2022
 */
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int row;
        System.out.print("How many row :");
        row = inp.nextInt();
        System.out.println("-----------------------------------");
        for (int i = row; i > 0; i--) {

            for (int j = 0; j < (row - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i - 1; k++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}