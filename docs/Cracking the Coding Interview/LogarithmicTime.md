# Logarithmic Time O(log n)

## Recursive function:
```typescript
const logFunc = (n: number): number => {
  if (n === 1) return 1
  return logFunc( Math.floor(n/2))
}
```

## Non Recursive function can also have Logarithmic time:
```typescript
const logFunc = (n: number) => {
  while(n > 1){
    n = Math.floor(n/2)
  }
  return
}
```


When traversing the **height** of a balanced binary tree, it's in Logarithmic time.