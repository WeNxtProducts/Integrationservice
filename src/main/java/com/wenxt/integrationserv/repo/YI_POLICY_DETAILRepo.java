package com.wenxt.integrationserv.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.integrationserv.model.YiPolicyDetail;

@Repository
public interface YI_POLICY_DETAILRepo extends JpaRepository<YiPolicyDetail, String> {
    
}
