package com.example.beratbadanideal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var beratbadan : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nama = findViewById<EditText>(R.id.ednama)
        val tb = findViewById<EditText>(R.id.edtinggibadan)
        val radio1 = findViewById<RadioButton>(R.id.rblaki)
        val radio2 = findViewById<RadioButton>(R.id.rbperempuan)
        val hitung = findViewById<Button>(R.id.btnproses)
        var hasil = findViewById<TextView>(R.id.txtberatbadan)

        hitung.setOnClickListener {
            var tb = tb.text.toString().toInt()
            var nama = nama.text.toString()
            if (radio1.isChecked) {
                beratbadan = (tb - 100) - ((tb - 100) * 10 / 100)
                hasil.setText("nama : $nama \nberat badan ideal : "+ beratbadan.toString() + "kg")
            } else if (radio2.isChecked) {
                beratbadan = (tb - 100) - ((tb - 100) * 15 / 100)
                hasil.setText("nama : $nama \nberat badan ideal : "+ beratbadan.toString() + "kg")
            } else{
                hasil.setText("pilih jenis kelamin terlebih dahulu")
            }

        }
    }
}