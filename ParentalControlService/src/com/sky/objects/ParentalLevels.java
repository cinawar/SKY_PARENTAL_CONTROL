package com.sky.objects;

public enum ParentalLevels {

	L1("U", 1), L2("PG", 2), L3("12", 3), L4("15", 4), L5("18", 5);

	private int ParentalLevel;
	private String ParentalType;

	ParentalLevels(String ParentalType, int ParentalLevel) {
		this.ParentalLevel = ParentalLevel;
		this.ParentalType = ParentalType;
	}

	/**
	 * @return the parentalLevel
	 */
	public synchronized final int getParentalLevel() {
		return ParentalLevel;
	}

	/**
	 * @return the parentalType
	 */
	public synchronized final String getParentalType() {
		return ParentalType;
	}

	public static int getLevelForType(String type) {
		if (type.equals(L1.getParentalType()))
			return L1.getParentalLevel();

		if (type.equals(L2.getParentalType()))
			return L2.getParentalLevel();

		if (type.equals(L3.getParentalType()))
			return L3.getParentalLevel();

		if (type.equals(L4.getParentalType()))
			return L4.getParentalLevel();
		if (type.equals(L5.getParentalType()))
			return L5.getParentalLevel();
		return 999;
	}
}
