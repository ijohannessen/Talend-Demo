
package demo_configfile_exceptions_postmsg.demo_configfile_exceptions_postmsg_0_1;

import routines.DataOperation;
import routines.TalendDataGenerator;
import routines.DataQuality;
import routines.Relational;
import routines.DataQualityDependencies;
import routines.Mathematical;
import routines.SQLike;
import routines.Numeric;
import routines.TalendStringUtil;
import routines.TalendString;
import routines.DQTechnical;
import routines.StringHandling;
import routines.DataMasking;
import routines.TalendDate;
import routines.DqStringHandling;
import routines.system.*;
import routines.system.api.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Comparator;
 




	//the import part of tJava_2
	//import java.util.List;

	//the import part of ContextFromFileJoblet_1_tJava_1
	//import java.util.List;

	//the import part of tJava_1
	//import java.util.List;

	//the import part of tJava_3
	//import java.util.List;


@SuppressWarnings("unused")

/**
 * Job: Demo_ConfigFile_Exceptions_PostMsg Purpose: <br>
 * Description:  <br>
 * @author Johannessen, Ivan
 * @version 7.2.1.20190909_1200_patch
 * @status 
 */
public class Demo_ConfigFile_Exceptions_PostMsg implements TalendJob {
	static {System.setProperty("TalendJob.log", "Demo_ConfigFile_Exceptions_PostMsg.log");}
	private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(Demo_ConfigFile_Exceptions_PostMsg.class);

protected static void logIgnoredError(String message, Throwable cause) {
       log.error(message, cause);

}


	public final Object obj = new Object();

	// for transmiting parameters purpose
	private Object valueObject = null;

	public Object getValueObject() {
		return this.valueObject;
	}

	public void setValueObject(Object valueObject) {
		this.valueObject = valueObject;
	}
	private Object[] multiThreadLockWrite = new Object[0];
	
	private final static String defaultCharset = java.nio.charset.Charset.defaultCharset().name();

	
	private final static String utf8Charset = "UTF-8";
	//contains type for every context property
	public class PropertiesWithType extends java.util.Properties {
		private static final long serialVersionUID = 1L;
		private java.util.Map<String,String> propertyTypes = new java.util.HashMap<>();
		
		public PropertiesWithType(java.util.Properties properties){
			super(properties);
		}
		public PropertiesWithType(){
			super();
		}
		
		public void setContextType(String key, String type) {
			propertyTypes.put(key,type);
		}
	
		public String getContextType(String key) {
			return propertyTypes.get(key);
		}
	}
	
	// create and load default properties
	private java.util.Properties defaultProps = new java.util.Properties();
	// create application properties with default
	public class ContextProperties extends PropertiesWithType {

		private static final long serialVersionUID = 1L;

		public ContextProperties(java.util.Properties properties){
			super(properties);
		}
		public ContextProperties(){
			super();
		}

		public void synchronizeContext(){
			
			if(db_server != null){
				
					this.setProperty("db_server", db_server.toString());
				
			}
			
			if(db_database != null){
				
					this.setProperty("db_database", db_database.toString());
				
			}
			
			if(db_port != null){
				
					this.setProperty("db_port", db_port.toString());
				
			}
			
			if(db_login != null){
				
					this.setProperty("db_login", db_login.toString());
				
			}
			
			if(db_password != null){
				
					this.setProperty("db_password", db_password.toString());
				
			}
			
			if(db_additionalParams != null){
				
					this.setProperty("db_additionalParams", db_additionalParams.toString());
				
			}
			
			if(config_file != null){
				
					this.setProperty("config_file", config_file.toString());
				
			}
			
		}

public String db_server;
public String getDb_server(){
	return this.db_server;
}
public String db_database;
public String getDb_database(){
	return this.db_database;
}
public String db_port;
public String getDb_port(){
	return this.db_port;
}
public String db_login;
public String getDb_login(){
	return this.db_login;
}
public String db_password;
public String getDb_password(){
	return this.db_password;
}
public String db_additionalParams;
public String getDb_additionalParams(){
	return this.db_additionalParams;
}
public String config_file;
public String getConfig_file(){
	return this.config_file;
}
	}
	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.1";
	private final String jobName = "Demo_ConfigFile_Exceptions_PostMsg";
	private final String projectName = "DEMO_CONFIGFILE_EXCEPTIONS_POSTMSG";
	public Integer errorCode = null;
	private String currentComponent = "";
	
		private final java.util.Map<String, Object> globalMap = java.util.Collections.synchronizedMap(new java.util.HashMap<String, Object>());
		
	
		private final java.util.Map<String, Long> start_Hash = java.util.Collections.synchronizedMap(new java.util.HashMap<String, Long>());
		private final java.util.Map<String, Long> end_Hash = java.util.Collections.synchronizedMap(new java.util.HashMap<String, Long>());
		private final java.util.Map<String, Boolean> ok_Hash = java.util.Collections.synchronizedMap(new java.util.HashMap<String, Boolean>());
		public  final java.util.List<String[]> globalBuffer = java.util.Collections.synchronizedList(new java.util.ArrayList<String[]>());
	

private RunStat runStat = new RunStat();

	// OSGi DataSource
	private final static String KEY_DB_DATASOURCES = "KEY_DB_DATASOURCES";
	
	private final static String KEY_DB_DATASOURCES_RAW = "KEY_DB_DATASOURCES_RAW";

	public void setDataSources(java.util.Map<String, javax.sql.DataSource> dataSources) {
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		for (java.util.Map.Entry<String, javax.sql.DataSource> dataSourceEntry : dataSources.entrySet()) {
			talendDataSources.put(dataSourceEntry.getKey(), new routines.system.TalendDataSource(dataSourceEntry.getValue()));
		}
		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}

	LogCatcherUtils tLogCatcher_1 = new LogCatcherUtils();
	JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName, "_ifKTsFfYEeqjMK8tojIoSg", "0.1");
	org.talend.job.audit.JobAuditLogger auditLogger_talendJobLog = null;

private final java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
private final java.io.PrintStream errorMessagePS = new java.io.PrintStream(new java.io.BufferedOutputStream(baos));

public String getExceptionStackTrace() {
	if ("failure".equals(this.getStatus())) {
		errorMessagePS.flush();
		return baos.toString();
	}
	return null;
}

private Exception exception;

public Exception getException() {
	if ("failure".equals(this.getStatus())) {
		return this.exception;
	}
	return null;
}

private class TalendException extends Exception {

	private static final long serialVersionUID = 1L;

	private java.util.Map<String, Object> globalMap = null;
	private Exception e = null;
	private String currentComponent = null;
	private String virtualComponentName = null;
	
	public void setVirtualComponentName (String virtualComponentName){
		this.virtualComponentName = virtualComponentName;
	}

	private TalendException(Exception e, String errorComponent, final java.util.Map<String, Object> globalMap) {
		this.currentComponent= errorComponent;
		this.globalMap = globalMap;
		this.e = e;
	}

	public Exception getException() {
		return this.e;
	}

	public String getCurrentComponent() {
		return this.currentComponent;
	}

	
    public String getExceptionCauseMessage(Exception e){
        Throwable cause = e;
        String message = null;
        int i = 10;
        while (null != cause && 0 < i--) {
            message = cause.getMessage();
            if (null == message) {
                cause = cause.getCause();
            } else {
                break;          
            }
        }
        if (null == message) {
            message = e.getClass().getName();
        }   
        return message;
    }

	@Override
	public void printStackTrace() {
		if (!(e instanceof TalendException || e instanceof TDieException)) {
			if(virtualComponentName!=null && currentComponent.indexOf(virtualComponentName+"_")==0){
				globalMap.put(virtualComponentName+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			}
			globalMap.put(currentComponent+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			System.err.println("Exception in component " + currentComponent + " (" + jobName + ")");
		}
		if (!(e instanceof TDieException)) {
			if(e instanceof TalendException){
				e.printStackTrace();
			} else {
				e.printStackTrace();
				e.printStackTrace(errorMessagePS);
				Demo_ConfigFile_Exceptions_PostMsg.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(Demo_ConfigFile_Exceptions_PostMsg.this, new Object[] { e , currentComponent, globalMap});
					break;
				}
			}

			if(!(e instanceof TDieException)){
				tLogCatcher_1.addMessage("Java Exception", currentComponent, 6, e.getClass().getName() + ":" + e.getMessage(), 1);
				tLogCatcher_1Process(globalMap);
			}
			} catch (TalendException e) {
				// do nothing
			
		} catch (Exception e) {
			this.e.printStackTrace();
		}
		}
	}
}

			public void tLogCatcher_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tLogCatcher_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tLogRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tLogCatcher_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJava_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tJava_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void ContextFromFileJoblet_1_tJava_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					ContextFromFileJoblet_1_tJava_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void ContextFromFileJoblet_1_tFileInputDelimited_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					ContextFromFileJoblet_1_tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void ContextFromFileJoblet_1_tBufferOutput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					ContextFromFileJoblet_1_tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void ContextFromFileJoblet_1_tContextLoad_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					ContextFromFileJoblet_1_tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJava_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tJava_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tParallelize_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tParallelize_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tRunJob_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tRunJob_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tRunJob_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tRunJob_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tRunJob_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tRunJob_5_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJava_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tJava_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendJobLog_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					talendJobLog_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tLogCatcher_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tJava_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void ContextFromFileJoblet_1_tJava_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void ContextFromFileJoblet_1_tFileInputDelimited_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tJava_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tParallelize_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tRunJob_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tRunJob_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tRunJob_5_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tJava_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void talendJobLog_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
	

	






public static class row2Struct implements routines.system.IPersistableRow<row2Struct> {
    final static byte[] commonByteArrayLock_DEMO_CONFIGFILE_EXCEPTIONS_POSTMSG_Demo_ConfigFile_Exceptions_PostMsg = new byte[0];
    static byte[] commonByteArray_DEMO_CONFIGFILE_EXCEPTIONS_POSTMSG_Demo_ConfigFile_Exceptions_PostMsg = new byte[0];

	
			    public java.util.Date moment;

				public java.util.Date getMoment () {
					return this.moment;
				}
				
			    public String pid;

				public String getPid () {
					return this.pid;
				}
				
			    public String root_pid;

				public String getRoot_pid () {
					return this.root_pid;
				}
				
			    public String father_pid;

				public String getFather_pid () {
					return this.father_pid;
				}
				
			    public String project;

				public String getProject () {
					return this.project;
				}
				
			    public String job;

				public String getJob () {
					return this.job;
				}
				
			    public String context;

				public String getContext () {
					return this.context;
				}
				
			    public Integer priority;

				public Integer getPriority () {
					return this.priority;
				}
				
			    public String type;

				public String getType () {
					return this.type;
				}
				
			    public String origin;

				public String getOrigin () {
					return this.origin;
				}
				
			    public String message;

				public String getMessage () {
					return this.message;
				}
				
			    public Integer code;

