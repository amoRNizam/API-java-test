package models;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Value{

	@SerializedName("integer")
	private int integer;

	@SerializedName("type")
	private String type;

	public void setInteger(int integer){
		this.integer = integer;
	}

	public int getInteger(){
		return integer;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	@Override
 	public String toString(){
		return 
			"Value{" + 
			"integer = '" + integer + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}