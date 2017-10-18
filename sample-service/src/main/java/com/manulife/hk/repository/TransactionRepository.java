package com.manulife.hk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.manulife.hk.domain.TransactionEntity;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionEntity, String> {
	@Query("select  t.tx_code from REFNO_TX_LOG t where t.ref_no ='975765' ")
	public String findOneByRefNo();

}
