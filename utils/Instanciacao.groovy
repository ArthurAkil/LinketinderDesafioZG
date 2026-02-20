package LinketinderDesafioZG.utils

import LinketinderDesafioZG.classes.Empresa
import LinketinderDesafioZG.classes.Person

class Instanciacao {

    List<Person> pessoas = []
    List<Empresa> empresas = []

    Instanciacao() {
        criarPessoas()
        criarEmpresas()
    }

    void adicionarPessoa(Person p){
        pessoas << p
    }

    void adicionarEmpresa(Empresa e){
        empresas << e
    }

    private void criarPessoas() {
        def p1 = new Person(
                nome: "Arthur Silva",
                email: "arthur@gmail.com",
                cpf: "12345678901",
                idade: 25,
                estado: "PB",
                cep: "58000000",
                descricaoPessoal: "Desenvolvedor backend."
        )
        p1.addCompetencia("Java")
        p1.addCompetencia("Groovy")
        p1.addCompetencia("SQL")

        def p2 = new Person(
                nome: "Mariana Costa",
                email: "mariana@gmail.com",
                cpf: "98765432100",
                idade: 22,
                estado: "SP",
                cep: "01000000",
                descricaoPessoal: "Front-end apaixonada por UI."
        )
        p2.addCompetencia("React")
        p2.addCompetencia("JavaScript")
        p2.addCompetencia("CSS")

        def p3 = new Person(
                nome: "Carlos Mendes",
                email: "carlos@gmail.com",
                cpf: "45678912345",
                idade: 30,
                estado: "MG",
                cep: "30000000",
                descricaoPessoal: "Especialista em DevOps."
        )
        p3.addCompetencia("Docker")
        p3.addCompetencia("AWS")
        p3.addCompetencia("Linux")

        def p4 = new Person(
                nome: "Juliana Alves",
                email: "juliana@gmail.com",
                cpf: "11122233344",
                idade: 27,
                estado: "RJ",
                cep: "20000000",
                descricaoPessoal: "Desenvolvedora mobile."
        )
        p4.addCompetencia("Flutter")
        p4.addCompetencia("Kotlin")
        p4.addCompetencia("Firebase")

        def p5 = new Person(
                nome: "Rafael Souza",
                email: "rafael@gmail.com",
                cpf: "99988877766",
                idade: 29,
                estado: "BA",
                cep: "40000000",
                descricaoPessoal: "Fullstack developer."
        )
        p5.addCompetencia("Node")
        p5.addCompetencia("React")
        p5.addCompetencia("PostgreSQL")

        pessoas.addAll([p1, p2, p3, p4, p5])
    }

    private void criarEmpresas() {
        def e1 = new Empresa(
                nome: "Tech Solutions",
                emailCorporativo: "contato@techsolutions.com",
                cnpj: "11222333000199",
                pais: "Brasil",
                estado: "SP",
                cep: "02000000",
                descricaoEmpresa: "Foco em backend e APIs."
        )
        e1.addCompetencia("Java")
        e1.addCompetencia("SQL")
        e1.addCompetencia("Spring")

        def e2 = new Empresa(
                nome: "Creative Digital",
                emailCorporativo: "rh@creativedigital.com",
                cnpj: "99888777000155",
                pais: "Brasil",
                estado: "RJ",
                cep: "20000000",
                descricaoEmpresa: "Desenvolvimento web moderno."
        )
        e2.addCompetencia("React")
        e2.addCompetencia("TypeScript")
        e2.addCompetencia("Figma")

        def e3 = new Empresa(
                nome: "Cloud Infra",
                emailCorporativo: "jobs@cloudinfra.com",
                cnpj: "44556677000122",
                pais: "Brasil",
                estado: "MG",
                cep: "31000000",
                descricaoEmpresa: "Infraestrutura em nuvem."
        )
        e3.addCompetencia("AWS")
        e3.addCompetencia("Docker")
        e3.addCompetencia("Kubernetes")

        def e4 = new Empresa(
                nome: "Mobile Labs",
                emailCorporativo: "contato@mobilelabs.com",
                cnpj: "55667788000144",
                pais: "Brasil",
                estado: "PB",
                cep: "58000000",
                descricaoEmpresa: "Apps mobile inovadores."
        )
        e4.addCompetencia("Flutter")
        e4.addCompetencia("Firebase")
        e4.addCompetencia("UX")

        def e5 = new Empresa(
                nome: "FullStack Corp",
                emailCorporativo: "recrutamento@fullstack.com",
                cnpj: "22334455000188",
                pais: "Brasil",
                estado: "BA",
                cep: "40000000",
                descricaoEmpresa: "Projetos fullstack escaláveis."
        )
        e5.addCompetencia("Node")
        e5.addCompetencia("React")
        e5.addCompetencia("PostgreSQL")

        empresas.addAll([e1, e2, e3, e4, e5])

        pessoas[0].empresasCurtidas.addAll([empresas[0].id, empresas[2].id])
        pessoas[1].empresasCurtidas.addAll([empresas[1].id])
        pessoas[2].empresasCurtidas.addAll([empresas[2].id, empresas[4].id])

        empresas[0].pessoasCurtidas.addAll([pessoas[0].id, pessoas[4].id])
        empresas[1].pessoasCurtidas.addAll([pessoas[1].id])
        empresas[4].pessoasCurtidas.addAll([pessoas[2].id])
    }
}