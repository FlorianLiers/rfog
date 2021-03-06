/*******************************************************************************
 * Forwarding on Gates Simulator/Emulator
 * Copyright (C) 2012, Integrated Communication Systems Group, TU Ilmenau.
 * 
 * This program and the accompanying materials are dual-licensed under either
 * the terms of the Eclipse Public License v1.0 as published by the Eclipse
 * Foundation
 *  
 *   or (per the licensee's choosing)
 *  
 * under the terms of the GNU General Public License version 2 as published
 * by the Free Software Foundation.
 ******************************************************************************/
package de.tuilmenau.ics.fog;

import de.tuilmenau.ics.fog.topology.Simulation;

public class ExitEvent implements IEvent
{
	public ExitEvent(Simulation sim)
	{
		this.sim = sim;
	}
	
	@Override
	public void fire()
	{
		sim.exit();
	}

	private Simulation sim;
}
