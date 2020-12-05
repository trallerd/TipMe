package com.trallerd.gorjeta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calcular.setOnClickListener {
            if (!TextUtils.isEmpty(valor.text.toString())) {
                if (!TextUtils.isEmpty(gorjeta.text.toString())) {
                    if (!TextUtils.isEmpty(pessoa.text.toString())) {
                        val valor = valor.text.toString().toFloat()
                        val percentualGorjeta = gorjeta.text.toString().toFloat()
                        val pessoas = pessoa.text.toString().toInt()

                        val gorjeta = valor * (percentualGorjeta / 100)
                        val conta = valor + gorjeta
                        val divisao = conta / pessoas

                        resultGorjeta.text = "Gorjeta (R$): $gorjeta"
                        resultConta.text = "Total da Conta: R$ $conta"
                        resultPessoa.text = "Total de R$ $divisao por pessoa"
                    } else {
                        Toast.makeText(applicationContext,"Preencha todos os campos!!",Toast.LENGTH_SHORT).show()
                    }
                } else {
                    Toast.makeText(applicationContext,"Preencha todos os campos!!",Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(applicationContext,"Preencha todos os campos!!",Toast.LENGTH_SHORT).show()
            }

        }
    }
}