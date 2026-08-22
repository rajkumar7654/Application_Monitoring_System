## Application Monitoring System – Long Description

**Application Monitoring System** is a monitoring and performance-tracking project designed to continuously monitor the health, performance, and resource utilization of an application. The main purpose of this project is to provide developers with real-time information about how the application is working and to help them identify errors, performance issues, and system bottlenecks quickly.

The system collects and monitors different application and system-level metrics such as **CPU usage, memory usage, API request count, response time, error rate, API latency, database performance, and token usage**. These metrics help developers understand the behavior of the application and determine whether the system is performing normally or requires optimization.

The project uses **Prometheus** for collecting and storing monitoring metrics. Prometheus periodically collects metrics from the application through a metrics endpoint and stores them as time-series data. The collected data can then be used to analyze application performance and detect abnormal behavior.

The monitoring system can be containerized using **Docker**, which makes it easier to configure, start, stop, and manage the monitoring environment. Docker can be used to run Prometheus without installing and configuring every component manually on the local system.

### Main Features

* Real-time application monitoring
* CPU and memory usage monitoring
* API request and response-time monitoring
* Error-rate tracking
* API latency monitoring
* Database performance monitoring
* Token usage monitoring
* Metrics collection using Prometheus
* Docker-based deployment
* Easy identification of performance bottlenecks
* Helps improve application reliability and performance

### Docker Commands to Start Prometheus

If you are using a `docker-compose.yml` file, open the terminal in the project folder and run:

```bash
docker compose up -d
```

To check whether the container is running:

```bash
docker ps
```

To see the logs:

```bash
docker compose logs -f
```

To stop the Docker containers:

```bash
docker compose down
```

If you already have a Prometheus Docker container and only want to start it:

```bash
docker start prometheus
```

To check the Prometheus container logs:

```bash
docker logs prometheus
```

After starting Prometheus, you can generally access its dashboard at:

```text
http://localhost:9090
```

**Project objective:** The overall objective of the Application Monitoring System is to provide a centralized and reliable way to monitor application performance, detect problems early, analyze system behavior, and maintain a stable and efficient application environment.
