data class Conta(var saldo: Int){
    fun sacar(valor: Int){
        if (valor <= saldo){
            saldo -= valor
            println("Saque realizado com sucesso. Novo saldo: $saldo")
        } else {
            println("Saldo insuficiente. Saque nao realizado!")
        }
    }
}

fun main() {
  // Entrada de dados
  val saldoTotal = readLine() !!.toInt()
  val valorSaque = readLine() !!.toInt()

  //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
  val conta = Conta(saldoTotal)
  conta.sacar(valorSaque)
}
