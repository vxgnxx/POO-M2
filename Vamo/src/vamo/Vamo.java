/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vamo;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Vamo {

    int numero;
    String dono;
    double saldo;
    double limite;
    
    Vamo(String dono, double saldo) {
        this.dono = dono;
        this.saldo = saldo;
    }
    
    Vamo(String dono, double saldo, double limite) {
        this(dono, saldo); //Chama o metodo construtor da propria classe
        this.limite = limite;
    } 
    
    void depositar(double valor){
        this.saldo = this.saldo + valor;
    }
    
    boolean sacar(double valor){
        if (saldo + limite > valor) {é
            this.saldo = this.saldo - valor;
            return true;
        }
        return false;
    }
    
    void imprimir() {
        System.out.println("------ Conta ------");
        System.out.println("Número: " + this.numero);
        System.out.println("Dono: " + this.dono);
        System.out.println("Saldo: " + this.saldo + "| Limite: " + this.limite);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in); // Cria um scanner
        //Vamo felipe = new Vamo();
        Vamo felipe;
        Vamo maria = new Vamo("Maria", 1000);
        
        //felipe.dono = sc.nextLine();
        //felipe.saldo = sc.nextDouble();
        
        String nome = sc.nextLine(); // Scan string
        double valor = sc.nextDouble(); // Scan double
        
        felipe = new Vamo(nome, valor, 1000);
        
        //maria.dono = "Maria";
        //maria.saldo = 1000;
        
        felipe.depositar(200);
        // felipe.sacar(900);
        //felipe.sacar(350);
        
        felipe.imprimir();
        maria.imprimir();
    }
    
}
