package net.tetris.dom;

public class TetrisFigure implements Figure {
    private int centerX;
    private int centerY;
    private String[] rows = new String[]{"#"};

    TetrisFigure() {
    }

    TetrisFigure(int centerX, int centerY, String... rows) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.rows = rows;
    }

    public int getLeft() {
        return centerX;
    }

    public int getRight() {
        return rows[0].length() - centerX - 1;
    }

    public int getTop() {
        return centerY;
    }

    public int getBottom() {
        return rows.length - centerY - 1;
    }

    public int[] getRowCodes() {
        int[] codes = new int[rows.length];
        for (int i = 0; i < rows.length; i++) {
            String row = rows[i];
            codes[i] = Integer.parseInt(row.replace('#', '1').replace(' ', '0'), 2);
        }
        return codes;
    }
}
