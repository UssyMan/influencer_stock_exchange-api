package com.uthmanIV.ise.user.portfolio;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface PortfolioRepository extends JpaRepository<Portfolio,Long> {

    Optional<Portfolio> findByUserId(Long userId);
}
