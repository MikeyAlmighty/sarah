# Binary Tree

[Binary Tree Algorithms for Technical Interviews - Full Course
](https://www.youtube.com/watch?v=fAAZixBzIAI)

- Every node has at **MOST** 2 children (0, 1 or 2 children per node)
- Exactly 1 root
- Exactly 1 path **between** root and any node.

Empty tree (0 Nodes), is also a Binary Tree.

See [Implementation + Examples](Trees/binary-tree.js)

Node exploring can be achieved by either [BFS](../../Algorithms/Breadth%20First%20Search.md) or [DFS](../../Algorithms//Depth%20First%20Search.md)

## Types Of Binary Trees

### Binary Tree vs Binary Search Tree

**Binary Search Tree (BST)**:  For Each node its left descendants are less than or equal to the current node, which is less than the right descendants.

```js
// A Binary Search Tree
      8
    /  \
   4    10
  /  \    \
 2    6    20
```
```js
// NOT a Binary Search Tree
      8
    /  \
   4    10
  /  \    \
 2    12    20
```

### Balanced vs Unbalanced

A Binary Tree is balanced if the difference between the **Height** of left & right subtree for every node is not more thank k (usually k=1).
- Unbalanced tree (access, insert & delete) operations are `O(n)` in worst case.
- Balanced tree (access, insert & delete) operations are `O(log n)` in worst case.

### Complete Binary Tree
Every level of the tree is fully filled, except for perhaps the last level. (To the extent that the last level is filled, it is filled left to right)
```js
// Not a complete Binary Tree
     10
    /  \
   5   20
  /  \    \
 3    7    30
```

```js
// Complete Binary Tree
      10
    /    \
   5      20
  /  \    /
 3    7  15
```

### Full Binary Tree
Every node has either **zero** or **two** children. (No node has only one child).
We can also say a `full binary tree` is a binary tree in which all nodes **except** leaf nodes have two children. 
```js
// Not a Full Binary Tree
       10
    /      \
   5        20
   \      /  \
   12    3    7
        /  \
       9    18
```

```js
// Full Binary Tree
      10
    /    \
   5      20
        /   \
       3     7
      /  \
     9    18
```

### Perfect Binary Tree
Is both **Full** and **Complete**. All leaf nodes will be at the same level and this level has the maximum number of nodes.
```js
// Perfect Binary Tree
      10
    /    \
   5      20
  / \    /  \
 9   18  3   7
```

![Types OF Binary Trees](./../../assets/typesOfBinaryTrees.png)