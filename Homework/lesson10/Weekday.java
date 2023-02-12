package lesson10;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        public boolean isWeekDay(){
            switch (this){
                case MONDAY:
                case TUESDAY:
                case WEDNESDAY:
                case THURSDAY:
                case FRIDAY: return true;
            }
    return isHoliday();
    }

    public boolean isHoliday(){
        switch (this){
            case SATURDAY:
            case SUNDAY: return false;
            default: throw new
                    EnumConstantNotPresentException(this.getDeclaringClass(), this.name());
        }
    }

}
