public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Mircea", 9);
        Student student2 = new Student("Ionel", 9);
        Student student3 = new Student("Aurica", 9);
        Student student4 = new Student("Marius", 10);
        Student student5 = new Student("Marcel", 7);
        Student student6 = new Student("Marcela", 6);
        System.out.println("Numarul total de studenti este: " + Student.STUDENTNUMERS);
        System.out.println("Totalul sumei notelor este: " + Student.GRADESUM);
        System.out.println("Media este : " + Student.getAverageGrades());

    }
}
