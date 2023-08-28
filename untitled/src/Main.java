import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        System.out.println("Hej med dig!");
        System.out.println("Indtast et tal:");
        String input = scanner.next();

        if (input.equals("Q") || input.equals("q")) {
            return;
        }

        double number = Double.parseDouble(input);
        list.add(number);

        while (true) {
            System.out.println("Indtast endnu et tal:");
            input = scanner.next();
            if (input.equals("Q") || input.equals("q")) {
                break;
            }

            try {
                number = Double.parseDouble(input);
                list.add(number);
                double sum = getSum(list);
                System.out.println("Gennemsnittet af de indtastede tal: " + sum / list.size());
            } catch(NumberFormatException err) {
                System.out.println("Input var ikke et nummer.");
            }
        }

        System.out.println("Programmet lukker.");
    }

    public static double getSum(ArrayList<Double> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        return sum;
    }
}
