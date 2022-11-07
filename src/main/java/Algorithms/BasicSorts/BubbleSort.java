package Algorithms.BubbleSort;

import java.awt.geom.Area;
import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr){
        int l = arr.length-1;

        for(int j=0; j<arr.length; j++) {
            for (int i = 0; i < l; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
               // l--;
            }
        }
        return arr;
    }

    public static void bubbSort(int[]array){
        for(int i=array.length-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }

        }
    }

    public static void main(String[] args) {
        int[] test ={4,2,6,5,1,3};
        System.out.println(Arrays.toString(bubbleSort(test)));

        int[] test2={4,2,6,5,1,3};
        bubbSort(test2);
        System.out.println(Arrays.toString(test2));
    }


}
