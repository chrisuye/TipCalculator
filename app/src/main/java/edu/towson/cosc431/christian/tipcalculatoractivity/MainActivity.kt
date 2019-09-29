package edu.towson.cosc431.christian.tipcalculatoractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cal_btn.setOnClickListener { handler() }
    }

    fun handler() {
        try {
            val amount = Amountinput.editableText.toString()

            val tipAmount = when(radioGroup.checkedRadioButtonId){
                R.id. one_radio -> TipAmount.One
                R.id. two_radio -> TipAmount.Two
                R.id. three_radio -> TipAmount.Three
                else -> throw Exception()
            }

            val amountnum = amount.toDouble()
            val result = tip(amountnum,tipAmount)
            val total = amountnum + result
            result_tv.text = "your calculated tip is " + result.toString() + " and your total is " + total.toString()
        }catch (e: Exception){
            result_tv.text = "Sorry your missing one or more inputs"
        }




    }
}
