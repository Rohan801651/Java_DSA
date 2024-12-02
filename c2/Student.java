package c2;

public class Student {
    String stdName;
    int roll;

    public Student(String name, int roll) { // parameterized constructor
        this.setStdName(name); 
        this.setRoll(roll);
    }

    public String getStdName() {
        return stdName;
    }

    public int getRoll() {
        return roll;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    
}
