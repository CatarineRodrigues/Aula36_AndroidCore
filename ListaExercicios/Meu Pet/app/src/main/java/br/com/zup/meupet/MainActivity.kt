package br.com.zup.meupet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoMensagemPets = findViewById<Button>(R.id.botao_mensagem_pets)

        botaoMensagemPets.setOnClickListener {
            Toast.makeText(this, "Olá, somos a Malí e Pete", Toast.LENGTH_LONG).show()
        }
    }
}