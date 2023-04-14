package hw14;

public class Ravenclaw extends Hogwarts {
    private int wisdom; // мудрость
    private int wit; // остроумие

    private int creation; // творчество
    public Ravenclaw(String name, String surName, String faculty, int magicPower, int transgressionDistance, int wisdom, int wit, int creation) {
        super(name, surName, faculty, magicPower, transgressionDistance);
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }
    public void printRavenclaw (Ravenclaw student) {
        int studentRavenclawOne = getWisdom() + getWit() + getCreation();
        int studentRavenclawTwo = student.getWisdom() + student.getWit() + student.getCreation();
        System.out.println("У " + getName() + " " + getSurName() +  " мудрость = " + getWisdom() + ", остроумие = " + getWit() + ", творчество = " + getCreation());
        System.out.println("У " + student.getName() + " " + student.getSurName() +  " мудрость = " + student.getWisdom() + ", остроумие = " + student.getWit() + ", творчество = " + student.getCreation());
        if (studentRavenclawOne == studentRavenclawTwo){
            System.out.println(student.getName() + " " + student.getSurName() + " и "+ getName() + " " + getSurName() + " обладают одинаковым количеством баллов");
        }if (studentRavenclawOne < studentRavenclawTwo){
            System.out.println(student.getName() + " " + student.getSurName() + " лучший Когтевран, чем "+ getName() + " " + getSurName());
        } else {
            System.out.println(getName() + " " + getSurName() + " лучший Когтевран, чем "+ student.getName() + " " + student.getSurName());        }
    }
    public String toString() {
        return super.toString() + " мудрость = " + getWisdom() + ", остроумие = " + getWit() + ", творчество = " + getCreation();
    }
}
