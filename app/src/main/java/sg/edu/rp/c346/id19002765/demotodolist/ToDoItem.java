package sg.edu.rp.c346.id19002765.demotodolist;

import java.util.Calendar;

public class ToDoItem {
    private String title;
    private Calendar date;

    public ToDoItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    @Override
    public String toString() {
        String str = date.get(Calendar.YEAR) + "/" + (date.get(Calendar.MONTH) + 1) + "/" + date.get(Calendar.DAY_OF_MONTH) + "(" + getDay(date.get(Calendar.DAY_OF_WEEK)) + ")";
        return str;

    }

    private String getDay(int dayOfWeek){
        switch (dayOfWeek){
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default: return  "";
        }
    }

    public void setYMP ( int year, int month, int day){
        date.set(year, month, day);
    }

}
