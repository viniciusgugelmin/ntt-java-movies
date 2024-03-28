package org.viniciusgugelmin.nttjavamovies.services.streamming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.viniciusgugelmin.nttjavamovies.entities.streamming.IStreamming;
import org.viniciusgugelmin.nttjavamovies.repositories.streamming.StreammingRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StreammingService implements IStreammingService {
    private final StreammingRepository streammingRepository;

    @Autowired
    public StreammingService(StreammingRepository streammingRepository) {
        this.streammingRepository = streammingRepository;
    }

    @Override
    public List<IStreamming> list() {
        return this.streammingRepository.findAll();
    }

    @Override
    public Optional<IStreamming> findById(Long id) {
        return this.streammingRepository.findById(id);
    }

    @Override
    public IStreamming create(IStreamming object) {
        return this.streammingRepository.save(object);
    }

    @Override
    public IStreamming update(IStreamming object) {
        return this.streammingRepository.save(object);
    }

    @Override
    public void delete(Long id) {
        this.streammingRepository.deleteById(id);
    }
}
