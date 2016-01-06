package bean;

public enum Player
	{
		Player1(Symbol.X),Player2(Symbol.O);
		Symbol s;
		Player(Symbol s){
				this.s=s;
			}

		public	Symbol getSymbol(){
				return this.s;
			}
	}
