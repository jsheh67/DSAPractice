package DataStructures.binarytree;

public class Main {

    public static void main(String[] args) {
        BinaryTree myBST = new BinaryTree();


        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(52);
        myBST.insert(82);

        System.out.println(myBST.BFS());

        System.out.println(myBST.DFSPreOrder());

        System.out.println(myBST.DFSPostOrder());

        System.out.println(myBST.DFSInOrder());

    }
}
