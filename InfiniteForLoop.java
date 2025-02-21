//Q.1 Assignment 3

class InfiniteForLoop { 
    public static void main(String[] args) { 
        
for (int i = 0; i < 10; i--) { 
            System.out.println(i); 
        } 
    } 
} 

This for loop runs infinitely because of we decrement i variable so loop not be satisfied in the given condition.


Corrected code:

class InfiniteForLoop { 
    public static void main(String[] args) { 
        
for (int i = 0; i < 10; i++) { 
            System.out.println(i); 
        } 
    } 
} 


//Output:
0
1
2
3
4
5
6
7
8
9