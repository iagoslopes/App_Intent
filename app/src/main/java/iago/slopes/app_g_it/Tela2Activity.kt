package iago.slopes.app_g_it

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Tela2Activity : AppCompatActivity() {
    lateinit var btVoltaTela:Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        btVoltaTela = findViewById(R.id.btVoltaTela)
        btVoltaTela.setOnClickListener { exibirVoltaTela() }
    }

    private fun exibirVoltaTela() {
        val intent : Intent = Intent(baseContext, MainActivity::class.java)
        startActivity(intent)
    }
}