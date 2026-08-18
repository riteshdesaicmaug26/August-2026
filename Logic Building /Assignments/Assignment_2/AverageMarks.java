public class AverageMarks {
  public static void main(String[] args) {
 
     int Maths = 40;
     int Science = 15;
     int History = 24.5;
     int Total = Maths + Science + History;
     int Average = Total / 3;
    
     System.out.println("Average Marks: " + Average);

     if(Average >= 90) {
       System.out.println("Grade A");
      }
     else if(Average >= 70 && Average <= 89) {
       System.out.println("Grade B");
      }
     else if(Average >= 50 && Average <= 69) {
       System.out.println("Grade C");
      }
     else if(Average >= 30 && Average <= 49) {
       System.out.println("Grade D");
      }
     else{
       System.out.println("Fail");
      }

  }
}