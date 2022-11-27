package com.cb.yash.array_string;

public class GrowableArray {
    private Integer[] elementData;
    private int elementCount;

    public GrowableArray(){
        elementData = new Integer[10];
        elementCount = 0;
    }

    public void increaseCapacity(int totalElements){
        int newCapacity = capacity()+totalElements;
        Integer[] nextArray = new Integer[newCapacity];
        if(elementCount==0)
            elementData = nextArray;
        else{
            for (int i=0; i<elementData.length; i++){
                nextArray[i] = elementData[i];
            }
            elementData = nextArray;
        }
    }

    public void increaseCapacity(){
        int newCapacity = capacity()*2;
        Integer[] nextArray = new Integer[newCapacity];
        for (int i=0; i<elementData.length; i++){
            nextArray[i] = elementData[i];
        }
        elementData = nextArray;
    }

    public void addAll(int[] arr){
        if(size()==capacity() || arr.length>(capacity()-size())){
            increaseCapacity(arr.length);
        }
        for (int j : arr) {
            elementData[elementCount++] = j;
        }
    }

    public void add(Integer element){
        if(size()==capacity()){
            increaseCapacity();
        }

        elementData[elementCount++] = element;
    }

    public int size(){
        return elementCount;
    }

    public int capacity(){
        return elementData.length;
    }

}

class GrowableArrayTest{
    public static void main(String[] args) {
        GrowableArray growableArray = new GrowableArray();
        System.out.println(growableArray.capacity());
        System.out.println(growableArray.size());

        growableArray.add(5);
        growableArray.add(5);
        growableArray.add(5);
        growableArray.add(5);
        growableArray.add(5);
        growableArray.add(5);
        growableArray.add(5);
        growableArray.add(5);
        growableArray.add(5);
        growableArray.add(5);

        System.out.println(growableArray.capacity());
        System.out.println(growableArray.size());
        System.out.println();

        growableArray.add(6);
        System.out.println();

        System.out.println(growableArray.capacity());
        System.out.println(growableArray.size());
        System.out.println();

        growableArray.addAll(new int[]{5,10,15,17,20,21,22,23,24,25,26,27,28,29,30});
        System.out.println(growableArray.capacity());
        System.out.println(growableArray.size());
        System.out.println();

        growableArray.addAll(new int[]{12,13,45,78,89,67,56,56,98,98});
        System.out.println(growableArray.capacity());
        System.out.println(growableArray.size());
        System.out.println();

    }
}
