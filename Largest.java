class Largest{
public static void main(String[] args){
int a = 12;
int b = 45;
int c = 22;
 if(a>b)  //12>45
{
if(a>c)  //12>22
{
System.out.println("largest number is:" +a);    //this block will not execute because condition not satisfied
}
else{
System.out.println("largest number is:" +c);
}
}
else
{
if(b>c)  //45>22
{
System.out.println("largest number is:" +b);
}
else{
System.out.println("largest number is:" +c);
}
}
}
}