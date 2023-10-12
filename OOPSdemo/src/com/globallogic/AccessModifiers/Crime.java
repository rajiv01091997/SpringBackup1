package com.globallogic.AccessModifiers;

public class Crime {
	
	  private int gun;
	  public int getGun(){
	    return gun;  
	  }
	  protected void fire(){
	    System.out.println("shoot!");
	  }
	
}
