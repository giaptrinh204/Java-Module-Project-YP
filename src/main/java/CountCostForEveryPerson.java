public class CountCostForEveryPerson {
    void ccfForEveryPerson(double share, double people) {
        share = share / people;
        Math.floor(share);
        while (share > 10) {
            share = share % 10;
        }
        String ruble;
        switch ((int) share) {
            case 1:
                ruble = " рубль";
                break;
            case 2:
            case 3:
            case 4:
                ruble = " рубля";
                break;
            default:
                ruble = " рублей";
                break;
        }

        System.out.println("Сумма с каждого человека составляет:\n" + String.format("%.2f", share) + ruble);
    }
}
