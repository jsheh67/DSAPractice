package DataStructures;

import java.util.HashMap;

public class main {
    public static void printItems(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    System.out.println(j+"/"+i+"/"+k);
                }
            }
        }
        for(int j=0; j<n; j++){
            System.out.println(j);
        }
    }

    public static void printItems(int a, int b){
        for(int i=0; i<a;i++){
            System.out.println(i);
        }
        for(int i=0; i<b;i++){
            System.out.println(i);
        }
    }

    public static int addItems(int n){
        return n+n;
    }

    public static void main(String[] args) {

        DoubleLinkedList mydll= new DoubleLinkedList(7);
        mydll.getHead();
        mydll.getTail();
        mydll.getLength();
        mydll.printList();

        mydll.append(8);
        mydll.append(9);
        mydll.append(10);
        mydll.printList();


        mydll.prepend(77);
        mydll.printList();

        mydll.set(2,99);
        mydll.insert(1,1);


        mydll.printList();

        mydll.remove(3);
        mydll.printList();





    }


}
