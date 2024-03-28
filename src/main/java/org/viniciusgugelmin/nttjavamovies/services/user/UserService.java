package org.viniciusgugelmin.nttjavamovies.services.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.viniciusgugelmin.nttjavamovies.entities.user.IUser;
import org.viniciusgugelmin.nttjavamovies.repositories.user.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<IUser> list() {
        return this.userRepository.findAll();
    }

    @Override
    public Optional<IUser> findById(Long id) {
        return this.userRepository.findById(id);
    }

    @Override
    public IUser create(IUser object) {
        return this.userRepository.save(object);
    }

    @Override
    public IUser update(IUser object) {
        return this.userRepository.save(object);
    }

    @Override
    public void delete(Long id) {
        this.userRepository.deleteById(id);
    }
}
