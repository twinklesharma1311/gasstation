package domain.util.external;

public class PriceSystem {
	
	//external system values
	private static final double GASOLINE_REGULAR = 1.75;
	private static final double GASOLINE_MIDGRADE = 1.89;
	private static final double GASOLINE_PREMIUM = 1.98;
	private static final double DIESEL = 1.71;
	
	public double getCurrentGasolinePrice(double d) {
		double currentPrice = 0;

		if(d == 87) {
			currentPrice = GASOLINE_REGULAR;
		} else if(d == 89) {
			currentPrice = GASOLINE_MIDGRADE;
		} else if(d == 93) {
			currentPrice = GASOLINE_PREMIUM;
		}

		return currentPrice;
	}

	public double getCurrentDieselPrice() {
		return DIESEL;
	}
}
