fun ordemAlfabetica(ativos: MutableList<String>) {
    ativos.sort()
    for (ativo in ativos) {
        println(ativo)
        }
}

fun main() {
    val ativos = mutableListOf<String>()

    // Entrada da quantidade de ativos
    val quantidadeAtivos = readLine()!!.toInt()

    // Entrada dos códigos dos ativos
    for (i in 1..quantidadeAtivos) {
        val codigoAtivo = readLine()!!
        ativos.add(codigoAtivo)
    }

    // Chamada da função de ordenação
    ordemAlfabetica(ativos)
}