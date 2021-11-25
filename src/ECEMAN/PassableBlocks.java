package ECEMAN;

public enum PassableBlocks {
    o('o'),X('X'),E('E'),SPACE(' ');

    public char asChar() {
        return asChar;
    }
    private final char asChar;

    PassableBlocks(char asChar){
        this.asChar = asChar;
    }

}
