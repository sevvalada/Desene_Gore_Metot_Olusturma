public class Main {
    public static void main(String[] args) {

        // Öğretmenler
        Teacher t1 = new Teacher("Ahmet", "555", "MAT");
        Teacher t2 = new Teacher("Ayşe", "444", "FZK");
        Teacher t3 = new Teacher("Mehmet", "333", "KMY");

        // Dersler (vize etkisi %40 → 0.40)
        Course mat = new Course("Matematik", "101", "MAT", 0.40);
        Course fiz = new Course("Fizik", "102", "FZK", 0.40);
        Course kim = new Course("Kimya", "103", "KMY", 0.40);

        // Öğretmen ekleme
        mat.addTeacher(t1);
        fiz.addTeacher(t2);
        kim.addTeacher(t3);

        // Öğrenci
        Student s1 = new Student("Şevval", "1001", 4, mat, fiz, kim);

        // Vize + Final Notları
        s1.addBulkExamNote(
                70, 80,   // Matematik
                60, 50,   // Fizik
                90, 60    // Kimya
        );

        // Sonuçlar
        mat.printTeacher();
        fiz.printTeacher();
        kim.printTeacher();

        s1.isPass();
        s1.printNote();
    }
}
