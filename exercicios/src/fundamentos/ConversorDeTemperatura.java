package fundamentos;

public class ConversorDeTemperatura {
	public static void main(String[] args) {
		final int CONS1 = 32;
		final double CONS2 = (5/9.0);
		int fa = 86;
		double celcios= ( fa - CONS1) * CONS2;
		
		System.out.println("A temperatura em °C=" +celcios+".");
	}
}
