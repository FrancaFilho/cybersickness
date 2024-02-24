package br.com.measure.entity;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

@Data
@RegisterForReflection
public class Dados {
    String id;
    String measure;
    Demographic demographic;
    Immersion immersion;
    Biosignal biosignal;
    ReportingStyles reportingStyles;
    PreprocessingMethods preprocessingMethods;
    FeatureExtraction featureExtraction;
    DevicesChannelsPowerband devicesChannelsPowerband;
    CiteThis citeThis;
}
