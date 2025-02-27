class Numberofdigits

{
public static void main(String[] args){
int num = 123456, count = 0;
for(; num!=0; num /= 10, count++){
}
System.out.println("Number of digits:" + count);
}
}