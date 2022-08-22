# Constructors
```dart
class Person {
  String? name;
  int? age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}
```
Shorthand:
```dart
class Person {
  String? name;
  int? age;

  Person({ this.name, this.age });
}
```

## Positional vs Named arguments

### Positional:
```dart
class Person {
  String? name;
  int? age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}
var mikey = Person('Mikey', 26)
```
### Named (Order doesn't matter):
```dart
class Person {
  String? name;
  int? age;

  Person({ String name, int age }) {
    this.name = name;
    this.age = age;
  }
}
var mikey = Person(age: 26, name: 'Mikey')
```

