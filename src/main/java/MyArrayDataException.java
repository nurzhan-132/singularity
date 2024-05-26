class MyArrayDataException extends NumberFormatException {
    private int row;
    private int column;
    private String value;

    public MyArrayDataException(int row, int column, String value) {
        super("Incorrect Number: [" + row + "][" + column + "] = \"" + value + "\"");
        this.row = row;
        this.column = column;
        this.value = value;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public String getValue() {
        return value;
    }
}