import entity.Bibliotheque

import entity.Livre
import entity.Emprunt
import entity.SpecialLecteur
import kotlin.text.toInt
import kotlin.text.toInt as textToInt
import java.time.*
import java.util.Date


fun main(args: Array<String>) {
   //liste

    val listeEmprunt= mutableListOf<Emprunt>()
    var listeLivre= mutableListOf<Livre>()
    //instanciation

    println("**********bibliotheque de la gloire********")

    println(" choisir:\n 1-ajouter un livre dans la bibliotheque\n 2-emprunter un livre\n ")

    // livre a ajouter
var resp = readLine()?.toInt()
    if (resp==1) {
        do {
            var liv1 = Livre(2,"wet","mart","12.03.2001","fade",8)

            println("information sur le livre a ajouter?")

            println("id du livre")
            liv1.idliv = readLine()?.toInt()!!
            println("intituler")
            liv1.intituler = readLine().toString()
            println("nom_aut")
            liv1.nom_aut = readLine().toString()
            println("date_pub")
            liv1.date_pub = readLine().toString()
            println("maison_eddi")
            liv1.maison_eddi = readLine().toString()
            println("id_biblio")
            liv1.id_biblio = readLine()?.toInt()!!

            listeLivre.add(liv1)


            println("voulez vous ajouter une autre livre? \n 0 pour non \n 1 pour oui")
            var result = readLine()?.toInt()

        }while (result==1)

        for (listeLiv in listeLivre){
            println("id du livre ${listeLiv.idliv},\n  intituler du livre ${listeLiv.intituler},\n nom de l'auteur ${listeLiv.nom_aut},\n date de publication ${listeLiv.date_pub},\n maison d'eddition ${listeLiv.maison_eddi}\n, id bibliotheque ${listeLiv.id_biblio}\n")

        }

    }


    // emprunter une livre

    if (resp==2) {
        do {
            val empr1 = Emprunt(4,2,6,"2023-11-2","2023-11-29")

            println("entrez les information sur le livre a emprunter")
            println("id emprunt")
            empr1.idemp = readLine()?.toInt()!!
            println("id livre")
            empr1.idliv = readLine()?.toInt()!!
            println("id lecteur")
            empr1.idlec = readLine()?.toInt()!!
            empr1.dateEmprunt = LocalDate.now().toString()
            empr1.dateRetour = LocalDate.now().plusDays(3).toString()

            println("livre emprunter\n")
            listeEmprunt.addAll(listOf(empr1))
            println("voulez vous emprunter une autre? \n 0 pour non \n 1 pour oui")
            var result = readLine()?.toInt()

        }while (result==1)
        for (listeEmpr in listeEmprunt){
            println(" id emprunt ${listeEmpr.idemp} id livre: ${listeEmpr.idliv}, id lecteur: ${listeEmpr.idlec}, date d'emprunt :${listeEmpr.dateEmprunt} date de restour:,${listeEmpr.dateRetour}")

        }

    }
    }



