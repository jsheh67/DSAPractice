package DataStructures.Stack;

public class main {

    public static void main(String[] args) {
        Stack myStack = new Stack(4);
        myStack.push(9);
        myStack.push(5);

        myStack.pop();



        myStack.printStack();
        System.out.println(myStack.getHeight());
    }
}
