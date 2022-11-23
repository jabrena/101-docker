# Usecase 1

```
docker stats
```

## JVM

```
CONTAINER ID   NAME                   CPU %     MEM USAGE / LIMIT     MEM %     NET I/O       BLOCK I/O    PIDS
5a029cdc422e   usecase1-usecase1b-1   0.96%     344.5MiB / 7.764GiB   4.33%     1.32kB / 0B   0B / 365kB   38
2b42833f888c   usecase1-usecase1a-1   0.86%     354.5MiB / 7.764GiB   4.46%     1.14kB / 0B   0B / 365kB   38
```

## GraalVM Native

```
CONTAINER ID   NAME                   CPU %     MEM USAGE / LIMIT    MEM %     NET I/O     BLOCK I/O   PIDS
3060ff10fa4f   usecase1-usecase1a-1   0.07%     29.6MiB / 7.764GiB   0.37%     766B / 0B   0B / 0B     18
7a42f3c6902d   usecase1-usecase1b-1   0.05%     21.8MiB / 7.764GiB   0.27%     876B / 0B   0B / 0B     18
```