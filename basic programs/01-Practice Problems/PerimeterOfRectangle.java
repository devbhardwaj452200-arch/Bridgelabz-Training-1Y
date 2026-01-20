import java.util.*;
class PerimeterOfRectangle{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Length: ");
int Length=sc.nextInt();
System.out.println("Enter Width: ");
int Width=sc.nextInt();
int Perimeter=2*(Length+Width);
System.out.println(Perimeter);}}