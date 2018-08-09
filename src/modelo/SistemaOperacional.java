package modelo;

import java.util.ArrayList;
import java.util.List;

public class SistemaOperacional {

    private List<Integer> idProcessos = null;
    private Processador processador = null;

    public SistemaOperacional() {
        this.idProcessos = new ArrayList();
        processador = new Processador();
    }

    public List<Integer> getIdProcessos() {
        return idProcessos;
    }

    public void setIdProcessos(List<Integer> idProcessos) {
        this.idProcessos = idProcessos;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

//    public void gerarProcesso(String tipoProcesso) {
//        Processo processo = new Processo(tipoProcesso);
//        int numRand = (int) (Math.random() * 5);
//        boolean inseridoNaLista = false;
//        
//        do {
//            boolean numeroRepetido = false;
//            if (!this.idProcessos.isEmpty()) {
//                for (int num : this.idProcessos) {
//                    if (numRand == num) {
//                        numRand = (int) (Math.random() * 5);
//                        numeroRepetido = true;
//                        break;
//                    }
//                }
//
//                if (!numeroRepetido) {
//                    this.idProcessos.add(numRand);
//                    processo.setIdProcesso(numRand);
//                    inseridoNaLista = true;
//                }
//
//            } else {
//                processo.setIdProcesso(numRand);
//                this.idProcessos.add(numRand);
//                inseridoNaLista = true;
//            }
//
//        } while (!inseridoNaLista);
//
//        p.getEmFila().add(processo);
//    }
    
    public void gerarProcesso() {
        Processo processo = new Processo();
        int numRand = (int) (Math.random() * 5);
        boolean inseridoNaLista = false;

        do {
            if (!this.idProcessos.contains(numRand)) {
                this.idProcessos.add(numRand);
                processo.setIdProcesso(numRand);
                inseridoNaLista = true;
            } else {
                numRand = (int) (Math.random() * 5);
            }
        } while (!inseridoNaLista);
        processador.getEmFila().add(processo);
    }

    public void executa() throws InterruptedException {
        processador.executarProcesso();
    }

    
    
}
