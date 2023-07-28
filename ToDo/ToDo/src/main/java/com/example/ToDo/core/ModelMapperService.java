package com.example.ToDo.core;

import org.modelmapper.ModelMapper;
public interface ModelMapperService {
    ModelMapper forResponse();
    ModelMapper forRequest();
}
