package com.jonydelivery.domain.application;

import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository<T extends DefaultModel> extends JpaRepository<T, Long> {

}
