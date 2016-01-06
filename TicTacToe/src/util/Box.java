package util;
import bean.*;

public class Box
{
	Symbol s;
	public Box(){
		this.s=Symbol.E;
	}
	public void setSymbol(String s){
		this.s=Symbol.valueOf(s);
	}
	public Symbol getSymbol(){
		return this.s;
	}
}
