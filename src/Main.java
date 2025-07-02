import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("VIN001", "Camry", "Toyota", 2020, 45_000, 25_000),
                new Car("VIN002", "X5", "BMW", 2021, 30_000, 60_000),
                new Car("VIN003", "Civic", "Honda", 2019, 55_000, 20_000),
                new Car("VIN004", "Model 3", "Tesla", 2022, 10_000, 50_000),
                new Car("VIN005", "Corolla", "Toyota", 2020, 60_000, 22_000),
                new Car("VIN006", "A4", "Audi", 2023, 5_000, 45_000)
        );

        System.out.println("1. Машины с пробегом < 50_000 км:");
        cars.stream()
                .filter(car -> car.getMileage() < 50_000)
                .forEach(car -> System.out.println("  - " + car.getManufacturer() + " " + car.getModel() + " (" + car.getMileage() + " км)"));

        System.out.println("\n2. Топ-3 самых дорогих:");
        cars.stream()
                .sorted((c1, c2) -> Double.compare(c2.getPrice(), c1.getPrice()))
                .limit(3)
                .forEach(car -> System.out.println("  - " + car.getManufacturer() + " " + car.getModel() + " ($" + car.getPrice() + ")"));

        double avgMileage = cars.stream()
                .mapToInt(Car::getMileage)
                .average()
                .orElse(0);
        System.out.println("\n3. Средний пробег: " + avgMileage + " км");

        System.out.println("\n4. Группировка по производителю:");
        cars.stream()
                .collect(Collectors.groupingBy(Car::getManufacturer))
                .forEach((maker, list) -> System.out.println("  - " + maker + ": " + list.size() + " авто"));
    }
}