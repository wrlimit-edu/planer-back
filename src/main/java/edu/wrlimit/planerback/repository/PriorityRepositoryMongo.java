package edu.wrlimit.planerback.repository;

import edu.wrlimit.planerback.model.Priority;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriorityRepositoryMongo extends MongoRepository<Priority, Long> {
}
