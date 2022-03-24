package com.example.registrodeestudiantes

import Classes.Operations
import Classes.Student
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    var ID:EditText?=null
    var fullName:EditText?=null
    var age:EditText?=null
    var phone:EditText?=null
    var address:EditText?=null

    var subject1:EditText?=null
    var subject2:EditText?=null
    var subject3:EditText?=null
    var subject4:EditText?=null
    var subject5:EditText?=null

    var grade1:EditText?= null
    var grade2:EditText?= null
    var grade3:EditText?= null
    var grade4:EditText?= null

    var grade5:EditText?= null
    var operations: Operations?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        
        startComponents()
    }

    private fun startComponents() {
        operations = Operations()

        ID = findViewById(R.id.txtID)
        fullName = findViewById(R.id.txtFullName)
        age = findViewById(R.id.txtAge)
        phone = findViewById(R.id.editTextPhone)
        address = findViewById(R.id.editTextAddress)

        subject1 = findViewById(R.id.txtSubject1)
        subject2 = findViewById(R.id.txtSubject2)
        subject3 = findViewById(R.id.txtSubject3)
        subject4 = findViewById(R.id.txtSubject4)
        subject5 = findViewById(R.id.txtSubject5)

        grade1 = findViewById(R.id.txtGrade1)
        grade2 = findViewById(R.id.txtGrade2)
        grade3 = findViewById(R.id.txtGrade3)
        grade4 = findViewById(R.id.txtGrade4)
        grade5 = findViewById(R.id.txtGrade5)

        var btnRegister : Button = findViewById(R.id.btnRegisterStudent)
        btnRegister.setOnClickListener{registerStudent()}
    }

    private fun registerStudent() {

        var student: Student = Student()
        student.ID = ID?.text.toString()
        student.name = fullName?.text.toString()
        student.age = age?.text.toString().toInt()
        student.phone = phone?.text.toString()
        student.address = address?.text.toString()

        student.subject1 = subject1?.text.toString()
        student.subject2 = subject2?.text.toString()
        student.subject3 = subject3?.text.toString()
        student.subject4 = subject4?.text.toString()
        student.subject5 = subject5?.text.toString()

        student.grade1 = grade1?.text.toString().toDouble()
        student.grade2 = grade2?.text.toString().toDouble()
        student.grade3 = grade3?.text.toString().toDouble()
        student.grade4 = grade4?.text.toString().toDouble()
        student.grade5 = grade5?.text.toString().toDouble()

        if(student.grade1<0 || student.grade1>5.0){
            Toast.makeText(this,"La nota de la materia 1 debe estar entre 0 y 5",Toast.LENGTH_SHORT).show()
        }
        else if(student.grade2<0 || student.grade2>5.0){
            Toast.makeText(this,"La nota de la materia 2 debe estar entre 0 y 5",Toast.LENGTH_SHORT).show()
        }
        else if(student.grade3<0 || student.grade3>5.0){
            Toast.makeText(this,"La nota de la materia 3 debe estar entre 0 y 5",Toast.LENGTH_SHORT).show()
        }
        else if(student.grade4<0 || student.grade4>5.0){
            Toast.makeText(this,"La nota de la materia 4 debe estar entre 0 y 5",Toast.LENGTH_SHORT).show()
        }
        else if(student.grade5<0 || student.grade5>5.0){
            Toast.makeText(this,"La nota de la materia 5 debe estar entre 0 y 5",Toast.LENGTH_SHORT).show()
        }
        else{
            student.mean = operations!!.calculeMean(student)
            operations?.registerStudent(student)
            operations?.statusStudent(student)

            val intent = Intent(this,ShowStudentActivity::class.java)
            val miBundle:Bundle=Bundle()
            miBundle.putString("Estudiante", student.name)
            miBundle.putString("Materia1", student.subject1)
            miBundle.putString("Materia2", student.subject2)
            miBundle.putString("Materia3", student.subject3)
            miBundle.putString("Materia4", student.subject4)
            miBundle.putString("Materia5", student.subject5)
            miBundle.putDouble("Nota1", student.grade1)
            miBundle.putDouble("Nota2", student.grade2)
            miBundle.putDouble("Nota3", student.grade3)
            miBundle.putDouble("Nota4", student.grade4)
            miBundle.putDouble("Nota5", student.grade5)
            miBundle.putDouble("Promedio",student.mean)
            intent.putExtras(miBundle)
            startActivity(intent)
        }
    }
}