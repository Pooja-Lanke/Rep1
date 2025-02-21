import java.util.Scanner;
class Calculator{
public static void main(String [] args){
char operator;
Double num1, num2, result;
Scanner in = new Scanner(System.in);
System.out.println("Choose an operater: +, -, *, /");
operator = in.next().charAt(0);
System.out.println("Enter first number");
num1 = in.nextDouble();
System.out.println("Enter second number");
num2 = in.nextDouble();
switch(operator) {
case '+' :
result = num1 + num2;
System.out.println(num1 + " + " + num2 + " = " + result);
break;
case '-' :
result = num1 - num2;
System.out.println(num1 + " - " + num2 + " = " + result);
break;
case '*' :
result = num1 * num2;
System.out.println(num1 + " * " + num2 + " = " + result);
break;
case '/' :
result = num1 / num2;
System.out.println(num1 + " / " + num2 + " = " + result);
break;
default:
System.out.println("Invalid Operator!");
break;
}
}
}











