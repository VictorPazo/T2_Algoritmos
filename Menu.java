import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Menu {
    public static void main(String[] args) {
        Fila fila = new Fila(10);
        Pilha pilha = new Pilha(10);

        try (BufferedReader br = new BufferedReader(new FileReader("entrada.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                int opcao = Integer.parseInt(partes[0]);

                switch (opcao) {
                    case 0:
                        System.out.println("Programa encerrado.");
                        return;

                    case 1:
                        fila.enfileirar(partes[1], partes[2]);
                        break;

                    case 2:
                        fila.imprimirDocumento();
                        break;

                    case 3:
                        fila.exibirFila();
                        break;

                    case 4:
                        fila.consultar(partes[1]);
                        break;

                    case 5:
                        pilha.empilhar(partes[1], partes[2]);
                        break;

                    case 6:
                        pilha.imprimir();
                        break;

                    case 7:
                        pilha.exibir();
                        break;

                    case 8:
                        pilha.consultar(partes[1]);
                        break;

                    default:
                        System.out.println("Opcao invalida: " + opcao);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
