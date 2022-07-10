# tRPC

Allows Types from server-to-client (or server-to-server) without extra overhead (read: Apollo GraphQL)

[tRPC - End-to-end typesafe APIs made easy](https://trpc.io/docs/)
[TypeScript Berlin Meetup #6 - Alex "KATT" Johansson - End-to-end typesafe APIs with tRPC](https://www.youtube.com/watch?v=qBXrwFsFK1Q)

Yikes:

```ts
import * as trpc from '@trpc/server';
const appRouter = trpc.router();

// only export *type signature* of router!
// to avoid accidentally importing your API
// into client-side code
export type AppRouter = typeof appRouter;
```