package All;

/**
 * Created by hidayat on 12/12/16.
 */
abstract class AbstracGame {

    public abstract void start();

    public void stop(){
        System.out.println("Stopping game in abstract class");
    }
}

class GameA extends AbstracGame{

    @Override
    public void start() {
        System.out.println("starting game A");
    }
}

class GameB extends AbstracGame{

    @Override
    public void start() {
        System.out.println("starting game B");
    }
}

class Example{
    public static void main(String[] args) {
        GameA a = new GameA();
        GameB b = new GameB();

        a.start();
        a.stop();

        b.start();
        b.stop();
    }
}
