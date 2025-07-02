import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] carYears = new int[50];
        Random random = new Random();

        for (int i = 0; i < carYears.length; i++) {
            carYears[i] = 2000 + random.nextInt(26);
        }

        System.out.println("Машины после 2015 года:");
        for (int year : carYears) {
            if (year > 2015) {
                System.out.println(year);
            }
        }

        int sum = 0;
        for (int year : carYears) {
            sum += (2025 - year);
        }
        double averageAge = (double) sum / carYears.length;
        System.out.println("Средний возраст авто: " + averageAge);
    }
}