public class Team{
	// attributter
private String name;
private int rank;
private String players;

public Team(String name){
	this.name = name;
	
}
public void setRank(int rang){
this.rank=rang;
	}

	public String toString(){
		String s = "Hold: "+ name+" Rang: "+rank;
			return s;

	}
}