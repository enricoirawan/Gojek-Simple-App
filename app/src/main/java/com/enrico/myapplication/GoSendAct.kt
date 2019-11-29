package com.enrico.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GoSendAct : AppCompatActivity() {

    private lateinit var dataDiterima : TextView

    companion object{
        const val EXTRA_NAMA        = "extra_nama"
        const val EXTRA_JUMLAH      = "extra_jumlah"
        const val EXTRA_ALAMAT      = "extra_alamat"
        const val EXTRA_NAMA_BARANG = "extra_nama_barang"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_go_send)

        dataDiterima = findViewById(R.id.data_diterima)

        val nama       = intent.getStringExtra(EXTRA_NAMA)
        val alamat     = intent.getStringExtra(EXTRA_ALAMAT)
        val namaBarang = intent.getStringExtra(EXTRA_NAMA_BARANG)
        val jumlah     = intent.getIntExtra(EXTRA_JUMLAH, 0)

        val text = " Nama : $nama \n Alamat : $alamat \n " +
                "Nama Barang : $namaBarang \n Jumlah : $jumlah"

        dataDiterima.text = text
    }
}
