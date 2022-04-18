package task1

const val MIN_COMMISSION: Int = 3500

fun main (){
    val commissionPercent = 0.0075

    print("Введите сумму перевода в копейках: ")
    val amount: Int = readln().toInt()
    println("Сумма перевода: $amount коп.")
    val commission: Int = if (amount*commissionPercent<MIN_COMMISSION) MIN_COMMISSION else (amount*commissionPercent).toInt()
    println("Комиссия за операцию состаила: $commission")
}