# consumer-kafka-proj

Download and unzip Kafka on Windows and make sure to setup that properly.  

Run Zookeeper in kafka directory.  

```
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
```

Run Kafka server using  

```
.\bin\windows\kafka-server-start.bat .\config\server.properties
```

Run this project.

### Output

![Screenshot 2024-08-18 234500](https://github.com/user-attachments/assets/937a293c-1e9e-40ba-a862-1d095989944c)


Note:

### if any issues while using kafka, try updating this property in server.properties file.  

```
listeners=PLAINTEXT://localhost:9092
```
