package org.example.Homeworks.Homework2.model;


import java.util.*;

public class GroupLaptops implements Group {
    private final Set<Laptop> products;

    public GroupLaptops(Set<Laptop> products) {
        this.products = products;
    }

    @Override
    public void selectionProduct() throws IllegalStateException {
        Set<Laptop> result = new HashSet<>(Set.copyOf(products));
        Map<String, String> criterion = getCriterion();

        for (Laptop lap : products) {
            if (criterion.containsKey("manufacturer")) {
                if (!lap.getManufacturer().contains(criterion.get("manufacturer")))
                    result.remove(lap);
            }
            if (criterion.containsKey("ram")) {
                if (!(lap.getRam() >= (Integer.parseInt(criterion.get("ram")))))
                    result.remove(lap);
            }
            if (criterion.containsKey("rom")) {
                if (!(lap.getRom() >= (Integer.parseInt(criterion.get("rom")))))
                    result.remove(lap);
            }
            if (criterion.containsKey("os")) {
                if (!lap.getOs().contains(criterion.get("os")))
                    result.remove(lap);
            }
            if (criterion.containsKey("color")) {
                if (!lap.getColor().contains(criterion.get("color")))
                    result.remove(lap);
            }
            if (criterion.containsKey("price")) {
                if (!(lap.getPrice() >= (Double.parseDouble(criterion.get("price")))))
                    result.remove(lap);
            }
            if (criterion.containsKey("screenDiagonal")) {
                if (!(lap.getScreenDiagonal() >= (Double.parseDouble(criterion.get("screenDiagonal")))))
                    result.remove(lap);
            }
            if (criterion.containsKey("gaming")) {
                if (!(lap.getGaming().equals(Boolean.parseBoolean(criterion.get("gaming")))))
                    result.remove(lap);
            }
            if (criterion.containsKey("cpuFrequency")) {
                if (!(lap.getCpuFrequency() >= (Double.parseDouble(criterion.get("cpuFrequency")))))
                    result.remove(lap);
            }
            if (criterion.containsKey("cpuCores")) {
                if (!(lap.getCpuCores() >= (Integer.parseInt(criterion.get("cpuCores")))))
                    result.remove(lap);
            }
        }
        for (Laptop lap : result) {
            System.out.println(lap);
        }
    }

    private Map<String, String> getCriterion() {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> options = new HashMap<>(Map.of(1, "ram",
                2, "rom",
                3, "os",
                4, "color",
                5, "manufacturer",
                6, "price",
                7, "screenDiagonal",
                8, "gaming",
                9, "cpuFrequency",
                10, "cpuCores"));

        Map<String, String> result = new HashMap<>();

        System.out.println("Введите цифру, соответствующую необходимому критерию:");

        for (Integer key : options.keySet()) {
            System.out.println(key + " - " + options.get(key));
        }

        System.out.println("Для окончания введите 0");

        int num = scanner.nextInt();

        while (num != 0) {
            if (num > 10 || num < 1) {
                System.out.println("Неккоректный ввод. Введите цифру, соответствующую необходимому критерию");
                num = scanner.nextInt();
            } else {
                System.out.println("Введите минимальное значение для " + options.get(num));
                String value = scanner.next();
                result.putIfAbsent(options.get(num), value);
                System.out.println("Введите цифру, соответствующую необходимому критерию:");
                num = scanner.nextInt();
            }
        }
        return result;
    }
}