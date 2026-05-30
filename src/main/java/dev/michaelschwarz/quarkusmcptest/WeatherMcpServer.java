package dev.michaelschwarz.quarkusmcptest;

import io.quarkiverse.mcp.server.Tool;

public class WeatherMcpServer {

    @Tool(description = "Get weather information for a location")
    public String getWeatherInformation(String locationName) {
        return "35°C in %s".formatted(locationName);
    }
}
