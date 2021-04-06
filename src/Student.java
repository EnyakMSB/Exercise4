public class Student {
    public static int GRADESUM = 0;
    public static int STUDENTNUMERS = 0;
    private String nume;
    private int grade;

    public Student(String nume, int grade) {
        STUDENTNUMERS++;
        GRADESUM+=grade;
        this.nume = nume;
        this.grade = grade;
    }

    public String getNume() {
        return nume;
    }

    public int getGrade() {
        return grade;
    }
    public static double getAverageGrades(){
        return GRADESUM/STUDENTNUMERS;
    }
}
