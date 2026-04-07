import java.util.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 48));

        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("Sorted Bogies by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " - " + b.capacity);
        }
    }
}