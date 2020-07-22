package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;

    private List<Person> students;

    public Klass(int number) {
        this.number = number;
        students = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public String getDisplayName() {
        return "Class " + getNumber();
    }

    //    设置班长
    public void assignLeader(Student student) {
        if (students.contains(student)) {
            this.leader = student;
        } else {
            System.out.print("It is not one of us.\n");
        }

    }

    public void appendMember(Student student){
        students.add(student);
    }

    public boolean isIn(Student student) {
       return getNumber() == student.getKlass().getNumber();
    }
}
