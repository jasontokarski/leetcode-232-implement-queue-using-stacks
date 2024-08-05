# Implement Queue using Stacks

This project provides a solution to LeetCode problem 232: [Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/description/). The solution is implemented in Java and uses Gradle for build automation.

## Problem Description

Implement a first in first out (FIFO) queue using only stacks.

Implement the `MyQueue` class:

- `void push(int x)` Pushes element x to the back of the queue.
- `int pop()` Removes the element from the front of the queue and returns it.
- `int peek()` Returns the element at the front of the queue.
- `boolean empty()` Returns true if the queue is empty, false otherwise.

Notes:

- You must use only standard Java libraries.
- The queue should be implemented using two stacks.

## Project Structure

- `src/main/java/`: Contains the main source code for the project.
  - `MyQueue.java`: Contains the implementation of the `MyQueue` class.
- `src/test/java/`: Contains the test cases for the project.
  - `MyQueueTest.java`: Contains unit tests for the `MyQueue` class.
- `build.gradle`: Gradle build configuration file.

## Getting Started

### Prerequisites

- Java 11 or higher
- Gradle 6.0 or higher

### Building the Project

To build the project, navigate to the project root directory and run:

```sh
gradle build
