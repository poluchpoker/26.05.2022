import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MaxHeightAirplaneComparator implements Comparator<Airplane>{
    @Override
    public int compare(Airplane o1, Airplane o2){
        return o1.getHeight() - o2.getHeight();
    }
}

class Airplane implements Comparable<Airplane> {
    private final int year;
    private final String model;
    private final int height;

    public Airplane(int year, String model, int height){
        this.year = year;
        this.model = model;
        this.height = height;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int compareTo(Airplane o) {
        return 0;
    }

    @Override
    public String toString(){
        return "{manufacturYear = " + String.valueOf(year) + ", " +
                "model = " + model + ", " + "height = " + String.valueOf(height) + "}";
    }
}

class Teps{
    public static void main(String[] args){
        List<Airplane> airplanes = new ArrayList<>();

        Airplane DAR = new Airplane(1935, "DAR", 10000);
        Airplane AS2 = new Airplane(1937, "AS", 7000);
        Airplane IU9 = new Airplane(1941, "IU", 8000);

        airplanes.add(DAR);
        airplanes.add(AS2);
        airplanes.add(IU9);

        Comparator<Airplane> heightComparator = new MaxHeightAirplaneComparator();
        Collections.sort(airplanes, heightComparator);

        System.out.println(airplanes.toString());
    }
}
