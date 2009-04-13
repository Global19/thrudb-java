/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.thrudb.thrudex;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;

public class SearchQuery implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("SearchQuery");
  private static final TField INDEX_FIELD_DESC = new TField("index", TType.STRING, (short)1);
  private static final TField QUERY_FIELD_DESC = new TField("query", TType.STRING, (short)2);
  private static final TField SORTBY_FIELD_DESC = new TField("sortby", TType.STRING, (short)3);
  private static final TField LIMIT_FIELD_DESC = new TField("limit", TType.I32, (short)4);
  private static final TField OFFSET_FIELD_DESC = new TField("offset", TType.I32, (short)5);
  private static final TField DESC_FIELD_DESC = new TField("desc", TType.BOOL, (short)6);
  private static final TField RANDOMIZE_FIELD_DESC = new TField("randomize", TType.BOOL, (short)7);
  private static final TField PAYLOAD_FIELD_DESC = new TField("payload", TType.BOOL, (short)8);

  public String index;
  public static final int INDEX = 1;
  public String query;
  public static final int QUERY = 2;
  public String sortby;
  public static final int SORTBY = 3;
  public int limit;
  public static final int LIMIT = 4;
  public int offset;
  public static final int OFFSET = 5;
  public boolean desc;
  public static final int DESC = 6;
  public boolean randomize;
  public static final int RANDOMIZE = 7;
  public boolean payload;
  public static final int PAYLOAD = 8;

  private final Isset __isset = new Isset();
  private static final class Isset implements java.io.Serializable {
    public boolean limit = false;
    public boolean offset = false;
    public boolean desc = false;
    public boolean randomize = false;
    public boolean payload = false;
  }

  public static final Map<Integer, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new HashMap<Integer, FieldMetaData>() {{
    put(INDEX, new FieldMetaData("index", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    put(QUERY, new FieldMetaData("query", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    put(SORTBY, new FieldMetaData("sortby", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    put(LIMIT, new FieldMetaData("limit", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    put(OFFSET, new FieldMetaData("offset", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    put(DESC, new FieldMetaData("desc", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    put(RANDOMIZE, new FieldMetaData("randomize", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    put(PAYLOAD, new FieldMetaData("payload", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(SearchQuery.class, metaDataMap);
  }

  public SearchQuery() {
    this.limit = 10;

    this.offset = 0;

    this.desc = false;

    this.randomize = false;

    this.payload = false;

  }

  public SearchQuery(
    String index,
    String query,
    String sortby,
    int limit,
    int offset,
    boolean desc,
    boolean randomize,
    boolean payload)
  {
    this();
    this.index = index;
    this.query = query;
    this.sortby = sortby;
    this.limit = limit;
    this.__isset.limit = true;
    this.offset = offset;
    this.__isset.offset = true;
    this.desc = desc;
    this.__isset.desc = true;
    this.randomize = randomize;
    this.__isset.randomize = true;
    this.payload = payload;
    this.__isset.payload = true;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SearchQuery(SearchQuery other) {
    if (other.isSetIndex()) {
      this.index = other.index;
    }
    if (other.isSetQuery()) {
      this.query = other.query;
    }
    if (other.isSetSortby()) {
      this.sortby = other.sortby;
    }
    __isset.limit = other.__isset.limit;
    this.limit = other.limit;
    __isset.offset = other.__isset.offset;
    this.offset = other.offset;
    __isset.desc = other.__isset.desc;
    this.desc = other.desc;
    __isset.randomize = other.__isset.randomize;
    this.randomize = other.randomize;
    __isset.payload = other.__isset.payload;
    this.payload = other.payload;
  }

  @Override
  public SearchQuery clone() {
    return new SearchQuery(this);
  }

  public String getIndex() {
    return this.index;
  }

  public void setIndex(String index) {
    this.index = index;
  }

  public void unsetIndex() {
    this.index = null;
  }

  // Returns true if field index is set (has been asigned a value) and false otherwise
  public boolean isSetIndex() {
    return this.index != null;
  }

  public void setIndexIsSet(boolean value) {
    if (!value) {
      this.index = null;
    }
  }

  public String getQuery() {
    return this.query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public void unsetQuery() {
    this.query = null;
  }

  // Returns true if field query is set (has been asigned a value) and false otherwise
  public boolean isSetQuery() {
    return this.query != null;
  }

  public void setQueryIsSet(boolean value) {
    if (!value) {
      this.query = null;
    }
  }

  public String getSortby() {
    return this.sortby;
  }

  public void setSortby(String sortby) {
    this.sortby = sortby;
  }

  public void unsetSortby() {
    this.sortby = null;
  }

  // Returns true if field sortby is set (has been asigned a value) and false otherwise
  public boolean isSetSortby() {
    return this.sortby != null;
  }

  public void setSortbyIsSet(boolean value) {
    if (!value) {
      this.sortby = null;
    }
  }

  public int getLimit() {
    return this.limit;
  }

  public void setLimit(int limit) {
    this.limit = limit;
    this.__isset.limit = true;
  }

  public void unsetLimit() {
    this.__isset.limit = false;
  }

  // Returns true if field limit is set (has been asigned a value) and false otherwise
  public boolean isSetLimit() {
    return this.__isset.limit;
  }

  public void setLimitIsSet(boolean value) {
    this.__isset.limit = value;
  }

  public int getOffset() {
    return this.offset;
  }

  public void setOffset(int offset) {
    this.offset = offset;
    this.__isset.offset = true;
  }

  public void unsetOffset() {
    this.__isset.offset = false;
  }

  // Returns true if field offset is set (has been asigned a value) and false otherwise
  public boolean isSetOffset() {
    return this.__isset.offset;
  }

  public void setOffsetIsSet(boolean value) {
    this.__isset.offset = value;
  }

  public boolean isDesc() {
    return this.desc;
  }

  public void setDesc(boolean desc) {
    this.desc = desc;
    this.__isset.desc = true;
  }

  public void unsetDesc() {
    this.__isset.desc = false;
  }

  // Returns true if field desc is set (has been asigned a value) and false otherwise
  public boolean isSetDesc() {
    return this.__isset.desc;
  }

  public void setDescIsSet(boolean value) {
    this.__isset.desc = value;
  }

  public boolean isRandomize() {
    return this.randomize;
  }

  public void setRandomize(boolean randomize) {
    this.randomize = randomize;
    this.__isset.randomize = true;
  }

  public void unsetRandomize() {
    this.__isset.randomize = false;
  }

  // Returns true if field randomize is set (has been asigned a value) and false otherwise
  public boolean isSetRandomize() {
    return this.__isset.randomize;
  }

  public void setRandomizeIsSet(boolean value) {
    this.__isset.randomize = value;
  }

  public boolean isPayload() {
    return this.payload;
  }

  public void setPayload(boolean payload) {
    this.payload = payload;
    this.__isset.payload = true;
  }

  public void unsetPayload() {
    this.__isset.payload = false;
  }

  // Returns true if field payload is set (has been asigned a value) and false otherwise
  public boolean isSetPayload() {
    return this.__isset.payload;
  }

  public void setPayloadIsSet(boolean value) {
    this.__isset.payload = value;
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case INDEX:
      if (value == null) {
        unsetIndex();
      } else {
        setIndex((String)value);
      }
      break;

    case QUERY:
      if (value == null) {
        unsetQuery();
      } else {
        setQuery((String)value);
      }
      break;

    case SORTBY:
      if (value == null) {
        unsetSortby();
      } else {
        setSortby((String)value);
      }
      break;

    case LIMIT:
      if (value == null) {
        unsetLimit();
      } else {
        setLimit((Integer)value);
      }
      break;

    case OFFSET:
      if (value == null) {
        unsetOffset();
      } else {
        setOffset((Integer)value);
      }
      break;

    case DESC:
      if (value == null) {
        unsetDesc();
      } else {
        setDesc((Boolean)value);
      }
      break;

    case RANDOMIZE:
      if (value == null) {
        unsetRandomize();
      } else {
        setRandomize((Boolean)value);
      }
      break;

    case PAYLOAD:
      if (value == null) {
        unsetPayload();
      } else {
        setPayload((Boolean)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case INDEX:
      return getIndex();

    case QUERY:
      return getQuery();

    case SORTBY:
      return getSortby();

    case LIMIT:
      return new Integer(getLimit());

    case OFFSET:
      return new Integer(getOffset());

    case DESC:
      return new Boolean(isDesc());

    case RANDOMIZE:
      return new Boolean(isRandomize());

    case PAYLOAD:
      return new Boolean(isPayload());

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case INDEX:
      return isSetIndex();
    case QUERY:
      return isSetQuery();
    case SORTBY:
      return isSetSortby();
    case LIMIT:
      return isSetLimit();
    case OFFSET:
      return isSetOffset();
    case DESC:
      return isSetDesc();
    case RANDOMIZE:
      return isSetRandomize();
    case PAYLOAD:
      return isSetPayload();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SearchQuery)
      return this.equals((SearchQuery)that);
    return false;
  }

  public boolean equals(SearchQuery that) {
    if (that == null)
      return false;

    boolean this_present_index = true && this.isSetIndex();
    boolean that_present_index = true && that.isSetIndex();
    if (this_present_index || that_present_index) {
      if (!(this_present_index && that_present_index))
        return false;
      if (!this.index.equals(that.index))
        return false;
    }

    boolean this_present_query = true && this.isSetQuery();
    boolean that_present_query = true && that.isSetQuery();
    if (this_present_query || that_present_query) {
      if (!(this_present_query && that_present_query))
        return false;
      if (!this.query.equals(that.query))
        return false;
    }

    boolean this_present_sortby = true && this.isSetSortby();
    boolean that_present_sortby = true && that.isSetSortby();
    if (this_present_sortby || that_present_sortby) {
      if (!(this_present_sortby && that_present_sortby))
        return false;
      if (!this.sortby.equals(that.sortby))
        return false;
    }

    boolean this_present_limit = true;
    boolean that_present_limit = true;
    if (this_present_limit || that_present_limit) {
      if (!(this_present_limit && that_present_limit))
        return false;
      if (this.limit != that.limit)
        return false;
    }

    boolean this_present_offset = true;
    boolean that_present_offset = true;
    if (this_present_offset || that_present_offset) {
      if (!(this_present_offset && that_present_offset))
        return false;
      if (this.offset != that.offset)
        return false;
    }

    boolean this_present_desc = true;
    boolean that_present_desc = true;
    if (this_present_desc || that_present_desc) {
      if (!(this_present_desc && that_present_desc))
        return false;
      if (this.desc != that.desc)
        return false;
    }

    boolean this_present_randomize = true;
    boolean that_present_randomize = true;
    if (this_present_randomize || that_present_randomize) {
      if (!(this_present_randomize && that_present_randomize))
        return false;
      if (this.randomize != that.randomize)
        return false;
    }

    boolean this_present_payload = true;
    boolean that_present_payload = true;
    if (this_present_payload || that_present_payload) {
      if (!(this_present_payload && that_present_payload))
        return false;
      if (this.payload != that.payload)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case INDEX:
          if (field.type == TType.STRING) {
            this.index = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case QUERY:
          if (field.type == TType.STRING) {
            this.query = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SORTBY:
          if (field.type == TType.STRING) {
            this.sortby = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case LIMIT:
          if (field.type == TType.I32) {
            this.limit = iprot.readI32();
            this.__isset.limit = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case OFFSET:
          if (field.type == TType.I32) {
            this.offset = iprot.readI32();
            this.__isset.offset = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case DESC:
          if (field.type == TType.BOOL) {
            this.desc = iprot.readBool();
            this.__isset.desc = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case RANDOMIZE:
          if (field.type == TType.BOOL) {
            this.randomize = iprot.readBool();
            this.__isset.randomize = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case PAYLOAD:
          if (field.type == TType.BOOL) {
            this.payload = iprot.readBool();
            this.__isset.payload = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.index != null) {
      oprot.writeFieldBegin(INDEX_FIELD_DESC);
      oprot.writeString(this.index);
      oprot.writeFieldEnd();
    }
    if (this.query != null) {
      oprot.writeFieldBegin(QUERY_FIELD_DESC);
      oprot.writeString(this.query);
      oprot.writeFieldEnd();
    }
    if (this.sortby != null) {
      oprot.writeFieldBegin(SORTBY_FIELD_DESC);
      oprot.writeString(this.sortby);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(LIMIT_FIELD_DESC);
    oprot.writeI32(this.limit);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(OFFSET_FIELD_DESC);
    oprot.writeI32(this.offset);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(DESC_FIELD_DESC);
    oprot.writeBool(this.desc);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(RANDOMIZE_FIELD_DESC);
    oprot.writeBool(this.randomize);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(PAYLOAD_FIELD_DESC);
    oprot.writeBool(this.payload);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SearchQuery(");
    boolean first = true;

    sb.append("index:");
    if (this.index == null) {
      sb.append("null");
    } else {
      sb.append(this.index);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("query:");
    if (this.query == null) {
      sb.append("null");
    } else {
      sb.append(this.query);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sortby:");
    if (this.sortby == null) {
      sb.append("null");
    } else {
      sb.append(this.sortby);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("limit:");
    sb.append(this.limit);
    first = false;
    if (!first) sb.append(", ");
    sb.append("offset:");
    sb.append(this.offset);
    first = false;
    if (!first) sb.append(", ");
    sb.append("desc:");
    sb.append(this.desc);
    first = false;
    if (!first) sb.append(", ");
    sb.append("randomize:");
    sb.append(this.randomize);
    first = false;
    if (!first) sb.append(", ");
    sb.append("payload:");
    sb.append(this.payload);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}
