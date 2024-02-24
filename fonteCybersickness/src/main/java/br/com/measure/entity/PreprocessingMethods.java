package br.com.measure.entity;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

@Data
@RegisterForReflection
public class PreprocessingMethods {
    String preprocessing;
}
