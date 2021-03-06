/*******************************************************************************
 * Copyright (c) 2014 Bert De Geyter (https://github.com/TheHolyWaffle).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     Bert De Geyter (https://github.com/TheHolyWaffle)
 ******************************************************************************/
package com.github.theholywaffle.teamspeak3.api.exception;

public class TS3UnknownErrorException extends TS3Exception {

	private static final long serialVersionUID = -8458508268312921713L;

	public TS3UnknownErrorException(String error) {
		super(error+" [Please report this exception to the developer!]");
	}

}
