package com.wenxt.integrationserv.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.integrationserv.model.PGIT_POL_RISK_ADDL_INFO;

@Repository
public interface PGIT_POL_RISK_ADDL_INFORepo extends JpaRepository<PGIT_POL_RISK_ADDL_INFO, Long> {
 
}
