package `exercises-carnaval`.exercise01

import java.time.LocalDate

 class People {


    private val now = LocalDate.now()
    private val name = "Giovani"
    private val birthDate = LocalDate.of(1995, 7,1)
    private val height = 1.78

    fun getString(): String = "$name nasceu em $birthDate, tem ${getAge()} anos e possui $height de altura."

    fun getAge(): Int = now.year - birthDate.year


}