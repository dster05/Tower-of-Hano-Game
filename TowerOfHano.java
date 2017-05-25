import java.util.*;
/*****************************************
Daniel J. Gallegos
******************************************/
public class TowerOfHano{
	/**Recursive method for "moving" disks.
	pre: startpeg, destPeg, tempPeg are different.
	@param n is the number of disks
	@param startPeg is the starting peg
	@param destPeg is the destination peg
	@param tempPeg is the temporary peg
	@return A string with all the required disk moves
	*/
	
	public static String showMoves(int n, char startPeg, char destPeg, char tempPeg){
	if(n==1){
	return "Move disk 1 from peg" + startPeg + "to peg" + destPeg + "\n";
	
	}
	else{	//recursive step
		return showMoves(n -1, startPeg, tempPeg, destPeg) + "Move disk " + n + "from peg" + startPeg + "to peg" + destPeg + "\n" + showMoves(n-1, tempPeg, destPeg, startPeg);
	}
	}
	
	public static void main(String[] args){
		int n;
		char a, b,c;
		String pPrint = null;
		
		System.out.println("please enter the number of disks");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		System.out.println("Please choose start peg a,b,c?");
		a = input.next().charAt(0);
		System.out.println("Please choose the tempPeg a,b,c");
		b = input.next().charAt(0);
		System.out.println("Please choose the destination peg a,b,c");
		c = input.next().charAt(0);
		System.out.println(showMoves(n,a,b,c));
		
	}
}