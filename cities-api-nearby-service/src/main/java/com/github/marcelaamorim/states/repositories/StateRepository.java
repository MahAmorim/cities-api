package com.github.marcelaamorim.states.repositories;

import com.github.marcelaamorim.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
