from ast import Num
import pytest

def test_addition():
    num1 = 20
    num2 = 30
    sum = num1 + num2
    assert sum == 50

def test_subtraction():
    num1 = 30
    num2 = 15
    diff = num1 - num2
    assert diff == 15

def test_multiply():
    num1 = 2
    num2 = 3
    prod = num1*num2
    assert prod == 6

def test_multiply():
    num1 = 6
    num2 = 3
    div = num1/num2
    assert div == 2