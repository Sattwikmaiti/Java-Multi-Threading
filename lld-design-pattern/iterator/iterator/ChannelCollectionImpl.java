
import java.util.ArrayList;
import java.util.List;
//has both channel collection and Iterator implementation
public class ChannelCollectionImpl implements ChannelCollection {

	private List<Channel> channelsList;

	public ChannelCollectionImpl() {
		channelsList = new ArrayList<>();
	}

	public void addChannel(Channel c) {
		this.channelsList.add(c);
	}

	public void removeChannel(Channel c) {
		this.channelsList.remove(c);
	}

	@Override
	public ChannelIterator iterator(ChannelTypeEnum type) {
		return new ChannelIteratorImpl(type, this.channelsList);
	}

	//inner class to prevent anyone to usethis implementation
	private class ChannelIteratorImpl implements ChannelIterator {

		private ChannelTypeEnum type;
		private List<Channel> channels;
		private int position;

		public ChannelIteratorImpl(ChannelTypeEnum ty,
				List<Channel> channelsList) {
			this.type = ty;
			this.channels = channelsList;
		}


		@Override
		public boolean hasNext() {
			//returns only the channel of given type || All
			while (position < channels.size()) {
				Channel c = channels.get(position);
				if (c.getTYPE().equals(type) || type.equals(ChannelTypeEnum.ALL)) {
					return true;
				} else
					position++;
			}
			return false;
		}

		@Override
		public Channel next() {
			// After a type is found, return the channel and increments the position pointer
			Channel c = channels.get(position);
			position++;
			return c;
		}

	}
}