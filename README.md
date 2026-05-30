# Quarkus MCP Test

> **Boilerplate / Template** — This repository is a starting point for building your own MCP server with Quarkus. It is not a finished project and is meant to be adapted to your use case.

A minimal MCP (Model Context Protocol) server built with Java 25 and Quarkus, exposed via Streamable HTTP.

## Tool

**`getWeatherInformation`**

Returns hardcoded weather data for a given location.

| Parameter    | Type   | Description       |
|--------------|--------|-------------------|
| locationName | String | Name of the city  |

Example response: `35°C in Berlin`

## MCP Endpoint

```
http://localhost:8080/mcp
```

Configure this URL in your MCP client (e.g. Claude Desktop, VS Code extension) as a Streamable HTTP transport.

## Build & Run

### Dev Mode (with live reload)

```bash
mvn quarkus:dev
```

### Uber-JAR

```bash
mvn clean install
java -jar target/quarkus-mcp-test-1.0.0-SNAPSHOT.jar
```

### Native Binary

Requires [GraalVM](https://www.graalvm.org/) with native-image installed.

```bash
mvn clean install -P native
./target/quarkus-mcp-test-1.0.0-SNAPSHOT
```

## Tech Stack

| Component  | Version                        |
|------------|--------------------------------|
| Java       | 25                             |
| Quarkus    | 3.36.0                         |
| MCP Server | quarkus-mcp-server-http 1.12.1 |
