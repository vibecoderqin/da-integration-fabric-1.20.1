package net.bummy1337.daintegrate.fabric.gui;

import org.lwjgl.glfw.GLFW;

/** Adapter for the legacy key callback used by Minecraft 1.20.1. */
public final class KeyEvent {
    private final int key;
    private final int scanCode;
    private final int modifiers;

    public KeyEvent(int key, int scanCode, int modifiers) {
        this.key = key;
        this.scanCode = scanCode;
        this.modifiers = modifiers;
    }

    public int key() {
        return key;
    }

    public int scanCode() {
        return scanCode;
    }

    public int modifiers() {
        return modifiers;
    }

    public boolean hasControlDown() {
        return (modifiers & GLFW.GLFW_MOD_CONTROL) != 0;
    }

    public boolean hasShiftDown() {
        return (modifiers & GLFW.GLFW_MOD_SHIFT) != 0;
    }

    public boolean hasAltDown() {
        return (modifiers & GLFW.GLFW_MOD_ALT) != 0;
    }

    public boolean isSelectAll() {
        return hasControlDown() && key == GLFW.GLFW_KEY_A;
    }

    public boolean isCopy() {
        return hasControlDown() && key == GLFW.GLFW_KEY_C;
    }

    public boolean isPaste() {
        return hasControlDown() && key == GLFW.GLFW_KEY_V;
    }

    public boolean isCut() {
        return hasControlDown() && key == GLFW.GLFW_KEY_X;
    }
}
