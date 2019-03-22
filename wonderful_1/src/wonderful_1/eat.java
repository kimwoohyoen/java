package wonderful_1;

public class eat {
	int radius;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		food[] c;
		c = new food[5];
		for (int i = 0; i < c.length; i++)
			c[i] = new food(i);

		for (int i = 0; i < c.length; i++)
			System.out.println((int) (c[i].getArea()) + " ");


	}

}
