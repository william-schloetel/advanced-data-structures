public interface DisjointSet {
	
	/** Connects integers P and Q. */
	void connect(int p, int q);

	/** Checks to see if two items are connected. */
	boolean isConnected(int p, int q);





}