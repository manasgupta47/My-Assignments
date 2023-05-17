class Student {
     int subjectA,subjectB,subjectC;
    public void setSubjectA(int mark){
        this.subjectA=subjectA;
    }
    public void setSubjectB(int mark){
        this.subjectB=subjectB;
    }
    public void setSubjectC(int mark){
        this.subjectC=subjectC;
    }
    public int studentsTotalMarksInAllSubjects(Student[] students) {
        int totalmarks=0;
        for(Student student:students){
            totalmarks+=student.subjectA+student.subjectB+student.subjectC;
        }
        return totalmarks;
    }

    public double studentsAverageMarksInAllSubjects(Student[] students) {
        int totalmarks=studentsTotalMarksInAllSubjects(students);
        double averagemarks=totalmarks/students.length;
        return averagemarks;
    }
    public int[] subjectWiseMarks(Student[] students,String subjectName){
    int[] marks=new int[students.length];
    for(int i=0;i<students.length;i++){
        Student student=students[i];
        if(subjectName.equals("A")){
            marks[i]=student.subjectA;
        } else if (subjectName.equalsIgnoreCase("B")) {
            marks[i]=student.subjectB;
        } else if (subjectName.equalsIgnoreCase("C")) {
            marks[i]=student.subjectC;
        }
    }
    return marks;
    }
    public int subjectATotalByStudents(int[] marks) {
        int totalmarks=0;
        for(int i:marks){
            totalmarks+=i;
        }
        return totalmarks;
    }
    public int subjectBTotalByStudents(int[] marks) {
        int totalmarks=0;
        for(int i:marks){
            totalmarks+=i;
        }
        return totalmarks;
    }
    public int subjectCTotalByStudents(int[] marks) {
        int totalmarks=0;
        for(int i:marks){
            totalmarks+=i;
        }
        return totalmarks;
    }

    public int subjectTotalByStudents(int[] marks){
        int totalmarks=0;
        for(int i:marks){
            totalmarks+=i;
        }
        return totalmarks;
    }

    public double subjectAAverageByStudents(int[] marks) {
        int totalmarks=subjectATotalByStudents(marks);
        double avg=totalmarks/(double) marks.length;
        return avg;
    }
    public double subjectBAverageByStudents(int[] marks) {
        int totalmarks=subjectBTotalByStudents(marks);
        double avg=totalmarks/(double) marks.length;
        return avg;
    }
    public double subjectCAverageByStudents(int[] marks) {
        int totalmarks=subjectCTotalByStudents(marks);
        double avg=totalmarks/(double) marks.length;
        return avg;
    }

}

public class Assignment1Q9 {

    public static void main(String[] args) {
      Student student1=new Student();
      student1.subjectA=10;
        student1.subjectB=20;
        student1.subjectC=30;
        Student student2=new Student();
        student2.subjectA=10;
        student2.subjectB=20;
        student2.subjectC=30;
        Student student3=new Student();
        student3.subjectA=10;
        student3.subjectB=20;
        student3.subjectC=30;
        Student[] students={student1,student2,student3};
        Student a1q9=new Student();
        int[] marksForsubjectA=a1q9.subjectWiseMarks(students,"A");
        int[] marksForsubjectB=a1q9.subjectWiseMarks(students,"B");
        int[] marksForsubjectC=a1q9.subjectWiseMarks(students,"C");
        System.out.println("Total marks of all the students in all");
        System.out.println(a1q9.studentsTotalMarksInAllSubjects(students));
        System.out.println("Average marks of all the students in all");
        System.out.println(a1q9.studentsAverageMarksInAllSubjects(students));
        System.out.println("Total marks scored by students in subject A");
        System.out.println(a1q9.subjectATotalByStudents(marksForsubjectA));
        System.out.println("Total marks scored by students in subject B");
        System.out.println(a1q9.subjectATotalByStudents(marksForsubjectB));
        System.out.println("Total marks scored by students in subject C");
        System.out.println(a1q9.subjectATotalByStudents(marksForsubjectC));
        System.out.println("Average marks scored by students in subject A");
        System.out.println(a1q9.subjectAAverageByStudents(marksForsubjectA));
        System.out.println("Average marks scored by students in subject B");
        System.out.println(a1q9.subjectAAverageByStudents(marksForsubjectB));
        System.out.println("Average marks scored by students in subject C");
        System.out.println(a1q9.subjectAAverageByStudents(marksForsubjectC));
    }
}
