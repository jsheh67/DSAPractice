//package DataStructures.binarytree;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class BFS {
//    public ArrayList<Integer> BFS(){
//        Node currentNode=root;
//        Queue<Node> queue = new LinkedList<>();
//        ArrayList<Integer> results = new ArrayList<>();
//        queue.add(currentNode);
//
//        while(queue.size()>0){
//            currentNode=queue.remove();
//            results.add(currentNode.value);
//            if(currentNode.left != null){
//                queue.add(currentNode.left);
//            }
//            if(currentNode.right != null){
//                queue.add(currentNode.right);
//            }
//        }
//        return results;
//
//    }
//}
