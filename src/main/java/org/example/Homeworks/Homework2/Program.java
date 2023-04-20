package org.example.Homeworks.Homework2;

import org.example.Homeworks.Homework2.model.GroupLaptops;
import org.example.Homeworks.Homework2.model.Laptop;
import java.util.HashSet;
import java.util.Set;


public class Program {
    public static void main(String[] args) {
        Set<Laptop> laptopSet = new HashSet<>();
        laptopSet.add(new Laptop("Apple", "MacBook Air", 83699.0,
                "серый", 13.3, false, "macOS", "2560x1600",
                "IPS", "Apple M1", 8, 3.2, 8, true,
                256, "Apple M1 7-core"));
        laptopSet.add(new Laptop("MSI", "Katana", 62999.0,
                "черный", 17.3, true, "без ОС", "1920x1080",
                "IPS", "Intel Core i5", 6, 2.7, 16, true,
                512, "GeForce GTX 1650"));
        laptopSet.add(new Laptop("HUAWEI", "MateBook D 14 NbD-WDH9", 49999.0,
                "серебристый", 14.0, false, "Windows 11",
                "1920x1080", "IPS", "Intel Core i5", 4,
                2.4, 8, true, 512, "Intel Iris Xe Graphics"));
        laptopSet.add(new Laptop("Echips", "Envy", 28999.0, "серебристый",
                15.6, false, "Windows 10", "1920x1080",
                "IPS", "Intel Celeron", 4, 2.0, 8, true,
                240, "Intel UHD Graphics 600"));
        laptopSet.add(new Laptop("DEXP", "Aquilon", 18499.0, "серебристый",
                15.6, false, "Windows 11 Home", "1920x1080",
                "IPS", "Intel Celeron", 2, 1.1, 8, true,
                128, "Intel UHD Graphics 600"));
        laptopSet.add(new Laptop("MSI", "Titan", 479999.0, "черный",
                17.3, true, "Windows 11 Home Single Language",
                "3840x2160", "IPS", "Intel Core i9", 24,
                2.2, 32, true, 2000, "GeForce RTX 4090"));

        GroupLaptops groupLaptops1 = new GroupLaptops(laptopSet);
        groupLaptops1.selectionProduct();
    }
}
