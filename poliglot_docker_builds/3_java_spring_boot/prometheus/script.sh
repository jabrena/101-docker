docker pull prom/prometheus

docker run -d --name=prometheus -p 9090:9090  -v "$(PWD)/config/prometheus.yml:/etc/prometheus/prometheus.yml"  prom/prometheus --
config.file=/etc/prometheus/prometheus.yml

docker run -d --name=grafana -p 3000:3000 grafana/grafana

# Dashboard to use in grafana 4701 (https://grafana.com/grafana/dashboards/6756-spring-boot-statistics/)
# Another good dashboard https://github.com/amrutprabhu/grafana-prometheus/blob/main/Spring%20Boot%20Statistics%20Dashboard.json