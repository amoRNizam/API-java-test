package models;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class FieldsItem{

	@SerializedName("field_id")
	private String fieldId;

	@SerializedName("value")
	private Value value;

	public void setFieldId(String fieldId){
		this.fieldId = fieldId;
	}

	public String getFieldId(){
		return fieldId;
	}

	public void setValue(Value value){
		this.value = value;
	}

	public Value getValue(){
		return value;
	}

	@Override
 	public String toString(){
		return 
			"FieldsItem{" + 
			"field_id = '" + fieldId + '\'' + 
			",value = '" + value + '\'' + 
			"}";
		}
}