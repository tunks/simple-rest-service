/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.att.vtm.controller;

import com.att.vtm.model.Ticket;
import com.att.vtm.repositories.TicketRepository;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ebrimatunkara
 */
@RestController
@RequestMapping("/tickets")
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Resource
    private TicketRepository ticketRepository;

    @RequestMapping(method = RequestMethod.POST, consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity saveAssignedTickets(@RequestBody Ticket ticket) {
        logger.info("Received ticket assigned " + ticket);
        try {
            ticketRepository.save(ticket);
            logger.info("Assigned ticket saved");
            return ResponseEntity.ok("{\"success\": \"true\"}");
        } catch (Exception ex) {
            logger.error("Cannot save assigned ticket " + ex.getMessage());
            return new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    public Page<Ticket> getAssignedTickets(Pageable page) {
        return ticketRepository.findAll(page);
    }
}
