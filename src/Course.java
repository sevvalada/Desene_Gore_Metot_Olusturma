public class Course {
String name;
String code;
String prefix;
int midTerm=0;
int fin=0;
double midTermEffect;

Teacher teacher;
    Course(String name, String code, String prefix, double midtermEffect) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.midTermEffect = midtermEffect;
        this.midTerm = 0;
        this.fin = 0;
    }
    void addTeacher(Teacher teacher)
    {
        this.teacher=teacher;
    }
    void printTeacher()
    {
        System.out.println(this.name +"Dersin Öğretmeni "+teacher.name);
    }
   double  calcCourseNote (){
        return ((midTerm*midTermEffect)+(fin*(1-midTermEffect)));
    }
}



