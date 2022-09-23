# Nominal Typing
(Java, C++ etc.)
```java
class Foo {
  public int x;
}
class Blah {
  public int x;
}
```

Even though Foo and Blah are structured exactly the same, they cannot be assigned to one another. The following code:

`Blah b = new Foo();`
Generates this error:

`Cannot implicitly convert type 'Foo' to 'Blah'`
The structure of these classes is irrelevant. A variable of type Foo can only be assigned to instances of the Foo class (or subclasses thereof).

`TypeScript` operates the **opposite** way.
TypeScript considers types to be compatible if they have the same structure—hence the name, structural typing.

# Structural Typing
So, the following runs without error (In TS):

```ts
class Foo {
  x: number = 0;
}
class Blah {
  x: number = 0;
}
let f: Foo = new Blah();
let b: Blah = new Foo();
```