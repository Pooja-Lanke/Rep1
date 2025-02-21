//Q.2 Assignment 3 (Snippets)

/*public class IncorrectWhileCondition { 
    public static void main(String[] args) { 
        int count = 5; 
        while (count = 0) { 
            System.out.println(count); 
            count--; 
        } 
    } 
}


//we will got error incompatible type because in while loop condition not satisfied with the given input.



//Corrected code:*/
public class IncorrectWhileCondition { 
    public static void main(String[] args) { 
        int count = 5; 
        while (count != 0 ) { 
            System.out.println(count); 
            count--; 
        } 
    } 
}

Output:
5
4
3
2
1