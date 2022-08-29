class Node {
  constructor(val){
    this.val = val
    this.left = null
    this.right = null
  }
}

const a = new Node('A')
const b = new Node('B')
const c = new Node('C')
const d = new Node('D')
const e = new Node('E')
const f = new Node('F')

a.left = b
a.right = c
b.left = d
b.right = e
c.right = f

//          a
//        /   \
//       b     c
//      / \     \
//     d   e     f

const iterativeDepthFirstValues = (root) => {
  if (!root) return []
  const result = []
  const stack = [root]
  while (stack.length > 0){
    const current = stack.pop()
    result.push(current.val)
    // Favours left hand side
    if(current.right) stack.push(current.right)
    if(current.left) stack.push(current.left)
    // Favours right hand side
    // if(current.left) stack.push(current.left)
    // if(current.right) stack.push(current.right)
  }
  return result
}

const recursiveDepthFirstValues = (root) => {
  if (!root) return []
  const leftValues = recursiveDepthFirstValues(root.left) // [b, d, e]
  const rightValues = recursiveDepthFirstValues(root.right) // [c, f]
  return [root.val, ...leftValues, ...rightValues]
}

const breadthFirstValues = (root) => {
  if (!root) return []
  const result = []
  const queue = [root]
  while (queue.length > 0) {
    const current = queue.shift()
    result.push(current.val)
    // Favours Left to Right
    if (current.left) queue.push(current.left)
    if (current.right) queue.push(current.right)
  }
  return result
}

// Utilizes BFS
const iterativeIncludes = (root, target) => {
  if (!root) return []
  const queue = [root]
  while (queue.length > 0) {
    const current = queue.shift()
    if (current.val === target) return true
    if (current.left) queue.push(current.left)
    if (current.right) queue.push(current.right)
  }
  return false
}

// Utilizes DFS
const recursiveIncludes = (root, target) => {
  if (!root) return false
  if (root.val === target) return true
  return recursiveIncludes(root.left, target) || recursiveIncludes(root.right, target)
}

const iterativeTreeSum = (root) => {
  if (!root) return false
  let sum = 0
  const queue = [root]
  while (queue.length > 0) {
    const current = queue.shift()
    sum += current.val
    if (current.left) queue.push(current.left)
    if (current.right) queue.push(current.right)
  }
  return sum
}

const recursiveTreeSum = (root) => {
  if (!root) return null
  return root.val + recursiveTreeSum(root.left) + recursiveTreeSum(root.right)
}

// BFS
const minTreeValue = (root) => {
  let min = Infinity
  if (!root) return null
  const queue = [root]
  while (queue.length > 0) {
    const current = queue.shift()
    if (current.val < min) min = current.val
    if (current.left) queue.push(current.left)
    if (current.right) queue.push(current.right)
  }
  return min
}

// DFS
const recursiveMinTreeValue = (root) => {
  if (!root) return Infinity
  return Math.min(root.val, recursiveMinTreeValue(root.left),recursiveMinTreeValue(root.right))
}

// Finds the maximum path from root to leaf (DFS)
const maxPathSum = (root) => {
  if (!root) return -Infinity
  if (root.left === null && root.right === null) return root.val // Leaf Node: root.left === null && root.right === null
  const leftVal = maxPathSum(root.left)
  const rightVal = maxPathSum(root.right)
  return root.val + Math.max(leftVal, rightVal)
}

console.log(iterativeDepthFirstValues(a))
console.log(recursiveDepthFirstValues(a))

console.log(breadthFirstValues(a))

console.log(iterativeIncludes(a, 'C')) // Should return true
console.log(iterativeIncludes(a, 'G')) // Should return false

console.log(recursiveIncludes(a, 'C'))
console.log(recursiveIncludes(a, 'G'))

const num1 = new Node(11)
const num2 = new Node(35)
const num3  = new Node(12)
const num4 = new Node(6)
const num5  = new Node(3)
const num6  = new Node(2)

num1.left = num2
num1.right = num3
num2.left = num4
num2.right = num5
num3.right = num6

//      11
//    /   \
//   35    12
//  /  \    \
// 6    3    2

console.log(recursiveTreeSum(num1)) // Should be 69
console.log(iterativeTreeSum(num1)) // Should be 69
console.log(minTreeValue(num1)) // Should be 2
console.log(recursiveMinTreeValue(num1)) // Should be 2
console.log(maxPathSum(num1)) // Should be 52

console.log(reverseBinaryTree(a))