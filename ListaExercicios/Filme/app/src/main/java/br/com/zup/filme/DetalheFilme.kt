package br.com.zup.filme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class DetalheFilme : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(MainActivity.TAG, "Passou pelo onCreate() do detalhe")
        setContentView(R.layout.activity_detalhe_filme)
    }

    override fun onStart() {
        super.onStart()
        Log.d(MainActivity.TAG, "Passou pelo onStart() do detalhe")
    }

    override fun onResume() {
        super.onResume()
        Log.d(MainActivity.TAG, "Passou pelo onResune() do detalhe")
    }

    override fun onPause() {
        super.onPause()
        Log.d(MainActivity.TAG, "Passou pelo onPause() do detalhe")
    }

    override fun onStop() {
        super.onStop()
        Log.d(MainActivity.TAG, "Passou pelo onStop() do detalhe")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MainActivity.TAG, "Passou pelo onDestroy() do detalhe")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(MainActivity.TAG, "Passou pelo onRestart() do detalhe")
    }
}