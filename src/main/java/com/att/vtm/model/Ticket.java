/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.att.vtm.model;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author ebrimatunkara
 */
@Document
public class Ticket implements Serializable {

    @Id
    private String id;
    private TicketAction action;
    private String ticketNumber;
    private String functionalArea;
    private String activeOrg;
    private String ticketOwner;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TicketAction getAction() {
        return action;
    }

    public void setAction(TicketAction action) {
        this.action = action;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getFunctionalArea() {
        return functionalArea;
    }

    public void setFunctionalArea(String functionalArea) {
        this.functionalArea = functionalArea;
    }

    public String getActiveOrg() {
        return activeOrg;
    }

    public void setActiveOrg(String activeOrg) {
        this.activeOrg = activeOrg;
    }

    public String getTicketOwner() {
        return ticketOwner;
    }

    public void setTicketOwner(String ticketOwner) {
        this.ticketOwner = ticketOwner;
    }

    public static enum TicketAction {
        TICKET_CREATE, TICKET_UPDATE
    }
}
