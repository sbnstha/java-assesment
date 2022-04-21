package Task1;
//Task 1. Define a class named Student to maintain information about students 
//and their quiz scores. A student has a name and a total quiz score. Supply 
//an appropriate constructor and methods such as getName(), addQuiz (int score), getTotalScore(),
//getHighandLowScore(),and getAverageScore(). To compute the latter, you also need to store the number of 
//quizzes that the student took. Now, write a driver program to test your class. Draw a UML class diagram
public class Student {
private String name;
private int quizScore;
private int quizNumber;   

    public Student(String name, int quizScore, int quizNumber) {
        this.name = name;
        this.quizScore = quizScore;
        this.quizNumber = quizNumber;
    }
    
    
public Student(String name){
super();
this.name=name;
this.quizNumber=0;
this.quizScore=0;
}
public String getName(){
return name;
}
public void addQuiz(double score){
this.quizScore+=score;
quizNumber++;
}
public int getTotalScore(){
return quizScore;
}
public double getAverageScore(){
return (double)(quizScore/quizNumber)/100;
}



}