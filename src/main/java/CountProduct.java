import java.util.Scanner;

public class CountProduct {
    Scanner scan = new Scanner(System.in);
    String allProduct = "Добавленные товары:\n";
    double allCost = 0;

    void input(){
        while (true) {
            System.out.println("Введите название товара:");
            String product = scan.next();
            System.out.println("Введите цену товара:");
            int cost = scan.nextInt();
            count(product, cost);
            System.out.println("Товар успешно добавлен. Хотите еще добавить?");
            String check = scan.next();
            if (check.equalsIgnoreCase("Завершить")){
                break;
            }
        }
    }
    void count(String product, double cost){
        allProduct = allProduct + product + "\n";
        allCost = allCost + cost;
    }
}

