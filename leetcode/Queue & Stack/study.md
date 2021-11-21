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



[comment]: <> (//이미지 사용 용도)
[comment]: <> (<img src="" width="100%" height="100%"></img>)
