import java.util.Scanner;

public class Principal {

    public static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Método para exibir o relatório completo do Sapato
    public static void exibirRelatorioSapato(Sapato sapato, int numeroObjeto) {
        System.out.println("--- SAPATO " + numeroObjeto + " ---");
        System.out.println(sapato.toString());
        System.out.println("Desconto (10% sobre R$ 300,00): R$ " + sapato.calcularPrecoComDesconto(300.0, 10.0));
        System.out.println("Está disponível em estoque? " + (sapato.verificarDisponibilidade() ? "Sim" : "Não"));
    }

    // Método para exibir o relatório completo do Paciente
    public static void exibirRelatorioPaciente(Paciente paciente, int numeroObjeto) {
        System.out.println("--- PACIENTE " + numeroObjeto + " ---");
        System.out.println(paciente.toString());
        System.out.println("IMC (altura padrão 1,75m): " + String.format("%.2f", paciente.calcularIMC(1.75)));
        paciente.verificarFaixaEtaria();
        System.out.println("Precisa de acompanhante? " + (paciente.verificarNecessidadeAcompanhante() ? "Sim" : "Não"));
    }

    // Método para exibir o relatório completo do Celular
    public static void exibirRelatorioCelular(Celular celular, int numeroObjeto) {
        System.out.println("--- CELULAR " + numeroObjeto + " ---");
        System.out.println(celular.toString());
        celular.calcularTotalLote(5);
        celular.verificarCategoria();
        System.out.println("Valor estimado de revenda (2 anos): R$ " + String.format("%.2f", celular.calcularValorDeRevenda(2)));
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            limparTela();

            System.out.println("========================================");
            System.out.println("          MENU DE TESTES POO            ");
            System.out.println("========================================");
            System.out.println("1 - Testar Classe Sapato");
            System.out.println("2 - Testar Classe Paciente");
            System.out.println("3 - Testar Classe Celular");
            System.out.println("0 - Sair");
            System.out.println("========================================");
            System.out.print("Escolha uma opção: ");

            int opcao = leitor.nextInt();
            leitor.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    limparTela();
                    System.out.println("========================================");
                    System.out.println("            TESTE: SAPATO               ");
                    System.out.println("========================================");

                    Sapato sapato1 = new Sapato("Nike", 40);
                    Sapato sapato2 = new Sapato("Adidas", 41);

                    exibirRelatorioSapato(sapato1, 1);
                    System.out.println();
                    exibirRelatorioSapato(sapato2, 2);

                    boolean alterarSapato = true;
                    while (alterarSapato) {
                        System.out.print("\nVocê quer mudar algum valor de qual sapato? (1 para Sapato 1 / 2 para Sapato 2 / 0 para Não alterar): ");
                        int numObjeto = leitor.nextInt();
                        leitor.nextLine();

                        if (numObjeto == 1 || numObjeto == 2) {
                            Sapato sapatoSelecionado = (numObjeto == 1) ? sapato1 : sapato2;

                            System.out.println("\nQual valor você quer alterar no Sapato " + numObjeto + "?");
                            System.out.println("1 - Marca");
                            System.out.println("2 - Tamanho");
                            System.out.print("Opção: ");
                            int opcaoAlterar = leitor.nextInt();
                            leitor.nextLine();

                            limparTela();

                            if (opcaoAlterar == 1) {
                                System.out.print("Digite a nova marca: ");
                                String novaMarca = leitor.nextLine();
                                sapatoSelecionado.setMarca(novaMarca);
                                System.out.println("\n[SUCESSO] Marca alterada com sucesso!");
                                System.out.println("Informação alterada -> Marca: " + sapatoSelecionado.getMarca());
                            } else if (opcaoAlterar == 2) {
                                System.out.print("Digite o novo tamanho: ");
                                int novoTamanho = leitor.nextInt();
                                leitor.nextLine();
                                sapatoSelecionado.setTamanho(novoTamanho);
                                System.out.println("\n[SUCESSO] Tamanho alterado com sucesso!");
                                System.out.println("Informação alterada -> Tamanho: " + sapatoSelecionado.getTamanho());
                            } else {
                                System.out.println("[ERRO] Opção de alteração inválida.");
                            }

                            System.out.println("\n--- DADOS ATUALIZADOS E RECALCULADOS ---");
                            exibirRelatorioSapato(sapatoSelecionado, numObjeto);

                        } else {
                            alterarSapato = false;
                        }
                    }
                    break;

                case 2:
                    limparTela();
                    System.out.println("========================================");
                    System.out.println("           TESTE: PACIENTE              ");
                    System.out.println("========================================");

                    Paciente paciente1 = new Paciente("Carlos Silva", 25, 75.5);
                    Paciente paciente2 = new Paciente("Ana Maria", 68, 62.0);

                    exibirRelatorioPaciente(paciente1, 1);
                    System.out.println();
                    exibirRelatorioPaciente(paciente2, 2);

                    boolean alterarPaciente = true;
                    while (alterarPaciente) {
                        System.out.print("\nVocê quer mudar algum valor de qual paciente? (1 para Paciente 1 / 2 para Paciente 2 / 0 para Não alterar): ");
                        int numObjeto = leitor.nextInt();
                        leitor.nextLine();

                        if (numObjeto == 1 || numObjeto == 2) {
                            Paciente pacienteSelecionado = (numObjeto == 1) ? paciente1 : paciente2;

                            System.out.println("\nQual valor você quer alterar no Paciente " + numObjeto + "?");
                            System.out.println("1 - Nome");
                            System.out.println("2 - Idade");
                            System.out.println("3 - Peso");
                            System.out.print("Opção: ");
                            int opcaoAlterar = leitor.nextInt();
                            leitor.nextLine();

                            limparTela();

                            if (opcaoAlterar == 1) {
                                System.out.print("Digite o novo nome: ");
                                String novoNome = leitor.nextLine();
                                pacienteSelecionado.setNome(novoNome);
                                System.out.println("\n[SUCESSO] Nome alterado com sucesso!");
                                System.out.println("Informação alterada -> Nome: " + pacienteSelecionado.getNome());
                            } else if (opcaoAlterar == 2) {
                                System.out.print("Digite a nova idade: ");
                                int novaIdade = leitor.nextInt();
                                leitor.nextLine();
                                pacienteSelecionado.setIdade(novaIdade);
                                System.out.println("\n[SUCESSO] Idade alterada com sucesso!");
                                System.out.println("Informação alterada -> Idade: " + pacienteSelecionado.getIdade());
                            } else if (opcaoAlterar == 3) {
                                System.out.print("Digite o novo peso: ");
                                double novoPeso = leitor.nextDouble();
                                leitor.nextLine();
                                pacienteSelecionado.setPeso(novoPeso);
                                System.out.println("\n[SUCESSO] Peso alterado com sucesso!");
                                System.out.println("Informação alterada -> Peso: " + pacienteSelecionado.getPeso());
                            } else {
                                System.out.println("[ERRO] Opção de alteração inválida.");
                            }

                            System.out.println("\n--- DADOS ATUALIZADOS E RECALCULADOS ---");
                            exibirRelatorioPaciente(pacienteSelecionado, numObjeto);

                        } else {
                            alterarPaciente = false;
                        }
                    }
                    break;

                case 3:
                    limparTela();
                    System.out.println("========================================");
                    System.out.println("            TESTE: CELULAR              ");
                    System.out.println("========================================");

                    Celular celular1 = new Celular("Galaxy S23", 3500.0, "Android");
                    Celular celular2 = new Celular("iPhone 13", 2800.0, "iOS");

                    exibirRelatorioCelular(celular1, 1);
                    System.out.println();
                    exibirRelatorioCelular(celular2, 2);

                    boolean alterarCelular = true;
                    while (alterarCelular) {
                        System.out.print("\nVocê quer mudar algum valor de qual celular? (1 para Celular 1 / 2 para Celular 2 / 0 para Não alterar): ");
                        int numObjeto = leitor.nextInt();
                        leitor.nextLine();

                        if (numObjeto == 1 || numObjeto == 2) {
                            Celular celularSelecionado = (numObjeto == 1) ? celular1 : celular2;

                            System.out.println("\nQual valor você quer alterar no Celular " + numObjeto + "?");
                            System.out.println("1 - Modelo");
                            System.out.println("2 - Preço");
                            System.out.println("3 - Sistema Operacional");
                            System.out.print("Opção: ");
                            int opcaoAlterar = leitor.nextInt();
                            leitor.nextLine();

                            limparTela();

                            if (opcaoAlterar == 1) {
                                System.out.print("Digite o novo modelo: ");
                                String novoModelo = leitor.nextLine();
                                celularSelecionado.setModelo(novoModelo);
                                System.out.println("\n[SUCESSO] Modelo alterado com sucesso!");
                                System.out.println("Informação alterada -> Modelo: " + celularSelecionado.getModelo());
                            } else if (opcaoAlterar == 2) {
                                System.out.print("Digite o novo preço: ");
                                double novoPreco = leitor.nextDouble();
                                leitor.nextLine();
                                celularSelecionado.setPreco(novoPreco);
                                System.out.println("\n[SUCESSO] Preço alterado com sucesso!");
                                System.out.println("Informação alterada -> Preço: " + celularSelecionado.getPreco());
                            } else if (opcaoAlterar == 3) {
                                System.out.print("Digite o novo sistema operacional: ");
                                String novoSistema = leitor.nextLine();
                                celularSelecionado.setSistemaOperacional(novoSistema);
                                System.out.println("\n[SUCESSO] Sistema alterado com sucesso!");
                                System.out.println("Informação alterada -> Sistema Operacional: " + celularSelecionado.getSistemaOperacional());
                            } else {
                                System.out.println("[ERRO] Opção de alteração inválida.");
                            }

                            System.out.println("\n--- DADOS ATUALIZADOS E RECALCULADOS ---");
                            exibirRelatorioCelular(celularSelecionado, numObjeto);

                        } else {
                            alterarCelular = false;
                        }
                    }
                    break;

                case 0:
                    limparTela();
                    System.out.println("Encerrando o programa de testes. Até logo!");
                    executando = false;
                    break;

                default:
                    System.out.println("\n[ERRO] Opção inválida! Pressione Enter para tentar novamente...");
                    leitor.nextLine();
                    break;
            }
        }

        leitor.close();
    }
}