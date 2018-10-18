package com.sathya.sorting;

public class QuickSort {

    public void sort(int[] nos) {
        sort(nos, 0, nos.length);
    }

    private void sort(int[] nos, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(nos, begin, end);
            sort(nos, begin, partitionIndex - 1);
            sort(nos, partitionIndex + 1, end);
        }
    }

    private int partition(int nos[], int begin, int end) {
        int pivot = nos[end];
        int pos = (begin - 1);
        for (int j = begin; j < end; j++) {
            if (nos[j] <= pivot) {
                pos++;
                swap(nos, pos, j);
            }
        }
        swap(nos, pos + 1, end);
        return pos + 1;
    }

    private void swap(int[] nos, int p1, int p2) {
        int temp = nos[p1];
        nos[p1] = nos[p2];
        nos[p2] = temp;
    }
}