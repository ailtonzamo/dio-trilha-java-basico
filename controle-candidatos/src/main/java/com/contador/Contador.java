package com.contador;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        analisarCandidato(1900.0);
        analisarCandidato(2200.);
        analisarCandidato(2000.0);
    }

    static void analisarCandidato(double salarioPretendido){
        // Valor base salarial
        double salarioBase = 2000.00;

//        // Salário pretendido pelo candidato
//        double salarioPretendido = 2500.00; // Exemplo de valor pretendido

        // Controle de fluxo
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}