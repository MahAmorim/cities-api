package com.github.marcelaamorim.countries.repositories;

import com.github.marcelaamorim.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
