/*
 * Copyright 2004 The JA-SIG Collaborative. All rights reserved. See license distributed with this file and available online at
 * http://www.uportal.org/license.html
 */
package org.jasig.cas.ticket.support;

import org.jasig.cas.ticket.ExpirationPolicy;
import org.jasig.cas.ticket.Ticket;

/**
 * NeverExpiresExpirationPolicy always answers false when asked if a Ticket is expired. Use this policy when you want a Ticket to live forever, or at
 * least as long as the particular CAS Universe exists.
 * 
 * @author Scott Battaglia
 * @version $Id$
 */
public class NeverExpiresExpirationPolicy implements ExpirationPolicy {

    public boolean isExpired(final Ticket ticket) {
        return false;
    }
}