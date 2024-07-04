package com.wenxt.integrationserv.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.integrationserv.model.YiChargeDetail;

@Repository
public interface YI_Charge_DETAILRepo extends JpaRepository<YiChargeDetail,String> {

}
