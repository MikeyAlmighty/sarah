interface Cat {
  weight: number;
  whiskers: number;
}

interface Dog {
  weight: number;
  friendly: boolean;
}

let animal: Dog | Cat;

interface Cat_1 {
  weight: number;
  whiskers: number;
  ANIMAL_TYPE: "CAT";
}

interface Dog_1 {
  weight: number;
  friendly: boolean;
  ANIMAL_TYPE: "DOG";
}

let animal_1 : Dog_1 | Cat_1 = {} as any;

if (animal_1.ANIMAL_TYPE === "DOG") {
  console.log(animal_1.friendly);
} else {
  console.log(animal_1.whiskers);
}
