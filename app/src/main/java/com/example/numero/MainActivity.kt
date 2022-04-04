package com.example.numero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var x=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)







        btnjugar.setOnClickListener() {
            val randomNumber: Int = Random().nextInt(8)
            val randomNumber1: Int = Random().nextInt(8)
            val randomNumber2: Int = Random().nextInt(8)
            edt1.setText(randomNumber.toString())
            edt2.setText(randomNumber1.toString())
            edt3.setText(randomNumber2.toString())





            x += 1
            puntos.setText(x.toString())
            if (puntos.text.toString() != "3") {
                txtganastes.text=""

                if (randomNumber == 7 && randomNumber1 == 7 && randomNumber2 == 7) {
                    txtganastes.text = "GANASTES!!!!"
                }


            }
            else {
                txtganastes.text = null
                edt1.text = null
                edt2.text = null
                edt3.text = null
                puntos.text = null
                x=0
                txtganastes.text = "PERDISTES!!!!"

            }

        }


    }
}