package com.example.controlerevision.dtos;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ComputerDTO {
    private String proce;
    private String ram;
    private Float price;
    private String hardDrive;


}
