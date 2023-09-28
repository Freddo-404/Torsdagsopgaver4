import java.util.Scanner;

class MainS{

public static void main(String [] args){

System.out.println("Please type your name");

Scanner scanner = new Scanner(System.in);
String input =  scanner.nextLine();

System.out.println("Please type your age");

int age =  scanner.nextInt();
System.out.println(age);

int ret = 67-age; 
System.out.println("You may retire in " + ret+" years");

}
}