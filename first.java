

import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter 0 for rock,1 for scissor,2 for paper: ");

        int user = sc.nextInt();
        int comp;

        comp = (int)(Math.random() * (2));
        System.out.println(comp);

        if (comp == 1 && user == 0 || comp == 2 && user == 1 || comp == 0 && user == 2) {
            System.out.println("You win :)");
        } else if (comp == 0 && user == 1 || comp == 1 && user == 2 || comp == 2 && user == 0) {
            System.out.println("you Lose :(");
        } else if (comp == user) {
            System.out.println("its a draw :0");
        } else {
            System.out.println("Error404");
        }

    }
}
