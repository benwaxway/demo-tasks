package fr.uga.im2ag.l3.miage.tasks.web;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Null;

import java.util.Date;

public record TaskDTO(
       Integer id,
       @NotBlank
       String title,
       @Null
       Date creation) {
}
