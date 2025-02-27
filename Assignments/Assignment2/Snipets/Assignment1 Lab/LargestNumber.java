class LargestNumber{
public static void main(String[] args){
int a = 13;
int b = 46;
int c = 25;
 if(a>b)  //13>46
{
if(a>c)  //13>25
{
System.out.println("largest number is:" +a);    //this block will not execute because condition not satisfied
}
else{
System.out.println("largest number is:" +c);
}
}
else
{
if(b>c)  //46>25
{
System.out.println("largest number is:" +b);
}
else{
System.out.println("largest number is:" +c);
}
}
}
}