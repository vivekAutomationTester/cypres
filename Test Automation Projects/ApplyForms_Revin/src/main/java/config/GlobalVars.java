package config;

public class GlobalVars {

	// Delays and timeouts are done to stabilise the scripts
	// Timeout is the time that the system will wait before it throws an that
	// it couldn't find the field
	public static final long longTimeout = 1000;
	public static final long mediumTimeout = 30000;
	public static final long shortTimeout = 15000;
	public static final long currentTimeout = longTimeout;

	// currentDelay is the unconditional wait time taken for each action on a field
    public static long currentDelay = 400;

}
