import java.lang.Exception
import kotlin.system.exitProcess

fun main(){
    val newServiceDog = createServiceDog()

    // функция получения информации о собаки
    newServiceDog.getServiceDogInfo()

    // взаимодействие с собакой
    newServiceDog.bark()
    newServiceDog.sleep()

    // функция замены клички
    newServiceDog.setName()
    newServiceDog.getServiceDogInfo()

    // функция перевода лет в дни (опыт)
    newServiceDog.yearsToDays()

    val newSportsDog = createSportsDog()

    // функция получения информации о собаки
    newSportsDog.getSportsDogInfo()

    // взаимодействие с собакой
    newSportsDog.growling()

    // функция обновления рекорда собаки
    newSportsDog.updateRecord()
    newSportsDog.getSportsDogInfo()

    // функция изменения дисциплины собаки
    newSportsDog.setDiscipline()
    newSportsDog.getSportsDogInfo()

    newSportsDog.sleep()

}

fun createServiceDog(): serviceDog {
    try {
        println("Служебная собака.")
        print("Введите кличку собаки: ")
        val name = readLine().toString()
        print("Введите породу собаки: ")
        val breed = readLine().toString()
        print("Введите задачу, которую выполняет служебная собака: ")
        val purpose = readLine().toString()
        if (name.isBlank() || breed.isBlank() || purpose.isBlank()) throw Exception()

        print("Введите опыт службы (в годах): ")
        val experience = readLine()!!.toInt()
        if (experience > 15 || experience < 0) throw Exception()

        return serviceDog(name, breed, purpose, experience)
    }
    catch (e: Exception){
        println("Ошибка ввода данных")
        exitProcess(0)
    }
}

fun createSportsDog(): sportsDog {
    try {
        println("Спортивная собака.")
        print("Введите кличку собаки: ")
        val name = readLine().toString()
        print("Введите породу собаки: ")
        val breed = readLine().toString()
        print("Введите спортивную дисциплину собаки: ")
        val discipline = readLine().toString()
        if (name.isBlank() || breed.isBlank() || discipline.isBlank()) throw Exception()

        print("Введите лучший результат на соревнованиях: ")
        val record = readLine()!!.toDouble()
        if (record < 0.0) throw Exception()

        return sportsDog(name, breed, discipline, record)
    }
    catch (e: Exception){
        println("Ошибка ввода данных")
        exitProcess(0)
    }
}