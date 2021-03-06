package simpledb.buffer;

/**
 * CS 4432 Project 1
 *
 * We created this class to extend the Buffer clas and have the least recently
 * used time.
 *
 * This class represents an individual buffer used in least recently used
 * replacement policy.
 *
 * @author Lambert Wang
 */
public class LFUBuffer extends Buffer {

	protected long usedTimes;

	/**
	 * Creates a LRUBuffer instance. Sets the last recently used time.
	 */
	public LFUBuffer() {
		usedTimes = 1;
	}

	/**
	 * Returns the least recently used time in milliseconds.
	 *
	 * @return a long
	 */
	public long getUsedTimes() {
		return usedTimes;
	}

	/**
	 * Sets the least recently used time in milliseconds.
	 */
	public void setUsedTimes() {
		usedTimes+=1;
	}

	/**
	 * CS 4432 Project 1
	 *
	 * We added this method to override the method in Buffer and give the LRU
	 * time.
	 *
	 * (non-Javadoc)
	 *
	 * @see simpledb.buffer.Buffer#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + ", LFU time: " + usedTimes;
	}
}
