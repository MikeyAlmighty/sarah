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