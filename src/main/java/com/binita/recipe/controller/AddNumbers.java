package com.binita.recipe.controller;

public class AddNumbers {
    private static boolean isPresent(){
        int arr[] = new int[]{2, 8, 7, 3, 5, 6, 4};
        int n=9;
        int j=1;
        for(int i=0; i<arr.length; i++){
            if(j!=i && j<arr.length){
                int sum = arr[i]+arr[j];
                System.out.println("Sum is "+sum);
                if(arr[i]+arr[j]==n){
                    System.out.println(" Values are "+arr[i]+ " + "+arr[j]);
                    return true;
                }
            }
            j++;
        }
        return false;
    }

    public static void main(String args[]){
        System.out.println("isPresent : "+isPresent());

    }
}
