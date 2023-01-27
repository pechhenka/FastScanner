# Fast Java IO

Replacement for faster input than scanner

example usage:

```java
FastScanner scanner = new FastScanner(System.in);
int x = scanner.nextInt();
String s = scanner.next();
String line = scanner.nextLine();
int[] array = scanner.nextIntArray(5);
```

Attention! Does not validate input data, which may lead to unexpected behavior
