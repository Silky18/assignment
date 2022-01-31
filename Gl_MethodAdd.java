import java.util.Scanner;

class Gl_MethodAdd {

//performAddition method
public int performAddition(int num1, int num2) {
return num1+num2;
}

//main method
public static void main(String[] args) {

//create object of main class
Gl_MethodAdd main = new Gl_MethodAdd();
int num1,num2,result;

//take input of num1, num2
Scanner sc=new Scanner(System.in);
System.out.println("Enter two no.s");
num1=sc.nextInt();
num2=sc.nextInt();

//call performAddition method and store result in a variable
result = main.performAddition(num1,num2);

//display the result.
System.out.println("sum of two no is:"+result);

}
}
