package LinketinderDesafioZG.classes

import groovy.transform.ToString

@ToString
class Empresa {
    private static Integer idContador = 0

    Integer id = ++idContador
    String nome
    String emailCorporativo
    String cnpj
    String pais
    String estado
    String cep
    String descricaoEmpresa

    List<String> competenciasEsperadas = []
    List<Integer> pessoasCurtidas = []

    void addCompetencia(String x){
        competenciasEsperadas << x.toLowerCase().trim()
    }

    void printBonito(){
        println("""Empresa:
            Id: $id,
            Nome: $nome,
            Email: $emailCorporativo,
            CNPJ: $cnpj,
            País: $pais,
            Estado: $estado,
            CEP: $cep,
            Descrição:
            $descricaoEmpresa;
            
            Competências esparadas: ${competenciasEsperadas.join(", ")}
            Id's de candidatos curtidos: ${pessoasCurtidas.join(", ")}
            """)
    }

}
