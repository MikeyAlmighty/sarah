# Interview Prep

## JSX
Rendering logic is coupled with other UI Logic (How events are handled, how state changes over time, how data is prepared for display).
Describes what the UI should look like
Uses react.CreateElement under the hood

## Why className vs class
class is reserved word in JS (JSX gets transpiled into JS)

## Data flow is uni-directional
Pass data down via props
State management

## Ternary vs AND operator
Use Ternary
.length is 0, false && ....

## Virtual-DOM

Virtual DOM only updates necessary changes

React DOM
- Directly update HTML
- Creates a new DOM if element updates
- Too much memory wastage
- Updates slow
- DOM manipulation is expensive

Virtual DOM
- Can't Directly update HTML
- Updates JSX if element updates
- No memory wastage
- Updates faster than Real DOM
- DOM manipulation is easy

## Advantages of React
- Increases application performance
- Used client side and server side
- JSX code readability

## Limitations of React
- Just a library not a framework
- Large library
- Coding gets complex with inline JSX

Browser can't read JSX (Only JS), need to use a transformer (Babel) to transform JSX to JS

## React Component LifeCycle:
1. Initial rendering phase (About to get added to DOM)
2. Updating phase (Rendered on DOM, potentially update + re-render)
3. Unmounting phase (Destroyed and removed from DOM)

```js
componentWillMount()
componentDidMount()
componentWillReceiveProps()
shouldComponentUpdate()
componentWillUpdate()
componentDidUpdate()
componentWillUnmount()
```