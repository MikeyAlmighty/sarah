class Queue {
  constructor(){
    this.storage = []
  }

  enqueue = (element) => this.storage.push(element)

  dequeue = () => this.storage.shift() // this is an O(n) time complexity, use a linkedList to get O(1)

  peek = () => this.storage.length > 0 ? this.storage[0] : null

  size = () => this.storage.length

  isEmpty = () => this.storage.length === 0 ? true : false
}

const videoGameQueue = new Queue()

videoGameQueue.enqueue('DeadPool')
videoGameQueue.enqueue('The Witcher 3')
videoGameQueue.enqueue('Doom')
console.log(videoGameQueue.storage)

console.log(videoGameQueue.size()) // Should return 3
videoGameQueue.dequeue() // Should remove DeadPool
console.log(videoGameQueue.size()) // Should return 2

class AlternativeQueue {
  constructor(){
    this.storage = {}
    this.head = 0
    this.tail = 0
  }

  enqueue = (element) => {
    this.storage[this.tail] = element
    this.tail ++
  }

  dequeue = () => {
    let removed = this.storage[this.head]
    delete this.storage[this.head]
    this.head ++
    return removed
  }
}

const movieQueue = new AlternativeQueue()
movieQueue.enqueue('DeadPool')
movieQueue.enqueue('The Witcher')
movieQueue.enqueue('Doom')

console.log(movieQueue.storage)

movieQueue.dequeue()
console.log(movieQueue.storage)