package task2

fun printMessage(likes: Int){
    val endMessage: String = if (likes  == 11) "людям"
    else if (likes % 1000 == 0) "человек"
    else if (likes % 10 == 1) "человеку"
    else "людям"
    println("Понравилось $likes $endMessage")
}

fun main() {
    while (true) {
        print("Введите количество лайков: ")
        val likes: Int = readln().toInt()
        printMessage(likes)
    }
}