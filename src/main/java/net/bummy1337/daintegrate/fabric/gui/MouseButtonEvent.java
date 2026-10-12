package net.bummy1337.daintegrate.fabric.gui;

/** Adapter for vanilla's mouseClicked(double, double, int) callback. */
public final class MouseButtonEvent {
    private final double x;
    private final double y;
    private final int input;

    public MouseButtonEvent(double x, double y, int input) {
        this.x = x;
        this.y = y;
        this.input = input;
    }

    public double x() {
        return x;
    }

    public double y() {
        return y;
    }

    public int input() {
        return input;
    }

    public int button() {
        return input;
    }

    public int buttonInfo() {
        return input;
    }
}
