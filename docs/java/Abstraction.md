# Abstraction

- Reduce complexity by hiding unnecessary details in our classes.

Say for example the below `Browser` class
both `findIpAddress` and `sendHttpRequest` are private.
So if in the future we ever, let's say added another argument to one of these: we **ONLY** have to update it within this class.
Any other place instantiating the `Broswer` class does **NOT** have to update it.

```java
public class Browser {
    public void navigate(String address) {
        String ip = findIpAddress(address, true);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    private String sendHttpRequest(String ip) {
        return "<html></html>";
    }

    private String findIpAddress(String address, boolean cache) {
        return "127.0.0.1";
    }
}
```