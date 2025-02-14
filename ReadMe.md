
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

![AddTwoNumbersTest](https://github.com/user-attachments/assets/cfb63796-ba34-4fe2-880f-b91fa88dd963)
![AddMultipleNumbersTestS](https://github.com/user-attachments/assets/306d70a2-97fb-4cc6-852e-b95bddd2caec)

### 2. Addition of Multiple Numbers (addMultipleNumbers)
Extended the addition function to support multiple integers:
- addMultipleNumbers(1, 2, 3, 4, 5);  // Returns 15
- addMultipleNumbers(1, 2);  // Returns 3
- addMultipleNumbers(-1, -1);  // Returns -2
Function does not accept arrays or lists, only individual numbers.

![AddMultipleNumbersTest](https://github.com/user-attachments/assets/d93b1a87-bcc1-4bf2-84f9-982432e058df)

![AddTwoNumbersTestS](https://github.com/user-attachments/assets/6d63f094-499b-4a70-8ae0-c62e8d42e7bd)

### 3. Multiplication Function (multiplyTwoNumbers)
Implemented a function to multiply two integers:
- multiplyTwoNumbers(1, 3);  // Returns 3
- multiplyTwoNumbers(-1, 3);  // Returns -3
Wrote unit tests before implementing the function.
Ensured all test cases pass successfully.

![MultiplyTwoNumbersTest](https://github.com/user-attachments/assets/8229f56d-0b23-419f-8a0e-df67ce451505)

![MultiplyTwoNumbersTestS](https://github.com/user-attachments/assets/baefbbb9-cb2d-4c42-af80-6679f058f538)

### 4. Multiplication of Multiple Numbers (multiplyMultipleNumbers)
Extended the multiplication function to support multiple integers:
- multiplyMultipleNumbers(1, 2, 3, 4, 5);  // Returns 120
- multiplyMultipleNumbers(1, 3);  // Returns 3
- multiplyMultipleNumbers(-1, 3);  // Returns -3
Ensured all test cases pass successfully.

![MultiplyMultipleNumbersTest](https://github.com/user-attachments/assets/8a541d51-88a6-4e89-87cb-86c038d3849c)

![MultiplyMultipleNumbersTestS](https://github.com/user-attachments/assets/79fa4eb0-e5be-4a4d-9f5e-6b708bea408d)

### How to Run the Project

1. Clone the repository.
2. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse, or VSCode).
3. Ensure JUnit is installed.
4. Run the test cases to validate the implementation.

### Conclusion

This project demonstrates the use of TDD in building a simple calculator, ensuring the correctness of addition and multiplication functions through rigorous testing.




