package Classes

class Operations {
    companion object{

        var listStudents = arrayListOf<Student>()
        var listStudentWon = arrayListOf<Student>()
        var listStudentLost = arrayListOf<Student>()
        var listStudentLostRecovered = arrayListOf<Student>()
    }

    fun registerStudent(student: Student){
        listStudents.add(student)
    }

    fun statusStudent(student: Student) {
        if(student.mean>3.5){
            listStudentWon.add(student)
        }
        else if(student.mean>2.5){
            listStudentLost.add(student)
            listStudentLostRecovered.add(student)
        }
        else{
            listStudentLost.add(student)
        }
    }

    fun imprimirListaEstudiantes():String{
        var prueba=""
        for(est in listStudents){
            prueba += est
        }
        return prueba
    }

    fun calculeMean(stu: Student): Double {

        var prom=(stu.grade1+stu.grade2+stu.grade3+stu.grade4+stu.grade5)/5

        return prom
    }
}