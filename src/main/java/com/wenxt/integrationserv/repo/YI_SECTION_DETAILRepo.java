package com.wenxt.integrationserv.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.integrationserv.model.YiSectionDetail;

@Repository
public interface YI_SECTION_DETAILRepo extends JpaRepository<YiSectionDetail, String> {
    
}
