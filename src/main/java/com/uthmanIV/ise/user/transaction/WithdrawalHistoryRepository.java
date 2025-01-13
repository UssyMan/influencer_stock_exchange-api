package com.uthmanIV.ise.user.transaction;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface WithdrawalHistoryRepository extends JpaRepository<WithdrawalHistory,Long> {

    Optional<List<WithdrawalHistory>> findByUserId(Long id);
}
