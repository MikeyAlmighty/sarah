const graph = {
  a: ['c', 'b'],
  b: ['d'],
  c: ['e'],
  d: ['f'],
  e: [],
  f: [],
}

const iterativeDepthFirstPrint = (graph, source) => {
  const stack = [source]

  while (stack.length > 0) {
    const current = stack.pop()
    for (let neighbor of graph[current]) {
      stack.push(neighbor)
    }
    console.log(current)
  }
}

// No need for base case, as in the case of no neighbor, [] empty array, no recursive call is made.
const recursiveDepthFirstPrint = (graph, source) => {
  console.log(source)
  for(let neighbor of graph[source]) {
    recursiveDepthFirstPrint(graph, neighbor)
  }
}

// Can only be applied iteratively as it needs to make use of a queue.
const breadthFirstPrint = (graph, source) => {
  console.log('breadthFirstPrint: ')
  const queue = [source]

  while (queue.length > 0) {
    const current = queue.shift()
    console.log(current)
    for (let neighbor of graph[current]) {
      queue.push(neighbor)
    }
  }
}

iterativeDepthFirstPrint(graph, 'a') // Should be abdfce
recursiveDepthFirstPrint(graph, 'a') // Should be acebdf
breadthFirstPrint(graph, 'a') // Should be acbedf

// Checks if destination node is found
// DFS
const iterativeHasPath = (graph, source, destination) => {
  const stack = [source]
  while (stack.length > 0) {
    const current = stack.pop()
    if (current === destination) return true
    for (let neighbor of graph[current]) {
      stack.push(neighbor)
    }
  }
  return false
}

const recursiveHasPath = (graph, source, destination) => {
  if (source === destination) return true
  for (let neighbor of graph[source]) {
    if (recursiveHasPath(graph, neighbor, destination) === true) return true
  }
  return false
}

const breadthFirstHasPath = (graph, source, destination) => {
  const queue = [source]
  while (queue.length > 0) {
    const current = queue.shift()
    if (current === destination) return true
    for (let neighbor of graph[current]) {
      queue.push(neighbor)
    }
  }
  return false
}

console.log(iterativeHasPath(graph, 'a', 'f')) // should return true
console.log(recursiveHasPath(graph, 'a', 'e')) // should return true
console.log(breadthFirstHasPath(graph, 'a', 'e')) // should return true

// Undirected Graph

// Convert Edge List to Adjacency List (Easier to work with)
// Generates Graph nodes as keys, with values being neighbors
const buildGraph = (edges) => {
  const graph = {}

  for (let edge of edges) {
    const [a, b] = edge // Pair of nodes, edge = ['i', 'j']
    if (!(a in graph)) graph[a] = []
    if (!(b in graph)) graph[b] = []
    graph[a].push(b)
    graph[b].push(a)
  }
  return graph
}

// Every pair represents a bi-directional connection/edge between two nodes
const edges = [
  ["i", "j"],
  ["k", "i"],
  ["m", "k"],
  ["k", "l"],
  ["o", "n"],
 ]

const undirectedPath = (edges, nodeA, nodeB) => {
  const graph = buildGraph(edges)
  return hasPath(graph, nodeA, nodeB, new Set()) // We use Set here as its lookup is O(1) compared to an array which is O(n)
}

const hasPath = (graph, src, destination, visited) => {
  if (src === destination) return true
  if (visited.has(src)) return false

  visited.add(src)

  for (let neighbor of graph[src]) {
    if(hasPath(graph, neighbor, destination, visited)) return true
  }
  return false
}

console.log(undirectedPath(edges, 'j', 'm')) // Should return true
console.log(undirectedPath(edges, 'j', 's')) // Should return false

// Count the amount of "full" node connections (Components)
const connectedComponentCount = (graph) => {
  const visited = new Set()
  let count = 0

  for (let node in graph) {
    if (explore(graph, node, visited)) count +=1
  }
  return count
}

const explore = (graph, currNode, visited) => {
  if (visited.has(String(currNode))) return false
  visited.add(String(currNode))

  for (let neighbor of graph[currNode]) {
    explore(graph, neighbor, visited)
  }
  return true
}

const undirectedGraph = {
  0: [8, 1, 5],
  1: [0],
  5: [0, 8],
  8: [0, 5],
  2: [3, 4],
  3: [2, 4],
  4: [3, 2],
}

