import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val dataInicial = scanner.nextLine()
    val dataFinal = scanner.nextLine()

    val sistemaAcionistas = SistemaAcionistas()
    val analises = sistemaAcionistas.obterAnalisesDesempenho(dataInicial, dataFinal)

    for (analise in analises) {
        println(analise)
    }
}

class SistemaAcionistas {
    fun obterAnalisesDesempenho(dataInicialStr: String, dataFinalStr: String): List<String> {
        val df = SimpleDateFormat("dd/MM/yyyy")
        val dataInicial = df.parse(dataInicialStr)
        val dataFinal = df.parse(dataFinalStr)

        val analises = mutableListOf<Analise>()
        analises.add(Analise(df.parse("01/01/2023"), "Analise de Desempenho Financeiro"))
        analises.add(Analise(df.parse("15/02/2023"), "Analise de Riscos e Exposicoes"))
        analises.add(Analise(df.parse("31/03/2023"), "Analises Corporativas"))
        analises.add(Analise(df.parse("01/04/2023"), "Analise de Politicas e Regulamentacoes"))
        analises.add(Analise(df.parse("15/05/2023"), "Analise de Ativos"))
        analises.add(Analise(df.parse("30/06/2023"), "Analise de Inovacao e Tecnologia"))

        return analises.filter { analise -> analise.data >= dataInicial && analise.data <= dataFinal }.map { analise -> analise.descricao }
    }
}

data class Analise(val data: Date, val descricao: String)