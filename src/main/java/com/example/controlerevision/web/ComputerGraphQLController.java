package com.example.controlerevision.web;

import com.example.controlerevision.dao.repositories.ComputerRepository;
import com.example.controlerevision.dtos.ComputerDTO;
import com.example.controlerevision.services.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;


import java.util.List;

@Controller
public class ComputerGraphQLController {
    @Autowired
    ComputerService computerService;

    @QueryMapping
   public List<ComputerDTO> getComputerByProce(@Argument String proce) {
      return computerService.getComputerByProce(proce);
  }
    @MutationMapping
    public ComputerDTO saveComputer(@Argument ComputerRequest computerRequest ) {
        System.out.println(computerRequest.toString());
        ComputerDTO computerDTO = new ComputerDTO(computerRequest.proce(),computerRequest.ram(),computerRequest.price(),computerRequest.hardDrive());
        return computerService.saveComputer(computerDTO);
  }
}
