package org.viniciusgugelmin.nttjavamovies.services.actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.viniciusgugelmin.nttjavamovies.entities.actor.IActor;
import org.viniciusgugelmin.nttjavamovies.repositories.actor.ActorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ActorService implements IActorService {
    private final ActorRepository actorRepository;

    @Autowired
    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @Override
    public List<IActor> list() {
        return this.actorRepository.findAll();
    }

    @Override
    public Optional<IActor> findById(Long id) {
        return this.actorRepository.findById(id);
    }

    @Override
    public IActor create(IActor object) {
        return this.actorRepository.save(object);
    }

    @Override
    public IActor update(IActor object) {
        return this.actorRepository.save(object);
    }

    @Override
    public void delete(Long id) {
        this.actorRepository.deleteById(id);
    }
}
