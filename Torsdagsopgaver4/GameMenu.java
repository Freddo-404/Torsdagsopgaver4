import java.util.ArrayList;
import java.util.Scanner;

class GameMenu{


	
 private ArrayList<String> actions = new ArrayList<>();
	public GameMenu(ArrayList<String> arrlist){
		this.actions = arrlist;
	}

public void display(){
System.out.println(actions.get(0));
System.out.println(actions.get(1));
System.out.println(actions.get(2));
System.out.println(actions.get(3));
}

public String getAction(){
	System.out.println("Type a number to choose an action");
	display();
	Scanner scan = new Scanner(System.in);
	String choice =  scan.nextLine();
	return choice;
	}
}




