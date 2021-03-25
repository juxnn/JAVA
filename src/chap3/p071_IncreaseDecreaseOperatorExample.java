package chap3;

public class p071_IncreaseDecreaseOperatorExample {
	public static void main(String[] arg) {
		
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("---------------");
		x++;
		++x;
		System.out.println("x=" +x);
		
		System.out.println("---------------");
		y++;
		++y;
		System.out.println("y=" +y);
		
		System.out.println("---------------");
		z = x++;
		System.out.println("z="+z);
		System.out.println("x="+x);
		
		System.out.println("---------------");
		z= ++x;
		System.out.println("z="+z);
		System.out.println("x="+x);
		
		System.out.println("---------------");
		z = ++x + y++;
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		
	}

}
