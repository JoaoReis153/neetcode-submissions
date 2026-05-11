class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack<Integer>();
        int[] result = new int[temperatures.length];   

        for (int i = 0; i < temperatures.length; i++) {

            while (!s.isEmpty() && temperatures[i] > temperatures[s.peek()]) {
                int index = s.pop();
                result[index] = i - index;
            }
            
            s.push(i);
        }

        return result;
    }
}
