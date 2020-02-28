package cse360assign2;

/** Loran Zerbe - 382 - Assignment #2
 *  This class makes a list that can have elements added,
 *  removed, found, and the elements returned as a string
 */
public class SimpleList {
    private int[] list;
    private int count;

    /**
     * This is the class constructor
     */
    public SimpleList(){
        list = new int[10];
        count = 0;
    }

    /**
     * Adds an int num to index 0 of the list, all other elements are shifted one index up
     * @param num this is the integer to be added to the front of the list
     */
    public void add(int num) {
        if(count == list.length) {
            int[] newList = new int[(int) Math.round(list.length*1.5)];
            for(int i = 0; i < list.length; i++) {
                newList[i] = list[i];
            }
            list = newList;
        }

        for(int i = count; i > 0; i--) {
            list[i] = list[i - 1];
        }
        list[0] = num;
        count++;
        return;
    }

    /**
     * Removes an element from the list if it exists in the list, all elements shifted down one index if executed
     * @param num this is the integer to be deleted
     */
    public void remove(int num){
        int removeIndex = search(num);
        if(removeIndex != -1) {
            list[removeIndex] = 0;
            for (int i = removeIndex; i < count - 1; i++) {
                list[i] = list[i + 1];
            }
            list[count - 1] = 0;
            count--;

            if((double) count/list.length <= .75 && list.length != 1) {
                int[] newList = new int[(int) Math.round(list.length*0.75)];
                for(int i = 0; i < count; i++) {
                    newList[i] = list[i];
                }
                list = newList;
            }
        }

        return;
    }

    /**
     * Returns int count
     * @return count this is the count of elements
     */
    public int count() {
        return this.count;
    }

    /**
     * Returns a string of all the elements in the list
     * @return elements this is the elements in string format
     */
    public String toString() {
        String elements = "";
        for(int i = 0; i < list.length; i++) {
            elements += list[i] + " ";
        }
        return elements;
    }

    /**
     * This searches the list for an integer num and returns the index if successful, -1 if not
     * @param num this is the integer the function searches for
     * @return this is the index we are looking for, -1 if it does not exist
     */
    public int search(int num) {
        for(int i = 0; i < list.length; i++){
            if(list[i] == num) {
                return i;
            }
        }
        return -1;
    }

    /**
     * This appends an integer at the end of the list
     * @param num this is the integer the function inserts at the end of the list
     */
    public void append(int num) {
       if(count != list.length) {
           list[count + 1] = num;
       } else if(count == list.length) {
               int[] newList = new int[(int) Math.round(list.length*1.5)];
               for(int i = 0; i < count; i++) {
                   newList[i] = list[i];
               }
               list = newList;
               list[count] = num;
               count++;
       }
       return;
    }

    /**
     * This returns the first element of the list
     * @return list[0] this is the first element of the list
     */
    public int first() {
        return list[0];
    }

    /**
     * This returns the last element of the list
     * @return list[count] this is the last element of the list
     */
    public int last() {
        return list[count - 1];
    }

    /**
     * This returns the array list size
     * @return list.length this is the array list size
     */
    public int size() {
        return list.length;
    }
}