				public Integer getCode () {
					return this.code;
				}
				



	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_DEMO_CONFIGFILE_EXCEPTIONS_POSTMSG_Demo_ConfigFile_Exceptions_PostMsg.length) {
				if(length < 1024 && commonByteArray_DEMO_CONFIGFILE_EXCEPTIONS_POSTMSG_Demo_ConfigFile_Exceptions_PostMsg.length == 0) {
   					commonByteArray_DEMO_CONFIGFILE_EXCEPTIONS_POSTMSG_Demo_ConfigFile_Exceptions_PostMsg = new byte[1024];
				} else {
   					commonByteArray_DEMO_CONFIGFILE_EXCEPTIONS_POSTMSG_Demo_ConfigFile_Exceptions_PostMsg = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_DEMO_CONFIGFILE_EXCEPTIONS_POSTMSG_Demo_ConfigFile_Exceptions_PostMsg, 0, length);
			strReturn = new String(commonByteArray_DEMO_CONFIGFILE_EXCEPTIONS_POSTMSG_Demo_ConfigFile_Exceptions_PostMsg, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_DEMO_CONFIGFILE_EXCEPTIONS_POSTMSG_Demo_ConfigFile_Exceptions_PostMsg) {

        	try {

        		int length = 0;
		
					this.moment = readDate(dis);
					
					this.pid = readString(dis);
					
					this.root_pid = readString(dis);
					
					this.father_pid = readString(dis);
					
					this.project = readString(dis);
					
					this.job = readString(dis);
					
					this.context = readString(dis);
					
						this.priority = readInteger(dis);
					
					this.type = readString(dis);
					
					this.origin = readString(dis);
					
					this.message = readString(dis);
					
						this.code = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.moment,dos);
					
					// String
				
						writeString(this.pid,dos);
					
					// String
				
						writeString(this.root_pid,dos);
					
					// String
				
						writeString(this.father_pid,dos);
					
					// String
				
						writeString(this.project,dos);
					
					// String
				
						writeString(this.job,dos);
					
					// String
				
						writeString(this.context,dos);
					
					// Integer
				
						writeInteger(this.priority,dos);
					
					// String
				
						writeString(this.type,dos);
					
					// String
				
						writeString(this.origin,dos);
					
					// String
				
						writeString(this.message,dos);
					
					// Integer
				
						writeInteger(this.code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("moment="+String.valueOf(moment));
		sb.append(",pid="+pid);
		sb.append(",root_pid="+root_pid);
		sb.append(",father_pid="+father_pid);
		sb.append(",project="+project);
		sb.append(",job="+job);
		sb.append(",context="+context);
		sb.append(",priority="+String.valueOf(priority));
		sb.append(",type="+type);
		sb.append(",origin="+origin);
		sb.append(",message="+message);
		sb.append(",code="+String.valueOf(code));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(moment == null){
        					sb.append("<null>");
        				}else{
            				sb.append(moment);
            			}
            		
        			sb.append("|");
        		
        				if(pid == null){
        					sb.append("<null>");
        				}else{
            				sb.append(pid);
            			}
            		
        			sb.append("|");
        		
        				if(root_pid == null){
        					sb.append("<null>");
        				}else{
            				sb.append(root_pid);
            			}
            		
        			sb.append("|");
        		
        				if(father_pid == null){
        					sb.append("<null>");
        				}else{
            				sb.append(father_pid);
            			}
            		
        			sb.append("|");
        		
        				if(project == null){
        					sb.append("<null>");
        				}else{
            				sb.append(project);
            			}
            		
        			sb.append("|");
        		
        				if(job == null){
        					sb.append("<null>");
        				}else{
            				sb.append(job);
            			}
            		
        			sb.append("|");
        		
        				if(context == null){
        					sb.append("<null>");
        				}else{
            				sb.append(context);
            			}
            		
        			sb.append("|");
        		
        				if(priority == null){
        					sb.append("<null>");
        				}else{
            				sb.append(priority);
            			}
            		
        			sb.append("|");
        		
        				if(type == null){
        					sb.append("<null>");
        				}else{
            				sb.append(type);
            			}
            		
        			sb.append("|");
        		
        				if(origin == null){
        					sb.append("<null>");
        				}else{
            				sb.append(origin);
            			}
            		
        			sb.append("|");
        		
        				if(message == null){
        					sb.append("<null>");
        				}else{
            				sb.append(message);
            			}
            		
        			sb.append("|");
        		
        				if(code == null){
        					sb.append("<null>");
        				}else{
            				sb.append(code);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row2Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tLogCatcher_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tLogCatcher_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row2Struct row2 = new row2Struct();




	
	/**
	 * [tLogRow_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tLogRow_1", false);
		start_Hash.put("tLogRow_1", System.currentTimeMillis());
		
	
	currentComponent="tLogRow_1";

	
			if (execStat || enableLogStash) {
				if(resourceMap.get("inIterateVComp") == null){
					
						
						if(execStat) {
							runStat.updateStatOnConnection("row2"+iterateId, 0, 0);
						}
						
						
						
						if(enableLogStash) {
							runStat.logStatOnConnection("row2"+iterateId, 0, 0);
						}
						
					
				}
			} 

		
		int tos_count_tLogRow_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tLogRow_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tLogRow_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tLogRow_1 = new StringBuilder();
                    log4jParamters_tLogRow_1.append("Parameters:");
                            log4jParamters_tLogRow_1.append("BASIC_MODE" + " = " + "true");
                        log4jParamters_tLogRow_1.append(" | ");
                            log4jParamters_tLogRow_1.append("TABLE_PRINT" + " = " + "false");
                        log4jParamters_tLogRow_1.append(" | ");
                            log4jParamters_tLogRow_1.append("VERTICAL" + " = " + "false");
                        log4jParamters_tLogRow_1.append(" | ");
                            log4jParamters_tLogRow_1.append("FIELDSEPARATOR" + " = " + "\"|\"");
                        log4jParamters_tLogRow_1.append(" | ");
                            log4jParamters_tLogRow_1.append("PRINT_HEADER" + " = " + "false");
                        log4jParamters_tLogRow_1.append(" | ");
                            log4jParamters_tLogRow_1.append("PRINT_UNIQUE_NAME" + " = " + "false");
                        log4jParamters_tLogRow_1.append(" | ");
                            log4jParamters_tLogRow_1.append("PRINT_COLNAMES" + " = " + "false");
                        log4jParamters_tLogRow_1.append(" | ");
                            log4jParamters_tLogRow_1.append("USE_FIXED_LENGTH" + " = " + "false");
                        log4jParamters_tLogRow_1.append(" | ");
                            log4jParamters_tLogRow_1.append("PRINT_CONTENT_WITH_LOG4J" + " = " + "true");
                        log4jParamters_tLogRow_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tLogRow_1 - "  + (log4jParamters_tLogRow_1) );
                    } 
                } 
            new BytesLimit65535_tLogRow_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addComponentMessage("tLogRow_1", "tLogRow");
				talendJobLogProcess(globalMap);
			}
			

	///////////////////////
	
		final String OUTPUT_FIELD_SEPARATOR_tLogRow_1 = "|";
		java.io.PrintStream consoleOut_tLogRow_1 = null;	

 		StringBuilder strBuffer_tLogRow_1 = null;
		int nb_line_tLogRow_1 = 0;
///////////////////////    			



 



/**
 * [tLogRow_1 begin ] stop
 */



	
	/**
	 * [tLogCatcher_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tLogCatcher_1", false);
		start_Hash.put("tLogCatcher_1", System.currentTimeMillis());
		
	
	currentComponent="tLogCatcher_1";

	
		int tos_count_tLogCatcher_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tLogCatcher_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tLogCatcher_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tLogCatcher_1 = new StringBuilder();
                    log4jParamters_tLogCatcher_1.append("Parameters:");
                            log4jParamters_tLogCatcher_1.append("CATCH_JAVA_EXCEPTION" + " = " + "true");
                        log4jParamters_tLogCatcher_1.append(" | ");
                            log4jParamters_tLogCatcher_1.append("CATCH_TDIE" + " = " + "true");
                        log4jParamters_tLogCatcher_1.append(" | ");
                            log4jParamters_tLogCatcher_1.append("CATCH_TWARN" + " = " + "true");
                        log4jParamters_tLogCatcher_1.append(" | ");
                            log4jParamters_tLogCatcher_1.append("CATCH_TACTIONFAILURE" + " = " + "true");
                        log4jParamters_tLogCatcher_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tLogCatcher_1 - "  + (log4jParamters_tLogCatcher_1) );
                    } 
                } 
            new BytesLimit65535_tLogCatcher_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addComponentMessage("tLogCatcher_1", "tLogCatcher");
				talendJobLogProcess(globalMap);
			}
			

try {
	for (LogCatcherUtils.LogCatcherMessage lcm : tLogCatcher_1.getMessages()) {
		row2.type = lcm.getType();
		row2.origin = (lcm.getOrigin()==null || lcm.getOrigin().length()<1 ? null : lcm.getOrigin());
		row2.priority = lcm.getPriority();
		row2.message = lcm.getMessage();
		row2.code = lcm.getCode();
		
		row2.moment = java.util.Calendar.getInstance().getTime();
	
    	row2.pid = pid;
		row2.root_pid = rootPid;
		row2.father_pid = fatherPid;
	
    	row2.project = projectName;
    	row2.job = jobName;
    	row2.context = contextStr;
    		
 



/**
 * [tLogCatcher_1 begin ] stop
 */
	
	/**
	 * [tLogCatcher_1 main ] start
	 */

	

	
	
	currentComponent="tLogCatcher_1";

	

 


	tos_count_tLogCatcher_1++;

/**
 * [tLogCatcher_1 main ] stop
 */
	
	/**
	 * [tLogCatcher_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tLogCatcher_1";

	

 



/**
 * [tLogCatcher_1 process_data_begin ] stop
 */

	
	/**
	 * [tLogRow_1 main ] start
	 */

	

	
	
	currentComponent="tLogRow_1";

	

			//row2
			//row2


			
				
				if(execStat){
					runStat.updateStatOnConnection("row2"+iterateId,1, 1);
				}
				
				
				
				if(enableLogStash) {
					runStat.logStatOnConnection("row2"+iterateId,1, 1);
				}
				
			

		
    			if(log.isTraceEnabled()){
    				log.trace("row2 - " + (row2==null? "": row2.toLogString()));
    			}
    		
///////////////////////		
						



				strBuffer_tLogRow_1 = new StringBuilder();




   				
	    		if(row2.moment != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
								FormatterUtils.format_Date(row2.moment, "yyyy-MM-dd HH:mm:ss")				
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row2.pid != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row2.pid)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row2.root_pid != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row2.root_pid)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row2.father_pid != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row2.father_pid)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row2.project != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row2.project)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row2.job != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row2.job)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row2.context != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row2.context)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row2.priority != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row2.priority)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row2.type != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row2.type)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row2.origin != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row2.origin)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row2.message != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row2.message)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row2.code != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row2.code)							
				);


							
	    		} //  			
 

                    if (globalMap.get("tLogRow_CONSOLE")!=null)
                    {
                    	consoleOut_tLogRow_1 = (java.io.PrintStream) globalMap.get("tLogRow_CONSOLE");
                    }
                    else
                    {
                    	consoleOut_tLogRow_1 = new java.io.PrintStream(new java.io.BufferedOutputStream(System.out));
                    	globalMap.put("tLogRow_CONSOLE",consoleOut_tLogRow_1);
                    }
                    	log.info("tLogRow_1 - Content of row "+(nb_line_tLogRow_1+1)+": " + strBuffer_tLogRow_1.toString());
                    consoleOut_tLogRow_1.println(strBuffer_tLogRow_1.toString());
                    consoleOut_tLogRow_1.flush();
                    nb_line_tLogRow_1++;
//////

//////                    
                    
///////////////////////    			

 


	tos_count_tLogRow_1++;

/**
 * [tLogRow_1 main ] stop
 */
	
	/**
	 * [tLogRow_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tLogRow_1";

	

 



/**
 * [tLogRow_1 process_data_begin ] stop
 */
	
	/**
	 * [tLogRow_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tLogRow_1";

	

 



/**
 * [tLogRow_1 process_data_end ] stop
 */



	
	/**
	 * [tLogCatcher_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tLogCatcher_1";

	

 



/**
 * [tLogCatcher_1 process_data_end ] stop
 */
	
	/**
	 * [tLogCatcher_1 end ] start
	 */

	

	
	
	currentComponent="tLogCatcher_1";

	
	}
} catch (Exception e_tLogCatcher_1) {
	logIgnoredError(String.format("tLogCatcher_1 - tLogCatcher failed to process log message(s) due to internal error: %s", e_tLogCatcher_1), e_tLogCatcher_1);
}

 
                if(log.isDebugEnabled())
            log.debug("tLogCatcher_1 - "  + ("Done.") );

ok_Hash.put("tLogCatcher_1", true);
end_Hash.put("tLogCatcher_1", System.currentTimeMillis());




/**
 * [tLogCatcher_1 end ] stop
 */

	
	/**
	 * [tLogRow_1 end ] start
	 */

	

	
	
	currentComponent="tLogRow_1";

	


//////
//////
globalMap.put("tLogRow_1_NB_LINE",nb_line_tLogRow_1);
                if(log.isInfoEnabled())
            log.info("tLogRow_1 - "  + ("Printed row count: ")  + (nb_line_tLogRow_1)  + (".") );

///////////////////////    			

			
			if(execStat){
				if(resourceMap.get("inIterateVComp") == null || !((Boolean)resourceMap.get("inIterateVComp"))){
	 				runStat.updateStatOnConnection("row2"+iterateId,2, 0);
			 	}
			}
			
			
			
			if(enableLogStash){
				if(resourceMap.get("inIterateVComp") == null || !((Boolean)resourceMap.get("inIterateVComp"))){
			 		
			 		RunStat.StatBean talend_statebean = runStat.logStatOnConnection("row2"+iterateId,2, 0);
			 		
			 		talendJobLog.addConnectionMessage(
					    "tLogCatcher_1", 
					    "tLogCatcher", 
					    false,
					    "output",
					    "row2",
					    talend_statebean.getNbLine(),
					    talend_statebean.getStartTime(),
					    talend_statebean.getEndTime()
					);
					
			 		talendJobLog.addConnectionMessage(
					    "tLogRow_1", 
					    "tLogRow", 
					    true,
					    "input",
					    "row2",
					    talend_statebean.getNbLine(),
					    talend_statebean.getStartTime(),
					    talend_statebean.getEndTime()
					);
					talendJobLogProcess(globalMap);
					
			 	}
			}
			
		
 
                if(log.isDebugEnabled())
            log.debug("tLogRow_1 - "  + ("Done.") );

ok_Hash.put("tLogRow_1", true);
end_Hash.put("tLogRow_1", System.currentTimeMillis());




/**
 * [tLogRow_1 end ] stop
 */



				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tLogCatcher_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk3", 0, "ok");
								} 
							
							tJava_2Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tLogCatcher_1 finally ] start
	 */

	

	
	
	currentComponent="tLogCatcher_1";

	

 



/**
 * [tLogCatcher_1 finally ] stop
 */

	
	/**
	 * [tLogRow_1 finally ] start
	 */

	

	
	
	currentComponent="tLogRow_1";

	

 



/**
 * [tLogRow_1 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tLogCatcher_1_SUBPROCESS_STATE", 1);
	}
	

public void tJava_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tJava_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tJava_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tJava_2", false);
		start_Hash.put("tJava_2", System.currentTimeMillis());
		
	
	currentComponent="tJava_2";

	
		int tos_count_tJava_2 = 0;
		
			if(enableLogStash) {
				talendJobLog.addComponentMessage("tJava_2", "tJava");
				talendJobLogProcess(globalMap);
			}
			


System.out.println("Exiting due to exception");
System.exit(1)
;
 



/**
 * [tJava_2 begin ] stop
 */
	
	/**
	 * [tJava_2 main ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 


	tos_count_tJava_2++;

/**
 * [tJava_2 main ] stop
 */
	
	/**
	 * [tJava_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 



/**
 * [tJava_2 process_data_begin ] stop
 */
	
	/**
	 * [tJava_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 



/**
 * [tJava_2 process_data_end ] stop
 */
	
	/**
	 * [tJava_2 end ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 

ok_Hash.put("tJava_2", true);
end_Hash.put("tJava_2", System.currentTimeMillis());




/**
 * [tJava_2 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tJava_2 finally ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 



/**
 * [tJava_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tJava_2_SUBPROCESS_STATE", 1);
	}
	

public void ContextFromFileJoblet_1_tJava_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("ContextFromFileJoblet_1_tJava_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [ContextFromFileJoblet_1_tJava_1 begin ] start
	 */

	

	
		
		ok_Hash.put("ContextFromFileJoblet_1_tJava_1", false);
		start_Hash.put("ContextFromFileJoblet_1_tJava_1", System.currentTimeMillis());
		
	
	currentComponent="ContextFromFileJoblet_1_tJava_1";

	
		int tos_count_ContextFromFileJoblet_1_tJava_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addComponentMessage("ContextFromFileJoblet_1_tJava_1", "tJava");
				talendJobLogProcess(globalMap);
			}
			



// get config file path from env


//context.config_file="C:/Users/819890/Talend/KvaernerTalend.cfg";
context.config_file="/Volumes/Passport/Talend/KvaernerTalend.cfg";

System.out.println("Reading config file " + context.config_file);

 



/**
 * [ContextFromFileJoblet_1_tJava_1 begin ] stop
 */
	
	/**
	 * [ContextFromFileJoblet_1_tJava_1 main ] start
	 */

	

	
	
	currentComponent="ContextFromFileJoblet_1_tJava_1";

	

 


	tos_count_ContextFromFileJoblet_1_tJava_1++;

/**
 * [ContextFromFileJoblet_1_tJava_1 main ] stop
 */
	
	/**
	 * [ContextFromFileJoblet_1_tJava_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="ContextFromFileJoblet_1_tJava_1";

	

 



/**
 * [ContextFromFileJoblet_1_tJava_1 process_data_begin ] stop
 */
	
	/**
	 * [ContextFromFileJoblet_1_tJava_1 process_data_end ] start
	 */

	

	
	
	currentComponent="ContextFromFileJoblet_1_tJava_1";

	

 



/**
 * [ContextFromFileJoblet_1_tJava_1 process_data_end ] stop
 */
	
	/**
	 * [ContextFromFileJoblet_1_tJava_1 end ] start
	 */

	

	
	
	currentComponent="ContextFromFileJoblet_1_tJava_1";

	

 

ok_Hash.put("ContextFromFileJoblet_1_tJava_1", true);
end_Hash.put("ContextFromFileJoblet_1_tJava_1", System.currentTimeMillis());




