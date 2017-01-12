# scalajs-stacktrace

## Introduction

scalajs-stacktrace is a Scala.js wrapper over [stacktrace-js](https://www.stacktracejs.com/).

When combined with the `window.onerror` function, it is useful for sending client side
errors to your backend.


## Installation

```sbt
libraryDependencies ++= Seq(
  "org.mdedetrich" %%% scalajs-stacktrace % "0.1.0-SNAPSHOT"
)
```

## Todo

- [ ] Generate properly typed opts object in constructors
- [ ] Implement `instrument`/`deinstrument`
- [ ] Tests
