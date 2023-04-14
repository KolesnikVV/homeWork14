package hw14;

public class Griffindor extends Hogwarts {
    private int nobleness; // благородство
    private int honor; // честь
    private int bravery; // храбрость

    public Griffindor(String name, String surName, String faculty, int magicPower, int transgressionDistance, int nobleness, int honor, int bravery) {
        super(name, surName, faculty, magicPower, transgressionDistance);
        this.nobleness = nobleness;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void setNobleness(int nobleness) {
        this.nobleness = nobleness;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getNobleness() {
        return nobleness;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void printGriffindor(Griffindor student) {
        int studentGriffendorOne = getNobleness() + getHonor() + getBravery();
        int studentGriffendorTwo = student.getNobleness() + student.getHonor() + student.getBravery();
        System.out.println("У " + getName() + " " + getSurName() + " благородство = " + getNobleness() + ", честь = " + getHonor() + ", храбрость = " + getBravery());
        System.out.println("У " + student.getName() + " " + student.getSurName() + " благородство = " + student.getNobleness() + ", честь = " + student.getHonor() + ", храбрость = " + student.getBravery());
        if (studentGriffendorOne == studentGriffendorTwo) {
            System.out.println(student.getName() + " " + student.getSurName() + " и " + getName() + " " + getSurName() + " обладают одинаковым количеством баллов");
        }
        if (studentGriffendorOne < studentGriffendorTwo) {
            System.out.println(student.getName() + " " + student.getSurName() + " лучший Гриффендорец, чем " + getName() + " " + getSurName());
        } else {
            System.out.println(getName() + " " + getSurName() + " лучший Гриффендорец, чем " + student.getName() + " " + student.getSurName());
        }
    }

    public String toString() {
        return super.toString() + " благородство = " + getNobleness() + ", честь = " + getHonor() + ", храбрость = " + getBravery();
    }
}
