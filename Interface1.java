package java_sel;

	
	interface shapes
	{
		void area(int l,int b);
	}

	class Rect implements shapes
	{
	    public void area(int l,int b)
	    {
	    	System.out.println("Area of Rectangle :"+ (l*b));
	    }
	}
	class Tri implements shapes
	{
		public void area(int l,int b)
		{
			System.out.println("Area of Triangle :"+ (0.5*l*b));
		}
	}
	class Square implements shapes
	{
		public void area(int l,int b)
		{
			System.out.println("Area of Square :"+ (l*b));
		}
	}

public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect obj=new Rect();
		obj.area(10,20);
		Tri obj1=new Tri();
		obj1.area(5,10);
		Square obj2=new Square();
		obj2.area(5,5);
		

	}

}
