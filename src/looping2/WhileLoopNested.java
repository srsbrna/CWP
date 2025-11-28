package looping2;

public class WhileLoopNested {
    
    public String getTriangle(int max) {
        StringBuilder result = new StringBuilder();

        int i = 1;
        while (i <= max) {
            int j = 1 ;
            while (j <= i) {
                result.append("*");
            }
            I++
        }

        return result.toString();
    }
}
