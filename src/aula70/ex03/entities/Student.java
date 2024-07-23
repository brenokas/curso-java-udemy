package aula70.ex03.entities;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade(){ return grade1 + grade2 + grade3; }
    public String passed(){
        if (finalGrade() >= 60.0) {
            return "PASS";
        } else {
            double missingPoints = 60.0 - finalGrade();
            return "FAILED\nMISSING " + String.format("%.2f", missingPoints) + " POINTS";
        }
    }
}
