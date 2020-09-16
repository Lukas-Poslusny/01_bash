import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Ukol {
    static ArrayList<Integer> list = new ArrayList<>();
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        int sum = 0;

        while (!input.equalsIgnoreCase("END")) {

            System.out.print("Zadej cislo/END: ");
            input = sc.nextLine();

            if (!input.equalsIgnoreCase("END")) {
                list.add(Integer.parseInt(input));
            }
        }

        System.out.println("\n"); // empty line to split entered values and result

        Collections.sort(list); // A->Z; 0->1; sort

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        System.out.println("Suma: " + sum); // sum here
        System.out.println("Minimum: " + list.get(0)); // min here
        System.out.println("Maximum: " + (list.size()-1)); // max here
        System.out.println("Average: " + sum / (list.size()-1)); // avg here

        sc.close();
    }
}