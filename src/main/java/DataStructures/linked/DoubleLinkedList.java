package DataStructures.linked;

public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;
        Node previous;

        Node(int value){
            this.value=value;
        }
    }

    public DoubleLinkedList(int value){
        Node newNode = new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }

    public void printList(){
        DoubleLinkedList.Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"-");
            temp=temp.next;
        }
        System.out.println();
    }

    public void getHead() {
        System.out.println("Head: "+head.value);
    }

    public void getTail() {
        System.out.println("Tail: "+tail.value);
    }

    public void getLength() {
        System.out.println("Length: "+length);
    }

    public void append(int value){
        Node newNode= new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }else{
            Node tempTail= tail;
            tempTail.next=newNode;
            newNode.previous=tempTail;
            tail=newNode;
            newNode.next=null;
        }
        length++;
    }

    public Node removeLast(){
        if(length==0){
            return null;
        }
        Node temp = tail;
        if(length==1){
            head=null;
            tail=null;
        }else {
            Node newTail = temp.previous;
            newTail.next = null;
            temp.previous = null;
            tail = newTail;
        }
        length--;
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }else{
            Node oldHead = head; //can just do head.previous
            newNode.next=oldHead;
            oldHead.previous=newNode;
            newNode.previous=null; //not necessary
            head=newNode;
        }
        length++;
    }

    public Node removeFirst(){
        if(length==0){
            return null;
        }
        Node temp=head;
        if(length==1){
            head=null;
            tail=null;
        }else {
            Node newHead = temp.next; //head=head.next
            temp.next=null;           //head.previous=null
            newHead.previous=null;    //temp.next==null;
            head=newHead;
        }
        length--;
        return temp;
    }

    public Node get(int index){
        if(index<0 || index>=length){
            return null;
        }
        Node temp =head;
        if(index<length/2){
            for(int i=0; i<index; i++){
                temp=temp.next;
            }
        }else{
            temp=tail;
            for(int i=length-1; i>index; i--){
                temp=temp.previous;
            }
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node toSet=get(index);
        if(toSet!=null){
            toSet.value=value;
            return true;
        }else{
            return false;
        }
    }

    public boolean insert(int index, int value){
        if(index<0|| index>length){
            return false;
        }if(index==0){
            prepend(value);
        }if(index==length-1){
            append(value);
        }else{
            Node newNode = new Node(value);
            Node beforeInsert=get(index-1);
            Node afterInsert=beforeInsert.next;
            beforeInsert.next=newNode;
            afterInsert.previous=newNode;
            newNode.next=afterInsert;
            newNode.previous=beforeInsert;
        }
        length++;
        return true;
    }

    public Node remove(int index){
        if(index<0||index>length){
            return null;
        }if(index==0){
            return removeFirst();
        }if(index==length-1){
            return  removeLast();
        }
        Node toRemove=get(index);
//        Node before= toRemove.previous;
//        Node after = toRemove.next;
//        before.next=after;
//        after.previous=before;
//        toRemove.previous=null;
//        toRemove.next=null;
        toRemove.next.previous=toRemove.previous;
        toRemove.previous.next=toRemove.next;
        toRemove.next=null;
        toRemove.previous=null;
        length--;
        return toRemove;
    }
}
