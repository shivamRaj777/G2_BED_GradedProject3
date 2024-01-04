package com.greatLearning.gl.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.greatLearning.gl.Entity.Ticket;

//we have used id type to be long data type 
public interface TicketRepository extends JpaRepository<Ticket, Long> {

	@Query(value = "select * from tickets t where t.ticket_title like %:keyword% or t.ticket_created_on like %:keyword% ", nativeQuery = true)
	List<Ticket> findByKeyword(@Param("keyword") String keyword);

}
