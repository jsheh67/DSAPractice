package DataStructures.HashTable;

import java.util.HashMap;

public class Main {

    //find common between two arrays

    public static boolean itemInCommon(int[] array1, int[] array2){
        for(int i: array1){
            for(int j: array2){
                if(i==j){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean itemInCommonHashTable(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();
        for (int i : array1) {
            myHashMap.put(i, true);
        }

        for (int j : array2) {
            if (myHashMap.get(j)!=null) {
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {

        int[] array1={1,3,5};
        int[] array2={2,4,6};

        System.out.println(itemInCommon(array1,array2));

        System.out.println(itemInCommonHashTable(array1,array2));


//
//        HashTable myHT= new HashTable();
//        myHT.set("nails",1000);
//        myHT.set("tiles", 50);
//        myHT.set("lumber",80);
//        myHT.set("bolts", 200);
//        myHT.set("screws", 140);
//
//        myHT.printTable();
//
//        System.out.println( myHT.get("lumber"));
//        System.out.println( myHT.get("screws"));
//
//        System.out.println(myHT.keys().toString());
    }
}
