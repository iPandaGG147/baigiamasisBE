package com.baigiamasis.gytis.repository;
import com.baigiamasis.gytis.model.Positions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


@Repository
public interface PositionRepository extends JpaRepository<Positions, String> {
}
