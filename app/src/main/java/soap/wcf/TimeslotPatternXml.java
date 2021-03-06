package soap.wcf;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 4.1.8.0
//
// Created by Quasar Development at 15-10-2015
//
//---------------------------------------------------


import java.util.Hashtable;
import org.ksoap2.serialization.*;

public class TimeslotPatternXml extends AttributeContainer implements KvmSerializable
{
    
    public Boolean Enabled;
    
    public java.util.Date EndTime;
    
    public String Id;
    
    public LocationXml Location;
    
    public java.util.Date StarTime;
    
    public Integer TimeslotDuration;
    
    public Integer Type;
    
    public ArrayOfString WeekDays=new ArrayOfString();
    
    public Integer WeekType;

    public TimeslotPatternXml()
    {
    }

    public TimeslotPatternXml(Object paramObj, ExtendedSoapSerializationEnvelope __envelope)
    {
	    
	    if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;


        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("Enabled"))
        {	
	        Object obj = soapObject.getProperty("Enabled");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.Enabled = new Boolean(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof Boolean){
                this.Enabled = (Boolean)obj;
            }    
        }
        if (soapObject.hasProperty("EndTime"))
        {	
	        Object obj = soapObject.getProperty("EndTime");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.EndTime = Helper.ConvertFromWebService(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof java.util.Date){
                this.EndTime = (java.util.Date)obj;
            }    
        }
        if (soapObject.hasProperty("Id"))
        {	
	        Object obj = soapObject.getProperty("Id");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.Id = j.toString();
                }
	        }
	        else if (obj!= null && obj instanceof String){
                this.Id = (String)obj;
            }    
        }
        if (soapObject.hasProperty("Location"))
        {	
	        Object j = soapObject.getProperty("Location");
	        this.Location = (LocationXml)__envelope.get(j,LocationXml.class);
        }
        if (soapObject.hasProperty("StarTime"))
        {	
	        Object obj = soapObject.getProperty("StarTime");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.StarTime = Helper.ConvertFromWebService(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof java.util.Date){
                this.StarTime = (java.util.Date)obj;
            }    
        }
        if (soapObject.hasProperty("TimeslotDuration"))
        {	
	        Object obj = soapObject.getProperty("TimeslotDuration");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.TimeslotDuration = Integer.parseInt(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof Integer){
                this.TimeslotDuration = (Integer)obj;
            }    
        }
        if (soapObject.hasProperty("Type"))
        {	
	        Object obj = soapObject.getProperty("Type");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.Type = Integer.parseInt(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof Integer){
                this.Type = (Integer)obj;
            }    
        }
        if (soapObject.hasProperty("WeekDays"))
        {	
	        Object j = soapObject.getProperty("WeekDays");
	        this.WeekDays = new ArrayOfString(j,__envelope);
        }
        if (soapObject.hasProperty("WeekType"))
        {	
	        Object obj = soapObject.getProperty("WeekType");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.WeekType = Integer.parseInt(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof Integer){
                this.WeekType = (Integer)obj;
            }    
        }


    }

    @Override
    public Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return this.Enabled!=null?this.Enabled:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.EndTime!=null? Helper.getDateTimeFormat().format(this.EndTime):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.Id!=null?this.Id:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.Location!=null?this.Location:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.StarTime!=null? Helper.getDateTimeFormat().format(this.StarTime):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.TimeslotDuration!=null?this.TimeslotDuration:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.Type!=null?this.Type:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==7)
        {
            return this.WeekDays!=null?this.WeekDays:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==8)
        {
            return this.WeekType!=null?this.WeekType:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 9;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "Enabled";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "EndTime";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Id";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
        if(propertyIndex==3)
        {
            info.type = LocationXml.class;
            info.name = "Location";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "StarTime";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "TimeslotDuration";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
        if(propertyIndex==6)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "Type";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
        if(propertyIndex==7)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "WeekDays";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
        if(propertyIndex==8)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "WeekType";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
    }
    
    @Override
    public void setProperty(int arg0, Object arg1)
    {
    }

}
