import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Por favor, digite o número da agência (XXX-X): ");
        String agencyNumber = scanner.nextLine();

        System.out.println("Ótimo, agora digite o número da conta: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite agora seu nome completo: ");
        String clientName = scanner.nextLine();

        System.out.println("Defina agora o saldo da conta: ");
        float ammount = scanner.nextFloat();

        scanner.close();

        System.out.printf(
            String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", 
            clientName, 
            agencyNumber,
            accountNumber,
            ammount));

    }
}
