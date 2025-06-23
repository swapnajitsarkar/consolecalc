# Java Console Calculator

A simple command-line calculator built in Java for basic arithmetic operations.

## Features

- Addition, subtraction, multiplication, and division
- Input validation and error handling
- Division by zero protection
- Menu-driven interface
- Continuous operation until user exits

## How to Run

1. **Compile the program:**
   ```bash
   javac Calculator.java
   ```

2. **Run the program:**
   ```bash
   java Calculator
   ```

## Usage

1. Choose an operation from the menu (1-5)
2. Enter two numbers when prompted
3. View the calculated result
4. Choose to continue or exit

## Key Java Concepts Demonstrated

- **Methods:** Separate methods for each arithmetic operation
- **Scanner:** User input handling
- **Loops:** While loop for continuous operation
- **Conditionals:** Switch-case and if-else statements
- **Error Handling:** Division by zero protection
- **Data Types:** Using double for decimal calculations

## Sample Output

```
=== Java Console Calculator ===
1. Addition (+)
2. Subtraction (-)
3. Multiplication (*)
4. Division (/)
5. Exit
Choose an operation (1-5): 1
Enter first number: 15.5
Enter second number: 4.3
Result: 15.50 + 4.30 = 19.80
```

## Error Handling

- Division by zero returns an error message
- Invalid menu choices prompt re-selection
- Input validation for numerical values

## Files

- `Calculator.java` - Main calculator implementation
