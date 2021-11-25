package ECEMAN;


public enum BlockedBlocks {
    M('M'),X('X');

    public char asChar() {
        return asChar;
    }
    private final char asChar;

    BlockedBlocks(char asChar){
        this.asChar = asChar;
    }
}
