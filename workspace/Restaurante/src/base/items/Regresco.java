package base.items;

import bases.Botella;
import bases.Empaque;
import bases.Envoltura;

public abstract class Regresco implements Item {

	@Override
	public Empaque empaque()
	{
		return new Botella();
	}
	
	@Override
	public abstract float precio();
	
}
