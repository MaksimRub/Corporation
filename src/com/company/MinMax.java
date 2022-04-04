package com.company;

public class MinMax <T extends Comparable <T>> {
    T[] list;


    public MinMax(T[] list){
        this.list=list;
    }

    public T Min () {
        if (list.length == 0) {
            return null;
        }
        T min = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(min) < 0) {
                min = list[i];
            }



        }
        return min;
    }
        public T Max () {
            if (list.length == 0) {
                return null;
            }
            T max = list[0];
            for (int i = 1; i < list.length; i++) {
                if (list[i].compareTo(max) >= 0) {
                    max = list[i];
                }


            }
            return max;


        }
}
