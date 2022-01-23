class MinStack {
    List<Integer> stack;
    List<Integer> minStack;
    public static int minNum;
    public MinStack() {
      stack = new LinkedList<>();
      minStack = new LinkedList<>();
    }
    
    public void push(int val) {
        if (minStack.size() == 0) {
            minStack.add(val);
        } else {
            int currSmallest = minStack.get(minStack.size() - 1);
            if (val <= currSmallest) {
                minStack.add(val);
            }
        }
        stack.add(val);
    }
    
    public void pop() {
        int removed = stack.get(stack.size() - 1);
        int smallest = minStack.get(minStack.size() - 1);
        if (removed == smallest) {
            minStack.remove(minStack.size() - 1);
        }
        stack.remove(stack.size() - 1);
    }
    
    public int top() {
        return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
        return minStack.get(minStack.size() - 1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
