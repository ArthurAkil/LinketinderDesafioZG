package LinketinderDesafioZG.classes

import groovy.transform.ToString

@ToString
class Person {
    private static int idContador = 0

    int id = ++idContador
    String nome
    String email
    String cpf
    Integer idade
    String estado
    String cep
    String descricaoPessoal

    List<String> competencias = []
    List<Integer> empresasCurtidas = []

    void addCompetencia(String x){
        competencias << x.toLowerCase().trim()
    }

    void printBonito(){
        println("""Candidato:
            Id: $id,
            Nome: $nome,
            Email: $email,
            CPF: $cpf,
            Idade: $idade,
            Estado: $estado,
            CEP: $cep,
            Descrição:
            $descricaoPessoal;
            
            Competências esparadas: ${competencias.join(", ")}
            Id's de empresas curtidas: ${empresasCurtidas.join(", ")}
            """)
    }
}
