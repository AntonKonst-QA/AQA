package Work7_ISP.Before;

interface Worker {
    void work();
    void eat();
}
class Programmer implements Worker {
    @Override
    public void work() {
        System.out.println("Программист пишет код");
    }
    @Override
    public void eat() {
        throw new UnsupportedOperationException("Программист не ест на работе");
    }
}
