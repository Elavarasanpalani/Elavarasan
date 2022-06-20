package javaprojects;

public class Dir {
	public static void main(String[] args) {
		Ways myWays=Ways.EAST;
		
	}
	public void goes(Ways we) {
		if(we==null) {
			System.out.println("you connn go that ways....");
 		}else {
 			System.out.println("you go that ways...");
 		}
		
	}

}
enum Ways{
	
	
	SOUTH,WEST,NORTH,EAST
	
}
