package practice11;


import java.util.LinkedList;

public class Teacher extends Person implements TeacherObsever{

    protected LinkedList<Klass> classes;

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public void setClasses(LinkedList<Klass> classes) {
        this.classes = classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.classes = new LinkedList<>();
    }

    public Teacher(int id, String name, int age, LinkedList classes) {
        super(id, name, age);
        this.classes = classes;
        appendToKlass();
    }

//    把老师加入班级
    public void appendToKlass() {
        for (Klass klass : classes) {
            klass.registerTeacher(this);
        }
    }


    @Override
    public String introduce() {
        if (getClasses().size() == 0) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        String klass = "";
        for (int i = 0; i < getClasses().size(); i++) {
            klass += getClasses().get(i).getNumber();
            if (i < getClasses().size() - 1) {
                klass += ", ";
            }
        }
        return super.introduce() + " I am a Teacher. I teach Class " + klass + ".";
    }

    public String introduceWith(Student student) {

        if (isTeaching(student)) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() +".";
        } else {
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }


    public boolean isTeaching(Student student) {
        for (int i = 0; i < getClasses().size(); i++) {
            if (getClasses().get(i).isIn(student)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public void update(Student student) {
//        如果是班长
        boolean flag = false;
        for (Klass klass : classes) {

            if (klass.getLeader() != null && student.getId() == klass.getLeader().getId()) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println(String.format("I am %s. I know %s become Leader of Class 2.",this.getName(), student.getName()));
        } else {
            System.out.println(String.format("I am %s. I know %s has joined Class 2.",this.getName(), student.getName()));
        }
    }
}
