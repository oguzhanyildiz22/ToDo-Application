package com.example.ToDo.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskRequest {

    private String title;

    private String description;

    private String startDate;

    private String deadLine;
}
