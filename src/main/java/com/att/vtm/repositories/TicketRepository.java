/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.att.vtm.repositories;

import com.att.vtm.model.Ticket;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author ebrimatunkara
 */
public interface TicketRepository extends PagingAndSortingRepository<Ticket, String>{
    
}
