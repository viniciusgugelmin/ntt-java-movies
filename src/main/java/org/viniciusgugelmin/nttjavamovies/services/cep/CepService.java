package org.viniciusgugelmin.nttjavamovies.services.cep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.viniciusgugelmin.nttjavamovies.application.config.exception.custom.CepNotFoundException;
import org.viniciusgugelmin.nttjavamovies.entities.cep.CepInfo;

@Service
public class CepService implements ICepService {

    @Value("${viacep.url}")
    private String viaCepUrl;
    private final RestTemplate restTemplate;

    public CepService() {
        this.restTemplate = new RestTemplate();
    }

    public CepInfo findCep(String cep) {
        try {
            String url = viaCepUrl + cep + "/json/";
            return restTemplate.getForObject(url, CepInfo.class);
        } catch (Exception e) {
            throw new CepNotFoundException(cep);
        }
    }
}