/**
 * [ContextFromFileJoblet_1_tJava_1 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:ContextFromFileJoblet_1_tJava_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("ContextFromFileJoblet_1_OnSubjobOk1", 0, "ok");
								} 
							
							ContextFromFileJoblet_1_tFileInputDelimited_1Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [ContextFromFileJoblet_1_tJava_1 finally ] start
	 */

	

	
	
	currentComponent="ContextFromFileJoblet_1_tJava_1";

	

 



/**
 * [ContextFromFileJoblet_1_tJava_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("ContextFromFileJoblet_1_tJava_1_SUBPROCESS_STATE", 1);
	}
	


public static class ContextFromFileJoblet_1_row3Struct implements routines.system.IPersistableRow<ContextFromFileJoblet_1_row3Struct> {
    final static byte[] commonByteArrayLock_DEMO_CONFIGFILE_EXCEPTIONS_POSTMSG_Demo_ConfigFile_Exceptions_PostMsg = new byte[0];
    static byte[] commonByteArray_DEMO_CONFIGFILE_EXCEPTIONS_POSTMSG_Demo_ConfigFile_Exceptions_PostMsg = new byte[0];

	
			    public String key;

				public String getKey () {
					return this.key;
				}
				
			    public String value;

				public String getValue () {
					return this.value;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_DEMO_CONFIGFILE_EXCEPTIONS_POSTMSG_Demo_ConfigFile_Exceptions_PostMsg.length) {
				if(length < 1024 && commonByteArray_DEMO_CONFIGFILE_EXCEPTIONS_POSTMSG_Demo_ConfigFile_Exceptions_PostMsg.length == 0) {
   					commonByteArray_DEMO_CONFIGFILE_EXCEPTIONS_POSTMSG_Demo_ConfigFile_Exceptions_PostMsg = new byte[1024];
				} else {
   					commonByteArray_DEMO_CONFIGFILE_EXCEPTIONS_POSTMSG_Demo_ConfigFile_Exceptions_PostMsg = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_DEMO_CONFIGFILE_EXCEPTIONS_POSTMSG_Demo_ConfigFile_Exceptions_PostMsg, 0, length);
			strReturn = new String(commonByteArray_DEMO_CONFIGFILE_EXCEPTIONS_POSTMSG_Demo_ConfigFile_Exceptions_PostMsg, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_DEMO_CONFIGFILE_EXCEPTIONS_POSTMSG_Demo_ConfigFile_Exceptions_PostMsg) {

        	try {

        		int length = 0;
		
					this.key = readString(dis);
					
					this.value = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.key,dos);
					
					// String
				
						writeString(this.value,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("key="+key);
		sb.append(",value="+value);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(key == null){
        					sb.append("<null>");
        				}else{
            				sb.append(key);
            			}
            		
        			sb.append("|");
        		
        				if(value == null){
        					sb.append("<null>");
        				}else{
            				sb.append(value);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(ContextFromFileJoblet_1_row3Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class ContextFromFileJoblet_1_row1Struct implements routines.system.IPersistableRow<ContextFromFileJoblet_1_row1Struct> {
    final static byte[] commonByteArrayLock_DEMO_CONFIGFILE_EXCEPTIONS_POSTMSG_Demo_ConfigFile_Exceptions_PostMsg = new byte[0];
    static byte[] commonByteArray_DEMO_CONFIGFILE_EXCEPTIONS_POSTMSG_Demo_ConfigFile_Exceptions_PostMsg = new byte[0];

	
			    public String key;

				public String getKey () {
					return this.key;
				}
				
			    public String value;

				public String getValue () {
					return this.value;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_DEMO_CONFIGFILE_EXCEPTIONS_POSTMSG_Demo_ConfigFile_Exceptions_PostMsg.length) {
				if(length < 1024 && commonByteArray_DEMO_CONFIGFILE_EXCEPTIONS_POSTMSG_Demo_ConfigFile_Exceptions_PostMsg.length == 0) {
   					commonByteArray_DEMO_CONFIGFILE_EXCEPTIONS_POSTMSG_Demo_ConfigFile_Exceptions_PostMsg = new byte[1024];
				} else {
   					commonByteArray_DEMO_CONFIGFILE_EXCEPTIONS_POSTMSG_Demo_ConfigFile_Exceptions_PostMsg = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_DEMO_CONFIGFILE_EXCEPTIONS_POSTMSG_Demo_ConfigFile_Exceptions_PostMsg, 0, length);
			strReturn = new String(commonByteArray_DEMO_CONFIGFILE_EXCEPTIONS_POSTMSG_Demo_ConfigFile_Exceptions_PostMsg, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_DEMO_CONFIGFILE_EXCEPTIONS_POSTMSG_Demo_ConfigFile_Exceptions_PostMsg) {

        	try {

        		int length = 0;
		
					this.key = readString(dis);
					
					this.value = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.key,dos);
					
					// String
				
						writeString(this.value,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("key="+key);
		sb.append(",value="+value);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(key == null){
        					sb.append("<null>");
        				}else{
            				sb.append(key);
            			}
            		
        			sb.append("|");
        		
        				if(value == null){
        					sb.append("<null>");
        				}else{
            				sb.append(value);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(ContextFromFileJoblet_1_row1Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void ContextFromFileJoblet_1_tFileInputDelimited_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("ContextFromFileJoblet_1_tFileInputDelimited_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		ContextFromFileJoblet_1_row1Struct ContextFromFileJoblet_1_row1 = new ContextFromFileJoblet_1_row1Struct();
ContextFromFileJoblet_1_row1Struct ContextFromFileJoblet_1_row3 = ContextFromFileJoblet_1_row1;





	
	/**
	 * [ContextFromFileJoblet_1_tContextLoad_1 begin ] start
	 */

	

	
		
		ok_Hash.put("ContextFromFileJoblet_1_tContextLoad_1", false);
		start_Hash.put("ContextFromFileJoblet_1_tContextLoad_1", System.currentTimeMillis());
		
	
	currentComponent="ContextFromFileJoblet_1_tContextLoad_1";

	
			if (execStat || enableLogStash) {
				if(resourceMap.get("inIterateVComp") == null){
					
						
						if(execStat) {
							runStat.updateStatOnConnection("ContextFromFileJoblet_1_row3"+iterateId, 0, 0);
						}
						
						
						
						if(enableLogStash) {
							runStat.logStatOnConnection("ContextFromFileJoblet_1_row3"+iterateId, 0, 0);
						}
						
					
				}
			} 

		
		int tos_count_ContextFromFileJoblet_1_tContextLoad_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("ContextFromFileJoblet_1_tContextLoad_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_ContextFromFileJoblet_1_tContextLoad_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_ContextFromFileJoblet_1_tContextLoad_1 = new StringBuilder();
                    log4jParamters_ContextFromFileJoblet_1_tContextLoad_1.append("Parameters:");
                            log4jParamters_ContextFromFileJoblet_1_tContextLoad_1.append("LOAD_NEW_VARIABLE" + " = " + "Warning");
                        log4jParamters_ContextFromFileJoblet_1_tContextLoad_1.append(" | ");
                            log4jParamters_ContextFromFileJoblet_1_tContextLoad_1.append("NOT_LOAD_OLD_VARIABLE" + " = " + "Warning");
                        log4jParamters_ContextFromFileJoblet_1_tContextLoad_1.append(" | ");
                            log4jParamters_ContextFromFileJoblet_1_tContextLoad_1.append("PRINT_OPERATIONS" + " = " + "false");
                        log4jParamters_ContextFromFileJoblet_1_tContextLoad_1.append(" | ");
                            log4jParamters_ContextFromFileJoblet_1_tContextLoad_1.append("DISABLE_ERROR" + " = " + "false");
                        log4jParamters_ContextFromFileJoblet_1_tContextLoad_1.append(" | ");
                            log4jParamters_ContextFromFileJoblet_1_tContextLoad_1.append("DISABLE_WARNINGS" + " = " + "true");
                        log4jParamters_ContextFromFileJoblet_1_tContextLoad_1.append(" | ");
                            log4jParamters_ContextFromFileJoblet_1_tContextLoad_1.append("DISABLE_INFO" + " = " + "true");
                        log4jParamters_ContextFromFileJoblet_1_tContextLoad_1.append(" | ");
                            log4jParamters_ContextFromFileJoblet_1_tContextLoad_1.append("DIEONERROR" + " = " + "false");
                        log4jParamters_ContextFromFileJoblet_1_tContextLoad_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("ContextFromFileJoblet_1_tContextLoad_1 - "  + (log4jParamters_ContextFromFileJoblet_1_tContextLoad_1) );
                    } 
                } 
            new BytesLimit65535_ContextFromFileJoblet_1_tContextLoad_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addComponentMessage("ContextFromFileJoblet_1_tContextLoad_1", "tContextLoad");
				talendJobLogProcess(globalMap);
			}
			
	java.util.List<String> assignList_ContextFromFileJoblet_1_tContextLoad_1 = new java.util.ArrayList<String>();
	java.util.List<String> newPropertyList_ContextFromFileJoblet_1_tContextLoad_1 = new java.util.ArrayList<String>();
	java.util.List<String> noAssignList_ContextFromFileJoblet_1_tContextLoad_1 = new java.util.ArrayList<String>();
	int nb_line_ContextFromFileJoblet_1_tContextLoad_1 = 0;

 



