import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (String operation : operations) {
            String[] str = operation.split(" ");
            
            int num = Integer.parseInt(str[1]);

            if (str[0].equals("I")) {
                minQueue.offer(num);
                maxQueue.offer(num);
                
            } else if (str[0].equals("D")) {
                if(num == 1 && !maxQueue.isEmpty()) {
                    int max = maxQueue.poll();
                    minQueue.remove(max);
                } else if (num == -1 && !minQueue.isEmpty()) {
                    int min = minQueue.poll();
                    maxQueue.remove(min);
                }
            }
        }
        if(minQueue.isEmpty() || maxQueue.isEmpty()) {
            return new int[] {0,0};
        } else {
            return new int[] {maxQueue.peek(), minQueue.peek()};
        }
    }
}