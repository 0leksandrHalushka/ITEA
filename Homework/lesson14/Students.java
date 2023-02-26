package lesson14;

import java.util.ArrayList;
import java.util.List;

public class Students {
    String name;
    String group;
    int course;
    float mathScores;
    float englishScores;
    float powerElectronicsScores;
    float philosophyScores;


    public Students() {
    }

    public Students(String name, String group, int course, float mathScores, float englishScores, float powerElectronicsScores, float philosophyScores) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.mathScores = mathScores;
        this.englishScores = englishScores;
        this.powerElectronicsScores = powerElectronicsScores;
        this.philosophyScores = philosophyScores;
    }


    public float getMathScores() {
        return mathScores;
    }

    public float getEnglishScores() {
        return englishScores;
    }

    public float getPowerElectronicsScores() {
        return powerElectronicsScores;
    }

    public float getPhilosophyScores() {
        return philosophyScores;
    }

    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    public float averageScore() {

        return (mathScores + englishScores + powerElectronicsScores + philosophyScores) / 4;
    }


    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", mathScores=" + mathScores +
                ", englishScores=" + englishScores +
                ", powerElectronicsScores=" + powerElectronicsScores +
                ", philosophyScores=" + philosophyScores +
                "}";
    }

    public void printStudents(List<Students> students, int course) {
        for (Students student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName() + ", Course: " + course);
            }

        }

    }

    public List<Students> transferStudent(List<Students> students) {
        ArrayList<Students> studentsNextCourse = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).averageScore() >= 3) {studentsNextCourse.add(students.get(i));
            } else {
                students.remove(i);
                i--;
            }
        }
        return studentsNextCourse;
    }

}
