package Frame;

public abstract class Access {
	public abstract Tree.Exp exp(Tree.Exp framePtr);
	public abstract Tree.Exp expFromStack(Tree.Exp stackPtr); 
}
