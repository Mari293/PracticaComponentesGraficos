package com.example.registrodeestudiantes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ShowStudentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_student)

        val information = findViewById<TextView>(R.id.infoStudent)
        var status = findViewById<TextView>(R.id.statusStudent)
        var miBundle:Bundle?=this.intent.extras

        if(miBundle!=null){
            information.text="Estudiante: ${miBundle.getString( "Estudiante")}\n" +
                    "Materia 1: ${miBundle.getString("Materia1")} Nota:${miBundle.getDouble("Nota1")}\n" +
                    "Materia 2: ${miBundle.getString("Materia2")} Nota:${miBundle.getDouble("Nota2")}\n" +
                    "Materia 3: ${miBundle.getString("Materia3")} Nota:${miBundle.getDouble("Nota3")}\n" +
                    "Materia 4: ${miBundle.getString("Materia4")} Nota:${miBundle.getDouble("Nota4")}\n" +
                    "Materia 5: ${miBundle.getString("Materia5")} Nota:${miBundle.getDouble("Nota5")}\n" +
                    "Promedio: ${miBundle.getDouble("Promedio")}\n"
        }
        val promedio: Double? = miBundle?.getDouble("Promedio")
        if(promedio!! >3.5){
            status.text = "Ganó el periodo"
        }
        else if(promedio!! >2.5){
            status.text = "Pierde el periodo, pero puede recuperar"
        }
        else{
            status.text = "Pierde el periodo, sin posibilidad de recuperar"
        }
    }
}