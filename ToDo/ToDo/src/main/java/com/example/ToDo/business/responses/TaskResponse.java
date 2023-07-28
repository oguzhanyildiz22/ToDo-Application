package com.example.ToDo.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskResponse {

    private String title;

    private String description;

    private String startDate;

    private String deadLine;
}
