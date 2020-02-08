package com.binita.recipe.controller;

public class QuickSort {

    public static void main(String args[]){
        int [] arr = new int[]{35, 53, 18, 103, 66, 28, 90};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        for(int x:arr){
            System.out.print(" "+x);
        }
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low<high){
            int pi = partition(arr, low, high);
            quickSort(arr, 0, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    private static int partition1(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot=arr[high];
        int i=low-1;
        for(int j=low; j<high; j++){

            if(arr[j]<=pivot){
                i++;
                //swap(arr[i], arr[j]);
                /*System.out.println("i : "+arr[i]+" j : "+arr[j]+ " pivot : "+pivot);
                */int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                //System.out.println("i : "+arr[i]+" j : "+arr[j]+ " pivot : "+pivot);

            }
        }
        //swap arr[i] and arr[high]
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;


        return i+1;
    }

    private static void swap(int i, int j) {
        int temp=j;
        j=i;
        i=temp;
    }


}
