package Semant;

import Types.*;

public class FuncEntry {
	public Temp.Label label;
	RECORD paramlist;
	Type returnTy;
	public Translate.Level level;
	
	public FuncEntry( Translate.Level level, Temp.Label label, RECORD p, Type rt)
	{
		paramlist = p;
		returnTy = rt;
		this.level = level;
		this.label = label;
	}
}
