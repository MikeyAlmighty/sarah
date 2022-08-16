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

}

const videoGames = new Stack()
videoGames.push('Deadpool')
videoGames.push('The Witcher 3')
videoGames.push('Doom')

console.log('videoGames: ', videoGames)

console.log(videoGames.size()) // Should be 3
videoGames.pop() // Pops off Doom

console.log('videoGames: ', videoGames.peek()) // Should be The Witcher 3
console.log(videoGames.size()) // Should be 2