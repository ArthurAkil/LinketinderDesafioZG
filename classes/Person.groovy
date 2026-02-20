package LinketinderDesafioZG.classes

class Person {
    String nome
    String email
    String cpf
    Integer idade
    String estado
    String cep
    String descricaoPessoal

    List<String> competencias = []

    void addCompetencia(String x){
        competencias << x.toLowerCase().trim()
    }
}
