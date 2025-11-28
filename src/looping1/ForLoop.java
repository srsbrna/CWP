package looping1;

public class ForLoop {
    public int getNumbersAndSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
}
