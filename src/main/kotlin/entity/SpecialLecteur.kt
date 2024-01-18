package entity

class SpecialLecteur():Lecteur(2,"tatou","mirenda","feminin") {
    init {
        println("lecteur speciale")
    }
    fun lire(){
        nom = "mirenda la douce"
        println(nom)
    }
}