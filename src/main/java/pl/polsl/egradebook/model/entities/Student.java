package pl.polsl.egradebook.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentID;

    @OneToOne
    @JoinColumn(name = "userID")
    private User user;

    @OneToOne
    @JoinColumn(name = "classID")
    private StudentsClass studentsClass;

    @ManyToOne
    @JoinColumn(name = "parentID")
    private Parent parent;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public StudentsClass getStudentsClass() {
        return studentsClass;
    }

    public void setStudentsClass(StudentsClass studentsClass) {
        this.studentsClass = studentsClass;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", user=" + user +
                ", studentsClass=" + studentsClass +
                ", parent=" + parent +
                '}';
    }
}
