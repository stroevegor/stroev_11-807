package Test2;

import java.util.Comparator;

public class BicycleComparatot implements Comparator<Bicycle> {
    @Override
    public int compare(Bicycle v1, Bicycle v2) {
        if(v1.getQuantspeed() > v2.getQuantspeed()){
            return 1;
        }
        else if(v1.getQuantspeed() < v2.getQuantspeed()){
            return -1;
        }
        else{
            return 0;
        }
    }
}