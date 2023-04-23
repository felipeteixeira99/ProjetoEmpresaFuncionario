
public class Funcionario {
	private int id;
	private String nome;
	private String cargo;
	private double salario;
	
	public int getId() {
		System.out.printf("ID: ");
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return ("Nome: " + this.nome);
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return ("Cargo: " + this.cargo);
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}


