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
package com.github.theholywaffle.teamspeak3.api.wrapper;

import java.util.HashMap;

public class Version extends Wrapper{

	public Version(HashMap<String, String> map) {
		super(map);
	}
	
	public String getVersion(){
		return get("version");
	}
	
	public String getBuild(){
		return get("build");
	}
	
	public String getPlatform(){
		return get("platform");
	}

}
