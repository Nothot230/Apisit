package Apisit1;
public class Student {

   private String name;
   private String id;
   private int scoreEng;
   private int scoreMath;
   private int scoreCom;
   private String gradeEng;
   private String gradeMath;
   private String gradeCom;
   private int totalCredits;
   private int totalScore;
   private double averageScore;

   public Student(String name, String id, int scoreEng, int scoreMath, int scoreCom) {
       this.name = name;
       this.id = id;
       this.scoreEng = scoreEng;
       this.scoreMath = scoreMath;
       this.scoreCom = scoreCom;
   }

   public void calculateGrade() {
       this.gradeEng = getGrade(this.scoreEng);
       this.gradeMath = getGrade(this.scoreMath);
       this.gradeCom = getGrade(this.scoreCom);
   }

   public String getGrade(int score) {
       if (score >= 80) {
           return "A";
       } else if (score >= 70) {
           return "B";
       } else if (score >= 60) {
           return "C";
       } else if (score >= 50) {
           return "D";
       } else {
           return "F";
       }
   }

   public void calculateAverage() {
       this.totalCredits = 2 + 3 + 2; 
       this.totalScore = this.scoreEng + this.scoreMath + this.scoreCom;
       this.averageScore = (double)this.totalScore / this.totalCredits;
   }

   public void display() {
       System.out.println("ชื่อ: " + this.name);
       System.out.println("รหัสนักศึกษา: " + this.id);
       System.out.println("วิชาภาษาอังกฤษ: " + this.scoreEng + " เกรด: " + this.gradeEng);
       System.out.println("วิชาคณิตศาสตร์: " + this.scoreMath + " เกรด: " + this.gradeMath);
       System.out.println("วิชาคอมพิวเตอร์: " + this.scoreCom + " เกรด: " + this.gradeCom);
       System.out.println("เกรดเฉลี่ย: " + this.averageScore);
   }
}