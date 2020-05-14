package com.project.template.persistence;

import com.project.template.domain.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SomeRepository extends JpaRepository<Entity, Long> {
}
