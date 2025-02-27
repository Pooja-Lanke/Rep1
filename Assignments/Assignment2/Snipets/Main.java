//Q.1 Assignment 2(Snippets)
public class Main { 
    public void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
} 


//error: in Main method is not static in class Main


Corrected code:


public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
} 


2.

public class Main { 
    static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
} 

Error: Main method not found in class Main


corrected code:

public class Main { 
   public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
} 


3.
public class Main { 
    public static int main(String[] args) { 
        System.out.println("Hello, World!"); 
        return 0; 
    } 
}


Error: Main method must return a value of type void in class Main



corrected code:

public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
         
    } 
}

4.
public class Main { 
    public static void main() { 
        System.out.println("Hello, World!"); 
    } 
}

Error:Main method not found in class Main


corrected code:
public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
}

5.
public class Main { 
    public static void main(String[] args) { 
        System.out.println("Main method with String[] args"); 
    } 
    public static void main(int[] args) { 
        System.out.println("Overloaded main method with int[] args"); 
    } 
} 

Yes,we can have multiple main methods with different types of input parameter.


6. 
public class Main { 
    public static void main(String[] args) { 
        int x = y + 10; 
        System.out.println(x); 
    } 
} 


we will get error: cannot find symbol, because we have not declare and define variable y.



coreected code:
public class Main { 
    public static void main(String[] args) { 
        int y = 5;    
        int x = y + 10; 
        System.out.println(x); 

    } 
} 


7. 
public class Main { 
    public static void main(String[] args) { 
        int x = "Hello"; 
        System.out.println(x); 
    } 
}


we will get  error: incompatible types: String cannot be converted to int, we cannnot assign string value to int variable.



corrected code:
public class Main { 
    public static void main(String[] args) { 
        int x = 5;
        string str = "Hello"; 
        System.out.println(x); 
    } 
}

8.
public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!" 
    } 
} 

Ans : closing bracket and semi colon is missing, its an compiler error. Compilation will get terminate.

corrected code:

public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
} 

9.

public class Main { 
    public static void main(String[] args) { 
        int class = 10; 
        System.out.println(class); 
    } 
} 

Ans : we can't use reserved keywords as a user defined varibale name

corrected : 

public class Main { 
    public static void main(String[] args) { 
        int num= 10; 
        System.out.println(num); 
    } 
} 

10. 

public class Main { 
    public void display() { 
        System.out.println("No parameters"); 
    } 
    public void display(int num) { 
        System.out.println("With parameter: " + num); 
    } 
    public static void main(String[] args) { 
        display(); 
        display(5); 
    } 
} 

ans:  non-static method display() cannot be referenced from a static context

corrected :


public class Main { 
    public static void display() { 
        System.out.println("No parameters"); 
    } 
    public static void display(int num) { 
        System.out.println("With parameter: " + num); 
    } 
    public static void main(String[] args) { 
        display(); 
        display(5); 
    } 
} 

11. 

public class Main { 
    public static void main(String[] args) { 
        int[] arr = {1, 2, 3}; 
        System.out.println(arr[5]); 
    } 
} 

Ans : we will get this ArrayIndexOutOfBoundsException, because we only have array of 3 index but in print we are trying to get the value of index 5.

corrected :

public class Main { 
    public static void main(String[] args) { 
        int[] arr = {1, 2, 3}; 
        System.out.println(arr[2]); 
    } 
} 

12. 

public class Main { 
    public static void main(String[] args) { 
        while (true) { 
            System.out.println("Infinite Loop"); 
        } 
    } 
}

ans : it will go infinte loop because every time in while condition is true so will run infinite time. to avoid this we can write condition to break the loop.

public class Main { 
    public static void main(String[] args) { 
        int i=0;
        while (i!=5) { 
            System.out.println("Infinite Loop"); 
            i++;
        } 
    } 
}

13 .

public class Main { 
    public static void main(String[] args) { 
        String str = null; 
        System.out.println(str.length()); 
    } 
} 

Ans: we will get NullPointerException, it will occur because we have assign str to null and on null object we are trying to get the length of string. 

corrected :


public class Main { 
    public static void main(String[] args) { 
        String str = "abc";
        System.out.println(str.length()); 
    } 
}

14. 

public class Main { 
    public static void main(String[] args) { 
        double num = "Hello"; 
        System.out.println(num); 
    } 
} 

ans: error: incompatible types: String cannot be converted to double

corrected : 


public class Main { 
    public static void main(String[] args) { 
        String num = "Hello"; 
        System.out.println(num); 
    } 
} 

