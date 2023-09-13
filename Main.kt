package exAnimal

import java.lang.Exception

fun main() {

    //função para ler numeros inteiros
    fun readInt(): Int {
        return readLine()?.toIntOrNull() ?: 0
    }

    var op: Int = 0

    try {
        println("Crie seu animal\nInsira o nome:")
        var nome: String = readLine().toString()
        println("Insira a classe: ")
        var classe:String = readLine().toString()
        println("Insira a familia:")
        var familia:String = readLine().toString()

        //instancia do objeto bixnho do tipo Animais
        var bixinho = Animais(nome, classe, familia)
        println(bixinho.nasceu())

        while (op!=4){
            println("o que $nome vai fazer agora?\n  \n1) Comer\n2) Correr\n3) Dormir\n4) Morrer")
            op = readInt()
            when(op) {
                1-> println(bixinho.comer())
                2-> println(bixinho.correr())
                3-> println(bixinho.dormir())
                4-> println(bixinho.morrer())
                //5->bixinho.status -> IMPLEMENTAR A BARRINHA DE STATUS DO BIXINHO
                else -> println("Ta errado ai mano")
            }
        }
        println("GAME OVER")

    } catch (e: Exception ) {
        println("Erro ${e.message}")
    }

}


