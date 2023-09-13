package exAnimal

class Animais (
    private  var nome: String,
    private var classe: String,
    private var familia: String,
    private var idade: Int = 0,
    private var estado: Boolean = true,
    private var caloria: Int = 10,
    private var forca: Int = 10
){
    fun nasceu(): String {
        return "O animal se chama $nome é da classe $classe da familia $familia. O animal possui força de $forca\n" +
                "caloria de $caloria e idade de $idade anos\n"
    }
    fun comer(): String {
        caloria += 10
        forca -= 2
        return  "O animalzinho apos comer ficou com:\n" +
                "força de: $forca \n" +
                "calorias de: $caloria"
    }
    fun correr (): String {
        forca -= 5
        caloria -= 5
        return  "Apos correr o animal ficou com forca de $forca e caloria de $caloria"
    }

    fun dormir (): String {
        forca += 10
        caloria -= 2
        return "dormindo.. forca: $forca e caloria: $caloria"
    }
    fun morrer(): String {
        forca = 0
        estado = false
        return "O animalzinho morreu :("
    }

}
