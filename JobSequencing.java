
import java.util.*;

class Job {
    char id;
    int deadline, profit;

    Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobSequencing {
    public static void main(String[] args) {

        Job jobs[] = {
            new Job('A', 2, 100),
            new Job('B', 1, 19),
            new Job('C', 2, 27),
            new Job('D', 1, 25),
            new Job('E', 3, 15)
        };

        // Sort jobs by decreasing profit
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        char slot[] = new char[maxDeadline + 1];
        boolean occupied[] = new boolean[maxDeadline + 1];

        int totalProfit = 0;

        // Schedule jobs in available slots
        for (Job job : jobs) {
            for (int j = job.deadline; j >= 1; j--) {
                if (!occupied[j]) {
                    slot[j] = job.id;
                    occupied[j] = true;
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        System.out.print("Scheduled Jobs: ");

        for (int i = 1; i <= maxDeadline; i++) {
            if (occupied[i]) {
                System.out.print(slot[i] + " ");
            }
        }

        System.out.println("\nMaximum Profit: " + totalProfit);
    }
}
