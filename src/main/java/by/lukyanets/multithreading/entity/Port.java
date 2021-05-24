package by.lukyanets.multithreading.entity;

public class Port {
    private static class Wrapper {
        static Port INSTANCE = new Port();
    }

    private Port() {
    }

    public static Port getInstance() {
        return Wrapper.INSTANCE;
    }
}
