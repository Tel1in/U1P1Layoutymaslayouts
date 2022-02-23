package mx.tecnm.tepic.u1p1layoutymaslayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botonR.setOnClickListener {
            pasarventana2()
        }

        botonI.setOnClickListener {
            pasarventana3()
        }
    }

    fun pasarventana2(){
        val pasarven = Intent (this,FullscreenActivity::class.java)
        startActivity(pasarven)
    }

    fun pasarventana3(){
        val pasarven1 = Intent (this,ScrollingActivity::class.java)
        startActivity(pasarven1)
    }

}