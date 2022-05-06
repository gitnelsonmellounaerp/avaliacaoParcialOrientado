package Entities;

public class NaoFuncionario extends Usuario {
	
	private String empresa;
	
	public NaoFuncionario() {
		
	}


	public NaoFuncionario(int id, String nome, String endereco, long cpf, String telefone, String email, String empresa) {
		
		super(id, nome, endereco, cpf, telefone, email);
		this.empresa = empresa;
	}


	public String getEmpresa() {
		return empresa;
	}


	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	

	
	
	

}
