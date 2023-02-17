import MovieTheaters.*
import java.lang.Exception

class filmCinema (name: String, ageCinema: Int, var title: String, var duration: Int, var genre: String) : Cinema(name, ageCinema) {

    fun getFilmInfo() {
        println("В кинотеатре '$name' показывается фильм - $title, продолжительностью: $duration минут. Жанр - $genre.")
    }

    fun minutesToHours() {
        val hours = duration / 60
        val minutes = duration % 60
        println("Продолжительность фильма $title в часах = $hours:${String.format("%02d", minutes)}")
    }

    fun setDuration() {
        val setDuration: Int
        try {
            print("Введите новое время продолжительности для фильма $title (в минутах): ")
            setDuration = readLine()!!.toInt()
            if (setDuration < 30 || setDuration > 300) throw Exception()
        }
        catch (e: Exception){
            println("Ошибка ввода.")
            return
        }
        this.duration = setDuration
    }
}