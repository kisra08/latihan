package com.example.lat2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun tambah(view:View){
        val angka1= findViewById<EditText>(R.id.angka1).text.toString()
        val angka2= findViewById<EditText>(R.id.angka2).text.toString()
        val hasil= findViewById<TextView>(R.id.tvhasil)

        if (angka1.equals("")){
            findViewById<EditText>(R.id.angka1).setError("Masukkan Angka Ya")
        }else if(angka2.equals("")){
            findViewById<EditText>(R.id.angka2).setError("Masukkan Angka Ya")

        }else{
        val jumlah = angka1.toDouble()+angka2.toDouble()
            hasil.text=jumlah.toString()
    }
    fun bersih (view: View){
        findViewById<EditText>(R.id.angka1).text.clear()
        findViewById<EditText>(R.id.angka2).text.clear()
        findViewById<TextView>(R.id.tvhasil).text='0'.toString()
    }
}