const person = {
  firstName: 'Dead',
  lastName: 'Pool',
}

const printName = function (country: string) {
  console.log(this.firstName, this.lastName, ' lives in ', country)
}

printName.apply(person, ['Kiev']) // Prints Dead Pool lives in Kiev

const person2 = {
  firstName: 'Aqua',
  lastName: 'Man'
}

printName.apply(person2, ['Cape Town']) // Prints Aqua Man lives in Cape Town
// OR
printName.apply({ firstName: 'Bat', lastName: 'Man' }, ['California']) // Prints Bat Man lives in California
// expected output: 2
