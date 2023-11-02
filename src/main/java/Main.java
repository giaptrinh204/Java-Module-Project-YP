
public class Main {
    public static void main(String[] args) {
        CountPeople countPeople = new CountPeople();
        countPeople.countPeople();
        //double people2 = countPeople.allPeople;

        CountProduct count = new CountProduct();
        count.input();
        //double share2 = count.allCost;

        CountCostForEveryPerson exitMoney = new CountCostForEveryPerson();
        System.out.println(count.allProduct);
        exitMoney.ccfForEveryPerson(count.allCost, countPeople.allPeople);
    }
}