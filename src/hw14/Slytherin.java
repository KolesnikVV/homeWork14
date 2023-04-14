package hw14;

public class Slytherin extends Hogwarts{
    private int cunning; // хитрость
    private int determination; // решительность
    private int ambition; // амбициозность
    private int resourcefulness; // находчивость
    private int lustForPower; // жажда власти

    public Slytherin(String name, String surName, String faculty, int magicPower, int transgressionDistance,
                     int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surName, faculty, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int resoluteness) {
        this.determination = resoluteness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public void printSlytherin (Slytherin student) {
        int studentSlytherinOne = getCunning() + getDetermination() + getAmbition() + getResourcefulness() + getLustForPower();
        int studentSlytherinTwo = student.getCunning() + student.getDetermination() + student.getAmbition() + student.getResourcefulness() + student.getLustForPower();
        System.out.println("У " + getName() + " " + getSurName() +  " хитрость = " + getCunning() + ", решительность = " + getDetermination() + ", амбициозность = " + getAmbition() + ", находчивость = " + getResourcefulness() + ", жажда власти = " + getLustForPower());
        System.out.println("У " + student.getName() + " " + student.getSurName() +  " хитрость = " + student.getCunning() + ", решительность = " + student.getDetermination() + ", амбициозность = " + student.getAmbition() + ", находчивость = " + student.getResourcefulness() + ", жажда власти = " + student.getLustForPower());
        if (studentSlytherinOne == studentSlytherinTwo){
            System.out.println(student.getName() + " " + student.getSurName() + " и "+ getName() + " " + getSurName() + " обладают одинаковым количеством баллов");
        }if (studentSlytherinOne < studentSlytherinTwo){
            System.out.println(student.getName() + " " + student.getSurName() + " лучший Слизеринец, чем "+ getName() + " " + getSurName());
        } else {
            System.out.println(getName() + " " + getSurName() + " лучший Слизеринец, чем "+ student.getName() + " " + student.getSurName());        }
    }
    public String toString() {
        return super.toString() + " хитрость = " + getCunning() + ", решительность = " + getDetermination() + ", амбициозность = " + getAmbition() + ", находчивость = " + getResourcefulness() + ", жажда власти = " + getLustForPower();
    }
}
