class Queen extends Piece {
    boolean isValidMove(Position newPosition) {
        // Déplacement horizontal ou vertical (comme la Tour)
        if (newPosition.column == this.column || newPosition.row == this.row) {
            return true;
        }

        // Déplacement diagonal (comme le Fou)
        if (Math.abs(newPosition.column - this.column) == Math.abs(newPosition.row - this.row)) {
            return true;
        }

        // Sinon, déplacement invalide
        return false;
    }
}
