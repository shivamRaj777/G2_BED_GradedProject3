package com.greatLearning.gl.Service;

import java.util.List;

import com.greatLearning.gl.Entity.Ticket;

public interface TicketService {
	// we want to perform crud operations ,hence 7 service will be provide to user
	public List<Ticket> getAllTickets(); // will give us list of tickets

	Ticket saveTicket(Ticket ticket);// perform save operations on creating tickets

	public Ticket getTicketById(Long id);// find tickets by id

	public Ticket viewTicket(Long id);

	public Ticket updateTicket(Ticket ticket);

	public void deleteTicketByid(Long id);// delete ticket by id

	public List<Ticket> getByKeyword(String keyword);
}
