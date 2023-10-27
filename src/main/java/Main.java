
public class Main {
    public static void main(String[] args) {
        CountPeople countPeople = new CountPeople();
        countPeople.countPeople();

        CountProduct count = new CountProduct();
        count.input();

        CountCostForEveryPerson exitMoney = new CountCostForEveryPerson();
        exitMoney.share = count.allCost;
        exitMoney.people = countPeople.allPeople;

        System.out.println(count.allProduct);
        exitMoney.ccfForEveryPerson();
    }
}