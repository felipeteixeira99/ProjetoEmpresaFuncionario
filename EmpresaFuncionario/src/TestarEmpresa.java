
public class TestarEmpresa{
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		Funcionario[] fun = new Funcionario[3];
		
		Funcionario f1 = new Funcionario();
	    f1.setId(1);
	    f1.setNome("Joao");
	    f1.setCargo("Analista");
	    f1.setSalario(3000.0);
	    
	    Funcionario f2 = new Funcionario();
	    f2.setId(1);
	    f2.setNome("Felipera");
	    f2.setCargo("Analista");
	    f2.setSalario(3000.0);
	    
	    
	    fun[0] = f1;
	    fun[1] = f2;
	    fun[2] = f1;
	    
		empresa.setNome("Liga da Justica");
		empresa.setCnpj("00.148.689.0004-11");
	
		System.out.println(empresa.getNome());
		System.out.println(empresa.getCnpj());
		
		System.out.println(fun[1].getNome());
		System.out.println(fun[2].getNome());
	}
}