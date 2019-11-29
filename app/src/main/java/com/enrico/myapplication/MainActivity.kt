package com.enrico.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var buttonGoSend : LinearLayout
    private lateinit var buttonGoMart : LinearLayout
    private lateinit var buttonGoRide : LinearLayout
    private lateinit var buttonGoCar  : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonGoSend = findViewById(R.id.go_send)
        buttonGoMart = findViewById(R.id.go_mart)
        buttonGoRide = findViewById(R.id.go_ride)
        buttonGoCar  = findViewById(R.id.go_car)

        buttonGoSend.setOnClickListener(this)
        buttonGoMart.setOnClickListener(this)
        buttonGoRide.setOnClickListener(this)
        buttonGoCar.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.go_send -> {
                val moveWithDataGoSend = Intent(this@MainActivity, GoSendAct::class.java)
                moveWithDataGoSend.putExtra(GoSendAct.EXTRA_NAMA, "Enrico Irawan")
                moveWithDataGoSend.putExtra(GoSendAct.EXTRA_ALAMAT, "Semarang")
                moveWithDataGoSend.putExtra(GoSendAct.EXTRA_NAMA_BARANG, "Handphone")
                moveWithDataGoSend.putExtra(GoSendAct.EXTRA_JUMLAH, 1)
                startActivity(moveWithDataGoSend)
            }
            R.id.go_mart -> {
                val moveWithDataGoMart = Intent(this@MainActivity, GoMart::class.java)
                moveWithDataGoMart.putExtra(GoMart.EXTRA_NAMA, "Daffa Prisan")
                moveWithDataGoMart.putExtra(GoMart.EXTRA_ALAMAT, "Tegal")
                moveWithDataGoMart.putExtra(GoMart.EXTRA_NAMA_BARANG, "Buku")
                moveWithDataGoMart.putExtra(GoMart.EXTRA_JUMLAH, 5)
                startActivity(moveWithDataGoMart)
            }
            R.id.go_ride -> {
                val moveWithDataGoRide = Intent(this@MainActivity, GoRide::class.java)
                moveWithDataGoRide.putExtra(GoRide.EXTRA_NAMA, "Hussein Muhammad")
                moveWithDataGoRide.putExtra(GoRide.EXTRA_ALAMAT, "UDINUS")
                moveWithDataGoRide.putExtra(GoRide.EXTRA_ALAMAT_TUJUAN, "UNDIP")
                startActivity(moveWithDataGoRide)
            }
            R.id.go_car -> {
                val moveWithDataGoCar = Intent(this@MainActivity, GoCar::class.java)
                moveWithDataGoCar.putExtra(GoCar.EXTRA_NAMA, "Aditya Rizky")
                moveWithDataGoCar.putExtra(GoCar.EXTRA_ALAMAT, "Stasiun Poncol")
                moveWithDataGoCar.putExtra(GoCar.EXTRA_ALAMAT_TUJUAN, "Inul Vista")
                startActivity(moveWithDataGoCar)
            }
        }
    }
}
