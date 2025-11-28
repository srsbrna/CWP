package looping2;

public class DoWhileLoopNested {
    
    public String getNumberTriangle(int max) {
        String result = "";
        int i = 1;

        do {
            int j = 1;
            do { 
                result += j;
                j++;
        } while (j <= i);

        if (i < max) {
            result += "\n";
        }

            i++;
        } while (i <= max);

        return result;
    }
}
