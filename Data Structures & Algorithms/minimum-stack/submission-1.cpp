class MinStack {
public:
    stack<pair<int, int>> stk;
    MinStack() {
        
    }
    
    void push(int val) {
        int minVal = INT_MAX;
        if (stk.size()) {
            minVal = stk.top().second;
        }
        stk.push({val, min(val, minVal)});
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
