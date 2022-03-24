package com.example.registrodeestudiantes

import Classes.Operations
import Classes.Operations.Companion.listStudentLost
import Classes.Operations.Companion.listStudentLostRecovered
import Classes.Operations.Companion.listStudentWon
import Classes.Operations.Companion.listStudents
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Statistics : AppCompatActivity() {
    var operations: Operations?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statistics)

        operations = Operations()

        val cantidadEstudiantes:Int= listStudents.count()
        val cantidadEstudiantesGanaron:Int= listStudentWon.count()
        val cantidadEstudiantesPerdieron:Int= listStudentLost.count()
        val cantidadEstudiantesRecuperan:Int= listStudentLostRecovered.count()

        val allStudents = findViewById<TextView>(R.id.countStatistics)
        val studentsWon = findViewById<TextView>(R.id.count2Statistics)
        val studentsLost = findViewById<TextView>(R.id.count3Statistics)
        val studentsRecovered = findViewById<TextView>(R.id.count4Statistics)

        allStudents.text = cantidadEstudiantes.toString()
        studentsWon.text = cantidadEstudiantesGanaron.toString()
        studentsLost.text = cantidadEstudiantesPerdieron.toString()
        studentsRecovered.text = cantidadEstudiantesRecuperan.toString()

    }


}