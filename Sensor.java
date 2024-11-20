import java.util.*;

// Composite Pattern: Mengelola Sensor Kelembaban Tanah
abstract class Sensor {
    public abstract String bacaData();
}

class SensorIndividu extends Sensor {
    private String lokasi;
    private int nilai;

    public SensorIndividu(String lokasi, int nilai) {
        this.lokasi = lokasi;
        this.nilai = nilai;
    }

    @Override
    public String bacaData() {
        return "Sensor di " + lokasi + ": " + nilai + "% kelembaban";
    }
}

class KompositSensor extends Sensor {
    private List<Sensor> sensorList = new ArrayList<>();

    public void tambahSensor(Sensor sensor) {
        sensorList.add(sensor);
    }

    @Override
    public String bacaData() {
        StringBuilder data = new StringBuilder();
        for (Sensor sensor : sensorList) {
            data.append(sensor.bacaData()).append("\n");
        }
        return data.toString();
    }
}
