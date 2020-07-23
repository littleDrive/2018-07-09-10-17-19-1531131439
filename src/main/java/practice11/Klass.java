package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;

    private List<Person> students;
    private List<Teacher> teachers;

    public Klass(int number) {
        this.number = number;
        students = new ArrayList<>();
        teachers = new ArrayList<>();
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
            notify(student);
        } else {
            System.out.print("It is not one of us.\n");
        }

    }
    //加入一个学生
    public void appendMember(Student student){
        students.add(student);
        notify(student);
    }
//    加入一个老师
    public void registerTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public boolean isIn(Student student) {
        return getNumber() == student.getKlass().getNumber();
    }

    //
    public void notify (Student student) {
        teachers.forEach(teacher -> {
            teacher.update(student);
        });
    }

}