/**
 * [ContextFromFileJoblet_1_tContextLoad_1 begin ] stop
 */



	
	/**
	 * [ContextFromFileJoblet_1_tBufferOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("ContextFromFileJoblet_1_tBufferOutput_1", false);
		start_Hash.put("ContextFromFileJoblet_1_tBufferOutput_1", System.currentTimeMillis());
		
	
	currentComponent="ContextFromFileJoblet_1_tBufferOutput_1";

	
			if (execStat || enableLogStash) {
				if(resourceMap.get("inIterateVComp") == null){
					
						
						if(execStat) {
							runStat.updateStatOnConnection("ContextFromFileJoblet_1_row1"+iterateId, 0, 0);
						}
						
						
						
						if(enableLogStash) {
							runStat.logStatOnConnection("ContextFromFileJoblet_1_row1"+iterateId, 0, 0);
						}
						
					
				}
			} 

		
		int tos_count_ContextFromFileJoblet_1_tBufferOutput_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addComponentMessage("ContextFromFileJoblet_1_tBufferOutput_1", "tBufferOutput");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [ContextFromFileJoblet_1_tBufferOutput_1 begin ] stop
 */



	
	/**
	 * [ContextFromFileJoblet_1_tFileInputDelimited_1 begin ] start
	 */

	

	
		
		ok_Hash.put("ContextFromFileJoblet_1_tFileInputDelimited_1", false);
		start_Hash.put("ContextFromFileJoblet_1_tFileInputDelimited_1", System.currentTimeMillis());
		
	
	currentComponent="ContextFromFileJoblet_1_tFileInputDelimited_1";

	
		int tos_count_ContextFromFileJoblet_1_tFileInputDelimited_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("ContextFromFileJoblet_1_tFileInputDelimited_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_ContextFromFileJoblet_1_tFileInputDelimited_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1 = new StringBuilder();
                    log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append("Parameters:");
                            log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append("FILENAME" + " = " + "context.config_file");
                        log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append(" | ");
                            log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append("CSV_OPTION" + " = " + "false");
                        log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append(" | ");
                            log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append("ROWSEPARATOR" + " = " + "\"\\n\"");
                        log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append(" | ");
                            log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append("FIELDSEPARATOR" + " = " + "\"=\"");
                        log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append(" | ");
                            log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append("HEADER" + " = " + "0");
                        log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append(" | ");
                            log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append("FOOTER" + " = " + "0");
                        log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append(" | ");
                            log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append("LIMIT" + " = " + "");
                        log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append(" | ");
                            log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append("REMOVE_EMPTY_ROW" + " = " + "true");
                        log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append(" | ");
                            log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append("UNCOMPRESS" + " = " + "false");
                        log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append(" | ");
                            log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append("DIE_ON_ERROR" + " = " + "true");
                        log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append(" | ");
                            log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append("ADVANCED_SEPARATOR" + " = " + "false");
                        log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append(" | ");
                            log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append("RANDOM" + " = " + "false");
                        log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append(" | ");
                            log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append("TRIMALL" + " = " + "false");
                        log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append(" | ");
                            log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append("TRIMSELECT" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("key")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("value")+"}]");
                        log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append(" | ");
                            log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append("CHECK_FIELDS_NUM" + " = " + "false");
                        log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append(" | ");
                            log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append("CHECK_DATE" + " = " + "false");
                        log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append(" | ");
                            log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                        log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append(" | ");
                            log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append("SPLITRECORD" + " = " + "false");
                        log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append(" | ");
                            log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append("ENABLE_DECODE" + " = " + "false");
                        log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("ContextFromFileJoblet_1_tFileInputDelimited_1 - "  + (log4jParamters_ContextFromFileJoblet_1_tFileInputDelimited_1) );
                    } 
                } 
            new BytesLimit65535_ContextFromFileJoblet_1_tFileInputDelimited_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addComponentMessage("ContextFromFileJoblet_1_tFileInputDelimited_1", "tFileInputDelimited");
				talendJobLogProcess(globalMap);
			}
			
	
	
	
 
	
	
	final routines.system.RowState rowstate_ContextFromFileJoblet_1_tFileInputDelimited_1 = new routines.system.RowState();
	
	
				int nb_line_ContextFromFileJoblet_1_tFileInputDelimited_1 = 0;
				org.talend.fileprocess.FileInputDelimited fid_ContextFromFileJoblet_1_tFileInputDelimited_1 = null;
				int limit_ContextFromFileJoblet_1_tFileInputDelimited_1 = -1;
				try{
					
						Object filename_ContextFromFileJoblet_1_tFileInputDelimited_1 = context.config_file;
						if(filename_ContextFromFileJoblet_1_tFileInputDelimited_1 instanceof java.io.InputStream){
							
			int footer_value_ContextFromFileJoblet_1_tFileInputDelimited_1 = 0, random_value_ContextFromFileJoblet_1_tFileInputDelimited_1 = -1;
			if(footer_value_ContextFromFileJoblet_1_tFileInputDelimited_1 >0 || random_value_ContextFromFileJoblet_1_tFileInputDelimited_1 > 0){
				throw new java.lang.Exception("When the input source is a stream,footer and random shouldn't be bigger than 0.");				
			}
		
						}
						try {
							fid_ContextFromFileJoblet_1_tFileInputDelimited_1 = new org.talend.fileprocess.FileInputDelimited(context.config_file, "ISO-8859-15","=","\n",true,0,0,
									limit_ContextFromFileJoblet_1_tFileInputDelimited_1
								,-1, false);
						} catch(java.lang.Exception e) {
							
								throw e;
							
						}
					
				    
				    	log.info("ContextFromFileJoblet_1_tFileInputDelimited_1 - Retrieving records from the datasource.");
				    
					while (fid_ContextFromFileJoblet_1_tFileInputDelimited_1!=null && fid_ContextFromFileJoblet_1_tFileInputDelimited_1.nextRecord()) {
						rowstate_ContextFromFileJoblet_1_tFileInputDelimited_1.reset();
						
			    						ContextFromFileJoblet_1_row1 = null;			
												
									boolean whetherReject_ContextFromFileJoblet_1_tFileInputDelimited_1 = false;
									ContextFromFileJoblet_1_row1 = new ContextFromFileJoblet_1_row1Struct();
									try {
										
				int columnIndexWithD_ContextFromFileJoblet_1_tFileInputDelimited_1 = 0;
				
					columnIndexWithD_ContextFromFileJoblet_1_tFileInputDelimited_1 = 0;
					
							ContextFromFileJoblet_1_row1.key = fid_ContextFromFileJoblet_1_tFileInputDelimited_1.get(columnIndexWithD_ContextFromFileJoblet_1_tFileInputDelimited_1);
						
				
					columnIndexWithD_ContextFromFileJoblet_1_tFileInputDelimited_1 = 1;
					
							ContextFromFileJoblet_1_row1.value = fid_ContextFromFileJoblet_1_tFileInputDelimited_1.get(columnIndexWithD_ContextFromFileJoblet_1_tFileInputDelimited_1);
						
				
				
										
										if(rowstate_ContextFromFileJoblet_1_tFileInputDelimited_1.getException()!=null) {
											throw rowstate_ContextFromFileJoblet_1_tFileInputDelimited_1.getException();
										}
										
										
							
			    					} catch (java.lang.Exception e) {
			        					whetherReject_ContextFromFileJoblet_1_tFileInputDelimited_1 = true;
			        					
			            					throw(e);
			            				
			    					}
								
			log.debug("ContextFromFileJoblet_1_tFileInputDelimited_1 - Retrieving the record " + fid_ContextFromFileJoblet_1_tFileInputDelimited_1.getRowNumber() + ".");
		

 



/**
 * [ContextFromFileJoblet_1_tFileInputDelimited_1 begin ] stop
 */
	
	/**
	 * [ContextFromFileJoblet_1_tFileInputDelimited_1 main ] start
	 */

	

	
	
	currentComponent="ContextFromFileJoblet_1_tFileInputDelimited_1";

	

 


	tos_count_ContextFromFileJoblet_1_tFileInputDelimited_1++;

/**
 * [ContextFromFileJoblet_1_tFileInputDelimited_1 main ] stop
 */
	
	/**
	 * [ContextFromFileJoblet_1_tFileInputDelimited_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="ContextFromFileJoblet_1_tFileInputDelimited_1";

	

 



/**
 * [ContextFromFileJoblet_1_tFileInputDelimited_1 process_data_begin ] stop
 */
// Start of branch "ContextFromFileJoblet_1_row1"
if(ContextFromFileJoblet_1_row1 != null) { 



	
	/**
	 * [ContextFromFileJoblet_1_tBufferOutput_1 main ] start
	 */

	

	
	
	currentComponent="ContextFromFileJoblet_1_tBufferOutput_1";

	

			//ContextFromFileJoblet_1_row1
			//ContextFromFileJoblet_1_row1


			
				
				if(execStat){
					runStat.updateStatOnConnection("ContextFromFileJoblet_1_row1"+iterateId,1, 1);
				}
				
				
				
				if(enableLogStash) {
					runStat.logStatOnConnection("ContextFromFileJoblet_1_row1"+iterateId,1, 1);
				}
				
			

		
    			if(log.isTraceEnabled()){
    				log.trace("ContextFromFileJoblet_1_row1 - " + (ContextFromFileJoblet_1_row1==null? "": ContextFromFileJoblet_1_row1.toLogString()));
    			}
    		



String[] row_ContextFromFileJoblet_1_tBufferOutput_1=new String[]{"","",};		
	    if(ContextFromFileJoblet_1_row1.key != null){
	        
	            row_ContextFromFileJoblet_1_tBufferOutput_1[0] = ContextFromFileJoblet_1_row1.key;
	                        			    
	    }else{
	    	row_ContextFromFileJoblet_1_tBufferOutput_1[0] = null;
	    }
	    if(ContextFromFileJoblet_1_row1.value != null){
	        
	            row_ContextFromFileJoblet_1_tBufferOutput_1[1] = ContextFromFileJoblet_1_row1.value;
	                        			    
	    }else{
	    	row_ContextFromFileJoblet_1_tBufferOutput_1[1] = null;
	    }
	globalBuffer.add(row_ContextFromFileJoblet_1_tBufferOutput_1);	
	
 
     ContextFromFileJoblet_1_row3 = ContextFromFileJoblet_1_row1;


	tos_count_ContextFromFileJoblet_1_tBufferOutput_1++;

/**
 * [ContextFromFileJoblet_1_tBufferOutput_1 main ] stop
 */
	
	/**
	 * [ContextFromFileJoblet_1_tBufferOutput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="ContextFromFileJoblet_1_tBufferOutput_1";

	

 



/**
 * [ContextFromFileJoblet_1_tBufferOutput_1 process_data_begin ] stop
 */

	
	/**
	 * [ContextFromFileJoblet_1_tContextLoad_1 main ] start
	 */

	

	
	
	currentComponent="ContextFromFileJoblet_1_tContextLoad_1";

	

			//ContextFromFileJoblet_1_row3
			//ContextFromFileJoblet_1_row3


			
				
				if(execStat){
					runStat.updateStatOnConnection("ContextFromFileJoblet_1_row3"+iterateId,1, 1);
				}
				
				
				
				if(enableLogStash) {
					runStat.logStatOnConnection("ContextFromFileJoblet_1_row3"+iterateId,1, 1);
				}
				
			

		
    			if(log.isTraceEnabled()){
    				log.trace("ContextFromFileJoblet_1_row3 - " + (ContextFromFileJoblet_1_row3==null? "": ContextFromFileJoblet_1_row3.toLogString()));
    			}
    		
        //////////////////////////
        String tmp_key_ContextFromFileJoblet_1_tContextLoad_1 = null;
                    String key_ContextFromFileJoblet_1_tContextLoad_1 = null;
                      if (ContextFromFileJoblet_1_row3.key != null){
                          tmp_key_ContextFromFileJoblet_1_tContextLoad_1 = ContextFromFileJoblet_1_row3.key.trim();
                        if ((tmp_key_ContextFromFileJoblet_1_tContextLoad_1.startsWith("#") || tmp_key_ContextFromFileJoblet_1_tContextLoad_1.startsWith("!") )){
                          tmp_key_ContextFromFileJoblet_1_tContextLoad_1 = null;
                        } else {
                          ContextFromFileJoblet_1_row3.key = tmp_key_ContextFromFileJoblet_1_tContextLoad_1;
                        }
                      }
                        if(ContextFromFileJoblet_1_row3.key != null) {
                    key_ContextFromFileJoblet_1_tContextLoad_1 =
                        ContextFromFileJoblet_1_row3.key;
                        }
                    String value_ContextFromFileJoblet_1_tContextLoad_1 = null;
                        if(ContextFromFileJoblet_1_row3.value != null) {
                    value_ContextFromFileJoblet_1_tContextLoad_1 =
                        ContextFromFileJoblet_1_row3.value;
                        }
				
				String currentValue_ContextFromFileJoblet_1_tContextLoad_1 = value_ContextFromFileJoblet_1_tContextLoad_1;
				

  if (tmp_key_ContextFromFileJoblet_1_tContextLoad_1 != null){
  try{
        if(key_ContextFromFileJoblet_1_tContextLoad_1!=null && "db_server".equals(key_ContextFromFileJoblet_1_tContextLoad_1))
        {
           context.db_server=value_ContextFromFileJoblet_1_tContextLoad_1;
        }

        if(key_ContextFromFileJoblet_1_tContextLoad_1!=null && "db_database".equals(key_ContextFromFileJoblet_1_tContextLoad_1))
        {
           context.db_database=value_ContextFromFileJoblet_1_tContextLoad_1;
        }

        if(key_ContextFromFileJoblet_1_tContextLoad_1!=null && "db_port".equals(key_ContextFromFileJoblet_1_tContextLoad_1))
        {
           context.db_port=value_ContextFromFileJoblet_1_tContextLoad_1;
        }

        if(key_ContextFromFileJoblet_1_tContextLoad_1!=null && "db_login".equals(key_ContextFromFileJoblet_1_tContextLoad_1))
        {
           context.db_login=value_ContextFromFileJoblet_1_tContextLoad_1;
        }

        if(key_ContextFromFileJoblet_1_tContextLoad_1!=null && "db_password".equals(key_ContextFromFileJoblet_1_tContextLoad_1))
        {
           context.db_password=value_ContextFromFileJoblet_1_tContextLoad_1;
        }

        if(key_ContextFromFileJoblet_1_tContextLoad_1!=null && "db_additionalParams".equals(key_ContextFromFileJoblet_1_tContextLoad_1))
        {
           context.db_additionalParams=value_ContextFromFileJoblet_1_tContextLoad_1;
        }

        if(key_ContextFromFileJoblet_1_tContextLoad_1!=null && "config_file".equals(key_ContextFromFileJoblet_1_tContextLoad_1))
        {
           context.config_file=value_ContextFromFileJoblet_1_tContextLoad_1;
        }


        if (context.getProperty(key_ContextFromFileJoblet_1_tContextLoad_1)!=null)
        {
            assignList_ContextFromFileJoblet_1_tContextLoad_1.add(key_ContextFromFileJoblet_1_tContextLoad_1);
        }else  {
            newPropertyList_ContextFromFileJoblet_1_tContextLoad_1.add(key_ContextFromFileJoblet_1_tContextLoad_1);
        }
        if(value_ContextFromFileJoblet_1_tContextLoad_1 == null){
            context.setProperty(key_ContextFromFileJoblet_1_tContextLoad_1, "");
        }else{
            context.setProperty(key_ContextFromFileJoblet_1_tContextLoad_1,value_ContextFromFileJoblet_1_tContextLoad_1);
        }
    }catch(java.lang.Exception e){
            log.error("ContextFromFileJoblet_1_tContextLoad_1 - Setting a value for the key \"" + key_ContextFromFileJoblet_1_tContextLoad_1 + "\" has failed. Error message: " + e.getMessage());
        System.err.println("Setting a value for the key \"" + key_ContextFromFileJoblet_1_tContextLoad_1 + "\" has failed. Error message: " + e.getMessage());
    }
        nb_line_ContextFromFileJoblet_1_tContextLoad_1++;
    }
        //////////////////////////

 


	tos_count_ContextFromFileJoblet_1_tContextLoad_1++;

/**
 * [ContextFromFileJoblet_1_tContextLoad_1 main ] stop
 */
	
	/**
	 * [ContextFromFileJoblet_1_tContextLoad_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="ContextFromFileJoblet_1_tContextLoad_1";

	

 



/**
 * [ContextFromFileJoblet_1_tContextLoad_1 process_data_begin ] stop
 */
	
	/**
	 * [ContextFromFileJoblet_1_tContextLoad_1 process_data_end ] start
	 */

	

	
	
	currentComponent="ContextFromFileJoblet_1_tContextLoad_1";

	

 



/**
 * [ContextFromFileJoblet_1_tContextLoad_1 process_data_end ] stop
 */



	
	/**
	 * [ContextFromFileJoblet_1_tBufferOutput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="ContextFromFileJoblet_1_tBufferOutput_1";

	

 



/**
 * [ContextFromFileJoblet_1_tBufferOutput_1 process_data_end ] stop
 */

} // End of branch "ContextFromFileJoblet_1_row1"




	
	/**
	 * [ContextFromFileJoblet_1_tFileInputDelimited_1 process_data_end ] start
	 */

	

	
	
	currentComponent="ContextFromFileJoblet_1_tFileInputDelimited_1";

	

 



/**
 * [ContextFromFileJoblet_1_tFileInputDelimited_1 process_data_end ] stop
 */
	
	/**
	 * [ContextFromFileJoblet_1_tFileInputDelimited_1 end ] start
	 */

	

	
	
	currentComponent="ContextFromFileJoblet_1_tFileInputDelimited_1";

	



            }
            }finally{
                if(!((Object)(context.config_file) instanceof java.io.InputStream)){
                	if(fid_ContextFromFileJoblet_1_tFileInputDelimited_1!=null){
                		fid_ContextFromFileJoblet_1_tFileInputDelimited_1.close();
                	}
                }
                if(fid_ContextFromFileJoblet_1_tFileInputDelimited_1!=null){
                	globalMap.put("ContextFromFileJoblet_1_tFileInputDelimited_1_NB_LINE", fid_ContextFromFileJoblet_1_tFileInputDelimited_1.getRowNumber());
					
						log.info("ContextFromFileJoblet_1_tFileInputDelimited_1 - Retrieved records count: "+ fid_ContextFromFileJoblet_1_tFileInputDelimited_1.getRowNumber() + ".");
					
                }
			}
			  

 
                if(log.isDebugEnabled())
            log.debug("ContextFromFileJoblet_1_tFileInputDelimited_1 - "  + ("Done.") );

ok_Hash.put("ContextFromFileJoblet_1_tFileInputDelimited_1", true);
end_Hash.put("ContextFromFileJoblet_1_tFileInputDelimited_1", System.currentTimeMillis());




/**
 * [ContextFromFileJoblet_1_tFileInputDelimited_1 end ] stop
 */

	
	/**
	 * [ContextFromFileJoblet_1_tBufferOutput_1 end ] start
	 */

	

	
	
	currentComponent="ContextFromFileJoblet_1_tBufferOutput_1";

	

			
			if(execStat){
				if(resourceMap.get("inIterateVComp") == null || !((Boolean)resourceMap.get("inIterateVComp"))){
	 				runStat.updateStatOnConnection("ContextFromFileJoblet_1_row1"+iterateId,2, 0);
			 	}
			}
			
			
			
			if(enableLogStash){
				if(resourceMap.get("inIterateVComp") == null || !((Boolean)resourceMap.get("inIterateVComp"))){
			 		
			 		RunStat.StatBean talend_statebean = runStat.logStatOnConnection("ContextFromFileJoblet_1_row1"+iterateId,2, 0);
			 		
			 		talendJobLog.addConnectionMessage(
					    "ContextFromFileJoblet_1_tFileInputDelimited_1", 
					    "tFileInputDelimited", 
					    false,
					    "output",
					    "ContextFromFileJoblet_1_row1",
					    talend_statebean.getNbLine(),
					    talend_statebean.getStartTime(),
					    talend_statebean.getEndTime()
					);
					
			 		talendJobLog.addConnectionMessage(
					    "ContextFromFileJoblet_1_tBufferOutput_1", 
					    "tBufferOutput", 
					    true,
					    "input",
					    "ContextFromFileJoblet_1_row1",
					    talend_statebean.getNbLine(),
					    talend_statebean.getStartTime(),
					    talend_statebean.getEndTime()
					);
					talendJobLogProcess(globalMap);
					
			 	}
			}
			
		
 

ok_Hash.put("ContextFromFileJoblet_1_tBufferOutput_1", true);
end_Hash.put("ContextFromFileJoblet_1_tBufferOutput_1", System.currentTimeMillis());




