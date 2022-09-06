package com.brocodeactivist.recipient.repository;

import com.brocodeactivist.recipient.entity.RecipientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipientRepository extends JpaRepository<RecipientEntity, Long> {
}
