package psl;
import util.*;

public class Client
	{
		public static void main(String[] args)
			{
				Game g=new Game();
				Box[][] b=g.getBoard();
				String fileName="/mnt/ext_card/Files/App Attached/Programs/JAVAworkspace/TicTacToe/sequences.txt";
				g.startGame(fileName,b);
			}
	}
