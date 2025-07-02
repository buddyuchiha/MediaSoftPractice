import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Car> carSet = new HashSet<>();
        Car car1 = new Car("VIN123", "Camry", "Toyota", 2020, 50_000, 25_000);
        Car car2 = new Car("VIN456", "X5", "BMW", 2021, 30_000, 60_000);
        Car car3 = new Car("VIN123", "Corolla", "Toyota", 2019, 70_000, 20_000);

        System.out.println("Пытаемся добавить 3 машины (2 с одинаковым VIN):");
        System.out.println("Добавлена car1? " + carSet.add(car1));
        System.out.println("Добавлена car2? " + carSet.add(car2));
        System.out.println("Добавлена car3? " + carSet.add(car3));

        System.out.println("\nИтоговое количество машин в HashSet: " + carSet.size());

        List<Car> sortedCars = new ArrayList<>(carSet);
        Collections.sort(sortedCars);

        System.out.println("\nМашины отсортированы по году (от новых к старым):");
        sortedCars.forEach(car -> System.out.println(car.getYear() + " " + car.getModel()));
    }
}