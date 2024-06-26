


public interface ChannelIterator {
//whether next element is present or not
	public boolean hasNext();
	
	//returns the next element and counter++
	public Channel next();
}