
package modelo;

public class Processo {
    private int tempoDeExecucao = 0;
    private int idProcesso = 0;
    private String tipoProcesso = "";
    
    public Processo(String tipoProcesso) {
        this.tipoProcesso = tipoProcesso;
        this.tempoDeExecucao = (int)(Math.random() * 6);
    }

    public int getTempoDeExecucao() {
        return tempoDeExecucao;
    }

    public void setTempoDeExecucao(int tempoDeExecucao) {
        this.tempoDeExecucao = tempoDeExecucao;
    }

    public int getIdProcesso() {
        return idProcesso;
    }

    public void setIdProcesso(int idProcesso) {
        this.idProcesso = idProcesso;
    }

    public String getTipoProcesso() {
        return tipoProcesso;
    }

    public void setTipoProcesso(String tipoProcesso) {
        this.tipoProcesso = tipoProcesso;
    }
    
}
