package com.arsatapathy.elasticsearch.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "employee-master", createIndex = false)
public class Employee {
    @Id
    private long employeeId;
    private String employeeName;
    private String department;
    private String address;
}
