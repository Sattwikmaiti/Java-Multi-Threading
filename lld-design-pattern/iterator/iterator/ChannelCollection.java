
//similar to vector,priroty queue,stack,queuein c++
public interface ChannelCollection {

	public void addChannel(Channel c);
	
	public void removeChannel(Channel c);
	// note that Channeliterator is provided ...to iterate ..not the entire collection
	
	public ChannelIterator iterator(ChannelTypeEnum type);
	
}