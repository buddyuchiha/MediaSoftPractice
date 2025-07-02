import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.Collections;

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
        List<String> carModels = new ArrayList<>();
        carModels.add("Toyota Camry");
        carModels.add("BMW X5");
        carModels.add("Tesla Model S");
        carModels.add("Toyota Camry");
        carModels.add("Audi A4");
        carModels.add("Tesla Model 3");

        Set<String> uniqueModels = new TreeSet<>(Collections.reverseOrder());
        for (String model : carModels) {
            if (model.contains("Tesla")) {
                uniqueModels.add("ELECTRO_CAR");
            } else {
                uniqueModels.add(model);
            }
        }

        System.out.println("\nУникальные модели (обратный порядок):");
        for (String model : uniqueModels) {
            System.out.println(model);
        }
    }
}