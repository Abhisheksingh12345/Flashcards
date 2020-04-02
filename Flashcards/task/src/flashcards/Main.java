package flashcards;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tell = new Scanner(System.in);
        System.out.println("Input the number of cards:");
        int size = tell.nextInt();
        String[] qestion = new String[size];
        String[] answer = new String[size];
        for (int i = 0; i < qestion.length; i++) {
            System.out.println("The card #" + (i + 1) + ":");
            qestion[i] = tell.nextLine();
            System.out.println("The definition of the card #" + (i + 1) + ":");
            answer[i] = tell.nextLine();
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.println("Print the definition of "+Arrays.toString(qestion)+":");
            String contestantAnswer = tell.next();
            if (contestantAnswer.equals(answer[i])) {
                System.out.println("Correct answer.");
            } else {
                System.out.println("Worng answer. The correct one is ");
            }

        }
    }
}
