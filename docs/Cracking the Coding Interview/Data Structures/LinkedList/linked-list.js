class Node {
  constructor(val){
    this.val = val
    this.next = null
  }
}

// Simply prints the linkedList values
const iterativePrintLinkedList = (headNode) => {
  let current = headNode
// When writing logic (I.e traversal) for a linkedList, try and work with `current`, NOT current.next === null as it will exclude the tail
  while (current !== null){
    console.log(current.val)
    current = current.next
  }
}

// Simply prints the linkedList values
const recursivePrintLinkedList = (headNode) => {
  if (headNode === null) return
  console.log(headNode.val)
  recursivePrintLinkedList(headNode.next)
}

// Retrieves the linkedList values inside an array
const iterativetGetLinkedListValues = (headNode) => {
  const result = []
  let current = headNode
  while (current !== null) {
    result.push(current.val)
    current = current.next
  }
  return result
}

// Retrieves the linkedList values inside an array
const recursiveGetLinkedListValues = (headNode) => {
  const result = []
  fillValues(headNode, result)
  return result
}
const fillValues = (head, values) => {
  if (head === null) return
  values.push(head.val)
  fillValues(head.next, values)
}

// Returns the Sum of each node's value.
const sumLinkedList = (headNode) => {
  let sumResult = 0
  let current = headNode
  while (current !== null) {
    sumResult += current.val
   current = current.next
  }
  return sumResult
}

// Returns boolean if List contains target value
const linkedListContains = (headNode, target) => {
  let current = headNode
  while (current !== null) {
    if (current.val === target) return true
    current = current.next
  }
  return false
}

// Retrieves the value at the given targetIndex
const valueAtIndex = (headNode, targetIndex) => {
  let currentIndex = 0
  let current = headNode
  while (current !== null) {
    if (currentIndex === targetIndex) return current.val
    currentIndex += 1
    current = current.next
  }
}

// A -> B -> C
// 1st prev = null, next = B,

// Reverse linkedList
const iterativeReverseLinkedList = (headNode) => {
  let prev = null
  let current = headNode
  while (current !== null) {
    const next = current.next
    current.next = prev
    prev = current
    current = next
  }
  return prev
}

// Reverse linkedList
const recursiveReverseLinkedList = (headNode, prev = null) => {
  if (headNode === null) return prev
  const next = headNode.next
  recursiveReverseLinkedList(next, headNode)
}


const a = new Node('A')
const b = new Node('B')
const c = new Node('C')
const d = new Node('D')

a.next = b
b.next = c
c.next = d

const num1 = new Node(27)
const num2 = new Node(69)
const num3 = new Node(420)
const num4 = new Node(4)

num1.next = num2
num2.next = num3
num3.next = num4

iterativePrintLinkedList(a)
recursivePrintLinkedList(a)

console.log(iterativetGetLinkedListValues(a))
console.log(recursiveGetLinkedListValues(a))
console.log(sumLinkedList(num1))
console.log(linkedListContains(num1, 420)) // Should return true
console.log(linkedListContains(a, 'G')) // Should return false
console.log(valueAtIndex(a, 2)) // Should return C
console.log(valueAtIndex(num1, 3)) // Should return 4
console.log(iterativeReverseLinkedList(num1))
console.log(recursiveReverseLinkedList(num1))
