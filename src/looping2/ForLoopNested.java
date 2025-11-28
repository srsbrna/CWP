package looping2;

public class ForLoopNested {
    
    public String gettGrid(int max) {
        StringBuilder result = new StringBuilder();

        for (int row = 1; row <= max; row++) {
            for (int col = 1; col <= max; col++) {
                result.append("Row " + row + " Col " + col);

                if (!(row == max && col == max)) {
                    result.append("\n");
                }
            }
        }
        return result.toString();
    }
}
