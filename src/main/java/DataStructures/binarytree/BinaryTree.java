package DataStructures.binarytree;

public class BinaryTree {
    class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value=value;
        }
    }
    Node root;

    public boolean insert(int val){
        Node newNode = new Node(val);
        if(root==null){
            root= newNode;
            return true;
        }
        Node temp = root;
        while(true){
            if(newNode.value== temp.value){return false;}
            if(newNode.value> temp.value){
                if(temp.right==null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }else{
                if(temp.left==null){
                    temp.left=newNode;
                    return true;
                }
                temp = temp.left;
            }
        }
    }

    public boolean contains(int value){
        if(root==null){return false;}
        Node temp = root;
        while(temp!=null){
            if(temp.value>value){
                temp=temp.left;
            }else if(temp.value<value){
                temp=temp.right;
            }else{
                return true;
                //(temp.value==value)
            }
        }
        return false;
    }



//    public BinaryTree(int value){
//        root = null;
//    }


}
