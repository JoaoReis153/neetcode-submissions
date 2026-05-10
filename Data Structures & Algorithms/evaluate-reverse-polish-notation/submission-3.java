class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<Integer>();
        int total = Integer.parseInt(tokens[0]);
        for (int i = 0; i < tokens.length; i++) {
            boolean isInteger = tokens[i].matches("-?\\d+");

            if (isInteger) {
                int value = Integer.parseInt(tokens[i]);
                s.push(value);
            } else {
                if (tokens[i].equals("+")) {
                    total = s.pop() + s.pop();
                } else if (tokens[i].equals("-")) {
                    int second = s.pop();
                    total = s.pop() - second;
                } else if (tokens[i].equals("*")) {
                    total = s.pop() * s.pop();
                } else if (tokens[i].equals("/")) {
                    int second = s.pop();
                    total = s.pop() / second;
                }
                s.push(total);
            }
        }
        return total;
    }
}
