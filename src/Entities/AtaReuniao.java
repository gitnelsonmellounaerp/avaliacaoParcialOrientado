package Entities;

import java.util.Date;

public class AtaReuniao {
	
	protected String tituloReuniao;
	protected Date dataEmissao;
	protected int qntParticipantes;
	protected Date dataInicio;
	protected Date dataFim;
	
	public AtaReuniao() {
		
	}

	public AtaReuniao(String tituloReuniao, Date dataEmissao, int qntParticipantes, Date dataInicio, Date dataFim) {
	
		this.tituloReuniao = tituloReuniao;
		this.dataEmissao = dataEmissao;
		this.qntParticipantes = qntParticipantes;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public String getTituloReuniao() {
		return tituloReuniao;
	}

	public void setTituloReuniao(String tituloReuniao) {
		this.tituloReuniao = tituloReuniao;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public int getQntParticipantes() {
		return qntParticipantes;
	}

	public void setQntParticipantes(int qntParticipantes) {
		this.qntParticipantes = qntParticipantes;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	
	public static void emitirAta() {
		System.out.println("");
	}
	
	
	
	
	

}