/**
 * [ContextFromFileJoblet_1_tBufferOutput_1 end ] stop
 */

	
	/**
	 * [ContextFromFileJoblet_1_tContextLoad_1 end ] start
	 */

	

	
	
	currentComponent="ContextFromFileJoblet_1_tContextLoad_1";

	
	
	java.util.Enumeration<?> enu_ContextFromFileJoblet_1_tContextLoad_1 = context.propertyNames();
    while(enu_ContextFromFileJoblet_1_tContextLoad_1.hasMoreElements())
    {           
    	String key_ContextFromFileJoblet_1_tContextLoad_1 = (String)enu_ContextFromFileJoblet_1_tContextLoad_1.nextElement();
        if(!assignList_ContextFromFileJoblet_1_tContextLoad_1.contains(key_ContextFromFileJoblet_1_tContextLoad_1) && !newPropertyList_ContextFromFileJoblet_1_tContextLoad_1.contains(key_ContextFromFileJoblet_1_tContextLoad_1))
        {
            noAssignList_ContextFromFileJoblet_1_tContextLoad_1.add(key_ContextFromFileJoblet_1_tContextLoad_1);
        }          
    } 

    String newPropertyStr_ContextFromFileJoblet_1_tContextLoad_1 = newPropertyList_ContextFromFileJoblet_1_tContextLoad_1.toString();
    String newProperty_ContextFromFileJoblet_1_tContextLoad_1 = newPropertyStr_ContextFromFileJoblet_1_tContextLoad_1.substring(1, newPropertyStr_ContextFromFileJoblet_1_tContextLoad_1.length() - 1);
    
    String noAssignStr_ContextFromFileJoblet_1_tContextLoad_1 = noAssignList_ContextFromFileJoblet_1_tContextLoad_1.toString();
    String noAssign_ContextFromFileJoblet_1_tContextLoad_1 = noAssignStr_ContextFromFileJoblet_1_tContextLoad_1.substring(1, noAssignStr_ContextFromFileJoblet_1_tContextLoad_1.length() - 1);
    
    globalMap.put("ContextFromFileJoblet_1_tContextLoad_1_KEY_NOT_INCONTEXT", newProperty_ContextFromFileJoblet_1_tContextLoad_1);
    globalMap.put("ContextFromFileJoblet_1_tContextLoad_1_KEY_NOT_LOADED", noAssign_ContextFromFileJoblet_1_tContextLoad_1);

    globalMap.put("ContextFromFileJoblet_1_tContextLoad_1_NB_LINE",nb_line_ContextFromFileJoblet_1_tContextLoad_1);

	List<String> parametersToEncrypt_ContextFromFileJoblet_1_tContextLoad_1 = new java.util.ArrayList<String>();
	
	
	resumeUtil.addLog("NODE", "NODE:ContextFromFileJoblet_1_tContextLoad_1", "", Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,parametersToEncrypt_ContextFromFileJoblet_1_tContextLoad_1));    
    	log.info("ContextFromFileJoblet_1_tContextLoad_1 - Loaded contexts count: " + nb_line_ContextFromFileJoblet_1_tContextLoad_1 + ".");
    
			
			if(execStat){
				if(resourceMap.get("inIterateVComp") == null || !((Boolean)resourceMap.get("inIterateVComp"))){
	 				runStat.updateStatOnConnection("ContextFromFileJoblet_1_row3"+iterateId,2, 0);
			 	}
			}
			
			
			
			if(enableLogStash){
				if(resourceMap.get("inIterateVComp") == null || !((Boolean)resourceMap.get("inIterateVComp"))){
			 		
			 		RunStat.StatBean talend_statebean = runStat.logStatOnConnection("ContextFromFileJoblet_1_row3"+iterateId,2, 0);
			 		
			 		talendJobLog.addConnectionMessage(
					    "ContextFromFileJoblet_1_tBufferOutput_1", 
					    "tBufferOutput", 
					    false,
					    "output",
					    "ContextFromFileJoblet_1_row3",
					    talend_statebean.getNbLine(),
					    talend_statebean.getStartTime(),
					    talend_statebean.getEndTime()
					);
					
			 		talendJobLog.addConnectionMessage(
					    "ContextFromFileJoblet_1_tContextLoad_1", 
					    "tContextLoad", 
					    true,
					    "input",
					    "ContextFromFileJoblet_1_row3",
					    talend_statebean.getNbLine(),
					    talend_statebean.getStartTime(),
					    talend_statebean.getEndTime()
					);
					talendJobLogProcess(globalMap);
					
			 	}
			}
			
		
 
                if(log.isDebugEnabled())
            log.debug("ContextFromFileJoblet_1_tContextLoad_1 - "  + ("Done.") );

ok_Hash.put("ContextFromFileJoblet_1_tContextLoad_1", true);
end_Hash.put("ContextFromFileJoblet_1_tContextLoad_1", System.currentTimeMillis());




/**
 * [ContextFromFileJoblet_1_tContextLoad_1 end ] stop
 */






				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:ContextFromFileJoblet_1_tFileInputDelimited_1:OnSubjobOk (TRIGGER_OUTPUT_1)", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk1", 0, "ok");
								} 
							
							tJava_1Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [ContextFromFileJoblet_1_tFileInputDelimited_1 finally ] start
	 */

	

	
	
	currentComponent="ContextFromFileJoblet_1_tFileInputDelimited_1";

	

 



/**
 * [ContextFromFileJoblet_1_tFileInputDelimited_1 finally ] stop
 */

	
	/**
	 * [ContextFromFileJoblet_1_tBufferOutput_1 finally ] start
	 */

	

	
	
	currentComponent="ContextFromFileJoblet_1_tBufferOutput_1";

	

 



/**
 * [ContextFromFileJoblet_1_tBufferOutput_1 finally ] stop
 */

	
	/**
	 * [ContextFromFileJoblet_1_tContextLoad_1 finally ] start
	 */

	

	
	
	currentComponent="ContextFromFileJoblet_1_tContextLoad_1";

	

 



/**
 * [ContextFromFileJoblet_1_tContextLoad_1 finally ] stop
 */






				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("ContextFromFileJoblet_1_tFileInputDelimited_1_SUBPROCESS_STATE", 1);
	}
	

public void tJava_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tJava_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tJava_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tJava_1", false);
		start_Hash.put("tJava_1", System.currentTimeMillis());
		
	
	currentComponent="tJava_1";

	
		int tos_count_tJava_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addComponentMessage("tJava_1", "tJava");
				talendJobLogProcess(globalMap);
			}
			


System.out.println("db_server=" + context.db_server);
System.out.println("db_database=" + context.db_database);
System.out.println("db_port=" + context.db_port);
System.out.println("db_login=" + context.db_login);
System.out.println("db_password=" + context.db_password);
System.out.println("db_additionalParams=" + context.db_additionalParams);


 



/**
 * [tJava_1 begin ] stop
 */
	
	/**
	 * [tJava_1 main ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 


	tos_count_tJava_1++;

/**
 * [tJava_1 main ] stop
 */
	
	/**
	 * [tJava_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 



/**
 * [tJava_1 process_data_begin ] stop
 */
	
	/**
	 * [tJava_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 



/**
 * [tJava_1 process_data_end ] stop
 */
	
	/**
	 * [tJava_1 end ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 

ok_Hash.put("tJava_1", true);
end_Hash.put("tJava_1", System.currentTimeMillis());




/**
 * [tJava_1 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tJava_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk2", 0, "ok");
								} 
							
							tParallelize_1Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tJava_1 finally ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 



/**
 * [tJava_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tJava_1_SUBPROCESS_STATE", 1);
	}
	

public void tParallelize_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tParallelize_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tParallelize_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tParallelize_1", false);
		start_Hash.put("tParallelize_1", System.currentTimeMillis());
		
	
	currentComponent="tParallelize_1";

	
		int tos_count_tParallelize_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addComponentMessage("tParallelize_1", "tParallelize");
				talendJobLogProcess(globalMap);
			}
			

// call parallelized subjobs
	java.util.Map<String, Thread> mt_tParallelize_1 = new java.util.HashMap<String, Thread>();
	
// clear the temporary values in the globalMap
	globalMap.remove("tRunJob_2_SUBPROCESS_STATE");
	globalMap.remove("tRunJob_3_SUBPROCESS_STATE");
	globalMap.remove("tRunJob_5_SUBPROCESS_STATE");

				java.util.Map concurrentMap_temp_tParallelize_1;
				if(globalMap instanceof java.util.HashMap){
					concurrentMap_temp_tParallelize_1 = java.util.Collections.synchronizedMap(globalMap);
				}else{
					concurrentMap_temp_tParallelize_1 = globalMap;
				}
				final java.util.Map concurrentMap_tParallelize_1 = concurrentMap_temp_tParallelize_1;
			
		runningThreadCount.add(1);
		String name_tRunJob_2 = "tParallelize_1_" + java.util.UUID.randomUUID().toString();
		Thread thread_tRunJob_2 = new Thread(new ThreadGroup(name_tRunJob_2), name_tRunJob_2){
	    	public void run() {	    	
				java.util.Map threadRunResultMap = new java.util.HashMap();
				threadRunResultMap.put("errorCode", null);
				threadRunResultMap.put("status", "");
				threadLocal.set(threadRunResultMap);
					    	
                try {
					
						log.debug("tParallelize_1 - The subjob starting with the component 'tRunJob_2' starts.");
					
					tRunJob_2Process(concurrentMap_tParallelize_1);
					
						log.debug("tParallelize_1 - The subjob starting with the component 'tRunJob_2' is done.");
					
				} catch (TalendException e) {
					
						log.error("tParallelize_1 - " + e.getMessage());
					
					concurrentMap_tParallelize_1.put("tRunJob_2_SUBPROCESS_STATE", -1);
					e.printStackTrace();
				} catch (java.lang.Error error) {
					
						log.error("tParallelize_1 - " + error.getMessage());
					
					concurrentMap_tParallelize_1.put("tRunJob_2_SUBPROCESS_STATE", -1);
					error.printStackTrace();
				}finally {
                	runningThreadCount.add(-1);
                }	        	
	    	}
		};
		thread_tRunJob_2.start();
		mt_tParallelize_1.put("tRunJob_2",thread_tRunJob_2);
		runningThreadCount.add(1);
		String name_tRunJob_3 = "tParallelize_1_" + java.util.UUID.randomUUID().toString();
		Thread thread_tRunJob_3 = new Thread(new ThreadGroup(name_tRunJob_3), name_tRunJob_3){
	    	public void run() {	    	
				java.util.Map threadRunResultMap = new java.util.HashMap();
				threadRunResultMap.put("errorCode", null);
				threadRunResultMap.put("status", "");
				threadLocal.set(threadRunResultMap);
					    	
                try {
					
						log.debug("tParallelize_1 - The subjob starting with the component 'tRunJob_3' starts.");
					
					tRunJob_3Process(concurrentMap_tParallelize_1);
					
						log.debug("tParallelize_1 - The subjob starting with the component 'tRunJob_3' is done.");
					
				} catch (TalendException e) {
					
						log.error("tParallelize_1 - " + e.getMessage());
					
					concurrentMap_tParallelize_1.put("tRunJob_3_SUBPROCESS_STATE", -1);
					e.printStackTrace();
				} catch (java.lang.Error error) {
					
						log.error("tParallelize_1 - " + error.getMessage());
					
					concurrentMap_tParallelize_1.put("tRunJob_3_SUBPROCESS_STATE", -1);
					error.printStackTrace();
				}finally {
                	runningThreadCount.add(-1);
                }	        	
	    	}
		};
		thread_tRunJob_3.start();
		mt_tParallelize_1.put("tRunJob_3",thread_tRunJob_3);
		runningThreadCount.add(1);
		String name_tRunJob_5 = "tParallelize_1_" + java.util.UUID.randomUUID().toString();
		Thread thread_tRunJob_5 = new Thread(new ThreadGroup(name_tRunJob_5), name_tRunJob_5){
	    	public void run() {	    	
				java.util.Map threadRunResultMap = new java.util.HashMap();
				threadRunResultMap.put("errorCode", null);
				threadRunResultMap.put("status", "");
				threadLocal.set(threadRunResultMap);
					    	
                try {
					
						log.debug("tParallelize_1 - The subjob starting with the component 'tRunJob_5' starts.");
					
					tRunJob_5Process(concurrentMap_tParallelize_1);
					
						log.debug("tParallelize_1 - The subjob starting with the component 'tRunJob_5' is done.");
					
				} catch (TalendException e) {
					
						log.error("tParallelize_1 - " + e.getMessage());
					
					concurrentMap_tParallelize_1.put("tRunJob_5_SUBPROCESS_STATE", -1);
					e.printStackTrace();
				} catch (java.lang.Error error) {
					
						log.error("tParallelize_1 - " + error.getMessage());
					
					concurrentMap_tParallelize_1.put("tRunJob_5_SUBPROCESS_STATE", -1);
					error.printStackTrace();
				}finally {
                	runningThreadCount.add(-1);
                }	        	
	    	}
		};
		thread_tRunJob_5.start();
		mt_tParallelize_1.put("tRunJob_5",thread_tRunJob_5);
	while(
(
		((globalMap.get("tRunJob_2_SUBPROCESS_STATE")==null)?true:((Integer)globalMap.get("tRunJob_2_SUBPROCESS_STATE")==0))||
		((globalMap.get("tRunJob_3_SUBPROCESS_STATE")==null)?true:((Integer)globalMap.get("tRunJob_3_SUBPROCESS_STATE")==0))||
		((globalMap.get("tRunJob_5_SUBPROCESS_STATE")==null)?true:((Integer)globalMap.get("tRunJob_5_SUBPROCESS_STATE")==0))|| false)  ) {
	Thread.sleep(100);
}


// call next subprocesses
	log.debug("tParallelize_1 - The subjob starting with the component 'tJava_3' starts.");
	tJava_3Process(globalMap);
	log.debug("tParallelize_1 - The subjob starting with the component 'tJava_3' is done.");



 



/**
 * [tParallelize_1 begin ] stop
 */
	
	/**
	 * [tParallelize_1 main ] start
	 */

	

	
	
	currentComponent="tParallelize_1";

	

 


	tos_count_tParallelize_1++;

/**
 * [tParallelize_1 main ] stop
 */
	
	/**
	 * [tParallelize_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tParallelize_1";

	

 



/**
 * [tParallelize_1 process_data_begin ] stop
 */
	
	/**
	 * [tParallelize_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tParallelize_1";

	

 



/**
 * [tParallelize_1 process_data_end ] stop
 */
	
	/**
	 * [tParallelize_1 end ] start
	 */

	

	
	
	currentComponent="tParallelize_1";

	

 

ok_Hash.put("tParallelize_1", true);
end_Hash.put("tParallelize_1", System.currentTimeMillis());




/**
 * [tParallelize_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tParallelize_1 finally ] start
	 */

	

	
	
	currentComponent="tParallelize_1";

	

 



