package br.com.measure.service;

import br.com.measure.entity.Dados;
import br.com.measure.repository.CybersicknessRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.concurrent.ExecutionException;

@ApplicationScoped
public class CybersicknessService {

    @Inject
    CybersicknessRepository cybersicknessRepository;

    public List<Dados> listarCybersickness() throws ExecutionException, InterruptedException {
        return cybersicknessRepository.obterListSickness();
    }
}
