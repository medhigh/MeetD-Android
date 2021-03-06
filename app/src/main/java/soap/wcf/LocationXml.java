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

public class LocationXml extends AttributeContainer implements KvmSerializable
{
    
    public String Address;
    
    public String Coordinates;
    
    public String Id;
    
    public String Region;

    public LocationXml()
    {
    }

    public LocationXml(Object paramObj, ExtendedSoapSerializationEnvelope __envelope)
    {
	    
	    if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;


        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("Address"))
        {	
	        Object obj = soapObject.getProperty("Address");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.Address = j.toString();
                }
	        }
	        else if (obj!= null && obj instanceof String){
                this.Address = (String)obj;
            }    
        }
        if (soapObject.hasProperty("Coordinates"))
        {	
	        Object obj = soapObject.getProperty("Coordinates");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.Coordinates = j.toString();
                }
	        }
	        else if (obj!= null && obj instanceof String){
                this.Coordinates = (String)obj;
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
        if (soapObject.hasProperty("Region"))
        {	
	        Object obj = soapObject.getProperty("Region");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.Region = j.toString();
                }
	        }
	        else if (obj!= null && obj instanceof String){
                this.Region = (String)obj;
            }    
        }


    }

    @Override
    public Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return this.Address!=null?this.Address:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.Coordinates!=null?this.Coordinates:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.Id!=null?this.Id:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.Region!=null?this.Region:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 4;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Address";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Coordinates";
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
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Region";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
    }
    
    @Override
    public void setProperty(int arg0, Object arg1)
    {
    }

}
