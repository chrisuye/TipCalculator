package edu.towson.cosc431.christian.tipcalculatoractivity

enum class TipAmount{ One, Two, Three}

fun tip(input: Double, tipAmount: TipAmount): Double {

    return when(tipAmount){
        TipAmount.One -> (input * .1)
        TipAmount.Two -> (input * .2)
        TipAmount.Three -> (input * .3)
    }

}