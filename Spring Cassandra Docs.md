# Spring Cassandra Docs



Cassandra docker

application.properties

```properties
spring.cassandra.keyspace-name=mykeyspace
spring.cassandra.contact-points=127.0.0.1
spring.cassandra.port=9042
spring.cassandra.schema-action=create_if_not_exists
# add following if replication factor > 1
spring.cassandra.local-datacenter=datacenter1
```



docker-compose.yml

```yml
version: '3.1'
services:
  mycassandra:
    image: cassandra
    container_name: mycassandra
    ports:
      - "9042:9042"
```





start cassandra

```shell
docker-compose up
```



enter cql shell

```shell
docker ps
docker exec -it {CONTAINER ID} bash
```



enter cal

```
cqlsh
```



create namespace

```
create keyspace mykeyspace with replication = {'class':'SimpleStrategy', 'replication_factor':1}
```

Note: if replication_factor is larger than 1, application properties need to include the DC.



user namespace

```cql
use mykeyspace;
```



create table

```cql
create table product (id int PRIMARY KEY, name TEXT);
```



# Optional

check cassandra node

You can check this by querying the local node's `system.peers` table. That table holds data on each of the *other* nodes in the cluster.



```
SELECT * FROM system.peers;
```

