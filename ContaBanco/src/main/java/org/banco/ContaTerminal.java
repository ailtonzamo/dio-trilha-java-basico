package org.banco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner

        System.out.print("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(numero, agencia, nomeCliente, saldo);

        System.out.println("\nInformações da Conta Bancária:");
        System.out.println("Número: " + conta.getNumero());
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Nome do Cliente: " + conta.getNomeCliente());
        System.out.println("Saldo: " + conta.getSaldo());
    }
}
