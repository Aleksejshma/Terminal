public class Bankomat {
    int money;

    public void datMoney(Human human, int count) {
        if (human.card.balance < count) { //500 <= 0
            System.out.println("Извините средств не хватает");
            return;
        }
        human.card.balance += count;
        money -= count;
    }

    public void zabratMoney(Human human, int count) {
        if (count > human.card.balance) {
            System.out.println("Извините денег не хватает для снятия");
            return;
        }
        human.card.balance -= count;
        money += count;
    }
}
