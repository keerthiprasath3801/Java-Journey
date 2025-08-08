package programs.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {
    public static int totalFruit(int[] fruits,int k) {
        Map<Integer, Integer> basket = new HashMap<>();
        int left = 0, maxFruits = 0;
        for (int right = 0; right < fruits.length; right++) {
            // Add fruit to basket
            int fruit = fruits[right];
            basket.put(fruit, basket.getOrDefault(fruit, 0) + 1);
            // If more than 2 types of fruits, shrink window from left
            while (basket.size() > k) {
                int leftFruit = fruits[left];
                basket.put(leftFruit, basket.get(leftFruit) - 1);
                if (basket.get(leftFruit) == 0) {
                    basket.remove(leftFruit);
                }
                left++;  // Shrink from the left
            }
            // Update maxFruits with current window size
            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        return maxFruits;
    }

    public static void main(String[] args) {
        int[] fruits = {1, 2, 3, 2, 2};
        int k=2;
        System.out.println(totalFruit(fruits,2)); // Output: 4
    }
}

