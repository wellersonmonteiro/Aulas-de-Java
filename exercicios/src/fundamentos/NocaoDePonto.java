package fundamentos;

public class NocaoDePonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X"; 
		s = s.toUpperCase();
		s = s.replace("X", "senhora");
		s = s.concat("!!!");
		
		System.out.println(s);
				
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X".replace("X", "Gui");
		System.out.println(y);
		// Tipos primitivos não tem o operador ponto ".".
		
	}

}
