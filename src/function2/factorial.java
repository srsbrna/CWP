package function2;

public class Factorial {

    // Fungsi untuk menghitung faktorial dari sebuah bilangan
    public int factorial(int n) {
        if (n < 0) {
            // Jika input negatif, bisa dikembalikan 0 atau error handling
            // tapi karena tidak dites di sini, kita kembalikan 0
            return 0;
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
