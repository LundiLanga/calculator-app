
# Calculator Project ###

This project is a simple calculator implemented using Test-Driven Development (TDD) with JUnit. It includes functions for addition and multiplication, both for two numbers and multiple numbers, with corresponding unit tests to ensure correctness.

## Project Features

- Addition function: Supports adding two or more numbers.
- Multiplication function: Supports multiplying two or more numbers.
- JUnit Testing: All functions are implemented following TDD principles, ensuring 
  reliability.
## Project Requirements
### 1. Addition Function (addTwoNumbers)  
- Implemented a function to add two integers:
- addTwoNumbers(1, 2);  // Returns 3
- addTwoNumbers(-1, -1);  // Returns -2

Wrote unit tests before implementing the function.
Ensured all test cases pass successfully.

![addTwoNumbersTestS](https://github.com/user-attachments/assets/f9e18a38-a96e-44c2-9433-74d1cb76726f)
![addTwoNumbersTest](https://github.com/user-attachments/assets/163abc83-ab37-4b40-a290-18bc9c162d37)


### 2. Addition of Multiple Numbers (addMultipleNumbers)
Extended the addition function to support multiple integers:
- addMultipleNumbers(1, 2, 3, 4, 5);  // Returns 15
- addMultipleNumbers(1, 2);  // Returns 3
- addMultipleNumbers(-1, -1);  // Returns -2
Function does not accept arrays or lists, only individual numbers.

![addMultipleNumbersTestS](https://github.com/user-attachments/assets/a202d3c9-63de-4400-88c4-32fc9634f092)
![addMultipleNumbersTest](https://github.com/user-attachments/assets/49dc9c46-af13-4861-acdc-a753cfc6044c)

### 3. Multiplication Function (multiplyTwoNumbers)
Implemented a function to multiply two integers:
- multiplyTwoNumbers(1, 3);  // Returns 3
- multiplyTwoNumbers(-1, 3);  // Returns -3
Wrote unit tests before implementing the function.
Ensured all test cases pass successfully.

![multiplyTwoNumbersTestS](https://github.com/user-attachments/assets/70f441fe-d4d3-4bbb-ae1f-d8e171047ed1)
![multiplyTwoNumbersTest](https://github.com/user-attachments/assets/d46d705d-1116-462e-918e-41beffd7f3f0)

### 4. Multiplication of Multiple Numbers (multiplyMultipleNumbers)
Extended the multiplication function to support multiple integers:
- multiplyMultipleNumbers(1, 2, 3, 4, 5);  // Returns 120
- multiplyMultipleNumbers(1, 3);  // Returns 3
- multiplyMultipleNumbers(-1, 3);  // Returns -3
Ensured all test cases pass successfully.

![multiplyMultipleNumbersTestS](https://github.com/user-attachments/assets/616c342f-22a8-4d40-8fae-a4a02da84bad)
![multiplyMultipleNumbersTest](https://github.com/user-attachments/assets/d8e2b34e-e8f8-4dcd-81b9-e6e91c7985a2)

### How to Run the Project

1. Clone the repository.
2. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse, or VSCode).
3. Ensure JUnit is installed.
4. Run the test cases to validate the implementation.

### Conclusion

This project demonstrates the use of TDD in building a simple calculator, ensuring the correctness of addition and multiplication functions through rigorous testing.




