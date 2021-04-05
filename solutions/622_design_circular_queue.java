// https://leetcode.com/problems/design-circular-queue/

// Solved in April Daily Challenge :
// https://leetcode.com/explore/challenge/card/april-leetcoding-challenge-2021/593/week-1-april-1st-april-7th/3696/

class MyCircularQueue {
    int arr[], f, r, size;
    boolean empty;
    public MyCircularQueue(int k) {
        arr = new int[k];
        f = 0; r = 0;
        size = k;
        empty = true;
    }
    
    public boolean enQueue(int value) {
        if(isFull())
            return false;
        if(r == size)
            r = r % size;
        if(empty)
            arr[r++] = value;
        else
            arr[r++] = value;
        empty = false;
        return true;
    }
    
    public boolean deQueue() {
        if(empty)
            return false;
        arr[f++] = -1;
        if(f == r)
            empty = true;
        if(f == size)
            f = f % size;
        
        return true;
    }
    
    public int Front() {
        if(isEmpty())
            return -1;
        else
            return arr[f];
    }
    
    public int Rear() {
        if(isEmpty())
            return -1;
        else
            return arr[r-1];
    }
    
    public boolean isEmpty() {
        return empty;
    }
    
    public boolean isFull() {
        //System.out.println(f + " " + r);
        if(empty)
            return false;
        if(r > f)
            return size == r - f;
        else
            return size == r + size - f;
    }
}