15. 

public class Main { 
    public static void main(String[] args) { 
        int num1 = 10; 
        double num2 = 5.5; 
        int result = num1 + num2; 
        System.out.println(result); 
    } 
}

//Ans:  we will get incompatible types: possible lossy conversion from double to int, we can handle this situation by defining int result to double result.

corrected : 

public class Main { 
    public static void main(String[] args) { 
        int num1 = 10; 
        double num2 = 5.5; 
        double result = num1 + num2; 
        System.out.println(result); 
    } 
} 

16. 

public class Main { 
    public static void main(String[] args) { 
        int num = 10; 
        double result = num / 4; 
        System.out.println(result); 
    } 
}

//Ans: the result will be 2.0. 

17. 

public class Main { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = a ** b; 
        System.out.println(result); 
    } 
} 

Ans: we will get error: illegal start of expression,

corrected :

public class Main { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = a * b; 
        System.out.println(result); 
    } 
} 


18.

public class Main { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = a + b * 2; 
        System.out.println(result); 
    } 
} 

Ans: we will get 20 as a answer because as per BODMAS rule multiplications precedence is higher than addition.

19. 

public class Main { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 0; 
        int result = a / b; 
        System.out.println(result); 
    } 
} 

Ans : we will get ArithmeticException because its not possible to divide any number by zero in mathematics.

corrected : 
 

public class Main { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = a / b; 
        System.out.println(result); 
    } 
} 

20.

public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World") 
    } 
} 

//Ans :  error: ';' expected



public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World"); 
    } 
} 

21.

public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    // Missing closing brace here
 
}

Ans : error: reached end of file while parsing

public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    }
 
}

22. 

public class Main { 
    public static void main(String[] args) { 
        static void displayMessage() { 
            System.out.println("Message"); 
        } 
    } 
} 

Ans : error: illegal start of expression, we can't declare method inside the method.

corrected :

public class Main { 
    public static void main(String[] args) { 
        displayMessage();
    } 
    static void displayMessage() { 
            System.out.println("Message"); 
    } 
}


23.

public class Main { 
    public static void main(String[] args) { 
        int value = 2; 
        switch(value) { 
            case 1: 
                System.out.println("Value is 1"); 
            case 2: 
                System.out.println("Value is 2"); 
                 break;

             case 3: 
                System.out.println("Value is 3"); 
            default: 
                System.out.println("Default case"); 
        } 
    } 
} 

Ans:we can avoid execution of default by placing break in case 2.



24.
public class MissingBreakCase { 
    public static void main(String[] args) { 
        int level = 1; 
        switch(level) { 
            case 1: 
                System.out.println("Level 1"); 
            case 2: 
                System.out.println("Level 2"); 
            case 3: 
                System.out.println("Level 3"); 
            default: 
                System.out.println("Unknown level"); 
        } 
    } 
}

Ans:it will print all the level because break not initialized after each case.
break is used to to terminate switch cases.

25.

public class Switch { 
    public static void main(String[] args) { 
        double score = 85.0; 
        switch(score) { 
            case 100: 
                System.out.println("Perfect score!"); 
                break; 
            case 85: 
                System.out.println("Great job!"); 
                break; 
            default: 
                System.out.println("Keep trying!"); 
        } 
    } 
} 


we will  get error: incompatible types: possible lossy conversion from double to int, we can use only int with the case can't use double.

corrected code:

public class Switch { 
    public static void main(String[] args) { 
        int score = 85; 
        switch(score) { 
            case 100: 
                System.out.println("Perfect score!"); 
                break; 
            case 85: 
                System.out.println("Great job!"); 
                break; 
            default: 
                System.out.println("Keep trying!"); 
        } 
    } 
} 







26.
public class Switch { 
    public static void main(String[] args) { 
        int number = 5; 
        switch(number) { 
            case 5: 
                System.out.println("Number is 5"); 
 
 
                break; 
            case 5: 
                System.out.println("This is another case 5"); 
                break; 
            default: 
                System.out.println("This is the default case"); 
        } 
    } 
}

error: duplicate case label, in case statement we can't have the same case condition in single switch case statement.


corrected code:
public class Switch { 
    public static void main(String[] args) { 
        int number = 5; 
        switch(number) { 
            case 4: 
                System.out.println("Number is 5"); 
 
 
                break; 
            case 5: 
                System.out.println("This is another case 5"); 
                break; 
            default: 
                System.out.println("This is the default case"); 
        } 
    } 
}





