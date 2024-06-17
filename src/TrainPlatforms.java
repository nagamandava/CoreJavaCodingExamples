import java.util.Arrays;

public class TrainPlatforms {
    public static int findMinimumPlatforms(int[] arrivals, int[] departures) {
        // Sort the arrival and departure times
        Arrays.sort(arrivals);
        Arrays.sort(departures);

        int n = arrivals.length;
        int platformCount = 0, maxPlatforms = 0;
        int i = 0, j = 0;

        // Traverse through both arrays
        while (i < n && j < n) {
            // If next event is an arrival, increment the platform count
            if (arrivals[i] <= departures[j]) {
                platformCount++;
                i++;
                // Update the maximum number of platforms needed
                if (platformCount > maxPlatforms) {
                    maxPlatforms = platformCount;
                }
            } else {
                // If next event is a departure, decrement the platform count
                platformCount--;
                j++;
            }
        }

        return maxPlatforms;
    }

    public static void main(String[] args) {
        int[] arrivals = {900, 940, 950, 1100, 1500, 1800};
        int[] departures = {910, 1200, 1120, 1130, 1900, 2000};

        int minPlatforms = findMinimumPlatforms(arrivals, departures);
        System.out.println("Minimum number of platforms required: " + minPlatforms);
    }
}
