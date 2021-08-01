package com.Company;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface teamRepository extends JpaRepository<Teamreport, Integer> {

	@Query(value = "Select * from Teamreport t where t.teamname like %:key% or t.taskname like %:key%",nativeQuery = true)
	List<Teamreport> findbyKeyword(@Param( "key") String Key);
}
