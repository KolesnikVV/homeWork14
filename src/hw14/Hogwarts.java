package hw14;

public class Hogwarts {
    private String name;
    private String surName;
    private String faculty;
    private int magicPower;
    private int transgressionDistance;


    public Hogwarts(String name, String surName, String faculty, int magicPower, int transgressionDistance) {
        this.name = name;
        this.surName = surName;
        this.faculty = faculty;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public void printHogwarts(Hogwarts student) {
        int studentOne = getMagicPower() + getTransgressionDistance();
        int studentTwo = student.getMagicPower() + student.getTransgressionDistance();
        if (studentOne == studentTwo) {
            System.out.println(student.getName() + " " + student.getSurName() + " и " + getName() + " " + getSurName() + " обладают одинаковым количеством баллов");
            System.out.println(getName() + " " + getSurName() + " обладает большей мощностью магии, чем " + student.getName() + " " + student.getSurName());
        }
        if (studentOne > studentTwo) {
        } else {
            System.out.println(student.getName() + " " + student.getSurName() + " обладает большей мощностью магии, чем " + getName() + " " + getSurName());
        }
    }
        @Override
        public String toString(){
        return ("Имя: " + getName() + " " + getSurName() + ", факультет: " + getFaculty() + ", сила магии: " + getMagicPower() + ", расстояние трансгресии: " + getTransgressionDistance());
    }

}