/**
 * [tParallelize_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tParallelize_1_SUBPROCESS_STATE", 1);
	}
	

public void tRunJob_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tRunJob_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tRunJob_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tRunJob_2", false);
		start_Hash.put("tRunJob_2", System.currentTimeMillis());
		
	
	currentComponent="tRunJob_2";

	
		int tos_count_tRunJob_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tRunJob_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tRunJob_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tRunJob_2 = new StringBuilder();
                    log4jParamters_tRunJob_2.append("Parameters:");
                            log4jParamters_tRunJob_2.append("USE_DYNAMIC_JOB" + " = " + "false");
                        log4jParamters_tRunJob_2.append(" | ");
                            log4jParamters_tRunJob_2.append("PROCESS" + " = " + "SubWorkerJob");
                        log4jParamters_tRunJob_2.append(" | ");
                            log4jParamters_tRunJob_2.append("USE_INDEPENDENT_PROCESS" + " = " + "false");
                        log4jParamters_tRunJob_2.append(" | ");
                            log4jParamters_tRunJob_2.append("DIE_ON_CHILD_ERROR" + " = " + "true");
                        log4jParamters_tRunJob_2.append(" | ");
                            log4jParamters_tRunJob_2.append("TRANSMIT_WHOLE_CONTEXT" + " = " + "false");
                        log4jParamters_tRunJob_2.append(" | ");
                            log4jParamters_tRunJob_2.append("CONTEXTPARAMS" + " = " + "[]");
                        log4jParamters_tRunJob_2.append(" | ");
                            log4jParamters_tRunJob_2.append("PROPAGATE_CHILD_RESULT" + " = " + "false");
                        log4jParamters_tRunJob_2.append(" | ");
                            log4jParamters_tRunJob_2.append("PRINT_PARAMETER" + " = " + "false");
                        log4jParamters_tRunJob_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tRunJob_2 - "  + (log4jParamters_tRunJob_2) );
                    } 
                } 
            new BytesLimit65535_tRunJob_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addComponentMessage("tRunJob_2", "tRunJob");
				talendJobLogProcess(globalMap);
			}
			


 



/**
 * [tRunJob_2 begin ] stop
 */
	
	/**
	 * [tRunJob_2 main ] start
	 */

	

	
	
	currentComponent="tRunJob_2";

	
	java.util.List<String> paraList_tRunJob_2 = new java.util.ArrayList<String>();
	
	        			paraList_tRunJob_2.add("--father_pid="+pid);
	      			
	        			paraList_tRunJob_2.add("--root_pid="+rootPid);
	      			
	        			paraList_tRunJob_2.add("--father_node=tRunJob_2");
	      			
	        			paraList_tRunJob_2.add("--context=Default");
	      			
			if(!"".equals(log4jLevel)){
				paraList_tRunJob_2.add("--log4jLevel="+log4jLevel);
			}
		
		if(enableLogStash){
			paraList_tRunJob_2.add("--monitoring="+enableLogStash);
		}
		
	//for feature:10589
	
		paraList_tRunJob_2.add("--stat_port=" + portStats);
	

	if(resuming_logs_dir_path != null){
		paraList_tRunJob_2.add("--resuming_logs_dir_path=" + resuming_logs_dir_path);
	}
	String childResumePath_tRunJob_2 = ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path);
	String tRunJobName_tRunJob_2 = ResumeUtil.getRighttRunJob(resuming_checkpoint_path);
	if("tRunJob_2".equals(tRunJobName_tRunJob_2) && childResumePath_tRunJob_2 != null){
		paraList_tRunJob_2.add("--resuming_checkpoint_path=" + ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path));
	}
	paraList_tRunJob_2.add("--parent_part_launcher=JOB:" + jobName + "/NODE:tRunJob_2");
	
	java.util.Map<String, Object> parentContextMap_tRunJob_2 = new java.util.HashMap<String, Object>();

	

	Object obj_tRunJob_2 = null;

	
	
		demo_configfile_exceptions_postmsg.subworkerjob_0_1.SubWorkerJob childJob_tRunJob_2 = new demo_configfile_exceptions_postmsg.subworkerjob_0_1.SubWorkerJob();
	    // pass DataSources
	    java.util.Map<String, routines.system.TalendDataSource> talendDataSources_tRunJob_2 = (java.util.Map<String, routines.system.TalendDataSource>) globalMap
	            .get(KEY_DB_DATASOURCES);
	    if (null != talendDataSources_tRunJob_2) {
	        java.util.Map<String, javax.sql.DataSource> dataSources_tRunJob_2 = new java.util.HashMap<String, javax.sql.DataSource>();
	        for (java.util.Map.Entry<String, routines.system.TalendDataSource> talendDataSourceEntry_tRunJob_2 : talendDataSources_tRunJob_2
			        .entrySet()) {
	            dataSources_tRunJob_2.put(talendDataSourceEntry_tRunJob_2.getKey(),
	                    talendDataSourceEntry_tRunJob_2.getValue().getRawDataSource());
	        }
	        childJob_tRunJob_2.setDataSources(dataSources_tRunJob_2);
	    }
		  
			childJob_tRunJob_2.parentContextMap = parentContextMap_tRunJob_2;
		  
		
			log.info("tRunJob_2 - The child job 'demo_configfile_exceptions_postmsg.subworkerjob_0_1.SubWorkerJob' starts on the version '0.1' with the context 'Default'.");
		
		String[][] childReturn_tRunJob_2 = childJob_tRunJob_2.runJob((String[]) paraList_tRunJob_2.toArray(new String[paraList_tRunJob_2.size()]));
		
			log.info("tRunJob_2 - The child job 'demo_configfile_exceptions_postmsg.subworkerjob_0_1.SubWorkerJob' is done.");
		
	  	
				((java.util.Map)threadLocal.get()).put("errorCode", childJob_tRunJob_2.getErrorCode());
			
	            
	    	if(childJob_tRunJob_2.getErrorCode() == null){
				globalMap.put("tRunJob_2_CHILD_RETURN_CODE", childJob_tRunJob_2.getStatus() != null && ("failure").equals(childJob_tRunJob_2.getStatus()) ? 1 : 0);
	    	}else{
				globalMap.put("tRunJob_2_CHILD_RETURN_CODE", childJob_tRunJob_2.getErrorCode());
		    }
		    if (childJob_tRunJob_2.getExceptionStackTrace() != null) { 
		    	globalMap.put("tRunJob_2_CHILD_EXCEPTION_STACKTRACE", childJob_tRunJob_2.getExceptionStackTrace());
		    }
	  
			 
				if (childJob_tRunJob_2.getErrorCode() != null || ("failure").equals(childJob_tRunJob_2.getStatus())) {
					java.lang.Exception ce_tRunJob_2 = childJob_tRunJob_2.getException();
					throw new RuntimeException("Child job running failed.\n" + ((ce_tRunJob_2!=null) ? (ce_tRunJob_2.getClass().getName() + ": " + ce_tRunJob_2.getMessage()) : ""));
				}
			
	  	

 


	tos_count_tRunJob_2++;

/**
 * [tRunJob_2 main ] stop
 */
	
	/**
	 * [tRunJob_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tRunJob_2";

	

 



/**
 * [tRunJob_2 process_data_begin ] stop
 */
	
	/**
	 * [tRunJob_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tRunJob_2";

	

 



/**
 * [tRunJob_2 process_data_end ] stop
 */
	
	/**
	 * [tRunJob_2 end ] start
	 */

	

	
	
	currentComponent="tRunJob_2";

	

 
                if(log.isDebugEnabled())
            log.debug("tRunJob_2 - "  + ("Done.") );

ok_Hash.put("tRunJob_2", true);
end_Hash.put("tRunJob_2", System.currentTimeMillis());




/**
 * [tRunJob_2 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tRunJob_2 finally ] start
	 */

	

	
	
	currentComponent="tRunJob_2";

	

 



/**
 * [tRunJob_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tRunJob_2_SUBPROCESS_STATE", 1);
	}
	

public void tRunJob_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tRunJob_3_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tRunJob_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tRunJob_3", false);
		start_Hash.put("tRunJob_3", System.currentTimeMillis());
		
	
	currentComponent="tRunJob_3";

	
		int tos_count_tRunJob_3 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tRunJob_3 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tRunJob_3{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tRunJob_3 = new StringBuilder();
                    log4jParamters_tRunJob_3.append("Parameters:");
                            log4jParamters_tRunJob_3.append("USE_DYNAMIC_JOB" + " = " + "false");
                        log4jParamters_tRunJob_3.append(" | ");
                            log4jParamters_tRunJob_3.append("PROCESS" + " = " + "SubWorkerJob");
                        log4jParamters_tRunJob_3.append(" | ");
                            log4jParamters_tRunJob_3.append("USE_INDEPENDENT_PROCESS" + " = " + "false");
                        log4jParamters_tRunJob_3.append(" | ");
                            log4jParamters_tRunJob_3.append("DIE_ON_CHILD_ERROR" + " = " + "true");
                        log4jParamters_tRunJob_3.append(" | ");
                            log4jParamters_tRunJob_3.append("TRANSMIT_WHOLE_CONTEXT" + " = " + "false");
                        log4jParamters_tRunJob_3.append(" | ");
                            log4jParamters_tRunJob_3.append("CONTEXTPARAMS" + " = " + "[]");
                        log4jParamters_tRunJob_3.append(" | ");
                            log4jParamters_tRunJob_3.append("PROPAGATE_CHILD_RESULT" + " = " + "false");
                        log4jParamters_tRunJob_3.append(" | ");
                            log4jParamters_tRunJob_3.append("PRINT_PARAMETER" + " = " + "false");
                        log4jParamters_tRunJob_3.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tRunJob_3 - "  + (log4jParamters_tRunJob_3) );
                    } 
                } 
            new BytesLimit65535_tRunJob_3().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addComponentMessage("tRunJob_3", "tRunJob");
				talendJobLogProcess(globalMap);
			}
			


 



/**
 * [tRunJob_3 begin ] stop
 */
	
	/**
	 * [tRunJob_3 main ] start
	 */

	

	
	
	currentComponent="tRunJob_3";

	
	java.util.List<String> paraList_tRunJob_3 = new java.util.ArrayList<String>();
	
	        			paraList_tRunJob_3.add("--father_pid="+pid);
	      			
	        			paraList_tRunJob_3.add("--root_pid="+rootPid);
	      			
	        			paraList_tRunJob_3.add("--father_node=tRunJob_3");
	      			
	        			paraList_tRunJob_3.add("--context=Default");
	      			
			if(!"".equals(log4jLevel)){
				paraList_tRunJob_3.add("--log4jLevel="+log4jLevel);
			}
		
		if(enableLogStash){
			paraList_tRunJob_3.add("--monitoring="+enableLogStash);
		}
		
	//for feature:10589
	
		paraList_tRunJob_3.add("--stat_port=" + portStats);
	

	if(resuming_logs_dir_path != null){
		paraList_tRunJob_3.add("--resuming_logs_dir_path=" + resuming_logs_dir_path);
	}
	String childResumePath_tRunJob_3 = ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path);
	String tRunJobName_tRunJob_3 = ResumeUtil.getRighttRunJob(resuming_checkpoint_path);
	if("tRunJob_3".equals(tRunJobName_tRunJob_3) && childResumePath_tRunJob_3 != null){
		paraList_tRunJob_3.add("--resuming_checkpoint_path=" + ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path));
	}
	paraList_tRunJob_3.add("--parent_part_launcher=JOB:" + jobName + "/NODE:tRunJob_3");
	
	java.util.Map<String, Object> parentContextMap_tRunJob_3 = new java.util.HashMap<String, Object>();

	

	Object obj_tRunJob_3 = null;

	
	
		demo_configfile_exceptions_postmsg.subworkerjob_0_1.SubWorkerJob childJob_tRunJob_3 = new demo_configfile_exceptions_postmsg.subworkerjob_0_1.SubWorkerJob();
	    // pass DataSources
	    java.util.Map<String, routines.system.TalendDataSource> talendDataSources_tRunJob_3 = (java.util.Map<String, routines.system.TalendDataSource>) globalMap
	            .get(KEY_DB_DATASOURCES);
	    if (null != talendDataSources_tRunJob_3) {
	        java.util.Map<String, javax.sql.DataSource> dataSources_tRunJob_3 = new java.util.HashMap<String, javax.sql.DataSource>();
	        for (java.util.Map.Entry<String, routines.system.TalendDataSource> talendDataSourceEntry_tRunJob_3 : talendDataSources_tRunJob_3
			        .entrySet()) {
	            dataSources_tRunJob_3.put(talendDataSourceEntry_tRunJob_3.getKey(),
	                    talendDataSourceEntry_tRunJob_3.getValue().getRawDataSource());
	        }
	        childJob_tRunJob_3.setDataSources(dataSources_tRunJob_3);
	    }
		  
			childJob_tRunJob_3.parentContextMap = parentContextMap_tRunJob_3;
		  
		
			log.info("tRunJob_3 - The child job 'demo_configfile_exceptions_postmsg.subworkerjob_0_1.SubWorkerJob' starts on the version '0.1' with the context 'Default'.");
		
		String[][] childReturn_tRunJob_3 = childJob_tRunJob_3.runJob((String[]) paraList_tRunJob_3.toArray(new String[paraList_tRunJob_3.size()]));
		
			log.info("tRunJob_3 - The child job 'demo_configfile_exceptions_postmsg.subworkerjob_0_1.SubWorkerJob' is done.");
		
	  	
				((java.util.Map)threadLocal.get()).put("errorCode", childJob_tRunJob_3.getErrorCode());
			
	            
	    	if(childJob_tRunJob_3.getErrorCode() == null){
				globalMap.put("tRunJob_3_CHILD_RETURN_CODE", childJob_tRunJob_3.getStatus() != null && ("failure").equals(childJob_tRunJob_3.getStatus()) ? 1 : 0);
	    	}else{
				globalMap.put("tRunJob_3_CHILD_RETURN_CODE", childJob_tRunJob_3.getErrorCode());
		    }
		    if (childJob_tRunJob_3.getExceptionStackTrace() != null) { 
		    	globalMap.put("tRunJob_3_CHILD_EXCEPTION_STACKTRACE", childJob_tRunJob_3.getExceptionStackTrace());
		    }
	  
			 
				if (childJob_tRunJob_3.getErrorCode() != null || ("failure").equals(childJob_tRunJob_3.getStatus())) {
					java.lang.Exception ce_tRunJob_3 = childJob_tRunJob_3.getException();
					throw new RuntimeException("Child job running failed.\n" + ((ce_tRunJob_3!=null) ? (ce_tRunJob_3.getClass().getName() + ": " + ce_tRunJob_3.getMessage()) : ""));
				}
			
	  	

 


	tos_count_tRunJob_3++;

