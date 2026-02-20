package LinketinderDesafioZG.menu

import LinketinderDesafioZG.utils.Instanciacao

class Menu {
    Instanciacao listas = new Instanciacao()
    private Boolean app = true

    Scanner sc = new Scanner(System.in)

    void iniciar(){
        while (app){
            menuInicial()
        }
    }

    void menuInicial(){
        println("Seja bem vindo ao Linketinder - Onde você encontra a sua futura empresa e a empresa encontra você!")
        println("Selecione uma opção: [1] - Ver Empresas-Canditados cadastrados / [2] - Cadastrar uma empresa ou canditado / [3] - Ver matches / [4] - Sair")
        Integer escolha = sc.nextInt()
        sc.nextLine()
        switch (escolha){
            case 1:
                menuRead()
                break;
            case 2:
                menuCadastro()
                break;
            case 3:
                listas.verMatches()
                break;
            default:
                this.app = false;
                println("Saindo..")
                break;
        }
    }

    void menuRead(){
        println("Deseja ver a lista de: [1] - Empresas / [2] - Candidatos / [3] - Voltar ao inicio")
        Integer escolha = sc.nextInt()
        sc.nextLine()
        switch (escolha) {
            case 1:
                listas.empresas.forEach { empresa ->
                    empresa.printBonito()
                }
                break;
            case 2:
                listas.pessoas.forEach { pessoa ->
                    pessoa.printBonito()
                }
                break;
            default:
                println("Voltando ao inicio")
                break;
        }
    }

    void menuCadastro(){
        println("Deseja cadastrar uma: [1] - Empresa / [2] - Candidato / [3] - Voltar ao início")
        try {
            int escolha = sc.nextInt()
            sc.nextLine()

            switch (escolha){
                case 1: {
                    println("Informe os dados: ")
                    print("Nome: ")
                    String nome = sc.nextLine()
                    print("Email corporativo: ")
                    String email = sc.nextLine()
                    print("CNPJ: ")
                    String cnpj = sc.nextLine()
                    print("País: ");
                    String pais = sc.nextLine()
                    print("Estado: ")
                    String estado = sc.nextLine()
                    print("CEP: ")
                    String cep = sc.nextLine()
                    print("Descrição: ")
                    String desc = sc.nextLine()
                    print("Competências (separe por vírgula): ")
                    List<String> comps = sc.nextLine().split(",")*.trim()
                    listas.cadastrarEmpresa(nome, email, cnpj, pais, estado, cep, desc, comps)

                    println("Empresa cadastrada com sucesso!")
                    break
                }
                case 2: {
                    print("Nome: ");
                    String nome = sc.nextLine()
                    print("Email: ");
                    String email = sc.nextLine()
                    print("CPF: ");
                    String cpf = sc.nextLine()
                    print("Idade: ");
                    int idade = sc.nextInt()
                    sc.nextLine()
                    print("Estado: ");
                    String estado = sc.nextLine()
                    print("CEP: ");
                    String cep = sc.nextLine()
                    print("Descrição: ");
                    String desc = sc.nextLine()
                    print("Competências (separe por vírgula): ");
                    List<String> comps = sc.nextLine().split(",")*.trim()

                    listas.cadastrarPessoa(nome, email, cpf, idade, estado, cep, desc, comps)
                    println("Candidato cadastrado com sucesso!")
                    break;
                }
                default:
                    println("Voltando..")
                    break;
            }
        } catch (Exception e){
            println("Ocorreu um erro, tente cadastrar novamente. Error: ${e.getMessage()}" )
        }
    }

    void verMatches(){

    }
}
