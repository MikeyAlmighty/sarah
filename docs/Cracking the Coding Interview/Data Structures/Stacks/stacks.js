class Stack {
  constructor(){
    this.storage = {}
    this.count = 0
  }

  push = (element) => {
    this.count++
    this.storage[this.count] = element
  }

  peek = () => {
    return this.storage[this.count]
  }

  pop = () => {
    let removed = this.storage[this.count]
    delete this.storage[this.count]
    this.count--
    return removed
  }

  size = () => {
    return this.count
  }

  isEmpty = () => {
    return this.count === 0 ? true : false
  }
}

const videoGameStack = new Stack()
console.log(videoGameStack.isEmpty()) // Should be true
videoGameStack.push('Deadpool')
console.log(videoGameStack.isEmpty()) // Should be false

videoGameStack.push('The Witcher 3')
videoGameStack.push('Doom')

console.log(videoGameStack.size()) // Should be 3
videoGameStack.pop() // Pops off Doom

console.log(videoGameStack.peek()) // Should be The Witcher 3

console.log(videoGameStack.size()) // Should be 2