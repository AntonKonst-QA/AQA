package Homework.Work_5.Museum;

public class Museum {
    private Exhibit exhibit;

    public void setExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
    }

    public void showExhibit() {
        if (exhibit == null) {
            System.out.println("В музее нет экспонатов");
        return;
        }
        exhibit.describe();
        exhibit.preserve();
    }
}
