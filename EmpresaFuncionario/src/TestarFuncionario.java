
public class TestarFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		funcionario.setId(1);
		funcionario.setNome("Felipe");
		funcionario.setCargo("Analista de Sistemas");
		funcionario.setSalario(2500);

		System.out.println(funcionario.getId()+ "\n"
		+ funcionario.getNome() + "\n"
		+ funcionario.getCargo() + "\n"
		+ funcionario.getSalario() + "\n");
	}

}
