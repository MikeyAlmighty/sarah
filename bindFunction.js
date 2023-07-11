const person = {
  firstName: 'Dead',
  lastName: 'Pool',
}

const printName = function (country){
  console.log(this.firstName, this.lastName, ' lives in ', country)
}

const deadPool = printName.bind(person, 'Kiev') // Prints Dead Pool lives in Kiev
deadPool()

const person2 = {
  firstName: 'Aqua',
  lastName: 'Man'
}

const aquaMan = printName.bind(person2, 'Cape Town')
aquaMan() // Prints Aqua Man lives in Cape Town
// OR
const batMan = printName.bind({ firstName: 'Bat', lastName: 'Man' }, 'California')
batMan() // Prints Bat Man lives in California
