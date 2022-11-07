package DataStructures.Stack;

public class Stack {
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }



    private Node top;
    private int height;

    public Stack(int value){
        Node newNode= new Node(value);
        top = newNode;
        height=1;
    }

    public void push(int value){
        Node newNode = new Node(value);
        if(height==0){
            top=newNode;
        }else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public Node pop(){
        if(height==0){
            return null;
        }else{
            Node temp = top;
            top= temp.next;
            temp.next=null;
            height--;
            return temp;
        }
    }

    public void printStack(){
        Node temp= top;
        while (temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
        System.out.println();
    }

    public Node getTop() {
        return top;
    }

    public int getHeight() {
        return height;
    }
}
