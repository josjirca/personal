package base.items;

import bases.Empaque;
import bases.Envoltura;

public abstract class Hamburgesa implements Item {

	@Override
	public Empaque empaque()
	{
		return new Envoltura();
	}
	
	@Override
	public abstract float precio();
}
