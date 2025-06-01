import java.time.LocalDateTime;
import java.util.Stack;

public class Pilha {
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

    private Stack<Documento> pilha;
    private int capacidade;

    public Pilha(int capacidade) {
        this.pilha = new Stack<>();
        this.capacidade = capacidade;
    }

    public boolean empilhar(String nome, String usuario) {
        if (pilha.size() >= capacidade) {
            System.out.println("Pilha cheia. Nao foi possivel adicionar o documento: " + nome);
            return false;
        }
        pilha.push(new Documento(nome, usuario));
        System.out.println("Documento adicionado a pilha emergencial: " + nome);
        return true;
    }

    public void imprimir() {
        if (pilha.isEmpty()) {
            System.out.println("Pilha vazia. Nenhum documento para reimprimir.");
            return;
        }
        Documento doc = pilha.pop();
        LocalDateTime agora = LocalDateTime.now();
        System.out.println("Reimprimindo: " + doc.nome + " (" + doc.usuario + ")");
        System.out.println("Tempo desde a solicitacao: " + java.time.Duration.between(doc.horarioSolicitacao, agora).toSeconds() + " segundos");
    }

    public void exibir() {
        if (pilha.isEmpty()) {
            System.out.println("Pilha de reimpressao vazia.");
            return;
        }
        System.out.println("Pilha de Reimpressao:");
        for (int i = pilha.size() - 1; i >= 0; i--) {
            System.out.println((pilha.size() - i) + " - " + pilha.get(i));
        }
    }

    public void consultar(String nomeDoc) {
        for (int i = pilha.size() - 1; i >= 0; i--) {
            Documento d = pilha.get(i);
            if (d.nome.equals(nomeDoc)) {
                System.out.println("Documento encontrado na posicao " + (pilha.size() - i) + ": " + d);
                return;
            }
        }
        System.out.println("Documento nao encontrado na pilha.");
    }
}
