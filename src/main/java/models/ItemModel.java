package models;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ItemModel{

	@SerializedName("size")
	private int size;

	@SerializedName("records_count")
	private int recordsCount;

	@SerializedName("records")
	private Records records;

	@SerializedName("database_id")
	private String databaseId;

	@SerializedName("created")
	private String created;

	@SerializedName("modified")
	private String modified;

	@SerializedName("handle")
	private String handle;

	@SerializedName("revision")
	private int revision;

	public void setSize(int size){
		this.size = size;
	}

	public int getSize(){
		return size;
	}

	public void setRecordsCount(int recordsCount){
		this.recordsCount = recordsCount;
	}

	public int getRecordsCount(){
		return recordsCount;
	}

	public void setRecords(Records records){
		this.records = records;
	}

	public Records getRecords(){
		return records;
	}

	public void setDatabaseId(String databaseId){
		this.databaseId = databaseId;
	}

	public String getDatabaseId(){
		return databaseId;
	}

	public void setCreated(String created){
		this.created = created;
	}

	public String getCreated(){
		return created;
	}

	public void setModified(String modified){
		this.modified = modified;
	}

	public String getModified(){
		return modified;
	}

	public void setHandle(String handle){
		this.handle = handle;
	}

	public String getHandle(){
		return handle;
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
			"ItemModel{" + 
			"size = '" + size + '\'' + 
			",records_count = '" + recordsCount + '\'' + 
			",records = '" + records + '\'' + 
			",database_id = '" + databaseId + '\'' + 
			",created = '" + created + '\'' + 
			",modified = '" + modified + '\'' + 
			",handle = '" + handle + '\'' + 
			",revision = '" + revision + '\'' + 
			"}";
		}
}