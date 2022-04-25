package hw131

fun main(){
    while (true) {
        println("Укажите время в секундах")
        val time : Int = readln().toInt()
        println(agoToText(time))
    }
}

fun agoToText(timeSec : Int): String{
    val result : String
    when (timeSec){
        in 0..60 -> result = "только что"
        in 61..3600 -> result = secToMinutes(timeSec)
        in 3601..86399 -> result = secToHours(timeSec)
        in 86400..172800 -> result = "сегодня"
        in 172801..259200 -> result = "вчера"
        else -> result = "давно"
    }
    return "был(-а) в сети $result"
}

fun secToMinutes(timeSec : Int) : String{
    val minutes : Int = timeSec/60
    val minutesForm : String = when (minutes){
        1,21,31,41,51 -> "минуту"
        2,3,4,22,23,24,32,33,34,42,43,44,52,53,54 -> "минуты"
        else -> "минут"
    }
    return "$minutes $minutesForm назад"
}

fun secToHours(timeSec : Int) :String{
    val hours : Int = timeSec/3600
    val hoursForm : String = when (hours){
        1,21 -> "час"
        2,3,4,22,23 -> "часа"
        else -> "часов"
    }
    return "$hours $hoursForm назад"
}
