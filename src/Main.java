public class Main {
    public static void main(String[] args) {

        int startingScore = 100;
        int refill = 1300;
        int bonus = 1;
        int refillBonus = refill * bonus / 100;


        if (refill <= 1000) {
            refillBonus = 0;
        }

        int score = startingScore + refill + refillBonus;

        System.out.println("Итоговый счет: " + score);
        System.out.println("Вам начислены бонусные рубли в размере 1р за каждые 100р при пополненеи от 1000р: " + refillBonus);
    }
}