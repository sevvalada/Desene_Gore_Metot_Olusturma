public class Student {
String name;
String Stno;
int classes;
Course c1,c2,c3;
double average;


Student(String name,String Stno,int classes,Course c1,Course c2,Course c3){

    this.name=name;
    this.Stno=Stno;
    this.classes=classes;
    this.c1=c1;
    this.c2=c2;
    this.c3=c3;


    }

    void addBulkExamNote(int v1, int f1, int v2, int f2, int v3, int f3){
        c1.midTerm = v1;
        c1.fin = f1;

        c2.midTerm = v2;
        c2.fin = f2;

        c3.midTerm = v3;
        c3.fin = f3;
    }

    void calcAverage(){
        this.average = (c1.calcCourseNote()+ c2.calcCourseNote()+ c3.calcCourseNote()) / 3;
    }

    void isPass(){
        calcAverage();
        if (this.average >= 55){
            System.out.println("Durum: Sınıfı Geçti");
        } else {
            System.out.println("Durum: Sınıfta Kaldı");
        }
    }

    void printNote(){
        System.out.println("\n--- Notlar ---");
        System.out.println(c1.name + " ortalama: " + c1.calcCourseNote());
        System.out.println(c2.name + " ortalama: " + c2.calcCourseNote());
        System.out.println(c3.name + " ortalama: " + c3.calcCourseNote());
        System.out.println("Genel Ortalama: " + this.average);
    }
}
