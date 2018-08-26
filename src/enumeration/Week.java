package enumeration;

public class Week {

        Day day;
        public Week(){}
        public Week(Day day){
            this.day = day;
        }
        public void whatToDo(Day day){
            switch(day){
                case MONDAY:
                    System.out.println("Start working on CodeLab");
                    break;
                case TUESDAY:
                    System.out.println("Start working on Homework");
                    break;
                case WEDNESDAY:
                    System.out.println("Join Mentoring session");
                    break;
                default:
                    System.out.println("I will do mentoring during the Midday");
                    break;
            }
        }
    }

