package LinketinderDesafioZG

import LinketinderDesafioZG.classes.Empresa

Empresa e = new Empresa()

e.addCompetencia("    python   ")
e.addCompetencia("    Comunicação Efetiva   ")

e.competenciasEsperadas.forEach {
    println(it)
}

