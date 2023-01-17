package cz.jales

class Kalkulacka {

    var prvni: Double = 0.0
    var druhe: Double = 0.0

    fun soucet(): Double{
        return prvni + druhe
    }
    fun rozdíl(): Double{
        return prvni - druhe
    }
    fun nasobek(): Double{
        return prvni * druhe
    }
    fun deleno(): Double{
        return prvni / druhe
    }
}