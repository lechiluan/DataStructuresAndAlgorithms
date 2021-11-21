package Java.core;
//Application of
public class StudentAcc {
    private String uname;
    private String classCode;
    private Short birthYear;

    public StudentAcc(String uname, String classCode, Short birthYear) {
        this.uname = uname;
        this.classCode = classCode;
        this.birthYear = birthYear;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public Short getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Short birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "StudentAcc{" +
                "uname='" + uname + '\'' +
                ", classCode='" + classCode + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