/**
 * [tRunJob_3 main ] stop
 */
	
	/**
	 * [tRunJob_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tRunJob_3";

	

 



/**
 * [tRunJob_3 process_data_begin ] stop
 */
	
	/**
	 * [tRunJob_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tRunJob_3";

	

 



/**
 * [tRunJob_3 process_data_end ] stop
 */
	
	/**
	 * [tRunJob_3 end ] start
	 */

	

	
	
	currentComponent="tRunJob_3";

	

 
                if(log.isDebugEnabled())
            log.debug("tRunJob_3 - "  + ("Done.") );

ok_Hash.put("tRunJob_3", true);
end_Hash.put("tRunJob_3", System.currentTimeMillis());




/**
 * [tRunJob_3 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tRunJob_3 finally ] start
	 */

	

	
	
	currentComponent="tRunJob_3";

	

 



/**
 * [tRunJob_3 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tRunJob_3_SUBPROCESS_STATE", 1);
	}
	

public void tRunJob_5Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tRunJob_5_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tRunJob_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tRunJob_5", false);
		start_Hash.put("tRunJob_5", System.currentTimeMillis());
		
	
	currentComponent="tRunJob_5";

	
		int tos_count_tRunJob_5 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tRunJob_5 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tRunJob_5{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tRunJob_5 = new StringBuilder();
                    log4jParamters_tRunJob_5.append("Parameters:");
                            log4jParamters_tRunJob_5.append("USE_DYNAMIC_JOB" + " = " + "false");
                        log4jParamters_tRunJob_5.append(" | ");
                            log4jParamters_tRunJob_5.append("PROCESS" + " = " + "SubWorkerJob");
                        log4jParamters_tRunJob_5.append(" | ");
                            log4jParamters_tRunJob_5.append("USE_INDEPENDENT_PROCESS" + " = " + "false");
                        log4jParamters_tRunJob_5.append(" | ");
                            log4jParamters_tRunJob_5.append("DIE_ON_CHILD_ERROR" + " = " + "true");
                        log4jParamters_tRunJob_5.append(" | ");
                            log4jParamters_tRunJob_5.append("TRANSMIT_WHOLE_CONTEXT" + " = " + "false");
                        log4jParamters_tRunJob_5.append(" | ");
                            log4jParamters_tRunJob_5.append("CONTEXTPARAMS" + " = " + "[]");
                        log4jParamters_tRunJob_5.append(" | ");
                            log4jParamters_tRunJob_5.append("PROPAGATE_CHILD_RESULT" + " = " + "false");
                        log4jParamters_tRunJob_5.append(" | ");
                            log4jParamters_tRunJob_5.append("PRINT_PARAMETER" + " = " + "false");
                        log4jParamters_tRunJob_5.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tRunJob_5 - "  + (log4jParamters_tRunJob_5) );
                    } 
                } 
            new BytesLimit65535_tRunJob_5().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addComponentMessage("tRunJob_5", "tRunJob");
				talendJobLogProcess(globalMap);
			}
			


 



/**
 * [tRunJob_5 begin ] stop
 */
	
	/**
	 * [tRunJob_5 main ] start
	 */

	

	
	
	currentComponent="tRunJob_5";

	
	java.util.List<String> paraList_tRunJob_5 = new java.util.ArrayList<String>();
	
	        			paraList_tRunJob_5.add("--father_pid="+pid);
	      			
	        			paraList_tRunJob_5.add("--root_pid="+rootPid);
	      			
	        			paraList_tRunJob_5.add("--father_node=tRunJob_5");
	      			
	        			paraList_tRunJob_5.add("--context=Default");
	      			
			if(!"".equals(log4jLevel)){
				paraList_tRunJob_5.add("--log4jLevel="+log4jLevel);
			}
		
		if(enableLogStash){
			paraList_tRunJob_5.add("--monitoring="+enableLogStash);
		}
		
	//for feature:10589
	
		paraList_tRunJob_5.add("--stat_port=" + portStats);
	

	if(resuming_logs_dir_path != null){
		paraList_tRunJob_5.add("--resuming_logs_dir_path=" + resuming_logs_dir_path);
	}
	String childResumePath_tRunJob_5 = ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path);
	String tRunJobName_tRunJob_5 = ResumeUtil.getRighttRunJob(resuming_checkpoint_path);
	if("tRunJob_5".equals(tRunJobName_tRunJob_5) && childResumePath_tRunJob_5 != null){
		paraList_tRunJob_5.add("--resuming_checkpoint_path=" + ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path));
	}
	paraList_tRunJob_5.add("--parent_part_launcher=JOB:" + jobName + "/NODE:tRunJob_5");
	
	java.util.Map<String, Object> parentContextMap_tRunJob_5 = new java.util.HashMap<String, Object>();

	

	Object obj_tRunJob_5 = null;

	
	
		demo_configfile_exceptions_postmsg.subworkerjob_0_1.SubWorkerJob childJob_tRunJob_5 = new demo_configfile_exceptions_postmsg.subworkerjob_0_1.SubWorkerJob();
	    // pass DataSources
	    java.util.Map<String, routines.system.TalendDataSource> talendDataSources_tRunJob_5 = (java.util.Map<String, routines.system.TalendDataSource>) globalMap
	            .get(KEY_DB_DATASOURCES);
	    if (null != talendDataSources_tRunJob_5) {
	        java.util.Map<String, javax.sql.DataSource> dataSources_tRunJob_5 = new java.util.HashMap<String, javax.sql.DataSource>();
	        for (java.util.Map.Entry<String, routines.system.TalendDataSource> talendDataSourceEntry_tRunJob_5 : talendDataSources_tRunJob_5
			        .entrySet()) {
	            dataSources_tRunJob_5.put(talendDataSourceEntry_tRunJob_5.getKey(),
	                    talendDataSourceEntry_tRunJob_5.getValue().getRawDataSource());
	        }
	        childJob_tRunJob_5.setDataSources(dataSources_tRunJob_5);
	    }
		  
			childJob_tRunJob_5.parentContextMap = parentContextMap_tRunJob_5;
		  
		
			log.info("tRunJob_5 - The child job 'demo_configfile_exceptions_postmsg.subworkerjob_0_1.SubWorkerJob' starts on the version '0.1' with the context 'Default'.");
		
		String[][] childReturn_tRunJob_5 = childJob_tRunJob_5.runJob((String[]) paraList_tRunJob_5.toArray(new String[paraList_tRunJob_5.size()]));
		
			log.info("tRunJob_5 - The child job 'demo_configfile_exceptions_postmsg.subworkerjob_0_1.SubWorkerJob' is done.");
		
	  	
				((java.util.Map)threadLocal.get()).put("errorCode", childJob_tRunJob_5.getErrorCode());
			
	            
	    	if(childJob_tRunJob_5.getErrorCode() == null){
				globalMap.put("tRunJob_5_CHILD_RETURN_CODE", childJob_tRunJob_5.getStatus() != null && ("failure").equals(childJob_tRunJob_5.getStatus()) ? 1 : 0);
	    	}else{
				globalMap.put("tRunJob_5_CHILD_RETURN_CODE", childJob_tRunJob_5.getErrorCode());
		    }
		    if (childJob_tRunJob_5.getExceptionStackTrace() != null) { 
		    	globalMap.put("tRunJob_5_CHILD_EXCEPTION_STACKTRACE", childJob_tRunJob_5.getExceptionStackTrace());
		    }
	  
			 
				if (childJob_tRunJob_5.getErrorCode() != null || ("failure").equals(childJob_tRunJob_5.getStatus())) {
					java.lang.Exception ce_tRunJob_5 = childJob_tRunJob_5.getException();
					throw new RuntimeException("Child job running failed.\n" + ((ce_tRunJob_5!=null) ? (ce_tRunJob_5.getClass().getName() + ": " + ce_tRunJob_5.getMessage()) : ""));
				}
			
	  	

 


	tos_count_tRunJob_5++;

/**
 * [tRunJob_5 main ] stop
 */
	
	/**
	 * [tRunJob_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tRunJob_5";

	

 



/**
 * [tRunJob_5 process_data_begin ] stop
 */
	
	/**
	 * [tRunJob_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tRunJob_5";

	

 



/**
 * [tRunJob_5 process_data_end ] stop
 */
	
	/**
	 * [tRunJob_5 end ] start
	 */

	

	
	
	currentComponent="tRunJob_5";

	

 
                if(log.isDebugEnabled())
            log.debug("tRunJob_5 - "  + ("Done.") );

ok_Hash.put("tRunJob_5", true);
end_Hash.put("tRunJob_5", System.currentTimeMillis());




/**
 * [tRunJob_5 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tRunJob_5 finally ] start
	 */

	

	
	
	currentComponent="tRunJob_5";

	

 



/**
 * [tRunJob_5 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tRunJob_5_SUBPROCESS_STATE", 1);
	}
	

public void tJava_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tJava_3_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tJava_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tJava_3", false);
		start_Hash.put("tJava_3", System.currentTimeMillis());
		
	
	currentComponent="tJava_3";

	
		int tos_count_tJava_3 = 0;
		
			if(enableLogStash) {
				talendJobLog.addComponentMessage("tJava_3", "tJava");
				talendJobLogProcess(globalMap);
			}
			


System.out.println("Demo succeeded!");

 



/**
 * [tJava_3 begin ] stop
 */
	
	/**
	 * [tJava_3 main ] start
	 */

	

	
	
	currentComponent="tJava_3";

	

 


	tos_count_tJava_3++;

/**
 * [tJava_3 main ] stop
 */
	
	/**
	 * [tJava_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJava_3";

	

 



/**
 * [tJava_3 process_data_begin ] stop
 */
	
	/**
	 * [tJava_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tJava_3";

	

 



/**
 * [tJava_3 process_data_end ] stop
 */
	
	/**
	 * [tJava_3 end ] start
	 */

	

	
	
	currentComponent="tJava_3";

	

 

ok_Hash.put("tJava_3", true);
end_Hash.put("tJava_3", System.currentTimeMillis());




/**
 * [tJava_3 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tJava_3 finally ] start
	 */

	

	
	
	currentComponent="tJava_3";

	

 



/**
 * [tJava_3 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tJava_3_SUBPROCESS_STATE", 1);
	}
	

public void talendJobLogProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("talendJobLog_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [talendJobLog begin ] start
	 */

	

	
		
		ok_Hash.put("talendJobLog", false);
		start_Hash.put("talendJobLog", System.currentTimeMillis());
		
	
	currentComponent="talendJobLog";

	
		int tos_count_talendJobLog = 0;
		

	for (JobStructureCatcherUtils.JobStructureCatcherMessage jcm : talendJobLog.getMessages()) {
		org.talend.logging.audit.Context log_context_talendJobLog = null;
		if(jcm.component_name == null) {//job level log
			if(jcm.status == null) {//job start
				log_context_talendJobLog = org.talend.job.audit.JobContextBuilder.create().jobName(jcm.job_name).jobId(jcm.job_id).jobVersion(jcm.job_version).timestamp(jcm.moment).build();
				auditLogger_talendJobLog.jobstart(log_context_talendJobLog);
			} else {//job end
				long timeMS = jcm.end_time - jcm.start_time;
				String duration = String.format(java.util.Locale.US, "%1$.2fs", (timeMS * 1.0)/1000);
			
				log_context_talendJobLog = org.talend.job.audit.JobContextBuilder.create().jobName(jcm.job_name).jobId(jcm.job_id).jobVersion(jcm.job_version)
					.timestamp(jcm.moment).duration(duration).status(jcm.status).build();
				auditLogger_talendJobLog.jobstop(log_context_talendJobLog);
			}
		} else if(jcm.current_connector == null) {//component log
			log_context_talendJobLog = org.talend.job.audit.JobContextBuilder.create().jobName(jcm.job_name).jobId(jcm.job_id).jobVersion(jcm.job_version)
				.connectorType(jcm.component_name).connectorId(jcm.component_id).build();
			auditLogger_talendJobLog.runcomponent(log_context_talendJobLog);
		} else {//component connector meter log
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.format(java.util.Locale.US, "%1$.2fs", (timeMS * 1.0)/1000);
			
			if(jcm.current_connector_as_input) {//log current component input line
				log_context_talendJobLog = org.talend.job.audit.JobContextBuilder.create().jobName(jcm.job_name).jobId(jcm.job_id).jobVersion(jcm.job_version)
					.connectorType(jcm.component_name).connectorId(jcm.component_id)
					.connectionName(jcm.current_connector).connectionType(jcm.current_connector_type)
					.rows(jcm.total_row_number).duration(duration).build();
				auditLogger_talendJobLog.flowInput(log_context_talendJobLog);
			} else {//log current component output/reject line
				log_context_talendJobLog = org.talend.job.audit.JobContextBuilder.create().jobName(jcm.job_name).jobId(jcm.job_id).jobVersion(jcm.job_version)
					.connectorType(jcm.component_name).connectorId(jcm.component_id)
					.connectionName(jcm.current_connector).connectionType(jcm.current_connector_type)
					.rows(jcm.total_row_number).duration(duration).build();
				auditLogger_talendJobLog.flowOutput(log_context_talendJobLog);
			}
		}
	}

 



/**
 * [talendJobLog begin ] stop
 */
	
	/**
	 * [talendJobLog main ] start
	 */

	

	
	
	currentComponent="talendJobLog";

	

 


	tos_count_talendJobLog++;

/**
 * [talendJobLog main ] stop
 */
	
	/**
	 * [talendJobLog process_data_begin ] start
	 */

	

	
	
	currentComponent="talendJobLog";

	

 



/**
 * [talendJobLog process_data_begin ] stop
 */
	
	/**
	 * [talendJobLog process_data_end ] start
	 */

	

	
	
	currentComponent="talendJobLog";

	

 



/**
 * [talendJobLog process_data_end ] stop
 */
	
	/**
	 * [talendJobLog end ] start
	 */

	

	
	
	currentComponent="talendJobLog";

	

 

ok_Hash.put("talendJobLog", true);
end_Hash.put("talendJobLog", System.currentTimeMillis());




/**
 * [talendJobLog end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [talendJobLog finally ] start
	 */

	

	
	
	currentComponent="talendJobLog";

	

 



