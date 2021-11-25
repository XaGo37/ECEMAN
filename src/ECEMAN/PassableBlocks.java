package ECEMAN;

public enum PassableBlocks {
    o('o'),Q('Q');

    public char asChar() {
        return asChar;
    }
    private final char asChar;

    PassableBlocks(char asChar){
        this.asChar = asChar;
    }

}
