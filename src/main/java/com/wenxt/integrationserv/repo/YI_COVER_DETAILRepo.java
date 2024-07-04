package com.wenxt.integrationserv.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.integrationserv.model.YiCoverDetail;

@Repository
public interface YI_COVER_DETAILRepo extends JpaRepository<YiCoverDetail, String> {
    
}
