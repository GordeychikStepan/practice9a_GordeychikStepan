import Dogs.*
import java.lang.Exception

class sportsDog (name: String, breed: String, var discipline: String, var record: Double) : Dog(name, breed) {

    fun getSportsDogInfo() {
        println("Кличка: $name; Порода: $breed; Дисциплина: $discipline; Рекорд по дисциплине: $record.")
    }

    fun updateRecord() {
        print("Введите новый рекорд для собаки: ")
        val setRecord: Double
        try {
            setRecord = readLine()!!.toDouble()
        }
        catch (e: Exception){
            println("Ошибка ввода.")
            return
        }
        if (setRecord > record && setRecord > 0.0){
            println("$name смогла установить новый рекорд по дисциплине $discipline")
            this.record = setRecord
        }
        else println("$name не смогла установить новый рекорд по дисциплине $discipline")
    }

    fun setDiscipline() {
        print("Введите новую дисциплину у собаки $name: ")
        val setDiscipline = readLine().toString()
        if (setDiscipline.isBlank()) {
            println("Ошибка ввода.")
            return
        }
        else{
            this.discipline = setDiscipline
            this.record = 0.0
        }
    }
}