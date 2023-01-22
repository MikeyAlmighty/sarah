# Access Modifiers

## Private

If a Base (Parent) Class has a `private` field, that field is **NOT** available in the Sub (Child) Class.

## Protected

`protected` fields/methods are accessible (exposed) for any Class within the package.
If a Class is in a `different` package it won't be able to see the protected members of another Class (in a different Package).
**HOWEVER**: If a Class in a different package (Class B), extends a Class (in a different package, Class A), `protected` members from say Class A is available (exposed) within Class A's Sub classes.

`Class B  (package com.someB)` Which contains some protected methods
`Class A (package com.someA)`

`Class A1 extends Class A` (Now we can access protected members From Class B)

### Be weary
[Generally considered as a potential code smell.](https://softwareengineering.stackexchange.com/a/162657)

## Default (No modifier)
Is public (accessible) to anything within the package but private outside (to other packages).
```java
package com.demo;

public class UIControl {
  boolean isEnabled = true;
}
```