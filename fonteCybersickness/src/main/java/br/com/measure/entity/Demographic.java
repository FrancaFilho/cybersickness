package br.com.measure.entity;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

@Data
@RegisterForReflection
public class Demographic {
    String people;
    String male;
    String female;
    String ageRange;
    String mean;
}
