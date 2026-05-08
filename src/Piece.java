class Piece {
    protected int row;
    protected int column;
    Position position;
    boolean isValidMove(Position newPosition){
        if (newPosition.row>0 && newPosition.column>0
                && newPosition.row<=8 && newPosition.column<=8) {
            return true;
        }
        else {
            return false;
        }
    }}