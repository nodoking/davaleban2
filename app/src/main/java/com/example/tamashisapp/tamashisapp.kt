package com.example.tamashisapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.tamashisapp.*

class Tamashisapp : AppCompatActivity() {

    private var PlayerOne: Boolean = true;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tamashisapp)
    }

    private fun init() {
        gilaki01.setOnClickListener {
            buttonIdentifier(gilaki01)
        }
        gilaki02.setOnClickListener {
            buttonIdentifier(gilaki02)
        }
        gilaki03.setOnClickListener {
            buttonIdentifier(gilaki03)
        }
        gilaki11.setOnClickListener {
            buttonIdentifier(gilaki11)
        }
        gilaki12.setOnClickListener {
            buttonIdentifier(gilaki12)
        }
        gilaki13.setOnClickListener {
            buttonIdentifier(gilaki13)
        }
        gilaki21.setOnClickListener {
            buttonIdentifier(gilaki21)
        }
        gilaki22.setOnClickListener {
            buttonIdentifier(gilaki22)
        }
        gilaki23.setOnClickListener {
            buttonIdentifier(gilaki23)
        }
        reset_gilaki.setOnClickListener{
            restart()
        }
    }

    private fun buttonIdentifier(button: Button){
        if (PlayerOne){ button.text = "x"}
        else{button.text = "0"}
        button.isClickable = false
        PlayerOne = !PlayerOne
        isWinner()

    }
    private  fun isWinner() {

        if (gilaki01.text.toString().isNotEmpty() && gilaki01.text.toString() == gilaki02.text.toString() && gilaki01.text.toString() == gilaki03.text.toString()) {
            showWinner(gilaki01.text.toString())
        }
        else if (gilaki01.text.toString().isNotEmpty() && gilaki01.text.toString() == gilaki11.text.toString() && gilaki11.text.toString() == gilaki21.text.toString()) {
            showWinner(gilaki11.text.toString())
        }
        else if (gilaki01.text.toString().isNotEmpty() && gilaki01.text.toString() == gilaki12.text.toString() && gilaki12.text.toString() == gilaki23.text.toString()) {
            showWinner(gilaki12.text.toString())
        }
        else if (gilaki02.text.toString().isNotEmpty() && gilaki02.text.toString() == gilaki12.text.toString() && gilaki12.text.toString() == gilaki22.text.toString()) {
            showWinner(gilaki22.text.toString())
        }
        else if (gilaki03.text.toString().isNotEmpty() && gilaki03.text.toString() == gilaki12.text.toString() && gilaki12.text.toString() == gilaki21.text.toString()){
            showWinner(gilaki21.text.toString())
        }
        else if(gilaki03.text.toString().isNotEmpty() && gilaki03.text.toString() == gilaki13.text.toString() && gilaki13.text.toString() == gilaki23.text.toString()){
            showWinner(gilaki23.text.toString())
        }
        else if (gilaki11.text.toString().isNotEmpty() && gilaki11.text.toString() == gilaki12.text.toString() && gilaki12.text.toString() == gilaki13.text.toString()){
            showWinner(gilaki13.text.toString())
        }
        else if (gilaki21.text.toString().isNotEmpty() && gilaki21.text.toString() == gilaki22.text.toString() && gilaki22.text.toString() == gilaki23.text.toString()){
            showWinner(gilaki23.text.toString())
        }
        else{if (gilaki01.text.toString().isNotEmpty() && gilaki02.text.toString().isNotEmpty() && gilaki03.text.toString().isNotEmpty() && gilaki11.text.toString().isNotEmpty() && gilaki12.text.toString().isNotEmpty() && gilaki13.text.toString().isNotEmpty() && gilaki21.text.toString().isNotEmpty() && gilaki22.text.toString().isNotEmpty() && gilaki23.text.toString().isNotEmpty()){
            Toast.makeText(this,"Draw! Playt Again!",Toast.LENGTH_SHORT).show()
        }}
    }


    private fun showWinner(winner: String) {
        Toast.makeText(this, "Winner:  $winner", Toast.LENGTH_LONG).show()
        gilaki01.isClickable = false
        gilaki02.isClickable = false
        gilaki03.isClickable = false
        gilaki11.isClickable = false
        gilaki12.isClickable = false
        gilaki13.isClickable = false
        gilaki21.isClickable = false
        gilaki22.isClickable = false
        gilaki23.isClickable = false
    }

    private fun restart(){
        gilaki01.text = ""
        gilaki02.text = ""
        gilaki03.text = ""
        gilaki11.text = ""
        gilaki12.text = ""
        gilaki13.text = ""
        gilaki21.text = ""
        gilaki22.text = ""
        gilaki23.text = ""

        gilaki01.isClickable = true
        gilaki02.isClickable = true
        gilaki03.isClickable = true
        gilaki11.isClickable = true
        gilaki12.isClickable = true
        gilaki13.isClickable = true
        gilaki21.isClickable = true
        gilaki22.isClickable = true
        gilaki23.isClickable = true
        PlayerOne = !PlayerOne
    }

}