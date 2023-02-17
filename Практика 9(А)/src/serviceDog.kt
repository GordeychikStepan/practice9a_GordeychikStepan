import Dogs.*

class serviceDog(name: String, breed: String, var purpose: String, var experience: Int) : Dog(name, breed) {

    fun getServiceDogInfo() {
        println("Кличка: $name; Порода: $breed; Задача: $purpose; Опыт работы (в годах): $experience.")
    }

    fun setName() {
        print("Введите новую кличку для собаки: ")
        val setName = readLine().toString()
        if (setName.isBlank()) {
            println("Ошибка ввода.")
            return
        }
        this.name = setName
    }

    fun yearsToDays() {
        println("Собака $name отслужила: ${365 * experience} дней")
    }
}