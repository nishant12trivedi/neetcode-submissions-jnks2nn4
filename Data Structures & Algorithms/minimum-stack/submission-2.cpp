class MinStack {
public:
    stack<pair<int, int>> stk;
    MinStack() {
        
    }
    
    void push(int val) {
        (stk.size() > 0) ? stk.push({val, min(val, stk.top().second)}) : stk.push({val, val});
    }
    
    void pop() {
        stk.pop();
    }
    
    int top() {
        return stk.top().first;
    }
    
    int getMin() {
        return stk.top().second;
    }
};
