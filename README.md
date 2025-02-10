# Unexpected Behavior with Mutable ListBuffer in Scala

This repository demonstrates a potential issue in Scala related to mutable state. The `MyClass` uses a mutable `ListBuffer`, which can lead to unexpected behavior if not handled carefully in concurrent scenarios or with complex interactions. The solution demonstrates the use of immutable data structures to avoid these concurrency issues.