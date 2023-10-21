package equalsAndHashCode;

public class EqualsAndHashCodeExample {

	public static void main(String[] args) {
		
		System.out.println("\n Class with equals and hash code \n");
		
		Customer customerA = new Customer("name", "address");
		Customer customerB = new Customer("name", "address");
		
		System.out.println(" * Spaces memory equals: \n");
		System.out.println(customerA);
		System.out.println(customerB);

		System.out.println("\n * HashCode equals: \n");
		System.out.println(customerA.hashCode());
		System.out.println(customerB.hashCode());
		
		System.out.println("\n Equals? " + customerA.equals(customerB));
	}
}
