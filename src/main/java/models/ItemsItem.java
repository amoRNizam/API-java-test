package models;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ItemsItem{

	@SerializedName("collection_id")
	private String collectionId;

	@SerializedName("record_id")
	private String recordId;

	@SerializedName("fields")
	private List<FieldsItem> fields;

	@SerializedName("revision")
	private int revision;

	public void setCollectionId(String collectionId){
		this.collectionId = collectionId;
	}

	public String getCollectionId(){
		return collectionId;
	}

	public void setRecordId(String recordId){
		this.recordId = recordId;
	}

	public String getRecordId(){
		return recordId;
	}

	public void setFields(List<FieldsItem> fields){
		this.fields = fields;
	}

	public List<FieldsItem> getFields(){
		return fields;
	}

	public void setRevision(int revision){
		this.revision = revision;
	}

	public int getRevision(){
		return revision;
	}

	@Override
 	public String toString(){
		return 
			"ItemsItem{" + 
			"collection_id = '" + collectionId + '\'' + 
			",record_id = '" + recordId + '\'' + 
			",fields = '" + fields + '\'' + 
			",revision = '" + revision + '\'' + 
			"}";
		}
}