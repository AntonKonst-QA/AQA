package Homework.Work_5.Museum;

public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum();

        museum.setExhibit(new Manuscript());
        museum.showExhibit();
        System.out.println();

        museum.setExhibit(new Sculpture());
        museum.showExhibit();
        System.out.println();
    }
}
