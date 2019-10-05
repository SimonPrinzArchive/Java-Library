package com.pinplaycooperation.internal.javalibrary.json;

import java.io.IOException;
import org.json.JSONObject;

public abstract class Serializable<T>
{
  public abstract T read(JSONObject paramJSONObject)
    throws IOException;
  
  public abstract JSONObject write(JSONObject paramJSONObject, T paramT)
    throws IOException;
}


/* Location:              /Users/sipri1000/Desktop/Java-Library-0.180208.02.jar!/com/pinplaycooperation/internal/javalibrary/json/Serializable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */