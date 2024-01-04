package com.greatLearning.gl.ServiceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatLearning.gl.Entity.Ticket;
import com.greatLearning.gl.Repository.TicketRepository;
import com.greatLearning.gl.Service.TicketService;

//all seven services that we are providing to the user are provided in the form of functions to perform the basic operations based on ticket tracker application
@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketRepository ticketRepository;

	public TicketServiceImpl(TicketRepository ticketRepository) {
		this.ticketRepository = ticketRepository;
	}

	@Override
	public List<Ticket> getAllTickets() {

		return ticketRepository.findAll();
	}

	@Override
	public Ticket saveTicket(Ticket ticket) {

		return ticketRepository.save(ticket);

	}

	@Override
	public Ticket getTicketById(Long id) {
		// TODO Auto-generated method stub
		return ticketRepository.findById(id).get();
	}

	@Override
	public Ticket viewTicket(Long id) {

		return ticketRepository.getReferenceById(id);
	}

	@Override
	public Ticket updateTicket(Ticket ticket) {

		return ticketRepository.save(ticket);
	}

	@Override
	public void deleteTicketByid(Long id) {

		ticketRepository.deleteById(id);

	}

	@Override
	public List<Ticket> getByKeyword(String keyword) {

		return ticketRepository.findByKeyword(keyword);
	}

}
