package com.collections_java;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        int intArr[]={1,2,3,4,5};
        System.out.println("Integer Array: "+Arrays.toString(intArr));

        int anotherIntArr[]=Arrays.copyOf(intArr,10);
        System.out.println("Another Integer Array: "+Arrays.toString(anotherIntArr));

        Arrays.fill(anotherIntArr,100);
        System.out.println("Another Integer Array: "+Arrays.toString(anotherIntArr));

        int arr[]={30,1,15,7,96,2};
        Arrays.sort(arr,1,arr.length);
        System.out.println("Arr: "+Arrays.toString(arr));

    }
}
