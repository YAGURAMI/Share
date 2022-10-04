import java.util.Scanner;

//Basic Initializer Operators, Computation 
class Main {
   

public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);
        
        
System.out.print("Enter 1st number: ");
       
int num1 = sc.nextInt();
        
System.out.print("Enter 2nd number: ");
        
int num2 = sc.nextInt();
        
        

System.out.println("______________________"+"\n"+"Sum: "+(num1+num2)+"\n"+"Product: "+(num1*num2)+"\n"+"Subtrahend: "+(num1-num2)+"\n"+"Division: "+(num1/num2)+"\n"+"Remainder: "+(num1%num2));
    
}

}