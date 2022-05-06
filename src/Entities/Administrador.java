package Entities;

import java.sql.Date;

public class Administrador extends Funcionario {
	
	private double percentualAtasSetor;
	private double percentualAtasFuncionarios;
	private Date tempoMax;
	private Date tempoMin;
	private Date tempoMed;
	
	public Administrador() {
		
	}

	public Administrador(int id, String nome, String endereco, long cpf, String telefone, String email, String cargo,
			String departamento, Double salario, java.util.Date dataEmissao, double percentualAtasSetor,
			double percentualAtasFuncionarios, Date tempoMax, Date tempoMin, Date tempoMed) {
		super(id, nome, endereco, cpf, telefone, email, cargo, departamento, salario, dataEmissao);
		this.percentualAtasSetor = percentualAtasSetor;
		this.percentualAtasFuncionarios = percentualAtasFuncionarios;
		this.tempoMax = tempoMax;
		this.tempoMin = tempoMin;
		this.tempoMed = tempoMed;
	}

	public double getPercentualAtasSetor() {
		return percentualAtasSetor;
	}

	public void setPercentualAtasSetor(double percentualAtasSetor) {
		this.percentualAtasSetor = percentualAtasSetor;
	}

	public double getPercentualAtasFuncionarios() {
		return percentualAtasFuncionarios;
	}

	public void setPercentualAtasFuncionarios(double percentualAtasFuncionarios) {
		this.percentualAtasFuncionarios = percentualAtasFuncionarios;
	}

	public Date getTempoMax() {
		return tempoMax;
	}

	public void setTempoMax(Date tempoMax) {
		this.tempoMax = tempoMax;
	}

	public Date getTempoMin() {
		return tempoMin;
	}

	public void setTempoMin(Date tempoMin) {
		this.tempoMin = tempoMin;
	}

	public Date getTempoMed() {
		return tempoMed;
	}

	public void setTempoMed(Date tempoMed) {
		this.tempoMed = tempoMed;
	}
	
	
	public static void emitirRelatio() {
		System.out.println("");
	}
	

}
