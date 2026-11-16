
import java.util.*;

class Item {
    int weight, profit;
    double ratio;

    Item(int weight, int profit) {
        this.weight = weight;
        this.profit = profit;
        this.ratio = (double) profit / weight;
    }
}

public class FractionalKnapsack {
    public static void main(String[] args) {

        Item items[] = {
            new Item(10, 60),
            new Item(20, 100),
            new Item(30, 120)
        };

        int capacity = 50;

        // Sort items by profit/weight ratio
        Arrays.sort(items, (a, b) ->
            Double.compare(b.ratio, a.ratio));

        double totalProfit = 0;

        for (Item item : items) {

            if (capacity >= item.weight) {
                capacity -= item.weight;
                totalProfit += item.profit;
            }
            else {
                totalProfit += item.ratio * capacity;
                capacity = 0;
                break;
            }
        }

        System.out.println("Maximum Profit: " + totalProfit);
    }
}
