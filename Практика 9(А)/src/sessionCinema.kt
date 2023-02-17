import MovieTheaters.*
import java.time.LocalTime
import java.time.temporal.ChronoUnit

class sessionCinema (name: String, ageCinema: Int, var film: String, var startTime: LocalTime, var endTime: LocalTime) : Cinema(name, ageCinema) {

    fun getSessionInfo() {
        println("В кинотеатре '$name' будет сеанс: $film. Начало: $startTime Конец: $endTime.")
    }

    fun durationSession() {
        val min = startTime.until(endTime, ChronoUnit.MINUTES)
        println("Продолжительность сеанса в минутах: $min")
    }

    fun setFilm() {
        print("Введите измененное название сеанса: ")
        val setFilm = readLine().toString()
        if (setFilm.isBlank()) {
            println("Ошибка ввода.")
            return
        }
        else
            this.name = setFilm
    }
}