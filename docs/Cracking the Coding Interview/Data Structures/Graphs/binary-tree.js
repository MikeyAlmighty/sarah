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

console.log(iterativeDepthFirstValues(a))

const recursiveDepthFirstValues = (root) => {
  if (!root) return []
  const leftValues = recursiveDepthFirstValues(root.left) // [b, d, e]
  const rightValues = recursiveDepthFirstValues(root.right) // [c, f]
  return [root.val, ...leftValues, ...rightValues]
}

console.log(recursiveDepthFirstValues(a))

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

console.log(breadthFirstValues(a))