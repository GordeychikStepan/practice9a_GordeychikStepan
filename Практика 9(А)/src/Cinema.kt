package MovieTheaters

open class Cinema(var name: String, var ageCinema: Int) {

    open fun ageStatus() {
        if (ageCinema < 5) println("$name - новый кинотеатр.")
        else if (ageCinema < 15) println("$name - не новый кинотеатр.")
        else println("$name - старый кинотеатр.")
    }

    open fun openCinema() {
        println("Кинотеатр '$name' - сейчас открыт.")
    }

    open fun closeCinema() {
        println("Кинотеатр '$name' - сейчас закрыт.")
    }
}