import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LocalDate TempoAgora = LocalDate.now();

        System.out.print("How many days you want to go back: ");

        int date = sc.nextInt();
        LocalDate pastWeek = TempoAgora.minusDays(date);
        System.out.println("Chosen past date: " + pastWeek);
        }
    }
