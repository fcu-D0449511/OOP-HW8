package fcu.iecs.oop.pokemon;

public abstract class Pokemon implements Fightable {

	private String nickname ;
	private PokemonType type ;
	private int cp ;
	
	public Pokemon(String a , PokemonType b , int c)
	{
		this.nickname = a ;
		this.type = b ;
		this.cp = c ;
	}
	
	public int getcp()
	{
		return cp ;
	}
	public String getnickname()
	{
		return nickname;
	}
	public PokemonType gettype()
	{
		return type ;
	}
	public void setnickname(String nickname)
	{
		this.nickname = nickname;
	}
	public void setcp(int cp)
	{
		this.cp = cp;
	}
	
}
