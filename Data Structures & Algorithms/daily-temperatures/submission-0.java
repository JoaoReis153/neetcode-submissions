class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int size = temperatures.length;
        Stack<Integer> s = new Stack<Integer>();
        int[] result = new int[size];   
        int previous = 0;
        for (int i = 0; i < size; i++) {
            if (temperatures[i] < temperatures[previous]) {
                s.push(i);
            } else {
                while (!s.isEmpty() && temperatures[i] > temperatures[s.peek()]) {
                    int index = s.pop();
                    result[index] = i - index;
                }
            }
            s.push(i);
            previous = i;
        }

        return result;
    }
}
