enum class Level { BASIC, INTERMEDIARY, ADVANCED }

data class User(val name: String, val matriculation: Int)

data class EducationalContent(val name: String, val duration: Int, val description: String){
    fun printContent() {
        println("Nome: $name")
        println("Duração: $duration")
        println("Descrição: $description")
        println()
    }
}

data class Formation(val name: String, val dificulty: Level, val content: List<EducationalContent>){

    val registeredUsers = mutableListOf<User>()

    fun matriculate(user: User) {
        registeredUsers.add(user)
        println("Matriculado com sucesso!")
        println("Usuário: ${user.name}")
        println("Matrícula: ${user.matriculation}")
        println()
    }

    fun cancelMatriculation(user: User) {
        registeredUsers.remove(user)
        println("Cancelamento de matrícula realizado com sucesso!")
        println("Usuário: ${user.name}")
        println("Matrícula: ${user.matriculation}")
        println()
    }

    fun printFormation() {
        println("Curso de $name")
        println("Nível: $dificulty")
        println("Conteúdos: ")
        for (content in content) {
            content.printContent()
        }
    }

    fun printMatriculatedUsers() {
        println("Matriculados no curso de $name")
        for (user in registeredUsers) {
            println(user)
            println()
        }
    }
}

fun main() {
    val cursoKotlin = Formation("Kotlin", Level.INTERMEDIARY, listOf(
        EducationalContent("Kotlin", 20, "Curso de Kotlin"),
        EducationalContent("Java", 10, "Curso de Java")
    ))

    val cursoDados = Formation("Dados", Level.BASIC, listOf(
        EducationalContent("Python", 20, "Curso de Python"),
        EducationalContent("R", 15, "Curso de R")
    ))

    val cursoAndroid = Formation("Android", Level.ADVANCED, listOf(
        EducationalContent("Java", 10, "Curso de Java"),
        EducationalContent("Kotlin", 25, "Curso de Kotlin"),
        EducationalContent("Firebase", 20, "Curso de FireBase")
    ))

    val user1 = User("XXXXXXXX", 1234)
    val user2 = User("XXXXXXXX", 5678)
    val user3 = User("XXXXXXXX", 9012)
    val user4 = User("XXXXXXXX", 3456)
    val user5 = User("XXXXXXXX", 7890)
    val user6 = User("XXXXXXXX", 1234)
    val user7 = User("XXXXXXXX", 5678)
    val user8 = User("XXXXXXXX", 9012)
    val user9 = User("XXXXXXXX", 3456)

    cursoKotlin.matriculate(user1)
    cursoKotlin.matriculate(user2)
    cursoKotlin.matriculate(user3)
    cursoDados.matriculate(user4)
    cursoDados.matriculate(user5)
    cursoAndroid.matriculate(user6)
    cursoAndroid.matriculate(user7)
    cursoAndroid.matriculate(user8)
    cursoAndroid.matriculate(user9)
	
    println()
    println()

    cursoKotlin.printFormation()
    cursoDados.printFormation()
    cursoAndroid.printFormation()

    cursoKotlin.printMatriculatedUsers()
    cursoDados.printMatriculatedUsers()
    cursoAndroid.printMatriculatedUsers()

    cursoAndroid.cancelMatriculation(user9)
    cursoAndroid.printMatriculatedUsers()
}