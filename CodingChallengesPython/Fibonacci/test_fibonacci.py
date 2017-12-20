##
# Calculate and print Fibonacci number using recursion.
# Fibonacci number is sum of previous two Fibonacci numbers fn= fn-1+ fn-2
# first 10 Fibonacci numbers are 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
##
 
import unittest

def findLength(input):
    return 
    
def test_fibonacci_4():
    assert getFibonacciNumber(4) == [1, 1, 2, 3]
    
def test_fibonacci_12():
    assert getFibonacciNumber(12) == [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144]
    
def test_fibonacci_25():
    assert getFibonacciNumber(25) == [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025]