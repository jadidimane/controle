package com.example.controlerevision.services;

import com.example.controlerevision.dao.entities.Computer;
import com.example.controlerevision.dao.repositories.ComputerRepository;
import com.example.controlerevision.dtos.ComputerDTO;
import com.example.controlerevision.mapper.ComputerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ComputerManager implements ComputerService{
    @Autowired
    private ComputerRepository computerRepository;
    @Autowired
    private ComputerMapper computerMapper;
    @Override
    public ComputerDTO saveComputer(ComputerDTO computerDTO) {
        if(computerDTO==null){
            throw new IllegalArgumentException("ComputerInput cannot be null");
        }
       Computer computer=computerMapper.computerDTOToComputer(computerDTO);
       computerRepository.save(computer);
       ComputerDTO computerDTO1=computerMapper.computerToComputerDTO(computer);
       return computerDTO1;
    }

    @Override
    public List<ComputerDTO> getComputerByProce(String proce) {
        List<Computer> computers = computerRepository.findByProce(proce);
        List<ComputerDTO> computerDTOS = new ArrayList<>();
        for (Computer computer : computers) {
            computerDTOS.add(computerMapper.computerToComputerDTO(computer));
        }
         return computerDTOS;


    }


}
