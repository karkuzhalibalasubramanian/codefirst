class Swap 
{
	public static void main(String[] args) 
	{
		System.out.println("before swapping");
		int x=5;
		int y=10;
		System.out.println("x is:" +x);
	    System.out.println ("y is:"+y);
		System.out.println("after swapping");
		x=x+y;
		y=x-y;
		x=x-y;
        System.out.println("x is :" +x );
		System.out.println("y is:" +y);
		
		

	}
}
