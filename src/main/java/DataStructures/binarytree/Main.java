package DataStructures.binarytree;

import DataStructures.Queue.Queue;

public class Main {

    public static void main(String[] args) {
        BinaryTree myBST = new BinaryTree();


        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(52);
        myBST.insert(82);

        myBST.insert(27);

        System.out.println(myBST.root.left.right.value);

        System.out.println(myBST.contains(99));
        System.out.println(myBST.contains(52));
        System.out.println(myBST.contains(76));
        System.out.println(myBST.contains(18));
        System.out.println(myBST.contains(100));
    }
}
