public enum Size
	{
		SHORT(4,"s"){
				public int a;
				@Override
				public void main(){//can be defined but can not be invoked
						this.a=9;
						System.out.println("Only SHORT method");
					}
				@Override
				public String getColor(){
						return "White";
					}
		},MEDIUM(5,"m"),LARGE(6,"l");
		int value;
		String s;
        int length;
		Size(int value,String s){
				this.value=value;
				this.s=s;

			}
	public void setLength(int length)
	{
		this.length = length;
	}

	public int getLength()
	{
		return length;
	}
		public String getValue(){
				return this.value+" "+this.s;
			}

		public String getColor(){
				return "Red";
			}
	public static void main(String[] args){
			//void methods can be defined but can not be invoked
				System.out.println("Yedt");
				
			}
		public int main(int a){
				return a;

			}

	}
