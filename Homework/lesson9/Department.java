package lesson9;

public class Department {

    private String departmentName;

    private Positions positions;

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    private class Positions{
        private String peopleInfo;
        private String position;

        public Positions(String peopleInfo, String position) {
            this.peopleInfo = peopleInfo;
            this.position = position;
        }

        public String getPeopleInfo() {
            return peopleInfo;
        }

        public String getPosition() {
            return position;
        }
    }

    public  Positions positions (String peopleInfo, String positionInfo){
        return positions = new Positions(peopleInfo, positionInfo);
    }


    @Override
    public String toString() {
        return "Department{" +
                "department Name: '" + departmentName + '\'' +
                ", positions: " + positions.getPosition() +
                ", employee information: " + positions.getPeopleInfo() +
                '}';
    }
}


