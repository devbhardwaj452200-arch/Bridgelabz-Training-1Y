import java.util.*;
class VolumeOfCylinder{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
double pi=3.14;
System.out.println("Enter radius: ");
int radius=sc.nextInt();
System.out.println("Enter height: ");
int height=sc.nextInt();
double volume=pi*radius*radius*height;
System.out.println("Volume of Cylinder="+volume);}}