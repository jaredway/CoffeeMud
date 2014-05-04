package com.planet_ink.coffee_mud.Abilities.Specializations;
import com.planet_ink.coffee_mud.core.interfaces.*;
import com.planet_ink.coffee_mud.core.*;
import com.planet_ink.coffee_mud.core.collections.*;
import com.planet_ink.coffee_mud.Abilities.interfaces.*;
import com.planet_ink.coffee_mud.Areas.interfaces.*;
import com.planet_ink.coffee_mud.Behaviors.interfaces.*;
import com.planet_ink.coffee_mud.CharClasses.interfaces.*;
import com.planet_ink.coffee_mud.Commands.interfaces.*;
import com.planet_ink.coffee_mud.Common.interfaces.*;
import com.planet_ink.coffee_mud.Exits.interfaces.*;
import com.planet_ink.coffee_mud.Items.interfaces.*;
import com.planet_ink.coffee_mud.Locales.interfaces.*;
import com.planet_ink.coffee_mud.MOBS.interfaces.*;
import com.planet_ink.coffee_mud.Races.interfaces.*;

import java.util.*;


/*
   Copyright 2014-2014 Bo Zimmerman

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

	   http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
public class Specialization_Shield extends Specialization_Weapon
{
	@Override public String ID() { return "Specialization_Shield"; }
	@Override public String name(){ return "Shield Specialization";}
	public Specialization_Shield()
	{
		super();
		weaponClass=Weapon.CLASS_BLUNT;
	}

	@Override
	protected int getDamageBonus(MOB mob, int dmgType)
	{
		return getXLEVELLevel(mob);
	}
	@Override
	protected boolean isWeaponMatch(Weapon W)
	{
		return W instanceof Shield;
	}

	@Override
	protected boolean canDamage(MOB mob, Weapon W)
	{
		return W instanceof Shield;
	}

	@Override
	protected boolean isWearableItem(Item I)
	{
		return I instanceof Shield;
	}

}