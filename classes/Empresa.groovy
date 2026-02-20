package LinketinderDesafioZG.classes

class Empresa {
    String nome
    String emailCorporativo
    String cnpj
    String pais
    String estado
    String cep
    String descricaoEmpresa

    List<String> competenciasEsperadas = []

    void addCompetencia(String x){
        competenciasEsperadas << x.toLowerCase().trim()
    }
}
