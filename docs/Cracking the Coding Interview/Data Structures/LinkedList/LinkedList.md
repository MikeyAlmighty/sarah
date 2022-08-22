# Linked List

Made up of many nodes.

A => B => C => D => Null
- A = Head
- D = Tail

Node - Contains some data, and an index.
- Insertion is in Constant O(1) [Faster than an [Array](./Arrays.md)]

If you want to pass a linkedList to a function, you can just pass the Head node. It contains a `current.next` method for the next node in the list, continuing all the way to the tail (When current null is hit).


When writing logic (I.e traversal) for a linkedList, try and work with `current`
[Linked Lists for Technical Interviews - Full Course
](https://www.youtube.com/watch?v=Hj_rA0dhr2I)

[Linked List JS implementation](./linked-list.js)