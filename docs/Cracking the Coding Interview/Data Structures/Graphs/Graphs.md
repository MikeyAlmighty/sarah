# Graphs

[Graph Algorithms for Technical Interviews - Full Course
](https://www.youtube.com/watch?v=tWVWeAqZ0WU)

Contains nodes (or vertex) + edges

Neighbor node = Node accessible through an edge

## Directed Graphs
Flows in one direction

## Undirected
Flow goes both ways (bidirectional)

## Adjacency list

Used to represent a graph in a programmatical way:

![AdjacencyList](../../assets/graphAdjacencyList.png)

(Constant lookup)
Key = Node, values = Neighbor nodes


![BFS vs DFS](../../assets/Graph_BFS_vs_DFS.png)

BFS = Stack ("Deep" in one direction search)
DFS = Queue (Explosive search)

See [Implementation + Examples](./graphs.js)

## Acyclic
No cycles

## Cyclic
Can travel back to a previous node

## Complexity
Traversal:
n = # nodes
n<sup>2</sup> = # edges

Time: O(n<sup>2</sup>)
Space: O(n)
