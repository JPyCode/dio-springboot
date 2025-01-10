import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    void adicionarPalavra(String palavra, String definicao) {
        dicionario.put(palavra, definicao);
    }

    void removerPalavra(String palavra) {
        if(!dicionario.containsKey(palavra)) {
            System.out.println("Palavra não encontrada.");
            return;
        }
        dicionario.remove(palavra);
    }

    void exibirPalavras() {
        if(dicionario.isEmpty()) {
            System.out.println("Dicionário vazio.");
            return;
        }
        dicionario.forEach((palavra, definicao) -> {
            System.out.println(palavra + " : " + definicao);
        });
    }

    void pesquisarPorPalavra(String palavra) {
        if(!dicionario.containsKey(palavra)) {
            System.out.println("Palavra não encontrada.");
            return;
        } 
        System.out.println(dicionario.get(palavra));
    }


    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
    
        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");
    
        dicionario.exibirPalavras();
    
        dicionario.pesquisarPorPalavra("java");
    
        
        dicionario.pesquisarPorPalavra("csharp");
    
        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
      }

}
