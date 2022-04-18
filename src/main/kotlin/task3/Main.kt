package task3

const val MELOMAN: Boolean = true //Статус "меломан"
val previouslySpentMoney: UInt = 500000u //Сумма ранее потраченых на музыку денег в коп

fun main() {
    val itemPrice: UInt = 10000u //Стоимость единицы товара в коп
    val itemCount: UInt = 1u // Количество единиц товара "в корзине"

    val discountMeloman = 0.01 // Скидка меломана
    val discountSpender = 0.05 // Скидка при сумме ранее потраченных на музыку денег более maxLevelOfDiscount, в %
    val discountLiteSpender: UInt = 10000u // Скидка при сумме ранее потраченных на музыку денег более firstLevelDiscount, в коп
    val firstLevelDiscount: UInt = 100000u // firstLevelDiscount (FLD) - уровень предыдущих трат для получения discountLiteSpender в коп.
    val minTotalPriceToFLD: UInt = 100000u // Минимальная сумма текущего заказа для возможности применения discountLiteSpender
    val maxLevelOfDiscount: UInt = 1000000u // Уровень предыдущих трат для получения discountSpender

    val totalPrice: UInt = itemPrice * itemCount // Посчитали Сумма заказа в коп.

    val firstDiscount: UInt = if (previouslySpentMoney > maxLevelOfDiscount) (totalPrice.toInt() * discountSpender).toUInt()
    else if (previouslySpentMoney > firstLevelDiscount && totalPrice > minTotalPriceToFLD) discountLiteSpender
    else 0u
    // Посчитали скидку в коп. в зависимости от уровня предыдущих трат и (опционально) от суммы текущего заказа.

    val secondDiscount: UInt = if (MELOMAN) ((totalPrice-firstDiscount).toInt() * discountMeloman).toUInt() else 0u
    //Посчитали скидку в коп. в зависимомти от статуса "Меломан"


    val result: UInt = totalPrice - firstDiscount - secondDiscount
    //Посчитали сумму заказа с учетом скидок в коп.

    println("Сумма заказа: ${totalPrice/100u} руб. ${totalPrice%100u} коп, Сумма с учетом скидок: ${result/100u} руб. ${result%100u} коп")

}