package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void selectionSort(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr == null || arr.length == 0){
            return;
        }

        for (int i = 0; i < arr.length; ++i){
            int min = Integer.MAX_VALUE;
            int minNumElement = 0;
            for (int j = i; j < arr.length; ++j){
                if(min > arr[j]){
                    min = arr[j];
                    minNumElement = j;
                }
            }
            int mid = arr[i];
            arr[i] = min;
            arr[minNumElement] = mid;
        }
    }

}