import java.util.Arrays;

public class FindMinimumNumberOfPlatforms {

    public static int minimumNumberOfPlatforms(int arrvals[], int departues[]) {

        Arrays.sort(arrvals);
        Arrays.sort(departues);
        int n = arrvals.length;
        int platformNeeded = 1;
        int result = 1;
        int i = 1;
        int j = 0;
        while (i < n && j < n) {
            if (arrvals[i] <= departues[j]) {
                platformNeeded++;
                i++;
            } else if (arrvals[i] > departues[j]) {
                platformNeeded--;
                j++;
            }
            if (platformNeeded > result) {
                result = platformNeeded;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arrivals = {900, 940, 950, 1100, 1500, 1800};
        int[] departures = {910, 1200, 1120, 1130, 1900, 2000};
        int minimumNumberOfPlatforms = minimumNumberOfPlatforms(arrivals, departures);
        System.out.println("the minimumNumberOfPlatforms required for this train is: " + minimumNumberOfPlatforms);
    }
}
