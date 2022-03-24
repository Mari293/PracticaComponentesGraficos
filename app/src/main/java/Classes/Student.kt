package Classes

class Student {
    var ID : String = ""
    var name : String = ""
    var age : Int = 0
    var phone : String = ""
    var address : String = ""

    var subject1 : String = ""
    var subject2 : String = ""
    var subject3 : String = ""
    var subject4 : String = ""
    var subject5 : String = ""

    var grade1 : Double = 0.0
    var grade2 : Double = 0.0
    var grade3 : Double = 0.0
    var grade4 : Double = 0.0
    var grade5 : Double = 0.0

    var mean : Double = 0.0

    override fun toString(): String {
        return "Estudiante(documento='$ID', nombre='$name'," +
                " edad=$age, telefono='$phone', direccion='$address'," +
                " materia1='$subject1', materia2='$subject2', " +
                "materia3='$subject3', materia4='$subject4', materia5='$subject5'," +
                " nota1=$grade1, nota2=$grade2, nota3=$grade3, nota4=$grade4, " +
                "nota5=$grade5, promedio=$mean)"
    }
}