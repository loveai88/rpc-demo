/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package example.avro.idl;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Record extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Record\",\"namespace\":\"example.avro.idl\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public long id;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Record() {}

  /**
   * All-args constructor.
   */
  public Record(java.lang.Long id) {
    this.id = id;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Long value) {
    this.id = value;
  }

  /** Creates a new Record RecordBuilder */
  public static example.avro.idl.Record.Builder newBuilder() {
    return new example.avro.idl.Record.Builder();
  }
  
  /** Creates a new Record RecordBuilder by copying an existing Builder */
  public static example.avro.idl.Record.Builder newBuilder(example.avro.idl.Record.Builder other) {
    return new example.avro.idl.Record.Builder(other);
  }
  
  /** Creates a new Record RecordBuilder by copying an existing Record instance */
  public static example.avro.idl.Record.Builder newBuilder(example.avro.idl.Record other) {
    return new example.avro.idl.Record.Builder(other);
  }
  
  /**
   * RecordBuilder for Record instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Record>
    implements org.apache.avro.data.RecordBuilder<Record> {

    private long id;

    /** Creates a new Builder */
    private Builder() {
      super(example.avro.idl.Record.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(example.avro.idl.Record.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Record instance */
    private Builder(example.avro.idl.Record other) {
            super(example.avro.idl.Record.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.Long getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public example.avro.idl.Record.Builder setId(long value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public example.avro.idl.Record.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public Record build() {
      try {
        Record record = new Record();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}