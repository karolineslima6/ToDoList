/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex13;

import java.awt.SystemColor;
import java.util.Scanner;


public class Ex13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
         String[] tarefas = new String [10];
         boolean[] concluidas = new boolean[10];
         
         int opcao = 0;
         
         while(opcao != 5){
             System.out.println("=====lista de tarefas====");
             System.out.println("1 - adicionar tarefa");
             System.out.println("2 - listar tarefas");
             System.out.println("3 - concluir tarefa");
             System.out.println("4 - excluir tarefa");
             System.out.println("5 - sair");
             
             System.out.println("escolar uma opcao");
             opcao = scanner.nextInt();
             scanner.nextLine();
             
             switch (opcao) {
                 case 1:
                     int posicaoLivre = -1;
                     
                     for(int i = 0; i < tarefas.length; i++){
                         if(tarefas[i] == null){
                             posicaoLivre = i;
                             break;
                         }
                     }
                        
                   if (posicaoLivre == -1) {
                       System.out.println("a lista de tarefas esta cheia!");
                    } else{
                       System.out.println("digite a terefa:");
                       tarefas[posicaoLivre] = scanner.nextLine();
                       concluidas[posicaoLivre] = false;
                       System.out.println("tarefa adicinada com sucesso");
                   }
                   break;
             
             case 2:
             System.out.println("===== minhas tarefas======");
             
             boolean existeTarefa = false;
             
             for(int i = 0; i < tarefas.length; i++) {
                 if(tarefas[i] != null) {
                     existeTarefa = true;
                     
                     if (concluidas[i] == true){
                         System.out.println((i + 1) + "- [x] " + tarefas[i]);
                     }else{
                         System.out.println((i + 1) + "- [] " + tarefas[i]);
                     }
                 }
             }
             
             if (existeTarefa == false){
                 System.out.println("nenhuma tarefa cadastrada");
             }
             
             break;
             
             
             case 3:
                System.out.println("Digite o numero da tarefa que deseja concluir:");
                int numeroConcluir = scanner.nextInt();
                
                int indiceConcluir = numeroConcluir - 1;
                
                if(indiceConcluir >= 0 &&
                        indiceConcluir< tarefas.length &&
                            tarefas [indiceConcluir] != null) {
                 
                    concluidas[indiceConcluir] = true;
                    System.out.println("Tarefa concluida com sucesso!");
                }else{
                    System.out.println("Tarefa invalida!");
                }
             case 4:
            System.out.println("Digite o numero da tarefa que deseja excluir");
            
            int numeroExcluir = scanner.nextInt();
            int indiceExcluir = numeroExcluir - 1;
            
            if(indiceExcluir >= 0 && indiceExcluir < tarefas.length && tarefas[indiceExcluir] != null){
                  
                  tarefas[indiceExcluir] = null;
                  concluidas[indiceExcluir] = false;
                  
                  System.out.println("Tarefa excluida com sucesso");      
            }else{
                System.out.println("Tarefa invalida");
            }
            break;
            
        case 5:
            System.out.println("Programa encerrado. Ate mais!");
        }  } 
         } 
    }

                       