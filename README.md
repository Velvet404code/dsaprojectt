# CAT 2 
## Question 1
Big O notation is used to describe the time complexity and space complexity of an algorithm. It focuses on growth of an algorithm perforamnce as the size of input increases. It therefore:
1. It describes the upper bound by defining the maximum time algorithm could take in a worst case scenario. If an algorithm is described as O(n), the running time does not exceed a linear relationship with the input in a worst case scenario.
2. Focuses on the largest or fastest growth term as the input size increases and other terms are ignored. If time complexity of an algorithm is O(n^2+n), it is simplified to O(n^2) since n^2 dominates with increase in input.
3. Ignores constant co-efficients since it does not really affect the growth rate as (n) becomes larger. For example, O(2n) and O(3n) will be simplified to O(n) because 2 and 3 are not considered in Big-O analysis.
4. It measures the worst-case time complexity to ensure that an algorithm is not degraded in terms of performance beyond a certain point. If a worst-case complexity is O(n^2) it shows that no matter the input size, time will not exceed the worst-case.
5. Compares algorithms in terms of their efficient based on their time and space complexity with increasing input size. For example in bubble sort and merge sort, O(n^2) and O(n log n) respectively, merge sort is more efficient in handling large input sizes since it grows slower as (n) increases.

## Question 2 
In memory allocation, arrays have a fixed size which is defined during creation-stored in continuous memory, while linked lists have a flexible size stored in scattered memory allowing them to expand and shrink dynamically.
In performance, arrays have a faster access of memory becaise of direct indexing but could waste memory, while linked lists have a slower memory access due to node traversal- which uses extra memory for pointers.
In insertion and deletion operations, arrays have faster insert and removing at the end than in the middle, while in linked lists, inserting and removing at the beginning and in the middle is faster compared to the end. 
