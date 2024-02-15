fun main() {
    val dataAuto = arrayOf(
        "Только сегодня! Спорткар за 9990 кредитов! Спешите купить!"
    )

    val dataMovie = arrayOf(
        "Новая часть культовой саги \"Звездные волны XIX\". Только в IMax5D!"
    )

    val dataDroid = arrayOf(
        "Заметил, что дроид уже не так эффективно работает? Чип I.A.M.D.N. уже в магазинах! Обнови своего дроида!"
    )

    val category = readln()
    var countOfRepeat = readln().toInt()

    while (countOfRepeat > 0) {
        when (category) {
            "Авто" -> {
                for (i in dataAuto) {
                    println(i)
                }
            }

            "Кино" -> {
                for (i in dataMovie) {
                    println(i)
                }
            }

            "Дроиды" -> {
                for (i in dataDroid) {
                    println(i)
                }
            }
        }
        countOfRepeat--
    }
}