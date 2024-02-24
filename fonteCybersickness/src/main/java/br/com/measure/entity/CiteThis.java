package br.com.measure.entity;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

@Data
@RegisterForReflection
public class CiteThis {
    String title;
    String doi;
    String year;
    String autors;
}
