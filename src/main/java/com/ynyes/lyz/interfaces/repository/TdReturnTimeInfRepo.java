package com.ynyes.lyz.interfaces.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.ynyes.lyz.interfaces.entity.TdReturnTimeInf;

public interface TdReturnTimeInfRepo
		extends PagingAndSortingRepository<TdReturnTimeInf, Long>, JpaSpecificationExecutor<TdReturnTimeInf> 
{

}

