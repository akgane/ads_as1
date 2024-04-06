# Overview

This project was done as part of *assignment 
1* of the **Algorithms and Data Structures** course. 
My work represents the realization of 10 methods:
finding the minimum element of an array, 
finding the average, checking a number for prime,
finding the factorial of a number, the nth 
number of a Fibonacci sequence, finding the 
nth power of a number, reversing the order of 
an array, checking a string for a digit, 
finding the binomial coefficient, and 
finding GCD.

## How to Use

1. Clone repository to your local machine.
2. Open the project in **Intellij IDEA** or any other ***Java*** IDE.
3. Compile and run file **MyApplication.java**.
4. Follow the on-screen instructions: *choose method*, *input required parameters*.
5. The output for chosen method will be displayed in *terminal*.</br>
**5.1** As standard, program waits 2.5 seconds after showing the result. However, you can change this time to the time you need, by changing the following line:</br>
```
        Utils.sleep(2.5f);
```
in ***MyApplication*** class, ***chooseMethod()*** method.
Where 2.5f is the amount of seconds, to be waited after outputting result. 

## Available of Methods

| **Return type** | **Method header**         | **Description**                                         |
|-----------------|---------------------------|---------------------------------------------------------|
| **int**         | *minElement(int[] arr)*   | Find the minimum element of an array.                   |
| **float**       | *average(int[] arr)*      | Calculates the average of an array.                     |
| **boolean**     | *isPrime(int n)*          | Checks if a number is prime (**true** if prime).        |
| **int**         | *factorial(int n)*        | Calculates the factorial of a number.                   |
| **int**         | *fibonacci(int n)*        | Calculates the n-th number in the Fibonacci sequence.   |
| **int**         | *power(int a, int n)*     | Calculates the number ***a*** to a power of ***n***.    |
| **int[]**       | *reverseArray(int[] arr)* | Reverses an array.                                      |
| **boolean**     | *isDigit(String s)*       | Checks if a string contains only digits.                |
| **int**         | *binomial(int n, int k)*  | Calculates the binomial coefficient of two numbers.     |
| **int**         | *gcd(int a, int b)*       | Finds the GCD (greatest common divisor) of two numbers. |
