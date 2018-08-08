package modelo;

import java.util.ArrayList;
import java.util.List;

public class SistemaOperacional {

    private List<Integer> idProcessos = null;
    private Processador p = null;

    public SistemaOperacional() {
        this.idProcessos = new ArrayList();
        p = new Processador();
    }

    public List<Integer> getIdProcessos() {
        return idProcessos;
    }

    public void setIdProcessos(List<Integer> idProcessos) {
        this.idProcessos = idProcessos;
    }

    public Processador getP() {
        return p;
    }

    public void setP(Processador p) {
        this.p = p;
    }

    public void gerarProcesso(String tipoProcesso) {
        Processo processo = new Processo(tipoProcesso);
        int numRand = (int) (Math.random() * 5);
        boolean inseridoNaLista = false;
        boolean naoEstaNaLista = false;

        do {
            naoEstaNaLista = false;
            if (!this.idProcessos.isEmpty()) {
                for (int num : this.idProcessos) {
                    if (numRand == num) {
                        numRand = (int) (Math.random() * 5);
                        naoEstaNaLista = true;
                        break;
                    }
                }
                
                if (!naoEstaNaLista) {
                    this.idProcessos.add(numRand);
                    processo.setIdProcesso(numRand);
                    inseridoNaLista = true;
                }
                
            } else {
                processo.setIdProcesso(numRand);
                this.idProcessos.add(numRand);
                inseridoNaLista = true;
            }

        } while (!inseridoNaLista);

        p.getEmFila().add(processo);

    }

    public void executa() throws InterruptedException {
        p.executarProcesso();
    }

}
