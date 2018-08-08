package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Processador {

    private List<Processo> emFila = null;
    private List<Processo> concluidos = null;

    public Processador() {
        this.emFila = new ArrayList();
        this.concluidos = new ArrayList();
    }

    public List<Processo> getEmFila() {
        return emFila;
    }

    public void setEmFila(List<Processo> emFila) {
        this.emFila = emFila;
    }

    public List<Processo> getConcluidos() {
        return concluidos;
    }

    public void setConcluidos(List<Processo> concluidos) {
        this.concluidos = concluidos;
    }

    public void executarProcesso() throws InterruptedException {
        do {
            TimeUnit.SECONDS.sleep(this.emFila.get(0).getTempoDeExecucao());
            System.out.println("Processo " + this.emFila.get(0).getIdProcesso()
                    + " executado e retirado da fila de processos!");
            this.concluidos.add(this.emFila.get(0));
            this.emFila.remove(0);

        } while (!this.emFila.isEmpty());
    }

}
