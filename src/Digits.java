interface MinMax<T extends Comparable<T>>{
    T max();
    T min();
}

class Digits<T extends Comparable<T>> implements MinMax<T>{
    T[] temp;

    public Digits(T[] o){
        temp = o;
    }

    public T min(){
        T v = temp[0];

        for (T t : temp) {
            if (t.compareTo(v) < 0) {
                v = t;
            }
        }
        return v;
    }

    public T max(){
        T v = temp[0];

        for (T t : temp) {
            if (t.compareTo(v) > 0) {
                v = t;
            }
        }
        return v;
    }
}

class Main {
    public static void main(String[] args) {
        Integer[] mass = {2, 4, 1, 5, 9};
        Character[] mass1 = {'a', 'd', 'A', 'b', 'G'};
        String[] mass2 = {"avcasdadxasfasf", "qweqedfs", "bvcbbdfgasdasdaa"};

        Digits<Integer> intMinMax = new Digits<>(mass);
        Digits<Character> charMinMax = new Digits<>(mass1);
        Digits<String> strMinMax = new Digits<>(mass2);

        System.out.println("Максимальное число в массиве:" + intMinMax.max());
        System.out.println("Минимальное число в массиве:" + intMinMax.min());
        System.out.println("Максимальный чар в массиве:" + charMinMax.max());
        System.out.println("Минимальный чар в массиве:" + charMinMax.min());
        System.out.println("Максимальная строка в массиве:" + strMinMax.max());
        System.out.println("Минимальная строка в массиве:" + strMinMax.min());
    }
}
