package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        float temperatureFahrenheit = (temperatureCelsius * 1.8f) + 32.0f;
        System.out.println(temperatureFahrenheit);
    }
}
