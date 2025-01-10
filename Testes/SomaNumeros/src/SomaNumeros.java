import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numbers = new ArrayList<>();

    public void addNumber(int number) {
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
        if (numbers.isEmpty()) {
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
        if (numbers.isEmpty()) {
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
        if (numbers.isEmpty()) {
            System.out.println("Não há números na lista");
            return;
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        SomaNumeros sumNumbers = new SomaNumeros();

        sumNumbers.addNumber(5);
        sumNumbers.addNumber(0);
        sumNumbers.addNumber(0);
        sumNumbers.addNumber(-2);
        sumNumbers.addNumber(10);

        System.out.println("Números adicionados:");
        sumNumbers.showNumbers();

        System.out.println("Soma dos números = " + sumNumbers.sumNumbers());

        sumNumbers.findBiggestNumber();

        sumNumbers.findSmallestNumber();
    }

}
