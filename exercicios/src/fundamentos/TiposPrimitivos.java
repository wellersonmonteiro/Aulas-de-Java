package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//informações de funcinários
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; //quando o numeral passa a casa das inteiros precisamos de um l no final  
		
		// Tipos numéricos com ponto flutuante 
		float salario =11_445.44F; // Sempre que usar o float colocar o f no final.
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipos booleano 
		boolean estaDeFerias = false; // true
		
		// Tipo caractere
		char status = 'A'; // ativo
		
		// Dias de empresa 
		System.out.println(anosDeEmpresa * 365 );
		
		// Pontos por real 
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		
		
				
	}
}