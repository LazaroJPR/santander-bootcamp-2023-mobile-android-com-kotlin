import java.util.Scanner

data class ContaBancaria(private val numeroConta: Int, private val nomeTitular: String, private val saldo: Double) {
    fun print(){
        println("Informacoes:")
        println("Conta: $numeroConta")
        println("Titular: $nomeTitular")
        println("Saldo: R$ $saldo")
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val numeroConta = scanner.nextInt()
    scanner.nextLine()
    val nomeTitular = scanner.nextLine()
    val saldo = scanner.nextDouble()

    val contaBancaria = ContaBancaria(numeroConta, nomeTitular, saldo)  
    contaBancaria.print()
}