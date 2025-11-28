package array1;

public class Array1D {

    public String getArrayInfo(int[] arr) {
        String result = "";
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            sum += arr[i];


            if (i < arr.length - 1) {
                result += " ";
            }
        }

        result += "\nSum: " + sum;

        return result;
    }
}
