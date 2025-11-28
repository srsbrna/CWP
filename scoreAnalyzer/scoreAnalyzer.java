package scoreAnalyzer;

public class scoreAnalyzer {
    
    public String classifyResult(int[] scores){
        if (scores == null || scores.length == 0){
            return "Poor";
        }

        int sum = 0;
        int validCount = 0;

        for (int s : scores) {
            if (s >= 0 && s <= 100) {
                sum += s;
                validCount++;
            }
        }

    double average = (double) sum / validCount;

    if (average >= 85) {
        return "Excellent";
    } else if (average >= 60) {
        return "Good";
    } else if (average >= 50) {
        return "Fair";
    } else {
        return "Poor";
    }
}
}