package kylelisscoding.pauls.ScaleApiKnox.model;
import kylelisscoding.pauls.ScaleApiKnox.model.ScaleConnection;

import static java.lang.System.in;
import static kylelisscoding.pauls.ScaleApiKnox.model.ScaleConnection.connectToScale;


public class ScaleWeight {

    private double weight;
    private final String ip;
    private final int port;

    public ScaleWeight(double weight, String ip, int port) {
        this.weight = connectToScale(ip,port);
        this.ip = ip;
        this.port = port;

    }

    public double maintainConnection(){

    }

    public double getWeight() {
        return weight;
    }

    public String getIp() {
        return ip;
    }

    public int getPort() {
        return port;
    }

    @Override
    public String toString() {
        return "Current Scale Weight: " + weight + "\n\n";
    }
}
