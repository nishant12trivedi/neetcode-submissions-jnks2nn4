class Solution {
    public int evalRPN(String[] tokens) {
         Set<String> ops = new HashSet<>(Set.of("+", "-", "*", "/"));
        Stack<Integer> stack = new Stack<>();
        for (String t : tokens) {
            if (!ops.contains(t)) {
                stack.push(Integer.parseInt(t));
            } else {
                int b = stack.pop(), a = stack.pop();
                switch (t) {
                    case "+" -> stack.push(a + b);
                    case "-" -> stack.push(a - b);
                    case "*" -> stack.push(a * b);
                    default -> stack.push(a / b);
                }
            }
        }
        return stack.pop();
    }
}
