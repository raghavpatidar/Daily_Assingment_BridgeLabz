public class Main {
    public static void main(String[] args) {
        MinMax<Integer> integerMinMax = new MinMax<>(3, 7, 2);
        System.out.println("Maximum Integer: " + integerMinMax.findMax3());
        System.out.println("Minimum Integer: " + integerMinMax.findmin3());

        MinMax<Double> doubleMinMax = new MinMax<>(5.5, 2.2, 7.7);
        System.out.println("Maximum Double: " + doubleMinMax.findMax3());
        System.out.println("Minimum Double: " + doubleMinMax.findmin3());

        MinMax<String> stringMinMax = new MinMax<>("apple", "orange", "banana");
        System.out.println("Maximum String: " + stringMinMax.findMax3());
        System.out.println("Minimum String: " + stringMinMax.findmin3());

        MinMax<Integer> integerMinMaxMany = new MinMax<>(3, 7, 2, 4, 8, 2, 46, 51, 23);
        System.out.println("Maximum Integer: " + integerMinMaxMany.findMaxMany());
        System.out.println("Minimum Integer: " + integerMinMaxMany.findMinMany());

        MinMax<Double> doubleMinMaxMany = new MinMax<>(5.5, 2.2, 7.7, 5.5, 2.3, 5.0,
                1.1);
        System.out.println("Maximum Double: " + doubleMinMaxMany.findMaxMany());
        System.out.println("Minimum Double: " + doubleMinMaxMany.findMinMany());

        MinMax<String> stringMinMaxMany = new MinMax<>("apple", "orange", "banana",
                "guava", "strawberry", "grape");
        System.out.println("Maximum String: " + stringMinMaxMany.findMaxMany());
        System.out.println("Minimum String: " + stringMinMaxMany.findMinMany());

    }
}
