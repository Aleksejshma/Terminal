import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        human.name = "Егор";
        Human human1 = new Human();
        human1.name = "Антон";

        Card mastercard = new Card();
        mastercard.balance = 1000;
        mastercard.password = 4321;
        Card visa = new Card();
        visa.balance = 1000;
        visa.password = 1234;

        human1.card = visa;
        human.card = mastercard;


        Bankomat bankomat = new Bankomat();
        bankomat.money = 10000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пожалуйста ПИН-код от Вашей карты!");
        int pass = scanner.nextInt();
        switch (pass) {
            case (1234):
                System.out.println("Здравствуйте, Антон!");
                System.out.println("Выбирите дальнейшую операцию, где \n1 - это снятие средств!\n2 - это пополнение счета! ");
                int operations = scanner.nextInt();
                switch (operations) {
                    case (1):
                        System.out.println("Введите сумму, которую хотите снять - ");
                        bankomat.datMoney(human1, scanner.nextInt());
                        System.out.println("Bank posle snytia: " + bankomat.money);
                        System.out.println(human1.card.balance);
                        break;
                    case (2): {
                        System.out.println("Введите сумму, которую хотите положить - ");
                        bankomat.zabratMoney(human1, scanner.nextInt());
                        System.out.println("Bank posle popolnenia: " + bankomat.money);
                        System.out.println("Егор, Ваш баланс карты теперь " + human1.card.balance);
                        break;
                    }
                    default:
                        System.out.println("Такого номера операции не существует, попробуйте снова!");
                }
                break;
            case (4321):
                System.out.println("Здравствуйте, Егор!");
                System.out.println("Выбирите дальнейшую операцию, где \n1 - это снятие средств!\n2 - это пополнение счета! ");
                int operation = scanner.nextInt();
                switch (operation) {
                    case (1):
                        System.out.println("Введите сумму, которую хотите снять - ");
                        bankomat.datMoney(human, scanner.nextInt());
                        System.out.println("Bank posle snytia: " + bankomat.money);
                        System.out.println(human.card.balance);
                        break;
                    case (2): {
                        System.out.println("Введите сумму, которую хотите положить - ");
                        bankomat.zabratMoney(human, scanner.nextInt());
                        System.out.println("Bank posle popolnenia: " + bankomat.money);
                        System.out.println(human.card.balance);
                        break;
                    }
                    default:
                        System.out.println("Такого номера операции не существует, попробуйте снова!");
                }
                break;
            default:
                System.out.println("Пин-код введен не верно, повторите ввод!");
        }

    }
}
