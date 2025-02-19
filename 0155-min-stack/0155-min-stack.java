class MinStack {
    Stack<Long> st=new Stack<>();   
    long  min=-1;

    

    public MinStack() {
        
    }
    
    public void push(int val) {
        long x=(long)val;
        if(st.size()==0){
            st.push(x);
            min=x;
        }
       else if(x>=min) {
            st.push(x);
        }
        else if(x<min){
            st.push(2*x-min);
           min=x;
        }
        
    }
    
    public void pop() {
        if(st.size()==0)return;
        else if(st.peek()>=min)st.pop();
        else if(st.peek()<min){//farzi.. restore oldmin
            long old=2*min-st.peek();
            min=old;
            st.pop();
        
    }
    }
    
    public int top() {
        if(st.size()==0) return -1;
        long q=st.peek();
        if(q>=min)return (int)q;
        if(q<min) return (int)min;
        return 0;
        
    }
    
    public int getMin() {
         if(st.size()==0) return -1;
        return (int)min;
    }
 }

    //Approack 2
//         Stack<Integer> st=new Stack<>();   
//     Stack<Integer> min=new Stack<>();

    

//     public MinStack() {
        
//     }
    
//     public void push(int val) {
//         if(st.size()==0){
//             st.push(val);
//             min.push(val);
//         }
//         else{
//             st.push(val);
//             if(min.peek()<val) min.push(min.peek());
//             else min.push(val);
//         }
        
//     }
    
//     public void pop() {
//         st.pop();
//         min.pop();
        
//     }
    
//     public int top() {
//         return st.peek();
        
//     }
    
//     public int getMin() {
//         return min.peek();
//     }


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */