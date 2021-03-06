package com.epita.socra.app;

import com.epita.socra.app.tools.ConsoleAdapter;
import com.epita.socra.app.tools.IOAdapter;

/**
 * Hello world.
 */
public final class App {
    private IOAdapter adapter;

    private App() {
        this(new ConsoleAdapter());
    }

    public App(IOAdapter adapter) {
        this.adapter = adapter;
    }

    /**
     * Says hello to the world. This is an added comment for a commit test.
     *
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        App application = new App();
        application.run();
    }

    /**
     * run the program.
     */
    public void run() {
        adapter.write("Hello, what's your name ?");
        String name = adapter.read();
        adapter.write("Nice to meet you, " + name + " !");
    }
}
