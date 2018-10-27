package org.sopt;

import org.sopt.model.Department;
import org.sopt.model.Professor;
import org.sopt.model.Student;
import org.sopt.model.University;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        final ArrayList<Student> studentList = new ArrayList<Student>();
        final ArrayList<University> universityList = new ArrayList<University>();
        final ArrayList<Department> departmentList = new ArrayList<Department>();
        final ArrayList<Professor> professorList = new ArrayList<Professor>();

        Student student = new Student(20151122, "황유선","3","디미",
                "이메일","주소","23","재학중");
        studentList.add(student);

        University university = new University(1, "덕성여대", "몰라", "몰라몰라");
        universityList.add(university);

        Department department = new Department(1, "디미", "번호", "공대");
        departmentList.add(department);

        Professor professor = new Professor(3, "강", "디미", "번호", "과목");
        professorList.add(professor);

        for(int i = 0; i < 2; i++) {
            studentList.add(new Student());
            universityList.add(new University());
            departmentList.add(new Department());
            professorList.add(new Professor());
        }

        for(final Student s : studentList) {
            System.out.println(s.toString());
        }

        for(final University u : universityList) {
            System.out.println(u.toString());
        }

        for(final Department d : departmentList) {
            System.out.println(d.toString());
        }

        for(final Professor p : professorList) {
            System.out.println(p.toString());
        }
    }
}
