package Midterm;

public class SuperComponent {
    private static SuperComponent sc = null;

    public static void main(String[] args) {
        SuperComponent obj = SuperComponent.getSuperComponent();
        obj.execute(4);
        obj.execute(-1);
    }

    public static SuperComponent getSuperComponent() {
        if (sc == null) {
            sc = new SuperComponent();
        }
        return sc;
    }

    public void execute(int input) {
        if (input < 0) {
            callBar();
        } else {
            callFoo();
        }
    }

    private void callBar() {
        Bar bar = new Bar();
        bar.func();
    }
    private void callFoo() {
        Foo foo = new Foo();
        foo.func();
    }
}