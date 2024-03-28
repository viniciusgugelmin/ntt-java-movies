package org.viniciusgugelmin.nttjavamovies.services.actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.viniciusgugelmin.nttjavamovies.entities.actor.Actor;
import org.viniciusgugelmin.nttjavamovies.repositories.actor.ActorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ActorService implements IActorService {
    @Autowired
    private ActorRepository actorRepository;

    @Override
    public List<Actor> list() {
        return this.actorRepository.findAll();
    }

    @Override
    public Optional<Actor> findById(Long id) {
        return this.actorRepository.findById(id);
    }

    @Override
    public Actor create(Actor object) {
        return this.actorRepository.save(object);
    }

    @Override
    public Actor update(Actor object) {
        return this.actorRepository.save(object);
    }

    @Override
    public void delete(Long id) {
        this.actorRepository.deleteById(id);
    }
}
