package net.bummy1337.daintegrate.fabric.gui;

/** Small input adapter matching the event API used by the UI code. */
public final class CharacterEvent {
    private final char codepoint;
    private final int modifiers;

    public CharacterEvent(char codepoint) {
        this(codepoint, 0);
    }

    public CharacterEvent(char codepoint, int modifiers) {
        this.codepoint = codepoint;
        this.modifiers = modifiers;
    }

    public char codepoint() {
        return codepoint;
    }

    public int modifiers() {
        return modifiers;
    }

    public String codepointAsString() {
        return String.valueOf(codepoint);
    }

    public boolean isAllowedChatCharacter() {
        return codepoint != '\u00A7' && codepoint >= ' ' && codepoint != '\u007F';
    }
}
