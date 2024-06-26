> [Youtube](https://www.youtube.com/watch?v=X7shKHOaYtU)

> [Digital ocean](https://www.digitalocean.com/community/tutorials/iterator-design-pattern-java)



Iterator pattern is useful when you want to provide a standard way to iterate over a collection and hide the implementation logic from client program.
The logic for iteration is embedded in the collection itself and it helps client program to iterate over them easily.


ChannelCollection interface defines the contract for our collection class implementation. Notice that there are methods to add and remove a channel but there is no method that returns the list of channels. ChannelCollection has a method that returns the iterator for traversal. ChannelIterator interface defines following methods; ChannelIterator.java


ChannelCollectionImpl has both channel collection and Iterator implementation