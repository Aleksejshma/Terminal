import java.util.Scanner;

public class Bankomat {
    int money;

    Scanner scanner = new Scanner(System.in);

    public int password(Human human) {
        int popitka = 0;
        System.out.println("Введите пароль");
        int pass = scanner.nextInt();
        for (int i = 0; i <= 1; i++) {
            if (pass != human.card.password) {
                System.out.println("Вы ввели неверный пароль, попробуйте еще раз!");
                pass = scanner.nextInt();
            }
            popitka = popitka + i;


            if (pass == human.card.password) {
                System.out.println("Вы ввели верный пароль! Добро пожаловать " + human.name);
                return 1;
            }
        }
        System.out.println("Вы превысили лимит попыток, ваша карта временно заблокирована.");
        return 0;
    }


    public void datMoney(Human human, int count) {
        if (human.card.balance < count) { //500 <= 0
            System.out.println("Извините средств не хватает");
            return;
        }
        human.card.balance += count;
        money -= count;
        System.out.println("Баланс банкомата после выдачи средств - " + money);
        System.out.println("Баланс карты после снятия средств - " + human.card.balance);
    }

    public void zabratMoney(Human human, int count) {
        if (count > human.card.balance) {
            System.out.println("Извините денег не хватает для снятия");
            return;
        }
        human.card.balance -= count;
        money += count;
        System.out.println("Баланс банкомата после внесения средств - " + money);
        System.out.println("Баланс карты после списания средств - " + human.card.balance);
    }
}