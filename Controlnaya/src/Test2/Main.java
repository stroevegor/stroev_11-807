package Test2;


import Test2.BicycleComparatot;
import Test2.Bicycle;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Comparator<Bicycle> colornumBicycle = new Comparator<Bicycle>() {
            @Override
            public int compare(Bicycle v1, Bicycle v2) {
                return Integer.compare(v1.getColornum(), v2.getColornum());
            }
        };
        ArrayList<Bicycle> bicycles = new ArrayList<>();
        bicycles.add(new Bicycle(6, 128, "Stels"));
        bicycles.add(new Bicycle(12, 192, "Merida"));
        bicycles.add(new Bicycle(18, 255, "Kona"));
        bicycles.add(new Bicycle(36, 139, "Kross"));
        Collections.sort(bicycles, colornumBicycle);
        for (Bicycle vel1 :
                bicycles) {
            System.out.println(vel1.toString());
        }
        BicycleComparatot cm = new BicycleComparatot();
        for (Bicycle vel1 :
                bicycles) {
            for (Bicycle vel2 :
                    bicycles) {
                cm.compare(vel1, vel2);
            }
        }
        for (Bicycle l1 :
                bicycles) {
            System.out.println(l1.toString());
        }
    }

}
