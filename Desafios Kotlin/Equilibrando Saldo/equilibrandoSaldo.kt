data class Conta(var saldo: Float){
    fun realizarTransacao(valor: Float){
        saldo += valor
    }

    fun imprimir(){
        println("Saldo atualizado na conta: %.1f".format(saldo))
    }

}

fun main() {
    val saldoAtual = readLine()!!.toFloat()
    val valorDeposito = readLine()!!.toFloat()
    var valorRetirada = readLine()!!.toFloat()
    
    valorRetirada *= -1

    val conta = Conta(saldoAtual)
    conta.realizarTransacao(valorDeposito)
    conta.realizarTransacao(valorRetirada)
    conta.imprimir()
}