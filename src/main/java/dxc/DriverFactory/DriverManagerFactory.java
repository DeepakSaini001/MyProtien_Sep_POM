package dxc.DriverFactory;

import dxc.Constants.DriverType;

public class DriverManagerFactory {
	private static DriverManager chromeManager = null;
	private static DriverManager firefoxManager = null;


	private DriverManagerFactory() {

	}

	public static DriverManager getManager(DriverType driverType) {

		switch (driverType) {
		case CHROME -> {
			if (chromeManager == null) {
				chromeManager = new ChromeDriverManager();
			}

			return chromeManager;
		}
		case FIREFOX -> {
			if (firefoxManager == null) {
				firefoxManager = new FireFoxDriverManager(); // Singleton
			}
			return firefoxManager;
		}
		default -> throw new IllegalStateException("Invalid Driver" + " : " + driverType);
		}

	}

}
