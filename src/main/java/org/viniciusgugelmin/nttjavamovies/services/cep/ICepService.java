package org.viniciusgugelmin.nttjavamovies.services.cep;

import org.viniciusgugelmin.nttjavamovies.entities.cep.CepInfo;

public interface ICepService {
    CepInfo findCep(String cep);
}
