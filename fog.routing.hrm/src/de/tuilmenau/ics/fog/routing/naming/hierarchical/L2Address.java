/*******************************************************************************
 * Forwarding on Gates Simulator/Emulator - Hierarchical Routing Management
 * Copyright (c) 2012, Integrated Communication Systems Group, TU Ilmenau.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 ******************************************************************************/
package de.tuilmenau.ics.fog.routing.naming.hierarchical;

import java.math.BigInteger;

import de.tuilmenau.ics.fog.facade.Description;
import de.tuilmenau.ics.fog.routing.hierarchical.RoutingServiceLinkVector;
import de.tuilmenau.ics.fog.routing.hierarchical.properties.ASParticipationProperty;

public class L2Address extends HRMName
{
	private static final long serialVersionUID = 4484202410314555829L;

	public L2Address(long pAddress, String pASName)
	{
		super(BigInteger.valueOf(pAddress));
		Description tDescription = new Description();
		tDescription.set(new ASParticipationProperty(pASName));
	}

	public L2Address(BigInteger pAddress)
	{
		super(pAddress);
	}
	
	public void setCaps(Description pDescription)
	{
		super.setCaps(pDescription);
	}
	
	public boolean equals(Object pObj)
	{
		if(pObj == null) return false;
		if(pObj == this) return true;
		
		if(pObj instanceof L2Address) {
			return (((L2Address) pObj).mAddress.equals(mAddress));
		} else if (pObj instanceof RoutingServiceLinkVector) {
			return ( ((RoutingServiceLinkVector)pObj).getSource() != null && ((RoutingServiceLinkVector)pObj).getSource().equals(this)) || (((RoutingServiceLinkVector)pObj).getDestination() != null && ((RoutingServiceLinkVector)pObj).getDestination().equals(this) ) ;
		}
		
		return false;
	}
	
	public String toString()
	{
		return mOptionalDescr + "(" + mAddress + ")";
	}
}
