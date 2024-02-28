package com.example.cassandrajpa;

import com.example.cassandrajpa.model.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface ProductRepository extends CassandraRepository<Product, Integer> {
}
