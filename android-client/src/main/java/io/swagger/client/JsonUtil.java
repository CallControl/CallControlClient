package io.swagger.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import io.swagger.client.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("DoNotCallComplaints".equalsIgnoreCase(className)) {
      return new TypeToken<List<DoNotCallComplaints>>(){}.getType();
    }
    
    if ("Reputation".equalsIgnoreCase(className)) {
      return new TypeToken<List<Reputation>>(){}.getType();
    }
    
    if ("CallReport".equalsIgnoreCase(className)) {
      return new TypeToken<List<CallReport>>(){}.getType();
    }
    
    if ("ReporterLoation".equalsIgnoreCase(className)) {
      return new TypeToken<List<ReporterLoation>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("DoNotCallComplaints".equalsIgnoreCase(className)) {
      return new TypeToken<DoNotCallComplaints>(){}.getType();
    }
    
    if ("Reputation".equalsIgnoreCase(className)) {
      return new TypeToken<Reputation>(){}.getType();
    }
    
    if ("CallReport".equalsIgnoreCase(className)) {
      return new TypeToken<CallReport>(){}.getType();
    }
    
    if ("ReporterLoation".equalsIgnoreCase(className)) {
      return new TypeToken<ReporterLoation>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
