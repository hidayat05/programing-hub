package All;

/**
 * Created by hidayat on 12/12/16.
 */
abstract class AbstracShape {
    abstract void draw();
}


class Rectangle extends AbstracShape{

    @Override
    void draw() {
        System.out.println("Draw Rectangle");
    }
}

class Triangle extends AbstracShape{

    @Override
    void draw() {
        System.out.println("Draw Triangle");
    }
}

class Abstractest{
    public static void main(String[] args) {
        AbstracShape shape = new Rectangle();
        shape.draw();

        shape = new Triangle();
        shape.draw();
    }
}
