package board;

public class Piece {
	protected Position position;
	
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	protected Board getBoard() {
		return board;
	}
	/*
	public boolean[][] possibleMoves(){
		return;
	}
	
	public boolean possibleMove(Position position) {
		
	}
	
	public boolean isThereAnyPossibleMove() {
		
	}
	 */
}
