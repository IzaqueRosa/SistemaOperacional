
package modelo;

public class Processo implements Comparable<Processo>{
    private int tempoDeExecucao;
    private int idProcesso = 0;
    private String tipoProcesso = "";
    
    public Processo() {
        if((int)Math.random() * 2 == 0){
            this.tipoProcesso = "Entrada e Saída";
        }else{
            this.tipoProcesso = "Processo";
        }
        
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

    @Override
    public int compareTo(Processo p) {
        if (this.tempoDeExecucao > p.getTempoDeExecucao()) {
          return 1;
     }
     if (this.tempoDeExecucao < p.getTempoDeExecucao()) {
          return -1;
     }
     return 0;
    }
    
}
