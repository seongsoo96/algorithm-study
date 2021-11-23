# Introduction

We may access a random element by index in Array.
However, we might want to restrict the processing order in some cases.

In this card, we introduce two different processing orders,
Frist-in-Frist-out and Last-in-First-out and its two corresponding linear data structures,
Queue and Stack.

We go through the definition, implementation and built-in functions for each data structure.
Then, we focus more on the practical applications of these two data structures.

# Queue: Frist-in-frist-out Data Structure(FIFO)

In this chapter, we will first introduce First-in-first-out (FIFO)
and how it works in a queue.

## First-in-first-out Data Structure

<img src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/05/03/screen-shot-2018-05-03-at-151021.png" width="40%" height="30%"></img>

In a FIFO data structure, the first element added to the queue will be processed first.

As shown in the picture above, the queue is a typical FIFO data structure.
The insert operation is also called enqueue and the new element is always added at the end of the queue.
The delete operation is called dequeue. You are only allowed to remove the first element.

## Queue - Implementation
To implement a queue, we may use a dynamic array and an index pointing to the head of the queue.

As mentioned, a queue should support two operations: enqueue and dequeue.
Enqueue appends a new element to the queue while dequeue removes the first element.
So we need an index to indicate the starting point.

### Drawback
The implementation above is straightforward but is inefficient in some cases.
With the movement of the start pointer, more and more space is wasted. And it will be
unacceptable when we only have a space limitation.

<img src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/21/screen-shot-2018-07-21-at-153558.png" width="40%" height="30%"></img>

Let's consider a situation when we are only able to allocate an array whose maximum length is 5.
Our solution works well when we have only added less than 5 elements.
For example, if we only called the enqueue function four times and we want to enqueue an element 10, we succeed.

And it is reasonable that we cannot accept more enqueue request because the quere is full now.
But what if we dequeue an elment?

<img src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/21/screen-shot-2018-07-21-at-153713.png" width="40%" height="30%"></img>

Actually, we should be able to accept one more element in this case.

## Circular Queue

Previously, we have provided a straightforward but inefficient implementation of queue.

A more efficient way is to use a circular queue. Specifically, we may use a fixed-size array
and two pointers to indicate the starting position and the ending position.
And the goal is to reuse the wasted storage we mentioned previously.

## Circular Queue - Implementation

In a circular queue, we use an array and two pointers, head and tail.
head indicates the start position of the queue while tail indicates the ending position of the queue.

Here we provide the code for your reference:

    class MyCircularQueue {

        private int[] data;
        private int head;
        private int tail;
        private int size;
    
        /** Initialize your data structure here. Set the size of the queue to be k. */
        public MyCircularQueue(int k) {
            data = new int[k];
            head = -1;
            tail = -1;
            size = k;
        }
        
        /** Insert an element into the circular queue. Return true if the operation is successful. */
        public boolean enQueue(int value) {
            if (isFull() == true) {
                return false;
            }
            if (isEmpty() == true) {
                head = 0;
            }
            tail = (tail + 1) % size;
            data[tail] = value;
            return true;
        }
        
        /** Delete an element from the circular queue. Return true if the operation is successful. */
        public boolean deQueue() {
            if (isEmpty() == true) {
                return false;
            }
            if (head == tail) {
                head = -1;
                tail = -1;
                return true;
            }
            head = (head + 1) % size;
            return true;
        }
        
        /** Get the front item from the queue. */
        public int Front() {
            if (isEmpty() == true) {
                return -1;
            }
            return data[head];
        }
        
        /** Get the last item from the queue. */
        public int Rear() {
            if (isEmpty() == true) {
                return -1;
            }
            return data[tail];
        }
        
        /** Checks whether the circular queue is empty or not. */
        public boolean isEmpty() {
            return head == -1;
        }
        
        /** Checks whether the circular queue is full or not. */
        public boolean isFull() {
            return ((tail + 1) % size) == head;
        }
    }

    /**
        Your MyCircularQueue object will be instantiated and called as such:
        MyCircularQueue obj = new MyCircularQueue(k);
        boolean param_1 = obj.enQueue(value);
        boolean param_2 = obj.deQueue();
        int param_3 = obj.Front();
        int param_4 = obj.Rear();
        boolean param_5 = obj.isEmpty();
        boolean param_6 = obj.isFull();
    */

## Queue - Usage

Most popular languages provide built-in Queue library so you don't have tp reomvemt the wheel.

As mentioned before, the queue has two important operations, enqueue and dequeue.
Besides, we should be able to get the first element in a quere since the first element should be processed first.

Below are some examples of using the built-in Queue library and its common operations:


    // "static void main" must be defined in a public class.
    public class Main {
        public static void main(String[] args) {
        // 1. Initialize a queue.
        Queue<Integer> q = new LinkedList();
        // 2. Get the first element - return null if queue is empty.
        System.out.println("The first element is: " + q.peek());
        // 3. Push new element.
        q.offer(5);
        q.offer(13);
        q.offer(8);
        q.offer(6);
        // 4. Pop an element.
        q.poll();
        // 5. Get the first element.
        System.out.println("The first element is: " + q.peek());
        // 7. Get the size of the queue.
        System.out.println("The size is: " + q.size());
        }
    }
We provide exercise after this article to help you familiarize with these operations.
And remember when you want to process the elements in order, using a queue might be a good choice.


[comment]: <> (//이미지 사용 용도)
[comment]: <> (<img src="" width="100%" height="100%"></img>)
