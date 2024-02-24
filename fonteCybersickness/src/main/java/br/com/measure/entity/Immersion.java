package br.com.measure.entity;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

@Data
@RegisterForReflection
public class Immersion {
    String modeStimulus;
    String vrContent;
    String movingStill;
    String standingSittingActive;
}
