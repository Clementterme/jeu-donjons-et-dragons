package fr.campus.dungeoncrawler.game;

public class Board {

    private Object[] board;
    private int characterPosition;

    public Board(int size) {
        board = new Object[size];
    }

    public Object getTile(int pos) {
        return board[pos];
    }

    public void setTile(int pos, Object tile) {
        board[pos] = tile;
    }

    public void moveCharacter(int move) {
        Object character = getTile(characterPosition);
        setTile(characterPosition, null);

        characterPosition += move;
        if (characterPosition >= board.length) {
            characterPosition = board.length - 1;
        }
        setTile(characterPosition, character);
    }

    public void print() {
        int numberTile = 1;
        for (int i = 0; i < board.length; i++) {
            if(board[i] == null) {
                System.out.print(".");
            } else {
                System.out.print(board[i]);
                numberTile = i + 1;
            }
        }
        System.out.println();
        System.out.println("Case " + numberTile + " / " + board.length);
        System.out.println();
    }

}
