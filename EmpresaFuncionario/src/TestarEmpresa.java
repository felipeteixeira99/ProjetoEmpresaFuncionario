
public class TestarEmpresa{
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		Funcionario[] fun = new Funcionario[5];
		
		/*Funcionario f1 = new Funcionario();
	    f1.setId(1);
	    f1.setNome("Joao");
	    f1.setCargo("Analista");
	    f1.setSalario(3000.0);*/
	    
	    //fun[1] = f1;
		
		empresa.setNome("Liga da Justica");
		empresa.setCnpj("00.148.689.0004-11");
		
		fun[1].setId(1);
		fun[1].setNome("Felipe");
			
		System.out.println(empresa.getNome());
		System.out.println(empresa.getCnpj());
		
		System.out.println(fun[1].getNome());
		
	}
}