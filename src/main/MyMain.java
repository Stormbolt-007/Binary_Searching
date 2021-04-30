package main;

import implementation.Searching;

public class MyMain {
    public static void main(String[] args) {
        int[] arr = {10,15,20,25,30,42,48,98,100,110,120,150};
        int low = 0;
        int high = arr.length - 1;
        int searchElement = 90;
        Searching obj = new Searching(arr);
        boolean result = obj.binarySearch(searchElement, low, high);
        System.out.println("Element found : " + result);

    }
}
