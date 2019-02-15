import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        String day;
        String mood;
        System.out.println("Какой сегодня день недели ?");
        day = imput.nextLine();
//        1
        System.out.println("Какое настроение ?");
        mood = imput.nextLine();


        String text;
        text = "сегодня - " + day + "настроение -" + mood;
        System.out.println(text);
    }
}