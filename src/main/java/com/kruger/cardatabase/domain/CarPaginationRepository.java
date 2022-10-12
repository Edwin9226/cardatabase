package com.kruger.cardatabase.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarPaginationRepository extends PagingAndSortingRepository<Car, Long> {
    @Override
    default Iterable<Car> findAll(Sort sort) {
        return null;
    }

    @Override
    default Page<Car> findAll(Pageable pageable) {
        return null;
    }
}
