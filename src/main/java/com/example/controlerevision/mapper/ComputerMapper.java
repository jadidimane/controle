package com.example.controlerevision.mapper;

import com.example.controlerevision.dao.entities.Computer;
import com.example.controlerevision.dtos.ComputerDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
@Component
public class ComputerMapper {
    final private ModelMapper modelMapper=new ModelMapper();
    public ComputerDTO computerToComputerDTO(Computer computer) {
        return modelMapper.map(computer,ComputerDTO.class);
    }
    public Computer computerDTOToComputer(ComputerDTO computerDTO) {
        return modelMapper.map(computerDTO,Computer.class);
    }
}
