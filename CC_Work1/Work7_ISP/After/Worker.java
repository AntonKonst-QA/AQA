package Work7_ISP.After;

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Programmer implements Workable, Eatable {

    @Override
    public void work() {
        System.out.println("Программист пишет код");
    }

    @Override
    public void eat() {
        System.out.println("Программист обедает");;
    }
}
