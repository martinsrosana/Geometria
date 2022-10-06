
public class TesteMetodos {

	public static void main(String[] args) {
		
		ImprimeSeJoaoPassouDeAno ();
		}
	public static void DobraSalario() {
		salario  = salario * 2;
	}
	
	//metodo
	public static void ImprimeSeJoaoPassouDeAno () {
		
		double mediaparapassardeano = 7;
		
		double mediadojoao = 5;
		
		if (mediadojoao < mediaparapassardeano) {
			System.out.println("Reprovado");
			
		}
		else {
			System.out.println("Aprovado");
		}
	}
	
}


// public class MetodosSemRetorno() 
//	 
//	 //executa ação sem entrada ou saída de dados.
//	 public void ImprimeHelloWorld() {
//		System.out.println("Hello World"); 
//	 }
// }
// public class MetodosComRetorno() 
// 
// //executa ação sem entrada ou saída de dados.
// public String InformeParaMimoNome() {
//	String nome = "Junior"; 
//	return nome;
// }