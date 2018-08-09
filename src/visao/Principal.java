package visao;

import modelo.Processo;
import modelo.SistemaOperacional;

public class Principal {
    public static void main(String args[]) throws InterruptedException {
        //Instanciando o SO
        SistemaOperacional SO = new SistemaOperacional();
        //Criando os processos
        SO.gerarProcesso();
        SO.gerarProcesso();
        SO.gerarProcesso();
        SO.gerarProcesso();
        SO.gerarProcesso();

        //Conferindo os processos criados
        for (Processo p : SO.getProcessador().getEmFila()) {
            System.out.println("Id: " + p.getIdProcesso()
                    + ", Tempo de Execução: " + p.getTempoDeExecucao()
                    + " segundos e Tipo de Processo: " + p.getTipoProcesso());
        }
        System.out.print("\n");
        //Executando os processos e removendo da fila
        SO.executa();

    }

}
