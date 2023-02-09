package lesson9;

public class ScoreBook {
    private Info info;
    private String session;

    public void setSession(String session) {
        this.session = session;
    }

    private class Info{
        private String courseName;
        private double scores;
        private String lecturer;
        private String mark;
        private String date;

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public void setScores(double scores) {
            this.scores = scores;
        }

        public void setLecturer(String lecturer) {
            this.lecturer = lecturer;
        }

        public void setMark(String mark) {
            this.mark = mark;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String scoreInfo(){  //generate string with session
            return "Session: " + session + "| Course name: "  + courseName + "| Score: " + scores + "| Lector: " + lecturer + " | Mark: " + mark + " | Date: " + date;
        }
    }

    public void fillScoreBook(String courseName, double scores, String  lecturer, String mark, String date){  // method for filling info about examination
        info = new Info();
        info.setCourseName(courseName);
        info.setScores(scores);
        info.setLecturer(lecturer);
        info.setMark(mark);
        info.setDate(date);

    }

    @Override
    public String toString() {
        return "Score Book {" + info.scoreInfo() + '}';
    }
}
