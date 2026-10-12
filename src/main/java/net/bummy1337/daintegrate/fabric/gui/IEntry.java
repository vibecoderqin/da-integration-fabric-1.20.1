package net.bummy1337.daintegrate.fabric.gui;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.input.CharacterEvent;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.input.MouseButtonEvent;

public interface IEntry {
    void drawEntry(GuiGraphics graphics, int x, int y, int mouseX, int mouseY, float partialTicks);
    int getHeightE();
    default void charTyped(CharacterEvent event) {}
    default boolean mouseClicked(MouseButtonEvent event, boolean doubleClick) { return false; }
    default boolean keyPressed(KeyEvent event) { return false; }
}
