  import java.util.Scanner;
public class marks1 {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("entere the name");
 String name = sc.nextLine();
 System.out.println("enter the number of subjects");
 int n = sc.nextInt();

 String[] subject = new String[n];
 int[] marks = new int[n];
 int total=0;
 for(int i=0;i<n;i++){
  sc.nextLine();
  System.out.println((i+1)+"subject"+"name:");
  subject[i] = sc.nextLine();
  System.out.println("student marks:"+subject[i]);
  marks[i] = sc.nextInt();
  total+=marks[i];
 }
 double percentage = (double) total/n;
 System.out.println(" REPORT CARD");
 System.out.println("student name:"+name);
 System.out.println("total marks:"+total);
 System.out.println("perecentage:"+percentage+"%");
 if (percentage>100 && percentage<0){
  System.out.println("marks not accept");

}


 else if(percentage>90){
System.out.println("grade=A");
}
else if (percentage>80){
  System.out.println("grade=B");

}
else if (percentage>70){
  System.out.println("grade=C");

}
else if (percentage>50){
  System.out.println("grade=D");

}
else {
  System.out.println("fail");
}
int highest_mark = marks[0];
for(int i=1;i<n;i++){
  if(highest_mark < marks[i]){
    highest_mark = marks[i];
}

}
System.out.println("highest mark"+highest_mark);
int lowest_mark = marks[0];
for(int i=1;i<n;i++){
  if(lowest_mark > marks[i]){
    lowest_mark = marks[i];}

}
System.out.println("lowest number"+lowest_mark);
 sc.close();
  }
    
}
