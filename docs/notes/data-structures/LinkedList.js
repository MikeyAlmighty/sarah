class ListNode {
    constructor(data){
        this.data = data
        this.next = null // Pointer to next node
    }
}

class LinkedList {
    // If no head is passed, head is initialized to null
    constructor(head = null) {
       this.head = head
    }

    // Number of Nodes
    size() {
        let count = 0
        let node = this.head

        while(node){
            count++
            node = node.next
        }
        return count
    }

    // Empties the list
    clear() {
        this.head = null
    }

   // Retrieves Last Node
    getLast() {
       let lastNode = this.head
        if (lastNode) {
            while(lastNode.next){
                lastNode = lastNode.next
            }
        }
        return lastNode
    }

   // Retrieves First Node
    getFirst() {
        return this.head
    }
}


const node1 = new ListNode(2)
const node2 = new ListNode(5)
node1.next = node2

const llist = new LinkedList(node1)
console.log(llist.head.next.data) // returns 5
