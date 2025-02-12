
### Calculator Project ###

This is a calculator project designed to Test Driven Development (TDD) using JUnit.

#Project Requirements

1. Creating an add Function

Wrote a function named add that adds two integers:

addTwoNumbers(1, 2) // should return 3
addTwoNumbers(-1, -1) // should return -2

Wrote unit tests for this function.

Implemented the function to make the tests pass.

2. Modifying the addTwoNumbers to Support Multiple Integers addMultipleNumbers

Updated the function so it can handle multiple numbers:

addMultipleNumbers(1, 2, 3, 4, 5) // should return 15
addMultipleNumbers(1, 2) // should still return 3
addMultipleNumbers(-1, -1) // should still return -2

Ensured that the function does not accept an array or list, only individual numbers:

addMultipleNumbers([1,2,3,4])  // incorrect
addMultipleNumbers({1,2,3,4})  // incorrect
addMultipleNumbers(1,2,3,4)    // correct

Maked sure all tests pass.

3. Creating a multiply Function

Implemented a function called multiplyTwoNumbers that multiplies two integers:

multiplyTwoNumbers(1, 3) // should return 3
multiplyTwoNumbers(-1, 3) // should return -3

Wrote tests first, then implement the function.

4. Modified  multiplyTwoNumbers to Support Multiple Integers MultiplyMultipleNumbers

Updated the function to handle multiple numbers:

multiplyMultipleNumbers(1, 2, 3, 4, 5) // should return 120
multiplyMultipleNumbers(1, 3) // should still return 3
multiplyMultipleNumbers(-1, 3) // should still return -3

Ensured all test cases pass successfully.

