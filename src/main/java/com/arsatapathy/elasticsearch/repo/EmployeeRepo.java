package com.arsatapathy.elasticsearch.repo;

import com.arsatapathy.elasticsearch.model.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface EmployeeRepo extends ElasticsearchRepository<Employee, Long> {
}
