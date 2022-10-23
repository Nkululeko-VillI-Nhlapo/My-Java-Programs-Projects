 
 /*
  * You have been asked to design the framework for defining different types of computers. For example, there are Laptops, Servers, and SmartPhones that are all a type of Computer.

  *Use the following rules to answer the questions that follow:
  *A Server is a type of Computer that has a Ethernet interface.
  *A Laptop is a type of Computer that has a Battery and also has a Ethernet and Wifi interface.
  *A SmartPhone is a type of Computer that has a Battery, a Call method and a Wifi interface.
  *A Network interface is an interface that allows an object to connect to a network.
  * A Ethernet interface is a type of Network interface.
  *A Wifi interface is a type of Network interface.
  */
 
 abstract public class Computer {
    public String HostName;
    private int  MemorySize;
    public abstract void shutdown(); 
    public abstract boolean runProgram(String name);

    public String getHostName(){
        return this.HostName;
    }

    public int getMemorySize(){
        return this.MemorySize;
    }

    public void setMemorySize(int MemorySize){
        this.MemorySize = MemorySize;
    }
}
