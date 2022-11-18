package arrays;

import java.util.ArrayList;

public class Array {
    int[] nums = new int[10];

    public int size(){
        return nums.length;
    }

    public int capacity(){
        return nums.length;
    }

    public boolean isEmpty(){
        for (int num : nums) {
            if (num != 0)
                return false;
        }
        return true;
    }

    public int at(int index){
        try{
            return nums[index];
        }
        catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
        return 0;
    }

    public void push(int item){

    }

    public void insert(int index, int item){

    }

    public void prepend(int item) { // - can use insert above at index 0

    }
    public int pop() { // - remove from end, return value
        return 0;
    }
    public int delete(int index) { //- delete item at index, shifting all trailing elements left
        return 0;
    }
    public int remove(int item) { //- looks for value and removes index holding it (even if in multiple places)
        return 0;
    }
    public int find(int item) { //- looks for value and returns first index with that value, -1 if not found
        return 0;
    }
    public void resize(int newCapacity) { // private function
    }
}
