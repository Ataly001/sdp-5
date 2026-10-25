# Smart Calculator — Strategy Pattern

## 1. Project Description

Smart Calculator is a simple Java console application that uses the Strategy Design Pattern.

The user can choose different mathematical operations and switch between them while the program is running.

The project also includes basic error handling.

## 2. Features

- Addition
- Subtraction
- Multiplication
- Division
- Power
- Error handling for division by zero
- Validation of user input
- Switching operations at runtime

## 3. Technologies

- Java JDK 17
- IntelliJ IDEA
- Strategy Design Pattern

## 4. Project Structure

```text
src/
├── Main.java
├── Calculator.java
├── OperationStrategy.java
├── AddStrategy.java
├── SubtractStrategy.java
├── MultiplyStrategy.java
├── DivideStrategy.java
└── PowerStrategy.java
```

## 5. How to Run

1. Clone or download the GitHub repository.
2. Open the project in IntelliJ IDEA.
3. Make sure JDK 17 is selected.
4. Open `Main.java`.
5. Click Run.

You can also run the project from the terminal:

```bash
javac -d out src/*.java
java -cp out Main
```

## 6. How Strategy Pattern Works

The project has three main components:

- **Strategy Interface:** `OperationStrategy` defines the `execute()` method.
- **Concrete Strategies:** Each strategy implements a mathematical operation.
- **Context:** `Calculator` stores the current strategy and executes it.

The `Main` class selects the strategy using `setStrategy()`.

## 7. How to Add a New Strategy

To add a new operation:

1. Create a new class that implements `OperationStrategy`.
2. Implement the `execute()` method.
3. Add the new operation to the menu in `Main.java`.
4. Use `setStrategy()` to select it.

There is no need to change the `Calculator` class.

## 8. Error Handling

The calculator handles invalid number input, division by zero, and invalid calculation results.

If an error occurs, the program displays an error message and allows the user to try again.

## 9. Conclusion

This project demonstrates how the Strategy Pattern makes code more flexible and easier to extend. New mathematical operations can be added without changing the Calculator class.