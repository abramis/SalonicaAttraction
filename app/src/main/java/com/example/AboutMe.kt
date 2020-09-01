package com.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_about_me.*

class AboutMe: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)
        buttonPlay.setOnClickListener {
            var s=""
            var snew=""
            if ((editText.text.toString() == "Roman Rotunda") || (editText.text.toString() == "Ροτοντα")|| (editText.text.toString() == "Rotonta")|| (editText.text.toString() == "Rotonda")){
                s = "Roman Rotunda"
                snew=""
                customimage.setImageResource(R.drawable.rotonta)
            } else if ((editText.text.toString() == "White Tower") || (editText.text.toString() == "Λευκός Πύργος")|| (editText.text.toString() == "Tower")|| (editText.text.toString() == "Πύργος")) {
                s = "White Tower"
                snew=""
                customimage.setImageResource(R.drawable.pyrgos)
            } else if ((editText.text.toString() == "Arch of Galerius") || (editText.text.toString() == "Αψίδα του Γαλερίου")|| (editText.text.toString() == "Καμαρα")|| (editText.text.toString() == "Kamara")) {
                s = "Arch of Galerius"
                snew=""
                customimage.setImageResource(R.drawable.galerios)
            } else if ((editText.text.toString() == "Byzantine Walls")  || (editText.text.toString() == "Βυζαντινά Τείχη")|| (editText.text.toString() == "Καστρα")|| (editText.text.toString() == "Τειχη")){
                s = "Byzantine Walls"
                snew=""
                customimage.setImageResource(R.drawable.teixh)
            } else if ((editText.text.toString() == "Agia Sophia")  || (editText.text.toString() == "Αγία Σοφία")|| (editText.text.toString() == "Αγια σοφια")|| (editText.text.toString() == "Σοφια")){
                s = "Agia Sophia"
                snew=""
                customimage.setImageResource(R.drawable.sofia)
            } else if ((editText.text.toString() == "Agios Dimitrios")  || (editText.text.toString() == "Άγιος Δημήτριος")|| (editText.text.toString() == "Αγιος δημητριος")|| (editText.text.toString() == "Δημητριος")){
                s = "Agios Dimitrios"
                snew=""
                customimage.setImageResource(R.drawable.dimitrios)
            } else {
                s=""
                snew="sorry no content matched your search"
            }
            helloMessage.text = "${s}"
            helloMessage2.text= "${snew}"
        }
    }
}