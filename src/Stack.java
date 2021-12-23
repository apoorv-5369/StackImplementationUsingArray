// Stack Implementation using Array.
public class Stack {
    // Store elements of the Stack
    private int[] arr;
    // Represent top of the Stack
    private int top;
    // Total capacity of the Stack
    private int capacity;
    // Creating a Stack
    Stack(int size){
        // Initialize the array and the stack variables.
        arr = new int[size];
        capacity=size;
        top=-1;
    }
    // push elements on top of the stack.
    public void push(int x){
        // Check if the stack is already full.
        if(isFull()){
            System.out.println("Stack Overflow");
            // Terminate the program.
            System.exit(1);
        }
        // insert elements.
        System.out.println("Inserting "+x);
        arr[++top]=x;
    }
     // pop elements of the stack.
    public int pop(){
        // Check if the stack is empty.
        if(isEmpty()) {
          System.out.println("Stack is Empty");
          // Terminate the program.
            System.exit(1);
        }
        // pop element from the stack.
        return arr[top--];
    }
    // Return size of the stack.
    public int getSize(){
        return top + 1;
    }
    // Check if the Stack is empty.
    public boolean isEmpty(){
        return top==-1;
    }
    // Check if the stack is full.
    public boolean isFull(){
        return top==capacity-1;
    }
    // Print elements of the Stack.
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
    }
        // Display the top element of the stack.
        public int peek(){
            // Check if the stack is empty.
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return 0;
        }else{
                int x=arr[top];
                return x;
            }
    }
    // Driver Code
    public static void main(String[] args){
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(" Stack: ");
        stack.printStack();
        // pop the top element of the stack.
        stack.pop();
        System.out.println(" Popped "+stack.pop()+" from the stack");
        System.out.println("Stack after popping top element:");
        stack.printStack();
    }
}
