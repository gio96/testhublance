package com.hublance.testhublance.repository;

import com.hublance.testhublance.models.BrandDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepositoryDataAdapter extends JpaRepository<BrandDao, Long> {
}
