package hw14;

public class Hufflepuff extends Hogwarts {
    private int industriousness; // трудолюбие
    private int loyalty; // верность
    private int honesty; // честность

    public Hufflepuff(String name, String surName, String faculty, int magicPower, int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(name, surName, faculty, magicPower, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void printHufflepuff(Hufflepuff student) {
        int studentHufflepuffOne = getIndustriousness() + getLoyalty() + getHonesty();
        int studentHufflepuffTwo = student.getIndustriousness() + student.getLoyalty() + student.getHonesty();
        System.out.println("У " + getName() + " " + getSurName() + " трудолюбие = " + getIndustriousness() + ", верность = " + getLoyalty() + ", честность = " + getHonesty());
        System.out.println("У " + student.getName() + " " + student.getSurName() + " трудолюбие = " + student.getIndustriousness() + ", верность = " + student.getLoyalty() + ", честность = " + student.getHonesty());
        if (studentHufflepuffOne == studentHufflepuffTwo) {
            System.out.println(student.getName() + " " + student.getSurName() + " и " + getName() + " " + getSurName() + " обладают одинаковым количеством баллов");
        }
        if (studentHufflepuffOne < studentHufflepuffTwo) {
            System.out.println(student.getName() + " " + student.getSurName() + " лучший Пуффендуйец, чем " + getName() + " " + getSurName());
        } else {
            System.out.println(getName() + " " + getSurName() + " лучший Пуффендуйец, чем " + student.getName() + " " + student.getSurName());
        }
    }
    @Override
    public String toString() {
        return super.toString() + ", трудолюбие = " + getIndustriousness() + ", верность = " + getLoyalty() + ", честность = " + getHonesty();

    }
}