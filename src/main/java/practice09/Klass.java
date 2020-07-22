package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;

    private List<Person> list;

    public Klass(int number) {
        this.number = number;
        list = new ArrayList<>();
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
        if (list.contains(student)) {
            this.leader = student;
        } else {
            System.out.print("It is not one of us.\n");
        }

    }

    public void appendMember(Person person){
        list.add(person);
    }
}
