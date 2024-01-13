
# LeetCode Challenge D24

## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [2259.  Remove Digit From Number to Maximize Result](https://leetcode.com/problems/remove-digit-from-number-to-maximize-result/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement

Given a string  `number`  representing a  **positive integer**  and a character  `digit`, return  _the resulting string after removing  **exactly one occurrence**  of_ `digit` _from_ `number` _such that the value of the resulting string in  **decimal**  form is  **maximized**_. The test cases are generated such that  `digit`  occurs at least once in  `number`.


**Example**


> **Input:** number = "123", digit = "3"
> 
> **Output:** "12"
> 
> **Explanation:** There is only one '3' in "123". After removing '3', the result is "12".

**Language Used**
> Java

**Difficulty**
> Easy

## Solution Overview
The `removeDigit` method takes two parameters: the original number as a string (`number`) and the digit to be removed (`digit`). The code iterates through each digit in the number, checking if it matches the specified digit. If a match is found, it sets a reference index to that position. Crucially, it then verifies if the digit at the current position is followed by a larger digit, because it might result in a larger number when the digit is removed, than the initial position (For example 12314 and digit is 1). If so, it breaks out of the loop, ensuring that the rightmost occurrence of the digit is identified. Finally, it constructs and returns a new string by removing the identified rightmost occurrence, effectively maximizing the resulting value.

In simpler terms, this code looks through the given number to find the rightmost occurrence of a specified digit, considering situations where the digit is followed by a larger digit. Once it identifies the rightmost occurrence, it removes that digit, creating a new number that should be larger when interpreted in decimal form.
