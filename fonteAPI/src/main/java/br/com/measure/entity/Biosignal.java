package br.com.measure.entity;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

@Data
@RegisterForReflection
public class Biosignal {
    String biosignal;
    String algorithm;
    String binaryMulticlass;
    String accuracies;
    String classificationType;
}
