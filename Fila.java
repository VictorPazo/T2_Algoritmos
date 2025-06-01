import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    private static class Documento {
        String nome;
        String usuario;
        LocalDateTime horarioSolicitacao;

        Documento(String nome, String usuario) {
            this.nome = nome;
            this.usuario = usuario;
            this.horarioSolicitacao = LocalDateTime.now();
        }

        @Override
        public String toString() {
            return nome + " (" + usuario + ") - Solicitado em: " + horarioSolicitacao;
        }
    }

    private Queue<Documento> fila;
    private int capacidade;

    public Fila(int capacidade) {
        this.fila = new LinkedList<>();
        this.capacidade = capacidade;
    }

    public boolean enfileirar(String nome, String usuario) {
        if (fila.size() >= capacidade) {
            System.out.println("Fila cheia. Nao foi possivel adicionar o documento: " + nome);
            return false;
        }
        fila.add(new Documento(nome, usuario));
        System.out.println("Documento adicionado a fila: " + nome);
        return true;
    }

    public void imprimirDocumento() {
        if (fila.isEmpty()) {
            System.out.println("Fila vazia. Nenhum documento para imprimir.");
            return;
        }
        Documento doc = fila.poll();
        LocalDateTime agora = LocalDateTime.now();
        System.out.println("Imprimindo: " + doc.nome + " (" + doc.usuario + ")");
        System.out.println("Tempo de espera: " + java.time.Duration.between(doc.horarioSolicitacao, agora).toSeconds() + " segundos");
    }

    public void exibirFila() {
        if (fila.isEmpty()) {
            System.out.println("Fila vazia.");
            return;
        }
        System.out.println("Fila de Impressao:");
        for (Documento d : fila) {
            System.out.println("-> " + d);
        }
    }

    public void consultar(String nomeDoc) {
        int pos = 1;
        for (Documento d : fila) {
            if (d.nome.equals(nomeDoc)) {
                System.out.println("Documento encontrado na posicao " + pos + ": " + d);
                return;
            }
            pos++;
        }
        System.out.println("Documento nao encontrado na fila.");
    }
}
