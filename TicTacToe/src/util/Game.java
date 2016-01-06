package util;
import java.io.*;
import java.util.*;
import bean.*;

public class Game
	{
		public Box[][] getBoard()
			{
				Box[][] board= new Box[3][3];
				board[0][0]=new Box();
				board[0][1]=new Box();
				board[0][2]=new Box();
				board[1][0]=new Box();
				board[1][1]=new Box();
				board[1][2]=new Box();
				board[2][0]=new Box();
				board[2][1]=new Box();
				board[2][2]=new Box();
				return board;
			}
		public	Player getPlayer(Symbol s)
			{
				if(s.equals(Symbol.X))
					{
						return Player.Player1;
					}
				return Player.Player2;
			}

		public void startGame(String fileName,Box[][] b)
			{
				Scanner sc=null;
				try
					{
						sc=new Scanner(new File(fileName));
					}
				catch(FileNotFoundException e)
					{}
				int countP1=0;int countP2=0;

				for(int k=0;k<3;k++)
					{
						int countDX=0;int countDO=0;
						int countTotalX=0;int countTotalO=0;
						loop1:
						for(int i=0;((i<3)&&(sc.hasNext()));i++)
							{
								String[] data=sc.nextLine().split(",");
								int countRX=0;int countRO=0;
								for(int j=0;j<3;j++)
									{
										b[i][j].setSymbol(data[j]);
										System.out.print(b[i][j].getSymbol());
										if(b[i][j].getSymbol().equals(Symbol.X))
											{if(i==2)
													if((b[0][j].getSymbol()==Symbol.X)&&(b[1][j].getSymbol()==Symbol.X)&&(b[2][j].getSymbol()==Symbol.X))
														{
															System.out.println("\n3 "+getPlayer(Symbol.X)+" wins");
															countP1++;
															//return;
															break loop1;
														}
												countRX++;
											}
										else
											{ if(i==2)
													if((b[0][j].getSymbol()==Symbol.O)&&(b[1][j].getSymbol()==Symbol.O)&&(b[2][j].getSymbol()==Symbol.O))
														{
															System.out.println("\n4 "+getPlayer(Symbol.O)+" wins");
															countP2++;
															//return;
															break loop1;
														}
												countRO++;
											}



										if((countRX==3)&&(countRO<3))
											{
												System.out.println("\n1"+getPlayer(Symbol.X)+" wins");
												countP1++;
												//return;
												break loop1;
											}
										if((countRO==3)&&(countRX<3))
											{
												System.out.println("\n2"+getPlayer(Symbol.O)+" wins");
												countP2++;
												break loop1;
												//return;
											}
									}//jloopend
								System.out.println();

								if(b[i][i].getSymbol().equals(Symbol.X))
									{
										countDX++;
									}
								if(b[i][i].getSymbol().equals(Symbol.O))
									{
										countDO++;
									}
								if((countDX==3)&&(countDO<3))
									{
										System.out.println("\n5 "+getPlayer(Symbol.X)+" wins");
										countP1++;
										//	return;
										break loop1;
									}
								if((countDO==3)&&(countDO<3))
									{
										System.out.println("\n6 "+getPlayer(Symbol.O)+" wins");
										countP2++;
										//	return;
										break loop1;
									}

								if(i==2)
									{	countTotalX++;
										countTotalO++;
									}
							}//i loop end
						if(((countTotalX!=0)&&(countTotalO!=0))&&(countTotalX==countTotalO))
							{
								System.out.println(countTotalX+" "+countTotalO);
								System.out.println("\nDraw");

							}

					}
				if(countP1==countP2)
					{
						System.out.println("\nMatch is finally Draw after three rounds");
					}
				if(countP1>countP2)
					{
						System.out.println("\nFinally,"+getPlayer(Symbol.X)+" wins");
					}
				if(countP1<countP2)
					{
						System.out.println("\nFinally ,"+getPlayer(Symbol.O)+" wins");
					}
			}
	}
