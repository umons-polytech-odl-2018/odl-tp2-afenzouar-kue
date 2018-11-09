package exercise2;

public class ProductionWorker implements Payable {
	private int producedPieceRate;
	private int production;

	public ProductionWorker(int producedPieceRate){
		this.producedPieceRate = producedPieceRate;
	}
	public void produceOnePiece() {
		this.production ++;

	}

	@Override
	public int computeSalary() {
		return this.producedPieceRate * this.production;
	}
}
