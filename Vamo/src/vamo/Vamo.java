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
    
    void depositar(double valor){
        this.saldo = this.saldo + valor;
    }
    
    boolean sacar(double valor){
        if (saldo + limite > valor) {
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
        Scanner sc = new Scanner(System.in);
        Vamo felipe = new Vamo();
        Vamo maria = new Vamo();
        
        felipe.dono = sc.nextLine();
        felipe.saldo = sc.nextDouble();
        maria.dono = "Maria";
        maria.saldo = 1000;
        
        felipe.depositar(200);
        // felipe.sacar(900);
        felipe.sacar(350);
        
        felipe.imprimir();
        maria.imprimir();
    }
    
}