console.log(connectedComponentCount(undirectedGraph))

const largestComponent = (graph) => {
  const visited = new Set()
  let largest = 0
  for (let node in graph) {
    const size = exploreSize(graph, node, visited)
    if(size > largest) return largest = size
  }
  return largest
}

const exploreSize = (graph, currNode, visited) => {
  if (visited.has(String(currNode))) return 0
  visited.add(String(currNode))
  let size = 1
  for (let neighbor of graph[currNode]) {
    size += exploreSize(graph, neighbor, visited)
  }
  return size
}

console.log(largestComponent(undirectedGraph))

const edges_1 = [
  ['w', 'x'],
  ['x', 'y'],
  ['z', 'y'],
  ['z', 'v'],
  ['w', 'v'],
]

const shortestPath = (edges, source, destination) => {
  const graph = buildGraph(edges)
  const visited = new Set([source])
  const queue = [ [source, 0] ]
  while (queue.length > 0) {
    const [node, distance] = queue.shift()

    if (node === destination) return distance

    for (let neighbor of graph[node]) {
      if (!visited.has(neighbor)) {
        visited.add(neighbor)
        queue.push([neighbor, distance + 1])
      }
    }
  }
  return -1
}

console.log(shortestPath(edges_1, 'v', 'x'))

// Takes in a grid containing Water ("W") and Land ("L") nodes.
// Function returns the number of islands on the grid.
// An island is a vertically or horizontally connected region of land.
const islandCount = (grid) => {
  const visited = new Set()
  let count = 0
  for (let row = 0; row < grid.length; row++) {
    for (let column = 0; column < grid[0].length; column++) {
      if (exploreEarthGraph(grid, row, column, visited) === true) count ++
    }
  }
  return count
}

const exploreEarthGraph = (grid, row, column, visited) => {
  const rowInBounds = 0 <= row && row < grid.length
  const columnInBounds = 0 <= column && column < grid[0].length
  if (!rowInBounds || !columnInBounds) return false

  if (grid[row][column] === 'W') return false // Exclude Water blocks
  const position = `${row},${column}`
  if (visited.has(position)) return false // Cycle prevention

  // If we reach this point (Passes guards), it's a land block so we need to do a DFS traversal
  visited.add(position)
  exploreEarthGraph(grid, row - 1, column, visited)
  exploreEarthGraph(grid, row + 1, column, visited)
  exploreEarthGraph(grid, row, column - 1, visited)
  exploreEarthGraph(grid, row, column + 1, visited)
  return true
}

const earthGraph = [
  ['W', 'L', 'W', 'W', 'W', 'W'],
  ['W', 'L', 'W', 'W', 'W', 'W'],
  ['W', 'W', 'W', 'W', 'L', 'W'],
  ['W', 'W', 'W', 'L', 'L', 'W'],
  ['L', 'W', 'W', 'W', 'L', 'L'],
  ['L', 'L', 'W', 'W', 'W', 'W']
]

console.log(islandCount(earthGraph)) // Should return 3

// Returns the smallest island count
const minIsland = (grid) => {
  const visited = new Set()
  let min = Infinity

  for (let row = 0; row < grid.length; row++) {
    for (let column = 0; column < grid[0].length; column++) {
      const size = exploreEarthGraphForMin(grid, row, column, visited)
      if (size > 0 && size < min) min = size
    }
  }

  return min
}

const exploreEarthGraphForMin = (grid, row, column, visited) => {
  const rowInBounds = 0 <= row && row < grid.length
  const columnInBounds = 0 <= column && column < grid[0].length
  if (!rowInBounds || !columnInBounds) return 0

  if (grid[row][column] === 'W') return 0 // Exclude Water blocks
  const position = `${row},${column}`
  if (visited.has(position)) return 0 // Cycle prevention
  visited.add(position)

  let size = 1 // 1 because we include current block (Part of island)
  size += exploreEarthGraph(grid, row - 1, column, visited)
  size += exploreEarthGraph(grid, row + 1, column, visited)
  size += exploreEarthGraph(grid, row, column - 1, visited)
  size += exploreEarthGraph(grid, row, column + 1, visited)
  return size
}

console.log(minIsland(earthGraph)) // Should return 2