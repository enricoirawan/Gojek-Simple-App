package com.enrico.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GoCar : AppCompatActivity() {
    private lateinit var dataDiterima : TextView

    companion object{
        const val EXTRA_NAMA          = "extra_nama"
        const val EXTRA_ALAMAT        = "extra_alamat"
        const val EXTRA_ALAMAT_TUJUAN = "extra_alamat_tujuan"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_go_car)

        dataDiterima = findViewById(R.id.data_diterima)

        val nama          = intent.getStringExtra(GoRide.EXTRA_NAMA)
        val alamat        = intent.getStringExtra(GoRide.EXTRA_ALAMAT)
        val alamatTujuan  = intent.getStringExtra(GoRide.EXTRA_ALAMAT_TUJUAN)

        val text = " Nama : $nama \n Alamat : $alamat \n Alamat Tujuan : $alamatTujuan"

        dataDiterima.text = text
    }
}
