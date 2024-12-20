package com.example.controlerevision.services;

import com.example.controlerevision.dtos.ComputerDTO;

import java.util.List;

public interface ComputerService {
    public ComputerDTO saveComputer(ComputerDTO computerDTO);
    public List<ComputerDTO> getComputerByProce(String proce);
}
