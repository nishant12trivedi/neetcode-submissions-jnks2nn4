class MinStack {
public:
    #define fi first
    #define se second
    stack<pair<int, int>> stk;
    MinStack() {
        
    }
    
    void push(int val) {
        int minVal = INT_MAX;
        if (stk.size()) {
            minVal = stk.top().se;
        }
        stk.push({val, min(val, minVal)});
    }
    
    void pop() {
        stk.pop();
    }
    
    int top() {
        return stk.top().fi;
    }
    
    int getMin() {
        return stk.top().se;
    }
};
