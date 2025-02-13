
### Calculator Project ###

This is a calculator project designed to Test Driven Development (TDD) using JUnit.

# Project Requirements

## 1. Creating an add Function

Wrote a function named add that adds two integers:
AddTwoNumbers(1, 2) // should return 3
AddTwoNumbers(-1, -1) // should return -2
Wrote unit tests for this function.
Implemented the function to make the tests pass.

 ![AddTwoNumbersTest](https://github.com/user-attachments/assets/00b1b9d7-8ca4-4391-9493-7810d65d2637)

## 2. Modifying the addTwoNumbers to Support Multiple Integers addMultipleNumbers
Updated the function so it can handle multiple numbers:
addMultipleNumbers(1, 2, 3, 4, 5) // should return 15
addMultipleNumbers(1, 2) // should still return 3
addMultipleNumbers(-1, -1) // should still return -2

Ensured that the function does not accept an array or list, only individual numbers:
addMultipleNumbers([1,2,3,4])  // incorrect
addMultipleNumbers({1,2,3,4})  // incorrect
addMultipleNumbers(1,2,3,4)    // correct

![AddMultipleNumbersTest](https://github.com/user-attachments/assets/417aab7d-cca0-448b-95cd-2b88f5498209)

## 3. Creating a multiply Function

Implemented a function called multiplyTwoNumbers that multiplies two integers:
multiplyTwoNumbers(1, 3) // should return 3
multiplyTwoNumbers(-1, 3) // should return -3
Wrote tests first, then implement the function.

 ![MultiplyTwoNumbersTest](https://github.com/user-attachments/assets/0c3de975-d814-48e8-8009-87c53949380b)

## 4. Modified  multiplyTwoNumbers to Support Multiple Integers MultiplyMultipleNumbers

Updated the function to handle multiple numbers:
multiplyMultipleNumbers(1, 2, 3, 4, 5) // should return 120
multiplyMultipleNumbers(1, 3) // should still return 3
multiplyMultipleNumbers(-1, 3) // should still return -3
Ensured all test cases pass successfully.

 ![MultiplyMultipleNumbersTest](https://github.com/user-attachments/assets/30477f43-c6d6-451b-8c07-a0f05f2b8d37)



