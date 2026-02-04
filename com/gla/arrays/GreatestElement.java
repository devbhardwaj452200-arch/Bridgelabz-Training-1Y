package com.gla.arrays;

public class GreatestElement {
    public static void main(String[] args){
        int arr[]={2,5,6,7,1,8};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max element is:"+ max);
    }
}
