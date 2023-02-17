package Dogs

open class Dog(var name: String, var breed: String) {

    open fun bark(){
        println("$name: Гав!!")
    }

    open fun growling(){
        println("$name: РРРрррр!!")
    }

    open fun sleep(){
        println("$name: сейчас спит...")
    }
}