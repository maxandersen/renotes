# renotes Project

This project is a web app using Quarkus with web bundler, htmx and  renarde to make a simple note taking app.

This branch is special as it is using JBang as a proof-of-concept to see how far it can go.

Noteworthy is that no node or npm is required to build the app. It is all done with JBang integrated in Quarkus and the Quarkus Web Bundle extension.

## How to build/run

```shell
jbang src/main/java/App.java
```

## Outstanding issues

devmode is broken due to bug in handling of multiple maven repositories.

devmode also don't seem to enable h2 devservice but might be related to the above issue.
