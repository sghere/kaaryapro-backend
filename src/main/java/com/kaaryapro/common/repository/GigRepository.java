package com.kaaryapro.common.repository;

import com.kaaryapro.common.entity.Gig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GigRepository extends JpaRepository<Gig, Long> {
}
