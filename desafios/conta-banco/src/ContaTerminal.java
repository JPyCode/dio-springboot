/**
 * Created by: Marcos Roberto
 * Date: 12-25-2024
 * Project Name: conta-banco
 * https://gitbub.com/JPyCode
 * Claro - Java com Spring Boot (Bootcamp - Dio)
 */

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Por favor, digite o número da agência (XXX-X): ");
        String agencyNumber = scanner.nextLine();

        System.out.println("Ótimo, agora digite o número da conta: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); //limpando buffer de entrada

        System.out.println("Escreva seu nome completo: ");
        String clientName = scanner.nextLine();

        System.out.println("Defina agora o saldo da conta: ");
        double ammount = scanner.nextDouble();

        scanner.close(); //encerrando o scanner

        System.out.printf(
            String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", 
            clientName, 
            agencyNumber,
            accountNumber,
            ammount));

    }
}