/**
 * [talendJobLog finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("talendJobLog_SUBPROCESS_STATE", 1);
	}
	
    public String resuming_logs_dir_path = null;
    public String resuming_checkpoint_path = null;
    public String parent_part_launcher = null;
    private String resumeEntryMethodName = null;
    private boolean globalResumeTicket = false;

    public boolean watch = false;
    // portStats is null, it means don't execute the statistics
    public Integer portStats = null;
    public int portTraces = 4334;
    public String clientHost;
    public String defaultClientHost = "localhost";
    public String contextStr = "Default";
    public boolean isDefaultContext = true;
    public String pid = "0";
    public String rootPid = null;
    public String fatherPid = null;
    public String fatherNode = null;
    public long startTime = 0;
    public boolean isChildJob = false;
    public String log4jLevel = "";
    
    private boolean enableLogStash;

    private boolean execStat = true;

    private ThreadLocal<java.util.Map<String, String>> threadLocal = new ThreadLocal<java.util.Map<String, String>>() {
        protected java.util.Map<String, String> initialValue() {
            java.util.Map<String,String> threadRunResultMap = new java.util.HashMap<String, String>();
            threadRunResultMap.put("errorCode", null);
            threadRunResultMap.put("status", "");
            return threadRunResultMap;
        };
    };

    private SyncInt runningThreadCount =new SyncInt();

    private class SyncInt
    {
        private int count = 0;
        public synchronized void add(int i)
        {
            count +=i;
        }

        public synchronized int getCount()
        {
            return count;
        }
    }

    private PropertiesWithType context_param = new PropertiesWithType();
    public java.util.Map<String, Object> parentContextMap = new java.util.HashMap<String, Object>();

    public String status= "";
    

    public static void main(String[] args){
        final Demo_ConfigFile_Exceptions_PostMsg Demo_ConfigFile_Exceptions_PostMsgClass = new Demo_ConfigFile_Exceptions_PostMsg();

        int exitCode = Demo_ConfigFile_Exceptions_PostMsgClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'Demo_ConfigFile_Exceptions_PostMsg' - Done.");
	        }

        System.exit(exitCode);
    }


    public String[][] runJob(String[] args) {

        int exitCode = runJobInTOS(args);
        String[][] bufferValue = (String[][])globalBuffer.toArray(new String[globalBuffer.size()][]);

        return bufferValue;
    }

    public boolean hastBufferOutputComponent() {
		boolean hastBufferOutput = false;
    	
        		hastBufferOutput = true;
    	
        return hastBufferOutput;
    }

    public int runJobInTOS(String[] args) {
	   	// reset status
	   	status = "";
	   	
        String lastStr = "";
        for (String arg : args) {
            if (arg.equalsIgnoreCase("--context_param")) {
                lastStr = arg;
            } else if (lastStr.equals("")) {
                evalParam(arg);
            } else {
                evalParam(lastStr + " " + arg);
                lastStr = "";
            }
        }

	        if(!"".equals(log4jLevel)){
				if("trace".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.TRACE);
				}else if("debug".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.DEBUG);
				}else if("info".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.INFO);
				}else if("warn".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.WARN);
				}else if("error".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.ERROR);
				}else if("fatal".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.FATAL);
				}else if ("off".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.OFF);
				}
				org.apache.log4j.Logger.getRootLogger().setLevel(log.getLevel());
    	    }
        	log.info("TalendJob: 'Demo_ConfigFile_Exceptions_PostMsg' - Start.");
    	
    	
    	
			if(enableLogStash) {
				java.util.Properties properties_talendJobLog = new java.util.Properties();
				properties_talendJobLog.setProperty("root.logger", "audit");
				properties_talendJobLog.setProperty("encoding", "UTF-8");
				properties_talendJobLog.setProperty("application.name", "Talend Studio");
				properties_talendJobLog.setProperty("service.name", "Talend Studio Job");
				properties_talendJobLog.setProperty("instance.name", "Talend Studio Job Instance");
				properties_talendJobLog.setProperty("propagate.appender.exceptions", "none");
				properties_talendJobLog.setProperty("log.appender", "file");
				properties_talendJobLog.setProperty("appender.file.path", "audit.json");
				properties_talendJobLog.setProperty("appender.file.maxsize", "52428800");
				properties_talendJobLog.setProperty("appender.file.maxbackup", "20");
				properties_talendJobLog.setProperty("host", "false");
				
				auditLogger_talendJobLog = org.talend.job.audit.JobEventAuditLoggerFactory.createJobAuditLogger(properties_talendJobLog);
			}
		

        if(clientHost == null) {
            clientHost = defaultClientHost;
        }

        if(pid == null || "0".equals(pid)) {
            pid = TalendString.getAsciiRandomString(6);
        }

        if (rootPid==null) {
            rootPid = pid;
        }
        if (fatherPid==null) {
            fatherPid = pid;
        }else{
            isChildJob = true;
        }

        if (portStats != null) {
            // portStats = -1; //for testing
            if (portStats < 0 || portStats > 65535) {
                // issue:10869, the portStats is invalid, so this client socket can't open
                System.err.println("The statistics socket port " + portStats + " is invalid.");
                execStat = false;
            }
        } else {
            execStat = false;
        }

        try {
            //call job/subjob with an existing context, like: --context=production. if without this parameter, there will use the default context instead.
            java.io.InputStream inContext = Demo_ConfigFile_Exceptions_PostMsg.class.getClassLoader().getResourceAsStream("demo_configfile_exceptions_postmsg/demo_configfile_exceptions_postmsg_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = Demo_ConfigFile_Exceptions_PostMsg.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
            }
            if (inContext != null) {
                //defaultProps is in order to keep the original context value
                if(context != null && context.isEmpty()) {
	                defaultProps.load(inContext);
	                context = new ContextProperties(defaultProps);
                }
                
                inContext.close();
            } else if (!isDefaultContext) {
                //print info and job continue to run, for case: context_param is not empty.
                System.err.println("Could not find the context " + contextStr);
            }

            if(!context_param.isEmpty()) {
                context.putAll(context_param);
				//set types for params from parentJobs
				for (Object key: context_param.keySet()){
					String context_key = key.toString();
					String context_type = context_param.getContextType(context_key);
					context.setContextType(context_key, context_type);

				}
            }
            class ContextProcessing {
                private void processContext_0() {
                        context.setContextType("db_server", "id_String");
                            context.db_server=(String) context.getProperty("db_server");
                        context.setContextType("db_database", "id_String");
                            context.db_database=(String) context.getProperty("db_database");
                        context.setContextType("db_port", "id_String");
                            context.db_port=(String) context.getProperty("db_port");
                        context.setContextType("db_login", "id_String");
                            context.db_login=(String) context.getProperty("db_login");
                        context.setContextType("db_password", "id_String");
                            context.db_password=(String) context.getProperty("db_password");
                        context.setContextType("db_additionalParams", "id_String");
                            context.db_additionalParams=(String) context.getProperty("db_additionalParams");
                        context.setContextType("config_file", "id_String");
                            context.config_file=(String) context.getProperty("config_file");
                } 
                public void processAllContext() {
                        processContext_0();
                }
            }

            new ContextProcessing().processAllContext();
        } catch (java.io.IOException ie) {
            System.err.println("Could not load context "+contextStr);
            ie.printStackTrace();
        }

        // get context value from parent directly
        if (parentContextMap != null && !parentContextMap.isEmpty()) {if (parentContextMap.containsKey("db_server")) {
                context.db_server = (String) parentContextMap.get("db_server");
            }if (parentContextMap.containsKey("db_database")) {
                context.db_database = (String) parentContextMap.get("db_database");
            }if (parentContextMap.containsKey("db_port")) {
                context.db_port = (String) parentContextMap.get("db_port");
            }if (parentContextMap.containsKey("db_login")) {
                context.db_login = (String) parentContextMap.get("db_login");
            }if (parentContextMap.containsKey("db_password")) {
                context.db_password = (String) parentContextMap.get("db_password");
            }if (parentContextMap.containsKey("db_additionalParams")) {
                context.db_additionalParams = (String) parentContextMap.get("db_additionalParams");
            }if (parentContextMap.containsKey("config_file")) {
                context.config_file = (String) parentContextMap.get("config_file");
            }
        }

        //Resume: init the resumeUtil
        resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
        resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
        resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
        //Resume: jobStart
        resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,parametersToEncrypt));

if(execStat) {
    try {
        runStat.openSocket(!isChildJob);
        runStat.setAllPID(rootPid, fatherPid, pid, jobName);
        runStat.startThreadStat(clientHost, portStats);
        runStat.updateStatOnJob(RunStat.JOBSTART, fatherNode);
    } catch (java.io.IOException ioException) {
        ioException.printStackTrace();
    }
}



	
	    java.util.concurrent.ConcurrentHashMap<Object, Object> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<Object, Object>();
	    globalMap.put("concurrentHashMap", concurrentHashMap);
	

    long startUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    long endUsedMemory = 0;
    long end = 0;

    startTime = System.currentTimeMillis();




this.globalResumeTicket = true;//to run tPreJob



		if(enableLogStash) {
	        talendJobLog.addJobStartMessage();
	        try {
	            talendJobLogProcess(globalMap);
	        } catch (java.lang.Exception e) {
	            e.printStackTrace();
	        }
        }

this.globalResumeTicket = false;//to run others jobs
final Thread launchingThread = Thread.currentThread();
        runningThreadCount.add(1);
        new Thread(){
            public void run() {
                java.util.Map threadRunResultMap = new java.util.HashMap();
                threadRunResultMap.put("errorCode", null);
                threadRunResultMap.put("status", "");
                threadLocal.set(threadRunResultMap);

                try {
((java.util.Map) threadLocal.get()).put("errorCode", null);ContextFromFileJoblet_1_tJava_1Process(globalMap);
if ( !"failure".equals(((java.util.Map)threadLocal.get()).get("status")) ) {
((java.util.Map) threadLocal.get()).put("status", "end");
}
}catch (TalendException e_ContextFromFileJoblet_1_tJava_1) {
globalMap.put("ContextFromFileJoblet_1_tJava_1_SUBPROCESS_STATE", -1);

e_ContextFromFileJoblet_1_tJava_1.printStackTrace();

}catch (java.lang.Error e_ContextFromFileJoblet_1_tJava_1) {
globalMap.put("ContextFromFileJoblet_1_tJava_1_SUBPROCESS_STATE", -1);
((java.util.Map) threadLocal.get()).put("status", "failure");throw e_ContextFromFileJoblet_1_tJava_1;

}
                finally {
                    Integer localErrorCode = (Integer)(((java.util.Map)threadLocal.get()).get("errorCode"));
                    String localStatus = (String)(((java.util.Map)threadLocal.get()).get("status"));
                    if (localErrorCode != null) {
                        if (errorCode == null || localErrorCode.compareTo(errorCode) > 0) {
                           errorCode = localErrorCode;
                        }
                    }
                    if (!status.equals("failure")){
                        status = localStatus;
                    }

                    if ("true".equals(((java.util.Map) threadLocal.get()).get("JobInterrupted"))) {
                        launchingThread.interrupt();
                    }

                    runningThreadCount.add(-1);
                }
            }
        }.start();

    boolean interrupted = false;
    while (runningThreadCount.getCount() > 0) {
        try {
            Thread.sleep(10);
        } catch (java.lang.InterruptedException e) {
            interrupted = true;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    if (interrupted) {
        Thread.currentThread().interrupt();
    }



this.globalResumeTicket = true;//to run tPostJob




        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : Demo_ConfigFile_Exceptions_PostMsg");
        }
		if(enableLogStash) {
	        talendJobLog.addJobEndMessage(startTime, end, status);
	        try {
	            talendJobLogProcess(globalMap);
	        } catch (java.lang.Exception e) {
	            e.printStackTrace();
	        }
        }



if (execStat) {
    runStat.updateStatOnJob(RunStat.JOBEND, fatherNode);
    runStat.stopThreadStat();
}
    int returnCode = 0;
    if(errorCode == null) {
         returnCode = status != null && status.equals("failure") ? 1 : 0;
    } else {
         returnCode = errorCode.intValue();
    }
    resumeUtil.addLog("JOB_ENDED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","" + returnCode,"","","");

    return returnCode;

  }

    // only for OSGi env
    public void destroy() {


    }














    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();







        return connections;
    }

    private void evalParam(String arg) {
        if (arg.startsWith("--resuming_logs_dir_path")) {
            resuming_logs_dir_path = arg.substring(25);
        } else if (arg.startsWith("--resuming_checkpoint_path")) {
            resuming_checkpoint_path = arg.substring(27);
        } else if (arg.startsWith("--parent_part_launcher")) {
            parent_part_launcher = arg.substring(23);
        } else if (arg.startsWith("--watch")) {
            watch = true;
        } else if (arg.startsWith("--stat_port=")) {
            String portStatsStr = arg.substring(12);
            if (portStatsStr != null && !portStatsStr.equals("null")) {
                portStats = Integer.parseInt(portStatsStr);
            }
        } else if (arg.startsWith("--trace_port=")) {
            portTraces = Integer.parseInt(arg.substring(13));
        } else if (arg.startsWith("--client_host=")) {
            clientHost = arg.substring(14);
        } else if (arg.startsWith("--context=")) {
            contextStr = arg.substring(10);
            isDefaultContext = false;
        } else if (arg.startsWith("--father_pid=")) {
            fatherPid = arg.substring(13);
        } else if (arg.startsWith("--root_pid=")) {
            rootPid = arg.substring(11);
        } else if (arg.startsWith("--father_node=")) {
            fatherNode = arg.substring(14);
        } else if (arg.startsWith("--pid=")) {
            pid = arg.substring(6);
        } else if (arg.startsWith("--context_type")) {
            String keyValue = arg.substring(15);
			int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.setContextType(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.setContextType(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }

            }

		} else if (arg.startsWith("--context_param")) {
            String keyValue = arg.substring(16);
            int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.put(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.put(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }
            }
        } else if (arg.startsWith("--log4jLevel=")) {
            log4jLevel = arg.substring(13);
		} else if (arg.startsWith("--monitoring=")) {//for trunjob call
			enableLogStash = "true".equalsIgnoreCase(arg.substring(13));
		}
		
		if(!enableLogStash) {
			enableLogStash = "true".equalsIgnoreCase(System.getProperty("monitoring"));
		}
    }
    
    private static final String NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY = "<TALEND_NULL>";

    private final String[][] escapeChars = {
        {"\\\\","\\"},{"\\n","\n"},{"\\'","\'"},{"\\r","\r"},
        {"\\f","\f"},{"\\b","\b"},{"\\t","\t"}
        };
    private String replaceEscapeChars (String keyValue) {

		if (keyValue == null || ("").equals(keyValue.trim())) {
			return keyValue;
		}

		StringBuilder result = new StringBuilder();
		int currIndex = 0;
		while (currIndex < keyValue.length()) {
			int index = -1;
			// judege if the left string includes escape chars
			for (String[] strArray : escapeChars) {
				index = keyValue.indexOf(strArray[0],currIndex);
				if (index>=0) {

					result.append(keyValue.substring(currIndex, index + strArray[0].length()).replace(strArray[0], strArray[1]));
					currIndex = index + strArray[0].length();
					break;
				}
			}
			// if the left string doesn't include escape chars, append the left into the result
			if (index < 0) {
				result.append(keyValue.substring(currIndex));
				currIndex = currIndex + keyValue.length();
			}
		}

		return result.toString();
    }

    public Integer getErrorCode() {
        return errorCode;
    }


    public String getStatus() {
        return status;
    }

    ResumeUtil resumeUtil = null;
}
/************************************************************************************************
 *     154537 characters generated by Talend Cloud Big Data Platform 
 *     on the March 1, 2020 9:48:02 AM CET
 ************************************************************************************************/