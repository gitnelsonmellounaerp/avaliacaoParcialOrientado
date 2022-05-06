package Entities;

import java.util.Date;

public class Funcionario extends Usuario {
	
	private String cargo;
	private String departamento;
	private Double salario;
	private Date dataEmissao;
	
	
	public Funcionario() {
		
	}


	public Funcionario(int id, String nome, String endereco, long cpf, String telefone, String email, String cargo, String departamento, Double salario, Date dataEmissao) {
		super(id, nome, endereco, cpf, telefone, email);
		this.cargo = cargo;
		this.departamento = departamento;
		this.salario = salario;
		this.dataEmissao = dataEmissao;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public Double getSalario() {
		return salario;
	}


	public void setSalario(Double salario) {
		this.salario = salario;
	}


	public Date getDataEmissao() {
		return dataEmissao;
	}


	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	
	
	
	
	

}
