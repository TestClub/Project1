package enumeration;

public class TestDay {
    public static void main(String[] args) {
        Week d = new Week();
        d.whatToDo(Day.Midday);
        d.whatToDo(Day.TUESDAY);
        d.whatToDo(Day.SUNDAY);
    }
}
