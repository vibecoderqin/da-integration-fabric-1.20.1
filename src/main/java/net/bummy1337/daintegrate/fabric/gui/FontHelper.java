package net.bummy1337.daintegrate.fabric.gui;

import net.minecraft.client.gui.Font;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.util.FormattedCharSequence;

public final class FontHelper {
    private static boolean fontAvailable;

    private FontHelper() {}

    public static void setFontAvailable(boolean value) {
        fontAvailable = value;
    }

    public static boolean isFontAvailable() {
        return fontAvailable;
    }

    /**
     * The 1.20.1 text API does not support the newer FontDescription API.
     * Use ordinary vanilla text while retaining the shared rendering helpers.
     */
    public static Component comp(String text) {
        return Component.literal(text != null ? text : "");
    }

    public static Component comp(String text, int color) {
        return Component.literal(text != null ? text : "").withStyle(Style.EMPTY.withColor(color));
    }

    public static FormattedCharSequence seq(String text) {
        return FormattedCharSequence.forward(text != null ? text : "", Style.EMPTY);
    }

    public static int width(Font font, String text) {
        return text == null ? 0 : font.width(text);
    }
}
