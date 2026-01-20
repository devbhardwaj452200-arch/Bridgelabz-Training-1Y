import java.util.*;

class SimpleIntrest{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Principle Amount: ");
double Principle=sc.nextDouble();
System.out.println("Enter Rate: ");
double Rate=sc.nextDouble();
System.out.println("Enter Time: ");
double Time=sc.nextDouble();
double SimpleInterest=(Principle*Rate*Time)/100;
System.out.println("SimpleInterest="+SimpleInterest);}}