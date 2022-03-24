package Classes

class Subject (name:String, grade:Double){
    var nameSubject:String=name
    var gradeSubject:Double=grade

    override fun toString(): String {
        return "Materia(nombreMateria='$nameSubject', promedioMateria=$gradeSubject)"
    }
}