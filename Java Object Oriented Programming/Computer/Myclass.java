public class Myclass extends Computer implements Ethernet {
    public boolean connect(String networkName) {
        
        return true;
    }
    public boolean disconnect() {
        
        return false;
    }
    public boolean plug(int port) {
        
        return false;
    }
    public boolean unPlug() {
        
        return false;
    }
    public void shutdown() {
        
        
    }
    public boolean runProgram(String name) {
        
        return false;
    }
    
}
