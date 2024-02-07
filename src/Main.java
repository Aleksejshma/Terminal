import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Human Egor = new Human();
        Egor.name = "Егор";
        Human Anton = new Human();
        Anton.name = "Антон";

        Card mastercard = new Card();
        mastercard.balance = 1000;
        mastercard.password = 4321;
        Card visa = new Card();
        visa.balance = 1000;
        visa.password = 1234;

        Anton.card = visa;
        Egor.card = mastercard;


        Bankomat bankomat = new Bankomat();
        bankomat.money = 10000;
        System.out.println("Выберите операцию где 1 - снять, а 2 - положить.");
        int operations = scanner.nextInt();
        switch (operations) {
            case (1): {
                int pass = bankomat.password(Anton);
                if (pass == 1) {
                    System.out.println("Введите сумму оперции по снятию средств.");
                    bankomat.datMoney(Anton, scanner.nextInt());
                }
            }
            break;
            case (2): {
                int pass = bankomat.password(Anton);
                if (pass == 1) {
                    System.out.println("Введите сумму оперции по внесению средств.");
                    bankomat.zabratMoney(Anton, scanner.nextInt());
                }
            }
            break;
        }
    }
}
