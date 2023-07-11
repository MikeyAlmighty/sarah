const bubbleSort = (array) => {
  const arr = array.slice() // Create shallow copy of array to avoid mutation (Pure Function)
  for (let i = 0; i < arr.length - 1; i++) {
    for (let j = 0; j < arr.length - 1 - i; j++) {
      if (arr[j] > arr[j + 1]) {
        const temp =  arr[j]
        arr[j] =  arr[j + 1]
        arr[j + 1] = temp
      }
    }
  }
  return arr
}

const array = [2, 19, 4, 25, 6, 520]
console.log(bubbleSort(array))
