import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    
    private List<Integer> numbers = new ArrayList<>();

    public void adicionarNumero(int number) {
        this.numbers.add(number);
    }

    public int sumNumbers() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public void findBiggestNumber() {
        if(numbers.isEmpty()) {
            System.out.println("Não há números na lista");
            return;
        }

        int biggestNumber = 0;
        for (int number : numbers) {
            if (number > biggestNumber) {
                biggestNumber = number;
            }
        }
        System.out.println("O maior número é: " + biggestNumber);
    }

    public void findSmallestNumber() {
        if(numbers.isEmpty()) {
            System.out.println("Não há números na lista");
            return;
        }

        int smallestNumber = numbers.get(0);
        for (int number : numbers) {
            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }
        System.out.println("O menor número é: " + smallestNumber);
    }

    public void showNumbers() {
        if(numbers.isEmpty()) {
            System.out.println("Não há números na lista");
            return;
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();
    
        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);
    
        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.showNumbers();
    
        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.sumNumbers());
    
        // Encontrando e exibindo o maior número na lista
        somaNumeros.findBiggestNumber();
    
        // Encontrando e exibindo o menor número na lista
        somaNumeros.findSmallestNumber();
      }
    
}
