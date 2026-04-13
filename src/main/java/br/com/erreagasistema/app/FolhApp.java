package br.com.erreagasistema.app;
import br.com.erreagasistema.model.Colaborador;
import br.com.erreagasistema.model.FuncionarioComissionado;
import br.com.erreagasistema.model.FuncionarioPadrao;
import br.com.erreagasistema.model.FuncionarioProducao;
import br.com.erreagasistema.util.ValidaDor;

import java.util.ArrayList;
import java.util.Scanner;

public class FolhApp {

     private static ArrayList<Colaborador> colaboradores = new ArrayList<>();
        private static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            int opcao;
            do {
                System.out.println("\n--- Sistema de Folha de Pagamento ---");
                System.out.println("1. Cadastrar Funcionário Padrão");
                System.out.println("2. Cadastrar Funcionário Comissionado");
                System.out.println("3. Cadastrar Funcionário de Produção");
                System.out.println("4. Listar Colaboradores e Salários");
                System.out.println("0. Sair");
                System.out.print("Escolha: ");
                opcao = sc.nextInt();
                sc.nextLine();

                switch(opcao) {
                    case 1: cadastrarPadrao(); break;
                    case 2: cadastrarComissionado(); break;
                    case 3: cadastrarProducao(); break;
                    case 4: listarColaboradores(); break;
                    case 0: System.out.println("Encerrando..."); break;
                    default: System.out.println("Opção inválida!");
                }
            } while(opcao != 0);
        }

        private static void cadastrarPadrao() {
            System.out.print("Registro: ");
            String registroStr = sc.nextLine();
            int reg = ValidaDor.validarRegistroOuExcecao(registroStr);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            colaboradores.add(new FuncionarioPadrao(reg, nome));
        }

        private static void cadastrarComissionado() {
            System.out.print("Registro: ");
            String registroStr = sc.nextLine();
            int reg = ValidaDor.validarRegistroOuExcecao(registroStr);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Vendas: ");
            double vendas = sc.nextDouble();
            System.out.print("Percentual: ");
            double perc = sc.nextDouble();
            colaboradores.add(new FuncionarioComissionado(reg, nome, vendas, perc));
        }

        private static void cadastrarProducao() {
            System.out.print("Registro: ");
            String registroStr = sc.nextLine();
            int reg = ValidaDor.validarRegistroOuExcecao(registroStr);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Valor por peça: ");
            double valor = sc.nextDouble();
            System.out.print("Quantidade produzida: ");
            int qtd = sc.nextInt();
            colaboradores.add(new FuncionarioProducao(reg, nome, valor, qtd));
        }

        private static void listarColaboradores() {
            for(Colaborador c : colaboradores) {
                System.out.println("Registro: " + c.getRegistro() +
                        " | Nome: " + c.getNome() +
                        " | Salário: R$ " + c.calcularSalario());
            }
        }

}
