package studio7;

public class Die {
	private int sides;

	public Die(int Nsides) {
		sides=Nsides;
	}
	public String toString() {
		return "Number of sides: " + sides ;
	}
	public int throwDie() {
		return (int) (Math.random()*sides+1);	
	}

	public static void main(String[] args ) {
		Die six= new Die (6);
		System.out.println(six.throwDie());
		System.out.println(six.toString());
	}

}
