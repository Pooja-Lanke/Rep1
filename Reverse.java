class Reverse{
public static void main(String[] args){
int num=12345, reversed = 0;
System.out.println("original number: " +num);                //12345
while(num != 0){
int digit = num%10;                                        //12345 % 10 =5
reversed = reversed * 10 + digit;                         //0*10+5=5
num /= 10;                                                //5
System.out.println("reversed number: " +reversed);      //54321    
}
}
}