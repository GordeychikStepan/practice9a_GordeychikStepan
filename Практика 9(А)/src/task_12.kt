import java.lang.Exception
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import kotlin.system.exitProcess

fun main(){
    val newFilmCinema = createFilm()

    // функция получения информации о фильме
    newFilmCinema.getFilmInfo()

    // взаимодействие с кинотеатром
    newFilmCinema.ageStatus()
    newFilmCinema.openCinema()

    // функция перевода продолжительности фильма (минуты - часы)
    newFilmCinema.minutesToHours()

    // функция замены продолжительности фильма
    newFilmCinema.setDuration()
    newFilmCinema.minutesToHours()
    newFilmCinema.getFilmInfo()

    val newSessionCinema = createSession()

    // функция получения информации о сессии
    newSessionCinema.getSessionInfo()

    // взаимодействие с кинотеатром
    newSessionCinema.closeCinema()
    newSessionCinema.ageStatus()

    // функция подсчета продолжительности сеанса
    newSessionCinema.durationSession()

    // функция изменения фильма
    newSessionCinema.setFilm()
    newSessionCinema.getSessionInfo()
}

fun createFilm(): filmCinema{
    try {
        print("Введите название кинотеатра: ")
        val name = readLine().toString()
        print("Введите возраст кинотеатра: ")
        val ageCinema = readLine()!!.toInt()
        if (ageCinema < 0 || ageCinema > 100) throw Exception()

        print("Введите название фильма: ")
        val title = readLine().toString()
        print("Введите продолжительность фильма (в минутах): ")
        val duration = readLine()!!.toInt()
        if (duration < 30 || duration > 300) throw Exception()

        print("Введите жанр фильма: ")
        val genre = readLine().toString()

        if (name.isBlank() || title.isBlank() || genre.isBlank()) throw Exception()

        return filmCinema(name, ageCinema, title, duration, genre)
    }
    catch (e: Exception){
        println("Ошибка ввода данных.")
        exitProcess(0)
    }
}

fun createSession(): sessionCinema{
    try {
        println()
        print("Введите название кинотеатра: ")
        val name = readLine().toString()
        print("Введите возраст кинотеатра: ")
        val ageCinema = readLine()!!.toInt()
        if (ageCinema < 0 || ageCinema > 100) throw Exception()

        print("Введите название сеанса: ")
        val film = readLine().toString()

        val format = DateTimeFormatter.ofPattern("HH:mm")
        print("Введите время начала сеанса (час:мин): ")
        val startTimeStr = readLine()
        val startTime = LocalTime.parse(startTimeStr, format)

        print("Введите время конца сеанса (час:мин): ")
        val endTimeStr = readLine()
        val endTime = LocalTime.parse(endTimeStr, format)

        if (!endTime.isAfter(startTime)) throw Exception()

        if (name.isBlank() || film.isBlank()) throw Exception()

        return sessionCinema(name, ageCinema, film, startTime, endTime)
    }
    catch (e: Exception){
        println("Ошибка ввода данных")
        exitProcess(0)
    }
}