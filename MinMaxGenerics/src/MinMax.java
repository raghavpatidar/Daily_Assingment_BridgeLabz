public class MinMax<T extends Comparable<T>> {

    private T num1;
    private T num2;
    private T num3;
    private T[] numbers;

    public MinMax(T num1, T num2, T num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public MinMax(T... numbers) {
        this.numbers = numbers;
    }

    public T findMax3() {
        T ans = num1;
        if (num2.compareTo(ans) > 0)
            ans = num2;
        if (num3.compareTo(ans) > 0)
            ans = num3;
        return ans;
    }

    public T findmin3() {
        T ans = num1;
        if (num2.compareTo(ans) < 0)
            ans = num2;
        if (num3.compareTo(ans) < 0)
            ans = num3;
        return ans;
    }

    public T findMaxMany() {
        T ans = numbers[0];
        for (T num : numbers) {
            if (num.compareTo(ans) > 0)
                ans = num;
        }
        return ans;
    }

    public T findMinMany() {
        T ans = numbers[0];
        for (T num : numbers) {
            if (num.compareTo(ans) < 0)
                ans = num;
        }
        return ans;
    }

}
