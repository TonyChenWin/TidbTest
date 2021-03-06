dataDir: ./data
logsDir: ./logs
# supported networkMode: bridge | host
# host network mode is useless on Mac
networkMode: bridge

pd:
  size: ${pdSize}
  image: pingcap/pd:latest

  # If you want to build pd image from source, leave image empty and specify pd source directory
  # and its dockerfile name
  # buildPath: ./pd
  # dockerfile: Dockerfile
  # when network_mode is host, pd port ranges [port, port+size)
  port: 2379

tikv:
  size: ${tikvSize}
  image: pingcap/tikv:latest

  # If you want to build tikv image from source, leave image empty and specify tikv source directory
  # and its dockerfile name
  # buildPath: ./tikv
  # dockerfile: Dockerfile
  # when network mode is host, tikv port ranges [port, port+size)
  port: 20160

# comment this section out if you don't need SQL layer and want to use TiKV directly
# when using TiKV directly, networkMode must be set to `host`
tidb:
  workerCount: 2
  image: pingcap/tidb:latest

  # If you want to build tidb image from source, leave image empty and specify tidb source directory
  # and its dockerfile name
  # buildPath: ./tidb
  # dockerfile: Dockerfile
  mysqlPort: "4000"
  statusPort: "10080"

tispark:
  image: pingcap/tispark:latest

  # If you want to build tidb image from source, leave image empty and specify tidb source directory
  # and its dockerfile name
  # buildPath: ./tidb
  # dockerfile: Dockerfile
  buildPath: ./tispark
  dockerfile: Dockerfile

  masterPort: 7077
  webuiPort: 8080
  workerCount: 1
  # slave web ui port will be workerWebUIPort ~ workerWebUIPort+workerCount-1
  workerWebUIPort: 38081

# comment this out to disable tidb-vision
tidbVision:
  image: pingcap/tidb-vision:latest

  # If you want to build tidb-vision image from source, leave image empty and specify tidb-vision source directory
  # and its dockerfile name
  # buildPath: ./tidb-vision
  # dockerfile: Dockerfile
  port: "8010"

# comment following monitor components sections out to disable monitor
grafana:
  image: grafana/grafana:5.3.0
  port: "3000"
  logLevel: error

pushgateway:
  image: prom/pushgateway:v0.3.1
  port: "9091"
  logLevel: error

prometheus:
  image: prom/prometheus:v2.2.1
  port: "9090"
  logLevel: error

# This is used to import tidb monitor dashboard templates to grafana
# this container runs only once and keep running until templates imported successfully
dashboardInstaller:
  image: pingcap/tidb-dashboard-installer:v2.0.0

  # If you want to build tidb-dashboard-installer image from source, leave image empty and specify tidb-dashboard-installer source directory
  # and its dockerfile name
  # buildPath: ./dashboard-installer
  # dockerfile: Dockerfile
