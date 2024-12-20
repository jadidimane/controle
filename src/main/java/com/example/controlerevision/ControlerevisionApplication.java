package com.example.controlerevision;

import com.example.controlerevision.dao.entities.Computer;
import com.example.controlerevision.dtos.ComputerDTO;
import com.example.controlerevision.mapper.ComputerMapper;
import com.example.controlerevision.services.ComputerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.Callable;

@SpringBootApplication
public class ControlerevisionApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControlerevisionApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(ComputerService computerService, ComputerMapper computerMapper) {
        return args -> {
            ComputerDTO computerDTO = ComputerDTO.builder().ram("jsbvn,x;f:n,").proce("ab").price(20.00f).hardDrive(",vd;lq:m;dvq").build();
            Computer com=computerMapper.computerDTOToComputer(computerDTO);
            System.out.println(com.toString());
            computerService.saveComputer(ComputerDTO.builder().ram("jsbvn,x;f:n,").proce("ab").price(20.00f).hardDrive(",vd;lq:m;dvq").build());
            computerService.saveComputer(ComputerDTO.builder().ram("jsbvn,x;f:n,").proce("cd").price(20.00f).hardDrive(",vd;lq:m;dvq").build());
            computerService.saveComputer(ComputerDTO.builder().ram("jsbvn,x;f:n,").proce("ab").price(20.00f).hardDrive(",vd;lq:m;dvq").build());
            computerService.saveComputer(ComputerDTO.builder().ram("jsbvn,x;f:n,").proce("gh").price(20.00f).hardDrive(",vd;lq:m;dvq").build());
            computerService.saveComputer(ComputerDTO.builder().ram("jsbvn,x;f:n,").proce("ij").price(20.00f).hardDrive(",vd;lq:m;dvq").build());

        };
    }
}
