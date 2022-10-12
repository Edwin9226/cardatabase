package com.kruger.cardatabase.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {

    //Fetch cars by brand
    @Query("select c from Car c where c.brand = ?1")
    List<Car> findByBrand(String brand);

    // Fetch cars by brand using SQL
    @Query("select c from Car c where c.brand like %?1")
    List<Car> findByBrandEndWith(String brand);

    // Fetch cars by color
    List<Car> findByColor(String color);

    // Fetch cars by year
    List<Car> findByYear(int year);

    //Fetch cars by brand
    List<Car> findByBrandAndModel(String brand, String model);

    // Fetch cars by color
    List<Car> findByBrandOrColor(String brand,String color);

    // Fetch cars by brand and sort by year
    List<Car> findByBrandOrderByYearAsc(String brand);

    @Override
    default <S extends Car> S save(S entity) {
        return null;
    }

    @Override
    default <S extends Car> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    default Optional<Car> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    default Iterable<Car> findAll() {
        return null;
    }

    @Override
    default long count() {
        return 0;
    }

    @Override
    default void deleteById(Long aLong) {

    }

    @Override
    default void delete(Car entity) {

    }

    @Override
    default void deleteAll() {

    }
}
