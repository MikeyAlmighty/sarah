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

```ts
export default trpcNext.createNextApiHandler({
  router: appRouter,
  createContext: () => null,
});
```

The context is used to pass contextual data to all router resolvers (Like If you wanted to extract auth header information and have it available to all router resolvers. Can also be used to pass Prisma Client instance).

- An endpoint is called a `procedure`;
A `procedure` can have two types of operations (`query` and `mutation`);

`Queries` are responsible for *fetching* data
`Mutations` are responsible for *making changes* to the data (server-side).


```ts
// The app's context - is generated for each incoming request
export async function createContext(opts?: trpcNext.CreateNextContextOptions) {
  // Create your context based on the request object
  // Will be available as `ctx` in all your resolvers
}
```