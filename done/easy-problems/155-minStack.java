class MinStack {

  /** initialize your data structure here. */
  Stack<Integer> normalStack = new Stack<>();
  Stack<Integer> minStack = new Stack<>();
  public MinStack() {
      
  }
  
  public void push(int x) {
      normalStack.push(x);
      if (!minStack.isEmpty()) {
          int minNum = minStack.peek();
          if (x <= minNum) {
              minStack.push(x);
          }
      } else {
          minStack.push(x);
      }
  }
  
  public void pop() {
      int x = normalStack.pop();
      if (!minStack.isEmpty()) {
          int minNum = minStack.peek();
          if (x == minNum) {
              minStack.pop();
          }
      }
  }
  
  public int top() {
      return normalStack.peek();
  }
  
  public int getMin() {
      return minStack.peek();
  }
}

/**
* Your MinStack object will be instantiated and called as such:
* MinStack obj = new MinStack();
* obj.push(x);
* obj.pop();
* int param_3 = obj.top();
* int param_4 = obj.getMin();
*/