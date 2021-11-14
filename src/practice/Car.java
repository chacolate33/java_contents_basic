package practice;

public class Car {
	private double fuelCost;
	private double fuelAmount;
    // コンストラクタを作成
	public Car(double fuelCost, double fuelAmount) {		
	this.fuelCost = fuelCost;
	this.fuelAmount = fuelAmount;
	}
	
	public void move(double length) {
		System.out.println(length + "km 走ります");
		this.fuelAmount -= length / fuelCost;
		return;
	}
	
	public double getFuelAmount() {
		return this.fuelAmount;
	}
	// moveメソッド
	// ・"xx km 走ります"を出力
	// ・残量を計算
	
	// fuelAmountを取得するメソッドを作成
}
