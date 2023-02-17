package com.arsatapathy.elasticsearch.repo;

import com.arsatapathy.elasticsearch.model.Student;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface StudentRepo extends ElasticsearchRepository<Student, Long> {
}
