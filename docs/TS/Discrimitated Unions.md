# Discriminated Unions

[TS Discriminated Unions](https://css-tricks.com/typescript-discriminated-unions/)

Given the following interfaces:
```ts
interface Cat {
  weight: number;
  whiskers: number;
}
interface Dog {
  weight: number;
  friendly: boolean;
}
let animal: Dog | Cat;
```
…many developers are surprised (and maybe even angry) to discover that when they do animal., only the weight property is valid, and not whiskers or friendly. 

See [Nominal vs Structural Typing](./Nominal%20vs%20Structural%20Typing.md)


```ts
interface Cat {
  weight: number;
  whiskers: number;
  ANIMAL_TYPE: "CAT";
}
interface Dog {
  weight: number;
  friendly: boolean;
  ANIMAL_TYPE: "DOG";
}
```

And now our check becomes a bit more reliable:
```ts

let animal: Dog | Cat = {} as any;

if (animal.ANIMAL_TYPE === "DOG") {
  console.log(animal.friendly);
} else {
  console.log(animal.whiskers);
}
```