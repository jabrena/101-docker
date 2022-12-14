# Usecase 1

```
docker stats
```

## JVM

```
CONTAINER ID   NAME                    CPU %     MEM USAGE / LIMIT     MEM %     NET I/O     BLOCK I/O         PIDS
ddb46bf5644d   usecase1-usecase1ag-1   141.64%   354.5MiB / 7.764GiB   4.46%     766B / 0B   4.1kB / 98.3kB    23
bcc034194676   usecase1-usecase1a-1    100.99%   348.2MiB / 7.764GiB   4.38%     766B / 0B   0B / 98.3kB       23
2bf664e15500   usecase1-usecase1b-1    154.58%   339.2MiB / 7.764GiB   4.27%     876B / 0B   57.3kB / 98.3kB   27
```

## GraalVM Native

```
CCONTAINER ID   NAME                   CPU %     MEM USAGE / LIMIT     MEM %     NET I/O         BLOCK I/O   PIDS
362bb0c79a7c   usecase1-usecase1a-1   0.04%     47.25MiB / 7.764GiB   0.59%     1.73kB / 997B   0B / 0B     19
295f3bd940dc   usecase1-usecase1b-1   0.05%     27.89MiB / 7.764GiB   0.35%     1.43kB / 463B   0B / 0B     18
```