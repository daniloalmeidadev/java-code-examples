package staticAtributte;

public class ClassExample {
	
	private static int quantity = 0;

	public ClassExample() {
		quantity++;
	}

	public static int getQuantity() {
		return quantity;
	}
}
