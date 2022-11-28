# MONITORING

## ➡️ Running the examples

👉 Start up the observability stack (we use Prometheus and Grafana) and wait for it to start. 
You have to navigate to the monitoring folder first and then run docker compose.
```
docker compose up
```
* To access Prometheus go to http://localhost:9090/
* To access Grafana go to http://localhost:3000/

👉 Go back to the main folder `3_java_spring_boot` and run the application (this will block your current terminal window).
```
$ ./mvnw spring-boot:run 
```

You should see log statements similar to these:

```
2022-11-25T09:25:15.046+01:00  INFO 85662 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 850 ms
2022-11-25T09:25:15.458+01:00  INFO 85662 --- [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 5 endpoint(s) beneath base path '/actuator'
2022-11-25T09:25:15.495+01:00  INFO 85662 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2022-11-25T09:25:15.506+01:00  INFO 85662 --- [           main] c.e.benchmarks.BenchmarkServerJibber     : Started BenchmarkServerJibber in 1.744 seconds (process running for 1.957)
```

👉 Go to [Grafana](http://localhost:3000/), go to dashboards, and click on the `Spring Boot Statistics` dashboard. You will see some metrics related to HTTP request. These come from the automated Spring Boot WebMvc instrumentation that uses the Micrometer API.

How to shutdown the example?

```
docker compose down
```